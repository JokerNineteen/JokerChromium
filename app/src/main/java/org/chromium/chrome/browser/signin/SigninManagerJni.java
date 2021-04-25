package org.chromium.chrome.browser.signin;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.CoreAccountInfo;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SigninManagerJni implements SigninManager.Natives {
  private static SigninManager.Natives testInstance;

  public static final JniStaticTestMocker<SigninManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.SigninManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.SigninManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isSigninAllowedByPolicy(long nativeSigninManagerAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_isSigninAllowedByPolicy(nativeSigninManagerAndroid);
  }

  @Override
  public boolean isForceSigninEnabled(long nativeSigninManagerAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_isForceSigninEnabled(nativeSigninManagerAndroid);
  }

  @Override
  public String extractDomainName(String email) {
    return (String)GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_extractDomainName(email);
  }

  @Override
  public void fetchAndApplyCloudPolicy(long nativeSigninManagerAndroid, CoreAccountInfo account,
      Runnable callback) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_fetchAndApplyCloudPolicy(nativeSigninManagerAndroid, account, callback);
  }

  @Override
  public void stopApplyingCloudPolicy(long nativeSigninManagerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_stopApplyingCloudPolicy(nativeSigninManagerAndroid);
  }

  @Override
  public void isAccountManaged(long nativeSigninManagerAndroid, CoreAccountInfo account,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_isAccountManaged(nativeSigninManagerAndroid, account, callback);
  }

  @Override
  public String getManagementDomain(long nativeSigninManagerAndroid) {
    return (String)GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_getManagementDomain(nativeSigninManagerAndroid);
  }

  @Override
  public void logOutAllAccountsForMobileIdentityConsistencyRollback(
      long nativeSigninManagerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_logOutAllAccountsForMobileIdentityConsistencyRollback(nativeSigninManagerAndroid);
  }

  @Override
  public void wipeProfileData(long nativeSigninManagerAndroid, Runnable callback) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_wipeProfileData(nativeSigninManagerAndroid, callback);
  }

  @Override
  public void wipeGoogleServiceWorkerCaches(long nativeSigninManagerAndroid, Runnable callback) {
    GEN_JNI.org_chromium_chrome_browser_signin_SigninManager_wipeGoogleServiceWorkerCaches(nativeSigninManagerAndroid, callback);
  }

  public static SigninManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.SigninManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SigninManagerJni();
  }
}
