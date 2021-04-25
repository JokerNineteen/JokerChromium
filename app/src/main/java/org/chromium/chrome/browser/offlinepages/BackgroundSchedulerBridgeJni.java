package org.chromium.chrome.browser.offlinepages;

import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BackgroundSchedulerBridgeJni implements BackgroundSchedulerBridge.Natives {
  private static BackgroundSchedulerBridge.Natives testInstance;

  public static final JniStaticTestMocker<BackgroundSchedulerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.BackgroundSchedulerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.BackgroundSchedulerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean startScheduledProcessing(boolean powerConnected, int batteryPercentage,
      int netConnectionType, Callback<Boolean> callback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_BackgroundSchedulerBridge_startScheduledProcessing(powerConnected, batteryPercentage, netConnectionType, callback);
  }

  @Override
  public void stopScheduledProcessing() {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_BackgroundSchedulerBridge_stopScheduledProcessing();
  }

  public static BackgroundSchedulerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.BackgroundSchedulerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BackgroundSchedulerBridgeJni();
  }
}
