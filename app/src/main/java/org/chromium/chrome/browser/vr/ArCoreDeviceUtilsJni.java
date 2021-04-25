package org.chromium.chrome.browser.vr;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreDeviceUtilsJni implements ArCoreDeviceUtils.ArCodeDeviceUtilsNative {
  private static ArCoreDeviceUtils.ArCodeDeviceUtilsNative testInstance;

  public static final JniStaticTestMocker<ArCoreDeviceUtils.ArCodeDeviceUtilsNative> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.ArCoreDeviceUtils.ArCodeDeviceUtilsNative>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.ArCoreDeviceUtils.ArCodeDeviceUtilsNative instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void installArCoreDeviceProviderFactory() {
    GEN_JNI.org_chromium_chrome_browser_vr_ArCoreDeviceUtils_installArCoreDeviceProviderFactory();
  }

  public static ArCoreDeviceUtils.ArCodeDeviceUtilsNative get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.ArCoreDeviceUtils.ArCodeDeviceUtilsNative. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ArCoreDeviceUtilsJni();
  }
}
