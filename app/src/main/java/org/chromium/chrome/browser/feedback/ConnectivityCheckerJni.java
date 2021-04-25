package org.chromium.chrome.browser.feedback;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ConnectivityCheckerJni implements ConnectivityChecker.Natives {
  private static ConnectivityChecker.Natives testInstance;

  public static final JniStaticTestMocker<ConnectivityChecker.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feedback.ConnectivityChecker.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feedback.ConnectivityChecker.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void checkConnectivity(Profile profile, String url, long timeoutMs,
      ConnectivityChecker.ConnectivityCheckerCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_feedback_ConnectivityChecker_checkConnectivity(profile, url, timeoutMs, callback);
  }

  @Override
  public boolean isUrlValid(String url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feedback_ConnectivityChecker_isUrlValid(url);
  }

  public static ConnectivityChecker.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feedback.ConnectivityChecker.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ConnectivityCheckerJni();
  }
}
