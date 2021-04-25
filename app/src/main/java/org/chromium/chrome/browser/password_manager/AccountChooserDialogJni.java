package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AccountChooserDialogJni implements AccountChooserDialog.Natives {
  private static AccountChooserDialog.Natives testInstance;

  public static final JniStaticTestMocker<AccountChooserDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialClicked(long nativeAccountChooserDialogAndroid,
      AccountChooserDialog caller, int credentialId, boolean signinButtonClicked) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AccountChooserDialog_onCredentialClicked(nativeAccountChooserDialogAndroid, caller, credentialId, signinButtonClicked);
  }

  @Override
  public void cancelDialog(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AccountChooserDialog_cancelDialog(nativeAccountChooserDialogAndroid, caller);
  }

  @Override
  public void destroy(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AccountChooserDialog_destroy(nativeAccountChooserDialogAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeAccountChooserDialogAndroid, AccountChooserDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AccountChooserDialog_onLinkClicked(nativeAccountChooserDialogAndroid, caller);
  }

  public static AccountChooserDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.AccountChooserDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AccountChooserDialogJni();
  }
}
