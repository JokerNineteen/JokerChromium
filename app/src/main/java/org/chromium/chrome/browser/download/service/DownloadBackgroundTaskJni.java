package org.chromium.chrome.browser.download.service;

import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.ProfileKey;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadBackgroundTaskJni implements DownloadBackgroundTask.Natives {
  private static DownloadBackgroundTask.Natives testInstance;

  public static final JniStaticTestMocker<DownloadBackgroundTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startBackgroundTask(DownloadBackgroundTask caller, ProfileKey key, int taskType,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_download_service_DownloadBackgroundTask_startBackgroundTask(caller, key, taskType, callback);
  }

  @Override
  public boolean stopBackgroundTask(DownloadBackgroundTask caller, ProfileKey key, int taskType) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_download_service_DownloadBackgroundTask_stopBackgroundTask(caller, key, taskType);
  }

  public static DownloadBackgroundTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.service.DownloadBackgroundTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadBackgroundTaskJni();
  }
}
