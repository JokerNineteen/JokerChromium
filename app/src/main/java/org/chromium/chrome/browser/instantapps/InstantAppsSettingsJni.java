package org.chromium.chrome.browser.instantapps;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstantAppsSettingsJni implements InstantAppsSettings.Natives {
  private static InstantAppsSettings.Natives testInstance;

  public static final JniStaticTestMocker<InstantAppsSettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean getInstantAppDefault(WebContents webContents, String url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsSettings_getInstantAppDefault(webContents, url);
  }

  @Override
  public void setInstantAppDefault(WebContents webContents, String url) {
    GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsSettings_setInstantAppDefault(webContents, url);
  }

  @Override
  public boolean shouldShowBanner(WebContents webContents, String url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_instantapps_InstantAppsSettings_shouldShowBanner(webContents, url);
  }

  public static InstantAppsSettings.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.instantapps.InstantAppsSettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstantAppsSettingsJni();
  }
}
