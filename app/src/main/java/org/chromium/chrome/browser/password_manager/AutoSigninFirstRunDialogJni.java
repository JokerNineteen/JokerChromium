package org.chromium.chrome.browser.password_manager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutoSigninFirstRunDialogJni implements AutoSigninFirstRunDialog.Natives {
  private static AutoSigninFirstRunDialog.Natives testInstance;

  public static final JniStaticTestMocker<AutoSigninFirstRunDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onTurnOffClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AutoSigninFirstRunDialog_onTurnOffClicked(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void onOkClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AutoSigninFirstRunDialog_onOkClicked(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void destroy(long nativeAutoSigninFirstRunDialogAndroid, AutoSigninFirstRunDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AutoSigninFirstRunDialog_destroy(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  @Override
  public void onLinkClicked(long nativeAutoSigninFirstRunDialogAndroid,
      AutoSigninFirstRunDialog caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_AutoSigninFirstRunDialog_onLinkClicked(nativeAutoSigninFirstRunDialogAndroid, caller);
  }

  public static AutoSigninFirstRunDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.AutoSigninFirstRunDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutoSigninFirstRunDialogJni();
  }
}
