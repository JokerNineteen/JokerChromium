package org.chromium.chrome.browser.contextualsearch;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchManagerJni implements ContextualSearchManager.Natives {
  private static ContextualSearchManager.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchManager caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_init(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchManager, ContextualSearchManager caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_destroy(nativeContextualSearchManager, caller);
  }

  @Override
  public void startSearchTermResolutionRequest(long nativeContextualSearchManager,
      ContextualSearchManager caller, ContextualSearchContext contextualSearchContext,
      WebContents baseWebContents) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_startSearchTermResolutionRequest(nativeContextualSearchManager, caller, contextualSearchContext, baseWebContents);
  }

  @Override
  public void gatherSurroundingText(long nativeContextualSearchManager,
      ContextualSearchManager caller, ContextualSearchContext contextualSearchContext,
      WebContents baseWebContents) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_gatherSurroundingText(nativeContextualSearchManager, caller, contextualSearchContext, baseWebContents);
  }

  @Override
  public void allowlistContextualSearchJsApiUrl(long nativeContextualSearchManager,
      ContextualSearchManager caller, String url) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_allowlistContextualSearchJsApiUrl(nativeContextualSearchManager, caller, url);
  }

  @Override
  public void enableContextualSearchJsApiForWebContents(long nativeContextualSearchManager,
      ContextualSearchManager caller, WebContents overlayWebContents) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchManager_enableContextualSearchJsApiForWebContents(nativeContextualSearchManager, caller, overlayWebContents);
  }

  public static ContextualSearchManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchManagerJni();
  }
}
