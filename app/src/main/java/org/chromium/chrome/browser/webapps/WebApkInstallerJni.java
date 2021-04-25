package org.chromium.chrome.browser.webapps;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WebApkInstallerJni implements WebApkInstaller.Natives {
  private static WebApkInstaller.Natives testInstance;

  public static final JniStaticTestMocker<WebApkInstaller.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkInstaller.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkInstaller.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onInstallFinished(long nativeWebApkInstaller, WebApkInstaller caller, int result) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkInstaller_onInstallFinished(nativeWebApkInstaller, caller, result);
  }

  @Override
  public void onGotSpaceStatus(long nativeWebApkInstaller, WebApkInstaller caller, int status) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkInstaller_onGotSpaceStatus(nativeWebApkInstaller, caller, status);
  }

  public static WebApkInstaller.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkInstaller.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkInstallerJni();
  }
}
