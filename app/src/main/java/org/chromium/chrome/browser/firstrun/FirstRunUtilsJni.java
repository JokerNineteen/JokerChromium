package org.chromium.chrome.browser.firstrun;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class FirstRunUtilsJni implements FirstRunUtils.Natives {
  private static FirstRunUtils.Natives testInstance;

  public static final JniStaticTestMocker<FirstRunUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.firstrun.FirstRunUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.firstrun.FirstRunUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean getFirstRunEulaAccepted() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_firstrun_FirstRunUtils_getFirstRunEulaAccepted();
  }

  @Override
  public void setEulaAccepted() {
    GEN_JNI.org_chromium_chrome_browser_firstrun_FirstRunUtils_setEulaAccepted();
  }

  @Override
  public boolean getCctTosDialogEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_firstrun_FirstRunUtils_getCctTosDialogEnabled();
  }

  public static FirstRunUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.firstrun.FirstRunUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FirstRunUtilsJni();
  }
}
