package org.chromium.chrome.browser.flags;

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
final class ChromeFeatureListJni implements ChromeFeatureList.Natives {
  private static ChromeFeatureList.Natives testInstance;

  public static final JniStaticTestMocker<ChromeFeatureList.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.flags.ChromeFeatureList.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.flags.ChromeFeatureList.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled(String featureName) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_flags_ChromeFeatureList_isEnabled(featureName);
  }

  @Override
  public String getFieldTrialParamByFeature(String featureName, String paramName) {
    return (String)GEN_JNI.org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeature(featureName, paramName);
  }

  @Override
  public int getFieldTrialParamByFeatureAsInt(String featureName, String paramName,
      int defaultValue) {
    return (int)GEN_JNI.org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsInt(featureName, paramName, defaultValue);
  }

  @Override
  public double getFieldTrialParamByFeatureAsDouble(String featureName, String paramName,
      double defaultValue) {
    return (double)GEN_JNI.org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsDouble(featureName, paramName, defaultValue);
  }

  @Override
  public boolean getFieldTrialParamByFeatureAsBoolean(String featureName, String paramName,
      boolean defaultValue) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_flags_ChromeFeatureList_getFieldTrialParamByFeatureAsBoolean(featureName, paramName, defaultValue);
  }

  public static ChromeFeatureList.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.flags.ChromeFeatureList.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ChromeFeatureListJni();
  }
}
