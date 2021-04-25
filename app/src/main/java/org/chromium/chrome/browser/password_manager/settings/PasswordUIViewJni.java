package org.chromium.chrome.browser.password_manager.settings;

import android.content.Context;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.IntStringCallback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordUIViewJni implements PasswordUIView.Natives {
  private static PasswordUIView.Natives testInstance;

  public static final JniStaticTestMocker<PasswordUIView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_manager.settings.PasswordUIView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_manager.settings.PasswordUIView.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PasswordUIView caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_init(caller);
  }

  @Override
  public void updatePasswordLists(long nativePasswordUIViewAndroid, PasswordUIView caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_updatePasswordLists(nativePasswordUIViewAndroid, caller);
  }

  @Override
  public SavedPasswordEntry getSavedPasswordEntry(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    return (SavedPasswordEntry)GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_getSavedPasswordEntry(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public String getSavedPasswordException(long nativePasswordUIViewAndroid, PasswordUIView caller,
      int index) {
    return (String)GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_getSavedPasswordException(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public void handleRemoveSavedPasswordEntry(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_handleRemoveSavedPasswordEntry(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public void handleRemoveSavedPasswordException(long nativePasswordUIViewAndroid,
      PasswordUIView caller, int index) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_handleRemoveSavedPasswordException(nativePasswordUIViewAndroid, caller, index);
  }

  @Override
  public String getAccountDashboardURL() {
    return (String)GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_getAccountDashboardURL();
  }

  @Override
  public boolean hasAccountForLeakCheckRequest() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_hasAccountForLeakCheckRequest();
  }

  @Override
  public void destroy(long nativePasswordUIViewAndroid, PasswordUIView caller) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_destroy(nativePasswordUIViewAndroid, caller);
  }

  @Override
  public void handleSerializePasswords(long nativePasswordUIViewAndroid, PasswordUIView caller,
      String targetPath, IntStringCallback successCallback, Callback<String> errorCallback) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_handleSerializePasswords(nativePasswordUIViewAndroid, caller, targetPath, successCallback, errorCallback);
  }

  @Override
  public void handleShowPasswordEntryEditingView(long nativePasswordUIViewAndroid,
      PasswordUIView caller, Context context, int index) {
    GEN_JNI.org_chromium_chrome_browser_password_1manager_settings_PasswordUIView_handleShowPasswordEntryEditingView(nativePasswordUIViewAndroid, caller, context, index);
  }

  public static PasswordUIView.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_manager.settings.PasswordUIView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordUIViewJni();
  }
}
