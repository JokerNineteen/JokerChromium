// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.toolbar;

import static org.chromium.chrome.browser.incognito.IncognitoUtils.getNonPrimaryOTRProfileFromWindowAndroid;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;

import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;

import org.chromium.base.ObserverList;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.NativeMethods;
import org.chromium.chrome.R;
import org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils;
import org.chromium.chrome.browser.layouts.LayoutStateProvider;
import org.chromium.chrome.browser.layouts.LayoutType;
import org.chromium.chrome.browser.offlinepages.OfflinePageUtils;
import org.chromium.chrome.browser.omnibox.ChromeAutocompleteSchemeClassifier;
import org.chromium.chrome.browser.omnibox.LocationBarDataProvider;
import org.chromium.chrome.browser.omnibox.SearchEngineLogoUtils;
import org.chromium.chrome.browser.omnibox.UrlBarData;
import org.chromium.chrome.browser.paint_preview.TabbedPaintPreview;
import org.chromium.chrome.browser.previews.Previews;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.chrome.browser.tab.TrustedCdn;
import org.chromium.chrome.browser.ui.native_page.NativePage;
import org.chromium.components.browser_ui.styles.ChromeColors;
import org.chromium.components.dom_distiller.core.DomDistillerUrlUtils;
import org.chromium.components.embedder_support.util.UrlConstants;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.components.metrics.OmniboxEventProtos.OmniboxEventProto.PageClassification;
import org.chromium.components.omnibox.OmniboxUrlEmphasizer;
import org.chromium.components.omnibox.SecurityStatusIcon;
import org.chromium.components.security_state.ConnectionSecurityLevel;
import org.chromium.components.security_state.SecurityStateModel;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.util.ColorUtils;
import org.chromium.url.URI;

import java.net.URISyntaxException;

/**
 * Provides a way of accessing toolbar data and state.
 */
public class LocationBarModel implements ToolbarDataProvider, LocationBarDataProvider {
    private final Context mContext;
    private final NewTabPageDelegate mNtpDelegate;

    private Tab mTab;
    private int mPrimaryColor;
    private LayoutStateProvider mLayoutStateProvider;

    private boolean mIsIncognito;
    private boolean mIsUsingBrandColor;
    private boolean mShouldShowOmniboxInOverviewMode;

    private long mNativeLocationBarModelAndroid;
    private ObserverList<LocationBarDataProvider.Observer> mLocationBarDataObservers =
            new ObserverList<>();

    /**
     * Default constructor for this class.
     * @param context The Context used for styling the toolbar visuals.
     */
    public LocationBarModel(Context context, NewTabPageDelegate newTabPageDelegate) {
        mContext = context;
        mNtpDelegate = newTabPageDelegate;
        mPrimaryColor = ChromeColors.getDefaultThemeColor(context.getResources(), false);
    }

    /**
     * Handle any initialization that must occur after native has been initialized.
     */
    public void initializeWithNative() {
        mNativeLocationBarModelAndroid = LocationBarModelJni.get().init(LocationBarModel.this);
    }

    /**
     * Destroys the native LocationBarModel.
     */
    public void destroy() {
        if (mNativeLocationBarModelAndroid == 0) return;
        LocationBarModelJni.get().destroy(mNativeLocationBarModelAndroid, LocationBarModel.this);
        mNativeLocationBarModelAndroid = 0;
    }

    /**
     * @return The currently active WebContents being used by the Toolbar.
     */
    @CalledByNative
    private WebContents getActiveWebContents() {
        if (!hasTab()) return null;
        return mTab.getWebContents();
    }

    /**
     * Sets the tab that contains the information to be displayed in the toolbar.
     * @param tab The tab associated currently with the toolbar.
     * @param isIncognito Whether the incognito model is currently selected, which must match the
     *                    passed in tab if non-null.
     */
    public void setTab(Tab tab, boolean isIncognito) {
        assert tab == null || tab.isIncognito() == isIncognito;
        mTab = tab;
        mIsIncognito = isIncognito;
        updateUsingBrandColor();
        notifyTitleChanged();
        notifyUrlChanged();
    }

    @Override
    public Tab getTab() {
        return hasTab() ? mTab : null;
    }

    @Override
    public boolean hasTab() {
        // TODO(dtrainor, tedchoc): Remove the isInitialized() check when we no longer wait for
        // TAB_CLOSED events to remove this tab.  Otherwise there is a chance we use this tab after
        // {@link ChromeTab#destroy()} is called.
        return mTab != null && mTab.isInitialized();
    }

    @Override
    public void addObserver(LocationBarDataProvider.Observer observer) {
        mLocationBarDataObservers.addObserver(observer);
    }

    @Override
    public void removeObserver(LocationBarDataProvider.Observer observer) {
        mLocationBarDataObservers.removeObserver(observer);
    }

    @Override
    public String getCurrentUrl() {
        // Provide NTP url instead of most recent tab url for searches in overview mode (when Start
        // Surface is enabled). .
        if (isInOverviewAndShowingOmnibox()) {
            return UrlConstants.NTP_URL;
        }

        // TODO(yusufo) : Consider using this for all calls from getTab() for accessing url.
        if (!hasTab() || !getTab().isInitialized()) return "";

        // Tab.getUrl() returns empty string if it does not have a URL.
        return getTab().getUrlString().trim();
    }

    public void notifyUrlChanged() {
        for (LocationBarDataProvider.Observer observer : mLocationBarDataObservers) {
            observer.onUrlChanged();
        }
    }

    @Override
    public NewTabPageDelegate getNewTabPageDelegate() {
        return mNtpDelegate;
    }

    @Override
    public UrlBarData getUrlBarData() {
        if (!hasTab()) return UrlBarData.EMPTY;

        String url = getCurrentUrl();
        if (NativePage.isNativePageUrl(url, isIncognito()) || UrlUtilities.isNTPUrl(url)) {
            return UrlBarData.EMPTY;
        }

        String formattedUrl = getFormattedFullUrl();
        if (mTab.isFrozen()) return buildUrlBarData(url, formattedUrl);

        if (DomDistillerUrlUtils.isDistilledPage(url)) {
            String originalUrl = DomDistillerUrlUtils.getOriginalUrlFromDistillerUrl(url);
            if (originalUrl != null) {
                return buildUrlBarData(
                        DomDistillerTabUtils.getFormattedUrlFromOriginalDistillerUrl(originalUrl));
            }
            return buildUrlBarData(url, formattedUrl);
        }

        // Strip the scheme from committed preview pages only.
        if (isPreview()) {
            return buildUrlBarData(url, UrlUtilities.stripScheme(url));
        }

        if (isOfflinePage()) {
            String originalUrl = mTab.getOriginalUrl();
            formattedUrl = UrlUtilities.stripScheme(
                    DomDistillerTabUtils.getFormattedUrlFromOriginalDistillerUrl(originalUrl));

            // Clear the editing text for untrusted offline pages.
            if (!OfflinePageUtils.isShowingTrustedOfflinePage(mTab.getWebContents())) {
                return buildUrlBarData(url, formattedUrl, "");
            }

            return buildUrlBarData(url, formattedUrl);
        }

        String urlForDisplay = getUrlForDisplay();
        if (!urlForDisplay.equals(formattedUrl)) {
            return buildUrlBarData(url, urlForDisplay, formattedUrl);
        }

        return buildUrlBarData(url, formattedUrl);
    }

    private UrlBarData buildUrlBarData(String url) {
        return buildUrlBarData(url, url, url);
    }

    private UrlBarData buildUrlBarData(String url, String displayText) {
        return buildUrlBarData(url, displayText, displayText);
    }

    private UrlBarData buildUrlBarData(String url, String displayText, String editingText) {
        SpannableStringBuilder spannableDisplayText = new SpannableStringBuilder(displayText);

        if (mNativeLocationBarModelAndroid != 0 && spannableDisplayText.length() > 0
                && shouldEmphasizeUrl()) {
            boolean isInternalPage = false;
            try {
                isInternalPage = UrlUtilities.isInternalScheme(new URI(url));
            } catch (URISyntaxException e) {
                // Ignore as this only is for applying color
            }

            ChromeAutocompleteSchemeClassifier chromeAutocompleteSchemeClassifier =
                    new ChromeAutocompleteSchemeClassifier(getProfile());
            OmniboxUrlEmphasizer.emphasizeUrl(spannableDisplayText, mContext.getResources(),
                    chromeAutocompleteSchemeClassifier, getSecurityLevel(), isInternalPage,
                    !ColorUtils.shouldUseLightForegroundOnBackground(getPrimaryColor()),
                    shouldEmphasizeHttpsScheme());
            chromeAutocompleteSchemeClassifier.destroy();
        }

        return UrlBarData.forUrlAndText(url, spannableDisplayText, editingText);
    }

    /**
     * @return True if the displayed URL should be emphasized, false if the displayed text
     *         already has formatting for emphasis applied.
     */
    private boolean shouldEmphasizeUrl() {
        // If the toolbar shows the publisher URL, it applies its own formatting for emphasis.
        if (mTab == null) return true;

        return TrustedCdn.getPublisherUrl(mTab) == null;
    }

    /**
     * @return Whether the light security theme should be used.
     */
    @VisibleForTesting
    public boolean shouldEmphasizeHttpsScheme() {
        return !isUsingBrandColor() && !isIncognito();
    }

    @Override
    public String getTitle() {
        if (!hasTab()) return "";

        String title = getTab().getTitle();
        return TextUtils.isEmpty(title) ? title : title.trim();
    }

    public void notifyTitleChanged() {
        for (LocationBarDataProvider.Observer observer : mLocationBarDataObservers) {
            observer.onTitleChanged();
        }
    }

    @Override
    public boolean isIncognito() {
        return mIsIncognito;
    }

    /**
     * @return Whether the location bar is showing in overview mode. If the location bar should not
     *  currently be showing in overview mode, returns false.
     */
    @Override
    public boolean isInOverviewAndShowingOmnibox() {
        if (!mShouldShowOmniboxInOverviewMode) return false;

        return mLayoutStateProvider != null
                && mLayoutStateProvider.isLayoutVisible(LayoutType.TAB_SWITCHER);
    }

    /**
     * @return Whether the location bar should show when in overview mode.
     */
    @Override
    public boolean shouldShowLocationBarInOverviewMode() {
        return mShouldShowOmniboxInOverviewMode;
    }

    @Override
    public Profile getProfile() {
        Profile lastUsedRegularProfile = Profile.getLastUsedRegularProfile();
        if (mIsIncognito) {
            WindowAndroid windowAndroid = (mTab != null) ? mTab.getWindowAndroid() : null;
            // If the mTab belongs to a CustomTabActivity then we return the non-primary OTR profile
            // which is associated with it. For all other cases we return the primary OTR profile.
            Profile nonPrimaryOTRProfile = getNonPrimaryOTRProfileFromWindowAndroid(windowAndroid);
            if (nonPrimaryOTRProfile != null) return nonPrimaryOTRProfile;

            // When in overview mode with no open tabs, there has not been created an
            // OTR profile yet. #getOffTheRecordProfile will create a profile if none
            // exists.
            assert lastUsedRegularProfile.hasPrimaryOTRProfile() || isInOverviewAndShowingOmnibox();
            // Return the primary OTR profile.
            return lastUsedRegularProfile.getPrimaryOTRProfile();
        }
        return lastUsedRegularProfile;
    }

    public void setLayoutStateProvider(LayoutStateProvider layoutStateProvider) {
        mLayoutStateProvider = layoutStateProvider;
    }

    public void setShouldShowOmniboxInOverviewMode(boolean shouldShowOmniboxInOverviewMode) {
        mShouldShowOmniboxInOverviewMode = shouldShowOmniboxInOverviewMode;
    }

    /**
     * Sets the primary color and changes the state for isUsingBrandColor.
     * @param color The primary color for the current tab.
     */
    public void setPrimaryColor(int color) {
        mPrimaryColor = color;
        updateUsingBrandColor();
    }

    private void updateUsingBrandColor() {
        mIsUsingBrandColor = !isIncognito()
                && mPrimaryColor
                        != ChromeColors.getDefaultThemeColor(mContext.getResources(), isIncognito())
                && hasTab() && !mTab.isNativePage();
    }

    @Override
    public int getPrimaryColor() {
        return isInOverviewAndShowingOmnibox()
                ? ChromeColors.getDefaultThemeColor(mContext.getResources(), isIncognito())
                : mPrimaryColor;
    }

    @Override
    public boolean isUsingBrandColor() {
        // If the overview is visible, force use of primary color, which is also overridden when the
        // overview is visible.
        return isInOverviewAndShowingOmnibox() || mIsUsingBrandColor;
    }

    @Override
    public boolean isOfflinePage() {
        return hasTab() && OfflinePageUtils.isOfflinePage(mTab);
    }

    @Override
    public boolean isPreview() {
        return hasTab() && Previews.isPreview(mTab);
    }

    @Override
    public boolean isPaintPreview() {
        return hasTab() && TabbedPaintPreview.get(mTab).isShowing();
    }

    @Override
    public int getSecurityLevel() {
        Tab tab = getTab();
        return getSecurityLevel(tab, isOfflinePage(), TrustedCdn.getPublisherUrl(tab));
    }

    @Override
    public int getPageClassification(boolean isFocusedFromFakebox) {
        if (mNativeLocationBarModelAndroid == 0) return PageClassification.INVALID_SPEC_VALUE;

        // Provide NTP as page class in overview mode (when Start Surface is enabled). No call
        // to the backend necessary or possible, since there is no tab or navigation entry.
        if (isInOverviewAndShowingOmnibox()) return PageClassification.NTP_VALUE;

        return LocationBarModelJni.get().getPageClassification(
                mNativeLocationBarModelAndroid, LocationBarModel.this, isFocusedFromFakebox);
    }

    @Override
    public int getSecurityIconResource(boolean isTablet) {
        return getSecurityIconResource(
                getSecurityLevel(), !isTablet, isOfflinePage(), isPreview(), isPaintPreview());
    }

    @Override
    @StringRes
    public int getSecurityIconContentDescriptionResourceId() {
        return SecurityStatusIcon.getSecurityIconContentDescriptionResourceId(getSecurityLevel());
    }

    @VisibleForTesting
    @ConnectionSecurityLevel
    int getSecurityLevel(Tab tab, boolean isOfflinePage, @Nullable String publisherUrl) {
        if (tab == null || isOfflinePage) {
            return ConnectionSecurityLevel.NONE;
        }

        if (publisherUrl != null) {
            assert getSecurityLevelFromStateModel(tab.getWebContents())
                    != ConnectionSecurityLevel.DANGEROUS;
            return (URI.create(publisherUrl).getScheme().equals(UrlConstants.HTTPS_SCHEME))
                    ? ConnectionSecurityLevel.SECURE
                    : ConnectionSecurityLevel.WARNING;
        }
        return getSecurityLevelFromStateModel(tab.getWebContents());
    }

    @VisibleForTesting
    @ConnectionSecurityLevel
    int getSecurityLevelFromStateModel(WebContents webContents) {
        int securityLevel = SecurityStateModel.getSecurityLevelForWebContents(webContents);
        return securityLevel;
    }

    @VisibleForTesting
    @DrawableRes
    int getSecurityIconResource(int securityLevel, boolean isSmallDevice, boolean isOfflinePage,
            boolean isPreview, boolean isPaintPreview) {
        // Paint Preview appears on top of WebContents and shows a visual representation of the page
        // that has been previously stored locally.
        if (isPaintPreview) return R.drawable.omnibox_info;

        // Checking for a preview first because one possible preview type is showing an offline page
        // on a slow connection. In this case, the previews UI takes precedence.
        if (isPreview) {
            return R.drawable.preview_pin_round;
        } else if (isOfflinePage) {
            return R.drawable.ic_offline_pin_24dp;
        }

        // Return early if native initialization hasn't been done yet.
        if ((securityLevel == ConnectionSecurityLevel.NONE
                    || securityLevel == ConnectionSecurityLevel.WARNING)
                && mNativeLocationBarModelAndroid == 0) {
            return R.drawable.omnibox_info;
        }

        boolean skipIconForNeutralState =
                !SearchEngineLogoUtils.shouldShowSearchEngineLogo(isIncognito())
                || mNtpDelegate.isCurrentlyVisible();

        return SecurityStatusIcon.getSecurityIconResource(securityLevel,
                SecurityStateModel.shouldShowDangerTriangleForWarningLevel(), isSmallDevice,
                skipIconForNeutralState);
    }

    @Override
    public @ColorRes int getSecurityIconColorStateList() {
        int securityLevel = getSecurityLevel();
        int color = getPrimaryColor();
        boolean needLightIcon = ColorUtils.shouldUseLightForegroundOnBackground(color);

        if (isIncognito() || needLightIcon) {
            // For a dark theme color, use light icons.
            return ToolbarColors.getThemedToolbarIconTintRes(true);
        }

        if (isPreview()) {
            // There will never be a preview in incognito. Always use the darker color rather than
            // incorporating with the block above.
            return R.color.locationbar_status_preview_color;
        }

        return ToolbarColors.getThemedToolbarIconTintRes(false);
    }

    /** @return The formatted URL suitable for editing. */
    public String getFormattedFullUrl() {
        if (mNativeLocationBarModelAndroid == 0) return "";
        return LocationBarModelJni.get().getFormattedFullURL(
                mNativeLocationBarModelAndroid, LocationBarModel.this);
    }

    /** @return The formatted URL suitable for display only. */
    public String getUrlForDisplay() {
        if (mNativeLocationBarModelAndroid == 0) return "";
        return LocationBarModelJni.get().getURLForDisplay(
                mNativeLocationBarModelAndroid, LocationBarModel.this);
    }

    @NativeMethods
    interface Natives {
        long init(LocationBarModel caller);
        void destroy(long nativeLocationBarModelAndroid, LocationBarModel caller);
        String getFormattedFullURL(long nativeLocationBarModelAndroid, LocationBarModel caller);
        String getURLForDisplay(long nativeLocationBarModelAndroid, LocationBarModel caller);
        int getPageClassification(long nativeLocationBarModelAndroid, LocationBarModel caller,
                boolean isFocusedFromFakebox);
    }
}