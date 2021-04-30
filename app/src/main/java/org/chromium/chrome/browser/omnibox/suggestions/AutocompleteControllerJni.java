package org.chromium.chrome.browser.omnibox.suggestions;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;
import org.chromium.components.omnibox.AutocompleteMatch;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutocompleteControllerJni implements AutocompleteController.Natives {
  private static AutocompleteController.Natives testInstance;

  public static final JniStaticTestMocker<AutocompleteController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(AutocompleteController caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_init(caller, profile);
  }

  @Override
  public void releaseJavaObject(long nativeAutocompleteControllerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_releaseJavaObject(nativeAutocompleteControllerAndroid);
  }

  @Override
  public void start(long nativeAutocompleteControllerAndroid, AutocompleteController caller,
      String text, int cursorPosition, String desiredTld, String currentUrl, int pageClassification,
      boolean preventInlineAutocomplete, boolean preferKeyword, boolean allowExactKeywordMatch,
      boolean wantAsynchronousMatches, String queryTileId, boolean isQueryStartedFromTiles) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_start(nativeAutocompleteControllerAndroid, caller, text, cursorPosition, desiredTld, currentUrl, pageClassification, preventInlineAutocomplete, preferKeyword, allowExactKeywordMatch, wantAsynchronousMatches, queryTileId, isQueryStartedFromTiles);
  }

  @Override
  public AutocompleteMatch classify(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller, String text, boolean focusedFromFakebox) {
    return (AutocompleteMatch)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_classify(nativeAutocompleteControllerAndroid, caller, text, focusedFromFakebox);
  }

  @Override
  public void stop(long nativeAutocompleteControllerAndroid, AutocompleteController caller,
      boolean clearResults) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_stop(nativeAutocompleteControllerAndroid, caller, clearResults);
  }

  @Override
  public void resetSession(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_resetSession(nativeAutocompleteControllerAndroid, caller);
  }

  @Override
  public void onSuggestionSelected(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller, int selectedIndex, int disposition, int hashCode,
      String currentPageUrl, int pageClassification, long elapsedTimeSinceModified,
      int completedLength, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_onSuggestionSelected(nativeAutocompleteControllerAndroid, caller, selectedIndex, disposition, hashCode, currentPageUrl, pageClassification, elapsedTimeSinceModified, completedLength, webContents);
  }

  @Override
  public void onOmniboxFocused(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller, String omniboxText, String currentUrl, int pageClassification,
      String currentTitle) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_onOmniboxFocused(nativeAutocompleteControllerAndroid, caller, omniboxText, currentUrl, pageClassification, currentTitle);
  }

  @Override
  public void deleteSuggestion(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller, int selectedIndex, int hashCode) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_deleteSuggestion(nativeAutocompleteControllerAndroid, caller, selectedIndex, hashCode);
  }

  @Override
  public GURL updateMatchDestinationURLWithQueryFormulationTime(
      long nativeAutocompleteControllerAndroid, AutocompleteController caller, int selectedIndex,
      int hashCode, long elapsedTimeSinceInputChange, String newQueryText,
      String[] newQueryParams) {
    return (GURL)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_updateMatchDestinationURLWithQueryFormulationTime(nativeAutocompleteControllerAndroid, caller, selectedIndex, hashCode, elapsedTimeSinceInputChange, newQueryText, newQueryParams);
  }

  @Override
  public Tab findMatchingTabWithUrl(long nativeAutocompleteControllerAndroid,
      AutocompleteController caller, GURL url) {
    return (Tab)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_findMatchingTabWithUrl(nativeAutocompleteControllerAndroid, caller, url);
  }

  @Override
  public void setVoiceMatches(long nativeAutocompleteControllerAndroid, String[] matches,
      float[] confidenceScores) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_setVoiceMatches(nativeAutocompleteControllerAndroid, matches, confidenceScores);
  }

  @Override
  public String qualifyPartialURLQuery(String query) {
    return (String)GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_qualifyPartialURLQuery(query);
  }

  @Override
  public void prefetchZeroSuggestResults() {
    GEN_JNI.org_chromium_chrome_browser_omnibox_suggestions_AutocompleteController_prefetchZeroSuggestResults();
  }

  public static AutocompleteController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.omnibox.suggestions.AutocompleteController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutocompleteControllerJni();
  }
}
