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
public final class BackgroundTaskMemoryMetricsEmitterJni implements BackgroundTaskMemoryMetricsEmitter.Natives {
  private static BackgroundTaskMemoryMetricsEmitter.Natives testInstance;

  public static final JniStaticTestMocker<BackgroundTaskMemoryMetricsEmitter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.BackgroundTaskMemoryMetricsEmitter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.BackgroundTaskMemoryMetricsEmitter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void reportMemoryUsage(boolean isReducedMode, String taskTypeAffix) {
    GEN_JNI.org_chromium_chrome_browser_metrics_BackgroundTaskMemoryMetricsEmitter_reportMemoryUsage(isReducedMode, taskTypeAffix);
  }

  public static BackgroundTaskMemoryMetricsEmitter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.BackgroundTaskMemoryMetricsEmitter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BackgroundTaskMemoryMetricsEmitterJni();
  }
}
