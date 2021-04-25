package org.chromium.chrome.browser.component_updater;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UpdateSchedulerJni implements UpdateScheduler.Natives {
  private static UpdateScheduler.Natives testInstance;

  public static final JniStaticTestMocker<UpdateScheduler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onStartTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    GEN_JNI.org_chromium_chrome_browser_component_1updater_UpdateScheduler_onStartTask(nativeBackgroundTaskUpdateScheduler, caller);
  }

  @Override
  public void onStopTask(long nativeBackgroundTaskUpdateScheduler, UpdateScheduler caller) {
    GEN_JNI.org_chromium_chrome_browser_component_1updater_UpdateScheduler_onStopTask(nativeBackgroundTaskUpdateScheduler, caller);
  }

  public static UpdateScheduler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.component_updater.UpdateScheduler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UpdateSchedulerJni();
  }
}
