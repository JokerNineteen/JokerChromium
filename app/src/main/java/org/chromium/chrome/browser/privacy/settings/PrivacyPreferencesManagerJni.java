package org.chromium.chrome.browser.privacy.settings;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class PrivacyPreferencesManagerJni implements PrivacyPreferencesManager.Natives {
  private static PrivacyPreferencesManager.Natives testInstance;

  public static final JniStaticTestMocker<PrivacyPreferencesManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canPrefetchAndPrerender() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_canPrefetchAndPrerender();
  }

  @Override
  public boolean getNetworkPredictionManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_getNetworkPredictionManaged();
  }

  @Override
  public boolean obsoleteNetworkPredictionOptionsHasUserSetting() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_obsoleteNetworkPredictionOptionsHasUserSetting();
  }

  @Override
  public boolean getNetworkPredictionEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_getNetworkPredictionEnabled();
  }

  @Override
  public void setNetworkPredictionEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_setNetworkPredictionEnabled(enabled);
  }

  @Override
  public boolean isMetricsReportingEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_isMetricsReportingEnabled();
  }

  @Override
  public void setMetricsReportingEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_setMetricsReportingEnabled(enabled);
  }

  @Override
  public boolean isMetricsReportingManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_settings_PrivacyPreferencesManager_isMetricsReportingManaged();
  }

  public static PrivacyPreferencesManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.privacy.settings.PrivacyPreferencesManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrivacyPreferencesManagerJni();
  }
}
