package org.chromium.chrome.browser.webapps;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebApkUkmRecorderJni implements WebApkUkmRecorder.Natives {
  private static WebApkUkmRecorder.Natives testInstance;

  public static final JniStaticTestMocker<WebApkUkmRecorder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkUkmRecorder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkUkmRecorder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordSessionDuration(String manifestUrl, int distributor, int versionCode,
      long duration) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUkmRecorder_recordSessionDuration(manifestUrl, distributor, versionCode, duration);
  }

  @Override
  public void recordVisit(String manifestUrl, int distributor, int versionCode, int source) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUkmRecorder_recordVisit(manifestUrl, distributor, versionCode, source);
  }

  @Override
  public void recordUninstall(String manifestUrl, int distributor, int versionCode, int launchCount,
      long installedDurationMs) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkUkmRecorder_recordUninstall(manifestUrl, distributor, versionCode, launchCount, installedDurationMs);
  }

  public static WebApkUkmRecorder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkUkmRecorder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkUkmRecorderJni();
  }
}
