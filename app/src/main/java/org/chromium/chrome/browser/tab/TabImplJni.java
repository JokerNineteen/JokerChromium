package org.chromium.chrome.browser.tab;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.contextmenu.ContextMenuPopulatorFactory;
import org.chromium.content_public.browser.WebContents;
import org.chromium.content_public.common.ResourceRequestBody;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabImplJni implements TabImpl.Natives {
  private static TabImpl.Natives testInstance;

  public static final JniStaticTestMocker<TabImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TabImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public TabImpl fromWebContents(WebContents webContents) {
    return (TabImpl)GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_fromWebContents(webContents);
  }

  @Override
  public void init(TabImpl caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_init(caller);
  }

  @Override
  public void destroy(long nativeTabAndroid) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_destroy(nativeTabAndroid);
  }

  @Override
  public void initWebContents(long nativeTabAndroid, boolean incognito, boolean isBackgroundTab,
      WebContents webContents, int parentTabId, TabWebContentsDelegateAndroidImpl delegate,
      ContextMenuPopulatorFactory contextMenuPopulatorFactory) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_initWebContents(nativeTabAndroid, incognito, isBackgroundTab, webContents, parentTabId, delegate, contextMenuPopulatorFactory);
  }

  @Override
  public void updateDelegates(long nativeTabAndroid, TabWebContentsDelegateAndroidImpl delegate,
      ContextMenuPopulatorFactory contextMenuPopulatorFactory) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_updateDelegates(nativeTabAndroid, delegate, contextMenuPopulatorFactory);
  }

  @Override
  public void destroyWebContents(long nativeTabAndroid) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_destroyWebContents(nativeTabAndroid);
  }

  @Override
  public void releaseWebContents(long nativeTabAndroid) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_releaseWebContents(nativeTabAndroid);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeTabAndroid, WebContents webContents,
      int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_onPhysicalBackingSizeChanged(nativeTabAndroid, webContents, width, height);
  }

  @Override
  public int loadUrl(long nativeTabAndroid, String url, Origin initiatorOrigin, String extraHeaders,
      ResourceRequestBody postData, int transition, String referrerUrl, int referrerPolicy,
      boolean isRendererInitiated, boolean shoulReplaceCurrentEntry, boolean hasUserGesture,
      boolean shouldClearHistoryList, long inputStartTimestamp, long intentReceivedTimestamp,
      int userAgentOverrideOption) {
    return (int)GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_loadUrl(nativeTabAndroid, url, initiatorOrigin, extraHeaders, postData, transition, referrerUrl, referrerPolicy, isRendererInitiated, shoulReplaceCurrentEntry, hasUserGesture, shouldClearHistoryList, inputStartTimestamp, intentReceivedTimestamp, userAgentOverrideOption);
  }

  @Override
  public void setActiveNavigationEntryTitleForUrl(long nativeTabAndroid, String url, String title) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_setActiveNavigationEntryTitleForUrl(nativeTabAndroid, url, title);
  }

  @Override
  public void loadOriginalImage(long nativeTabAndroid) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_loadOriginalImage(nativeTabAndroid);
  }

  @Override
  public void setAddApi2TransitionToFutureNavigations(long nativeTabAndroid, boolean shouldAdd) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_setAddApi2TransitionToFutureNavigations(nativeTabAndroid, shouldAdd);
  }

  @Override
  public boolean getAddApi2TransitionToFutureNavigations(long nativeTabAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_getAddApi2TransitionToFutureNavigations(nativeTabAndroid);
  }

  @Override
  public void setHideFutureNavigations(long nativeTabAndroid, boolean hide) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_setHideFutureNavigations(nativeTabAndroid, hide);
  }

  @Override
  public boolean getHideFutureNavigations(long nativeTabAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_getHideFutureNavigations(nativeTabAndroid);
  }

  @Override
  public void setShouldBlockNewNotificationRequests(long nativeTabAndroid, boolean value) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_setShouldBlockNewNotificationRequests(nativeTabAndroid, value);
  }

  @Override
  public boolean getShouldBlockNewNotificationRequests(long nativeTabAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_tab_TabImpl_getShouldBlockNewNotificationRequests(nativeTabAndroid);
  }

  public static TabImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabImplJni();
  }
}
