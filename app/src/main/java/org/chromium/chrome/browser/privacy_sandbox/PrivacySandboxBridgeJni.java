package org.chromium.chrome.browser.privacy_sandbox;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrivacySandboxBridgeJni implements PrivacySandboxBridge.Natives {
  private static PrivacySandboxBridge.Natives testInstance;

  public static final JniStaticTestMocker<PrivacySandboxBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isPrivacySandboxSettingsFunctional() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxSettingsFunctional();
  }

  @Override
  public boolean isPrivacySandboxEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxEnabled();
  }

  @Override
  public boolean isPrivacySandboxManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_isPrivacySandboxManaged();
  }

  @Override
  public void setPrivacySandboxEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_1sandbox_PrivacySandboxBridge_setPrivacySandboxEnabled(enabled);
  }

  public static PrivacySandboxBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.privacy_sandbox.PrivacySandboxBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrivacySandboxBridgeJni();
  }
}
