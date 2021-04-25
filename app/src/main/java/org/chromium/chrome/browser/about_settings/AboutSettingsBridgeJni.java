package org.chromium.chrome.browser.about_settings;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AboutSettingsBridgeJni implements AboutSettingsBridge.Natives {
  private static AboutSettingsBridge.Natives testInstance;

  public static final JniStaticTestMocker<AboutSettingsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.about_settings.AboutSettingsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.about_settings.AboutSettingsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getApplicationVersion() {
    return (String)GEN_JNI.org_chromium_chrome_browser_about_1settings_AboutSettingsBridge_getApplicationVersion();
  }

  @Override
  public String getOSVersion() {
    return (String)GEN_JNI.org_chromium_chrome_browser_about_1settings_AboutSettingsBridge_getOSVersion();
  }

  public static AboutSettingsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.about_settings.AboutSettingsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AboutSettingsBridgeJni();
  }
}
