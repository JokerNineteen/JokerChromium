package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordGenerationDialogBridgeJni implements PasswordGenerationDialogBridge.Natives {
  private static PasswordGenerationDialogBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordGenerationDialogBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void passwordAccepted(long nativePasswordGenerationDialogViewAndroid,
      PasswordGenerationDialogBridge caller, String generatedPassword) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordGenerationDialogBridge_passwordAccepted(nativePasswordGenerationDialogViewAndroid, caller, generatedPassword);
  }

  @Override
  public void passwordRejected(long nativePasswordGenerationDialogViewAndroid,
      PasswordGenerationDialogBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordGenerationDialogBridge_passwordRejected(nativePasswordGenerationDialogViewAndroid, caller);
  }

  public static PasswordGenerationDialogBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordGenerationDialogBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordGenerationDialogBridgeJni();
  }
}
