package org.chromium.chrome.browser.omaha.notification;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UpdateNotificationServiceBridgeJni implements UpdateNotificationServiceBridge.Natives {
  private static UpdateNotificationServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<UpdateNotificationServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.omaha.notification.UpdateNotificationServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.omaha.notification.UpdateNotificationServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void schedule(String title, String message, int state, boolean shouldShowImmediately) {
    GEN_JNI.org_chromium_chrome_browser_omaha_notification_UpdateNotificationServiceBridge_schedule(title, message, state, shouldShowImmediately);
  }

  public static UpdateNotificationServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.omaha.notification.UpdateNotificationServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UpdateNotificationServiceBridgeJni();
  }
}
