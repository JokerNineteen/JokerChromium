package org.chromium.chrome.browser.usage_stats;

import android.graphics.Bitmap;
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
final class NotificationSuspenderJni implements NotificationSuspender.Natives {
  private static NotificationSuspender.Natives testInstance;

  public static final JniStaticTestMocker<NotificationSuspender.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void storeNotificationResources(Profile profile, String[] notificationIds,
      String[] origins, Bitmap[] resources) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_NotificationSuspender_storeNotificationResources(profile, notificationIds, origins, resources);
  }

  @Override
  public void reDisplayNotifications(Profile profile, String[] origins) {
    GEN_JNI.org_chromium_chrome_browser_usage_1stats_NotificationSuspender_reDisplayNotifications(profile, origins);
  }

  public static NotificationSuspender.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.usage_stats.NotificationSuspender.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationSuspenderJni();
  }
}
