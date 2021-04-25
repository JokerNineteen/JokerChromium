package org.chromium.chrome.browser.notifications;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class NotificationPlatformBridgeJni implements NotificationPlatformBridge.Natives {
  private static NotificationPlatformBridge.Natives testInstance;

  public static final JniStaticTestMocker<NotificationPlatformBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void initializeNotificationPlatformBridge() {
    GEN_JNI.org_chromium_chrome_browser_notifications_NotificationPlatformBridge_initializeNotificationPlatformBridge();
  }

  @Override
  public void onNotificationClicked(long nativeNotificationPlatformBridgeAndroid,
      NotificationPlatformBridge caller, String notificationId, int notificationType, String origin,
      String scopeUrl, String profileId, boolean incognito, String webApkPackage, int actionIndex,
      String reply) {
    GEN_JNI.org_chromium_chrome_browser_notifications_NotificationPlatformBridge_onNotificationClicked(nativeNotificationPlatformBridgeAndroid, caller, notificationId, notificationType, origin, scopeUrl, profileId, incognito, webApkPackage, actionIndex, reply);
  }

  @Override
  public void onNotificationClosed(long nativeNotificationPlatformBridgeAndroid,
      NotificationPlatformBridge caller, String notificationId, int notificationType, String origin,
      String profileId, boolean incognito, boolean byUser) {
    GEN_JNI.org_chromium_chrome_browser_notifications_NotificationPlatformBridge_onNotificationClosed(nativeNotificationPlatformBridgeAndroid, caller, notificationId, notificationType, origin, profileId, incognito, byUser);
  }

  @Override
  public void storeCachedWebApkPackageForNotificationId(
      long nativeNotificationPlatformBridgeAndroid, NotificationPlatformBridge caller,
      String notificationId, String webApkPackage) {
    GEN_JNI.org_chromium_chrome_browser_notifications_NotificationPlatformBridge_storeCachedWebApkPackageForNotificationId(nativeNotificationPlatformBridgeAndroid, caller, notificationId, webApkPackage);
  }

  public static NotificationPlatformBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.notifications.NotificationPlatformBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new NotificationPlatformBridgeJni();
  }
}
