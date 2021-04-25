package org.chromium.components.webxr;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreInstallUtilsJni implements ArCoreInstallUtils.ArInstallHelperNative {
  private static ArCoreInstallUtils.ArInstallHelperNative testInstance;

  public static final JniStaticTestMocker<ArCoreInstallUtils.ArInstallHelperNative> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webxr.ArCoreInstallUtils.ArInstallHelperNative>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.webxr.ArCoreInstallUtils.ArInstallHelperNative instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRequestInstallSupportedArCoreResult(long nativeArCoreInstallHelper,
      boolean success) {
    GEN_JNI.org_chromium_components_webxr_ArCoreInstallUtils_onRequestInstallSupportedArCoreResult(nativeArCoreInstallHelper, success);
  }

  public static ArCoreInstallUtils.ArInstallHelperNative get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webxr.ArCoreInstallUtils.ArInstallHelperNative. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ArCoreInstallUtilsJni();
  }
}
