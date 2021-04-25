package org.chromium.chrome.browser.vr;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VrModuleProviderJni implements VrModuleProvider.Natives {
  private static VrModuleProvider.Natives testInstance;

  public static final JniStaticTestMocker<VrModuleProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.vr.VrModuleProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.vr.VrModuleProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void registerJni() {
    GEN_JNI.org_chromium_chrome_browser_vr_VrModuleProvider_registerJni();
  }

  @Override
  public void onInstalledModule(long nativeVrModuleProvider, VrModuleProvider caller,
      boolean success) {
    GEN_JNI.org_chromium_chrome_browser_vr_VrModuleProvider_onInstalledModule(nativeVrModuleProvider, caller, success);
  }

  public static VrModuleProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.vr.VrModuleProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VrModuleProviderJni();
  }
}
