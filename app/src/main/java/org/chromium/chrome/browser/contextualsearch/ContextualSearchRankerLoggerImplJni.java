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
final class ContextualSearchRankerLoggerImplJni implements ContextualSearchRankerLoggerImpl.Natives {
  private static ContextualSearchRankerLoggerImpl.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchRankerLoggerImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchRankerLoggerImpl caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_init(caller);
  }

  @Override
  public void destroy(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_destroy(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public void logInt32(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller, String featureString, int value) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_logInt32(nativeContextualSearchRankerLoggerImpl, caller, featureString, value);
  }

  @Override
  public void setupLoggingAndRanker(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller, WebContents basePageWebContents) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_setupLoggingAndRanker(nativeContextualSearchRankerLoggerImpl, caller, basePageWebContents);
  }

  @Override
  public int runInference(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_runInference(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public void writeLogAndReset(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_writeLogAndReset(nativeContextualSearchRankerLoggerImpl, caller);
  }

  @Override
  public boolean isQueryEnabled(long nativeContextualSearchRankerLoggerImpl,
      ContextualSearchRankerLoggerImpl caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchRankerLoggerImpl_isQueryEnabled(nativeContextualSearchRankerLoggerImpl, caller);
  }

  public static ContextualSearchRankerLoggerImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchRankerLoggerImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchRankerLoggerImplJni();
  }
}
