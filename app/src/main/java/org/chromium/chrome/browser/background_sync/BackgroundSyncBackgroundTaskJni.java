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
final class BackgroundSyncBackgroundTaskJni implements BackgroundSyncBackgroundTask.Natives {
  private static BackgroundSyncBackgroundTask.Natives testInstance;

  public static final JniStaticTestMocker<BackgroundSyncBackgroundTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void fireOneShotBackgroundSyncEvents(Runnable callback) {
    GEN_JNI.org_chromium_chrome_browser_background_1sync_BackgroundSyncBackgroundTask_fireOneShotBackgroundSyncEvents(callback);
  }

  public static BackgroundSyncBackgroundTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.background_sync.BackgroundSyncBackgroundTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BackgroundSyncBackgroundTaskJni();
  }
}
