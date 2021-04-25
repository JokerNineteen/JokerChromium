package org.chromium.components.browser_ui.site_settings;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class SiteSettingsFeatureListJni implements SiteSettingsFeatureList.Natives {
  private static SiteSettingsFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<SiteSettingsFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.browser_ui.site_settings.SiteSettingsFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.browser_ui.site_settings.SiteSettingsFeatureList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_components_browser_1ui_site_1settings_SiteSettingsFeatureList_isEnabled(featureName);
  }

  public static SiteSettingsFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.site_settings.SiteSettingsFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new SiteSettingsFeatureListJni();
  }
}
