package org.chromium.chrome.browser.permissions;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class PermissionSettingsBridgeJni implements PermissionSettingsBridge.Natives {
  private static PermissionSettingsBridge.Natives testInstance;

  public static final JniStaticTestMocker<PermissionSettingsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.permissions.PermissionSettingsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.permissions.PermissionSettingsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean shouldShowNotificationsPromo(Profile profile, WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_permissions_PermissionSettingsBridge_shouldShowNotificationsPromo(profile, webContents);
  }

  @Override
  public void didShowNotificationsPromo(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_permissions_PermissionSettingsBridge_didShowNotificationsPromo(profile);
  }

  public static PermissionSettingsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.permissions.PermissionSettingsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PermissionSettingsBridgeJni();
  }
}
