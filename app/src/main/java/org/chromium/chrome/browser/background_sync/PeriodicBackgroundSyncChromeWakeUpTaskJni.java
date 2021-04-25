package org.chromium.chrome.browser.background_sync;

import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PeriodicBackgroundSyncChromeWakeUpTaskJni implements PeriodicBackgroundSyncChromeWakeUpTask.Natives {
  private static PeriodicBackgroundSyncChromeWakeUpTask.Natives testInstance;

  public static final JniStaticTestMocker<PeriodicBackgroundSyncChromeWakeUpTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.background_sync.PeriodicBackgroundSyncChromeWakeUpTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.background_sync.PeriodicBackgroundSyncChromeWakeUpTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void firePeriodicBackgroundSyncEvents(Runnable callback) {
    GEN_JNI.org_chromium_chrome_browser_background_1sync_PeriodicBackgroundSyncChromeWakeUpTask_firePeriodicBackgroundSyncEvents(callback);
  }

  public static PeriodicBackgroundSyncChromeWakeUpTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.background_sync.PeriodicBackgroundSyncChromeWakeUpTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PeriodicBackgroundSyncChromeWakeUpTaskJni();
  }
}
