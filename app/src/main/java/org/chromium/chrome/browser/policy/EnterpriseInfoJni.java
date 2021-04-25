package org.chromium.chrome.browser.policy;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class EnterpriseInfoJni implements EnterpriseInfo.Natives {
  private static EnterpriseInfo.Natives testInstance;

  public static final JniStaticTestMocker<EnterpriseInfo.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.policy.EnterpriseInfo.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.policy.EnterpriseInfo.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void updateNativeOwnedState(boolean hasProfileOwnerApp, boolean hasDeviceOwnerApp) {
    GEN_JNI.org_chromium_chrome_browser_policy_EnterpriseInfo_updateNativeOwnedState(hasProfileOwnerApp, hasDeviceOwnerApp);
  }

  public static EnterpriseInfo.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.policy.EnterpriseInfo.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EnterpriseInfoJni();
  }
}
