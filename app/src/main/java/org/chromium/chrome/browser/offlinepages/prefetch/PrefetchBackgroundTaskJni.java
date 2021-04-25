package org.chromium.chrome.browser.offlinepages.prefetch;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefetchBackgroundTaskJni implements PrefetchBackgroundTask.Natives {
  private static PrefetchBackgroundTask.Natives testInstance;

  public static final JniStaticTestMocker<PrefetchBackgroundTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean startPrefetchTask(PrefetchBackgroundTask caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_prefetch_PrefetchBackgroundTask_startPrefetchTask(caller);
  }

  @Override
  public boolean onStopTask(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_prefetch_PrefetchBackgroundTask_onStopTask(nativePrefetchBackgroundTaskAndroid, caller);
  }

  @Override
  public void setTaskReschedulingForTesting(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller, int rescheduleType) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_prefetch_PrefetchBackgroundTask_setTaskReschedulingForTesting(nativePrefetchBackgroundTaskAndroid, caller, rescheduleType);
  }

  @Override
  public void signalTaskFinishedForTesting(long nativePrefetchBackgroundTaskAndroid,
      PrefetchBackgroundTask caller) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_prefetch_PrefetchBackgroundTask_signalTaskFinishedForTesting(nativePrefetchBackgroundTaskAndroid, caller);
  }

  public static PrefetchBackgroundTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.prefetch.PrefetchBackgroundTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefetchBackgroundTaskJni();
  }
}
