package org.chromium.chrome.browser.notifications.scheduler;

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
final class NotificationSchedulerTaskJni implements NotificationSchedulerTask.Natives {
  private static NotificationSchedulerTask.Natives testInstance;

  public static final JniStaticTestMocker<NotificationSchedulerTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartTask(NotificationSchedulerTask caller, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_notifications_scheduler_NotificationSchedulerTask_onStartTask(caller, callback);
  }

  @Override
  public boolean onStopTask(NotificationSchedulerTask caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_notifications_scheduler_NotificationSchedulerTask_onStopTask(caller);
  }

  public static NotificationSchedulerTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.scheduler.NotificationSchedulerTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationSchedulerTaskJni();
  }
}
