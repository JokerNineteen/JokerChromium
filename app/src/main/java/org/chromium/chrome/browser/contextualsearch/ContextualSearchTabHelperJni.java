package org.chromium.chrome.browser.contextualsearch;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchTabHelperJni implements ContextualSearchTabHelper.Natives {
  private static ContextualSearchTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchTabHelper caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchTabHelper_init(caller, profile);
  }

  @Override
  public void installUnhandledTapNotifierIfNeeded(long nativeContextualSearchTabHelper,
      ContextualSearchTabHelper caller, WebContents webContents, float pxToDpScaleFactor) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchTabHelper_installUnhandledTapNotifierIfNeeded(nativeContextualSearchTabHelper, caller, webContents, pxToDpScaleFactor);
  }

  @Override
  public void destroy(long nativeContextualSearchTabHelper, ContextualSearchTabHelper caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_ContextualSearchTabHelper_destroy(nativeContextualSearchTabHelper, caller);
  }

  public static ContextualSearchTabHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.ContextualSearchTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchTabHelperJni();
  }
}
