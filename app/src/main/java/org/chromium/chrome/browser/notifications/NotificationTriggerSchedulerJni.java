package org.chromium.chrome.browser.notifications;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NotificationTriggerSchedulerJni implements NotificationTriggerScheduler.Natives {
  private static NotificationTriggerScheduler.Natives testInstance;

  public static final JniStaticTestMocker<NotificationTriggerScheduler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.NotificationTriggerScheduler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.NotificationTriggerScheduler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void triggerNotifications() {
    GEN_JNI.org_chromium_chrome_browser_notifications_NotificationTriggerScheduler_triggerNotifications();
  }

  public static NotificationTriggerScheduler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.NotificationTriggerScheduler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationTriggerSchedulerJni();
  }
}
