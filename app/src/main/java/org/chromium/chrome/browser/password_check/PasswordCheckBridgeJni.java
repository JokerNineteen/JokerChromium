package org.chromium.chrome.browser.password_check;

import android.app.Activity;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PasswordCheckBridgeJni implements PasswordCheckBridge.Natives {
  private static PasswordCheckBridge.Natives testInstance;

  public static final JniStaticTestMocker<PasswordCheckBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.password_check.PasswordCheckBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.password_check.PasswordCheckBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long create(PasswordCheckBridge passwordCheckBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_create(passwordCheckBridge);
  }

  @Override
  public void startCheck(long nativePasswordCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_startCheck(nativePasswordCheckBridge);
  }

  @Override
  public void stopCheck(long nativePasswordCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_stopCheck(nativePasswordCheckBridge);
  }

  @Override
  public boolean areScriptsRefreshed(long nativePasswordCheckBridge) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_areScriptsRefreshed(nativePasswordCheckBridge);
  }

  @Override
  public void refreshScripts(long nativePasswordCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_refreshScripts(nativePasswordCheckBridge);
  }

  @Override
  public long getLastCheckTimestamp(long nativePasswordCheckBridge) {
    return (long)GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_getLastCheckTimestamp(nativePasswordCheckBridge);
  }

  @Override
  public int getCompromisedCredentialsCount(long nativePasswordCheckBridge) {
    return (int)GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_getCompromisedCredentialsCount(nativePasswordCheckBridge);
  }

  @Override
  public int getSavedPasswordsCount(long nativePasswordCheckBridge) {
    return (int)GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_getSavedPasswordsCount(nativePasswordCheckBridge);
  }

  @Override
  public void getCompromisedCredentials(long nativePasswordCheckBridge,
      CompromisedCredential[] credentials) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_getCompromisedCredentials(nativePasswordCheckBridge, credentials);
  }

  @Override
  public void launchCheckupInAccount(long nativePasswordCheckBridge, Activity activity) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_launchCheckupInAccount(nativePasswordCheckBridge, activity);
  }

  @Override
  public void updateCredential(long nativePasswordCheckBridge, CompromisedCredential credential,
      String newPassword) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_updateCredential(nativePasswordCheckBridge, credential, newPassword);
  }

  @Override
  public void removeCredential(long nativePasswordCheckBridge, CompromisedCredential credentials) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_removeCredential(nativePasswordCheckBridge, credentials);
  }

  @Override
  public void destroy(long nativePasswordCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_password_1check_PasswordCheckBridge_destroy(nativePasswordCheckBridge);
  }

  public static PasswordCheckBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.password_check.PasswordCheckBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PasswordCheckBridgeJni();
  }
}
