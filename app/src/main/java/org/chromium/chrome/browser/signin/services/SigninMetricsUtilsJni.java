package org.chromium.chrome.browser.signin.services;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class SigninMetricsUtilsJni implements SigninMetricsUtils.Natives {
  private static SigninMetricsUtils.Natives testInstance;

  public static final JniStaticTestMocker<SigninMetricsUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.services.SigninMetricsUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.services.SigninMetricsUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void logProfileAccountManagementMenu(int metric, int gaiaServiceType) {
    GEN_JNI.org_chromium_chrome_browser_signin_services_SigninMetricsUtils_logProfileAccountManagementMenu(metric, gaiaServiceType);
  }

  @Override
  public void logSigninUserActionForAccessPoint(int accessPoint) {
    GEN_JNI.org_chromium_chrome_browser_signin_services_SigninMetricsUtils_logSigninUserActionForAccessPoint(accessPoint);
  }

  @Override
  public boolean logWebSignin(String[] gaiaIds) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_signin_services_SigninMetricsUtils_logWebSignin(gaiaIds);
  }

  public static SigninMetricsUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.services.SigninMetricsUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SigninMetricsUtilsJni();
  }
}
