package org.chromium.chrome.browser.navigation_predictor;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NavigationPredictorBridgeJni implements NavigationPredictorBridge.Natives {
  private static NavigationPredictorBridge.Natives testInstance;

  public static final JniStaticTestMocker<NavigationPredictorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onActivityWarmResumed() {
    GEN_JNI.org_chromium_chrome_browser_navigation_1predictor_NavigationPredictorBridge_onActivityWarmResumed();
  }

  @Override
  public void onColdStart() {
    GEN_JNI.org_chromium_chrome_browser_navigation_1predictor_NavigationPredictorBridge_onColdStart();
  }

  @Override
  public void onPause() {
    GEN_JNI.org_chromium_chrome_browser_navigation_1predictor_NavigationPredictorBridge_onPause();
  }

  public static NavigationPredictorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.navigation_predictor.NavigationPredictorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NavigationPredictorBridgeJni();
  }
}
