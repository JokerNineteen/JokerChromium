package org.chromium.chrome.browser.background_task_scheduler;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProxyNativeTaskJni implements ProxyNativeTask.Natives {
  private static ProxyNativeTask.Natives testInstance;

  public static final JniStaticTestMocker<ProxyNativeTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.background_task_scheduler.ProxyNativeTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.background_task_scheduler.ProxyNativeTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ProxyNativeTask caller, int taskType, String extras,
      Callback<Boolean> callback) {
    return (long)GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_init(caller, taskType, extras, callback);
  }

  @Override
  public void startBackgroundTaskInReducedMode(long nativeProxyNativeTask, ProxyNativeTask caller,
      ProfileKey key) {
    GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_startBackgroundTaskInReducedMode(nativeProxyNativeTask, caller, key);
  }

  @Override
  public void startBackgroundTaskWithFullBrowser(long nativeProxyNativeTask, ProxyNativeTask caller,
      Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_startBackgroundTaskWithFullBrowser(nativeProxyNativeTask, caller, profile);
  }

  @Override
  public void onFullBrowserLoaded(long nativeProxyNativeTask, ProxyNativeTask caller,
      Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_onFullBrowserLoaded(nativeProxyNativeTask, caller, profile);
  }

  @Override
  public boolean stopBackgroundTask(long nativeProxyNativeTask, ProxyNativeTask caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_stopBackgroundTask(nativeProxyNativeTask, caller);
  }

  @Override
  public void destroy(long nativeProxyNativeTask, ProxyNativeTask caller) {
    GEN_JNI.org_chromium_chrome_browser_background_1task_1scheduler_ProxyNativeTask_destroy(nativeProxyNativeTask, caller);
  }

  public static ProxyNativeTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.background_task_scheduler.ProxyNativeTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProxyNativeTaskJni();
  }
}
