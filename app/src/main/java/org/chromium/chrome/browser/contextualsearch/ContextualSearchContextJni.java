package org.chromium.chrome.browser.contextualsearch;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchContextJni implements ContextualSearchContext.Natives {
  private static ContextualSearchContext.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchContext.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchContext caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_init(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchContext, ContextualSearchContext caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_destroy(nativeContextualSearchContext, caller);
  }

  @Override
  public void setResolveProperties(long nativeContextualSearchContext,
      ContextualSearchContext caller, String homeCountry, boolean doSendBasePageUrl,
      long previousEventId, int previousEventResults) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_setResolveProperties(nativeContextualSearchContext, caller, homeCountry, doSendBasePageUrl, previousEventId, previousEventResults);
  }

  @Override
  public void adjustSelection(long nativeContextualSearchContext, ContextualSearchContext caller,
      int startAdjust, int endAdjust) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_adjustSelection(nativeContextualSearchContext, caller, startAdjust, endAdjust);
  }

  @Override
  public void setContent(long nativeContextualSearchContext, ContextualSearchContext caller,
      String content, int selectionStart, int selectionEnd) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_setContent(nativeContextualSearchContext, caller, content, selectionStart, selectionEnd);
  }

  @Override
  public String detectLanguage(long nativeContextualSearchContext, ContextualSearchContext caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_detectLanguage(nativeContextualSearchContext, caller);
  }

  @Override
  public void setTranslationLanguages(long nativeContextualSearchContext,
      ContextualSearchContext caller, String detectedLanguage, String targetLanguage,
      String fluentLanguages) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_setTranslationLanguages(nativeContextualSearchContext, caller, detectedLanguage, targetLanguage, fluentLanguages);
  }

  @Override
  public void prepareToResolve(long nativeContextualSearchContext, ContextualSearchContext caller,
      boolean isExactSearch, String relatedSearchesStamp) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchContext_prepareToResolve(nativeContextualSearchContext, caller, isExactSearch, relatedSearchesStamp);
  }

  public static ContextualSearchContext.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchContext.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchContextJni();
  }
}
