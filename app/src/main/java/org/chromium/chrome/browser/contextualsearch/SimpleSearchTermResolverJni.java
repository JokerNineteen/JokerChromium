package org.chromium.chrome.browser.contextualsearch;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SimpleSearchTermResolverJni implements SimpleSearchTermResolver.Natives {
  private static SimpleSearchTermResolver.Natives testInstance;

  public static final JniStaticTestMocker<SimpleSearchTermResolver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.SimpleSearchTermResolver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.SimpleSearchTermResolver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SimpleSearchTermResolver caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_SimpleSearchTermResolver_init(caller);
  }

  @Override
  public void destroy(long nativeSimpleSearchTermResolver, SimpleSearchTermResolver caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_SimpleSearchTermResolver_destroy(nativeSimpleSearchTermResolver, caller);
  }

  @Override
  public void startSearchTermResolutionRequest(long nativeSimpleSearchTermResolver,
      SimpleSearchTermResolver caller, ContextualSearchContext contextualSearchContext,
      WebContents baseWebContents) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_SimpleSearchTermResolver_startSearchTermResolutionRequest(nativeSimpleSearchTermResolver, caller, contextualSearchContext, baseWebContents);
  }

  public static SimpleSearchTermResolver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.SimpleSearchTermResolver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SimpleSearchTermResolverJni();
  }
}
