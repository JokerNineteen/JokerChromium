package org.chromium.chrome.browser.metrics;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UmaSessionStatsJni implements UmaSessionStats.Natives {
  private static UmaSessionStats.Natives testInstance;

  public static final JniStaticTestMocker<UmaSessionStats.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.UmaSessionStats.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.UmaSessionStats.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init() {
    return (long)GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_init();
  }

  @Override
  public void changeMetricsReportingConsent(boolean consent) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_changeMetricsReportingConsent(consent);
  }

  @Override
  public void initMetricsAndCrashReportingForTesting() {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_initMetricsAndCrashReportingForTesting();
  }

  @Override
  public void unsetMetricsAndCrashReportingForTesting() {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_unsetMetricsAndCrashReportingForTesting();
  }

  @Override
  public void updateMetricsAndCrashReportingForTesting(boolean consent) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_updateMetricsAndCrashReportingForTesting(consent);
  }

  @Override
  public void updateMetricsServiceState(boolean mayUpload) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_updateMetricsServiceState(mayUpload);
  }

  @Override
  public void umaResumeSession(long nativeUmaSessionStats, UmaSessionStats caller) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_umaResumeSession(nativeUmaSessionStats, caller);
  }

  @Override
  public void umaEndSession(long nativeUmaSessionStats, UmaSessionStats caller) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_umaEndSession(nativeUmaSessionStats, caller);
  }

  @Override
  public void registerExternalExperiment(String studyName, int[] experimentIds,
      boolean overrideExistingIds) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_registerExternalExperiment(studyName, experimentIds, overrideExistingIds);
  }

  @Override
  public void registerSyntheticFieldTrial(String trialName, String groupName) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_registerSyntheticFieldTrial(trialName, groupName);
  }

  @Override
  public void recordTabCountPerLoad(int numTabsOpen) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_recordTabCountPerLoad(numTabsOpen);
  }

  @Override
  public void recordPageLoaded(boolean isDesktopUserAgent) {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_recordPageLoaded(isDesktopUserAgent);
  }

  @Override
  public void recordPageLoadedWithKeyboard() {
    GEN_JNI.org_chromium_chrome_browser_metrics_UmaSessionStats_recordPageLoadedWithKeyboard();
  }

  public static UmaSessionStats.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.UmaSessionStats.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UmaSessionStatsJni();
  }
}
