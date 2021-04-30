package org.chromium.chrome.browser.password_entry_edit;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CredentialEditBridgeJni implements CredentialEditBridge.Natives {
  private static CredentialEditBridge.Natives testInstance;

  public static final JniStaticTestMocker<CredentialEditBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getCredential(long nativeCredentialEditBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1entry_1edit_CredentialEditBridge_getCredential(nativeCredentialEditBridge);
  }

  @Override
  public void getExistingUsernames(long nativeCredentialEditBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1entry_1edit_CredentialEditBridge_getExistingUsernames(nativeCredentialEditBridge);
  }

  @Override
  public void saveChanges(long nativeCredentialEditBridge, String username, String password) {
    GEN_JNI.org_chromium_chrome_browser_password_1entry_1edit_CredentialEditBridge_saveChanges(nativeCredentialEditBridge, username, password);
  }

  @Override
  public void onUIDismissed(long nativeCredentialEditBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1entry_1edit_CredentialEditBridge_onUIDismissed(nativeCredentialEditBridge);
  }

  public static CredentialEditBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_entry_edit.CredentialEditBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CredentialEditBridgeJni();
  }
}
