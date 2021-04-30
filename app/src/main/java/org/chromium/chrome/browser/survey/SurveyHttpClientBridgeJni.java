package org.chromium.chrome.browser.survey;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SurveyHttpClientBridgeJni implements SurveyHttpClientBridge.Natives {
  private static SurveyHttpClientBridge.Natives testInstance;

  public static final JniStaticTestMocker<SurveyHttpClientBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.survey.SurveyHttpClientBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.survey.SurveyHttpClientBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_survey_SurveyHttpClientBridge_init(profile);
  }

  @Override
  public void destroy(long nativeSurveyHttpClientBridge) {
    GEN_JNI.org_chromium_chrome_browser_survey_SurveyHttpClientBridge_destroy(nativeSurveyHttpClientBridge);
  }

  @Override
  public void sendNetworkRequest(long nativeSurveyHttpClientBridge, GURL gurl, String requestType,
      byte[] body, String[] headerKeys, String[] headerValues,
      Callback<SurveyHttpClientBridge.HttpResponse> resultCallback) {
    GEN_JNI.org_chromium_chrome_browser_survey_SurveyHttpClientBridge_sendNetworkRequest(nativeSurveyHttpClientBridge, gurl, requestType, body, headerKeys, headerValues, resultCallback);
  }

  public static SurveyHttpClientBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.survey.SurveyHttpClientBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SurveyHttpClientBridgeJni();
  }
}
