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
final class PasswordStoreBridgeJni implements PasswordStoreBridge.Natives {
  private static PasswordStoreBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordStoreBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.PasswordStoreBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.PasswordStoreBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PasswordStoreBridge passwordStoreBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_init(passwordStoreBridge);
  }

  @Override
  public void insertPasswordCredential(long nativePasswordStoreBridge,
      PasswordStoreCredential credential) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_insertPasswordCredential(nativePasswordStoreBridge, credential);
  }

  @Override
  public boolean editPassword(long nativePasswordStoreBridge, PasswordStoreCredential credential,
      String newPassword) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_editPassword(nativePasswordStoreBridge, credential, newPassword);
  }

  @Override
  public int getPasswordStoreCredentialsCount(long nativePasswordStoreBridge) {
    return (int)GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_getPasswordStoreCredentialsCount(nativePasswordStoreBridge);
  }

  @Override
  public void getAllCredentials(long nativePasswordStoreBridge,
      PasswordStoreCredential[] credentials) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_getAllCredentials(nativePasswordStoreBridge, credentials);
  }

  @Override
  public void clearAllPasswords(long nativePasswordStoreBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_clearAllPasswords(nativePasswordStoreBridge);
  }

  @Override
  public void destroy(long nativePasswordStoreBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_PasswordStoreBridge_destroy(nativePasswordStoreBridge);
  }

  public static PasswordStoreBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.PasswordStoreBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordStoreBridgeJni();
  }
}
