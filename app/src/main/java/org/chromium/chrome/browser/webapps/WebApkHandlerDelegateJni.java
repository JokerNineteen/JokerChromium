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
final class WebApkHandlerDelegateJni implements WebApkHandlerDelegate.Natives {
  private static WebApkHandlerDelegate.Natives testInstance;

  public static final JniStaticTestMocker<WebApkHandlerDelegate.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkHandlerDelegate.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkHandlerDelegate.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onWebApkInfoRetrieved(long nativeWebApkHandlerDelegate, String name, String shortName,
      String packageName, String id, int shellApkVersion, int versionCode, String uri, String scope,
      String manifestUrl, String manifestStartUrl, int displayMode, int orientation,
      long themeColor, long backgroundColor, long lastUpdateCheckTimeMs,
      long lastUpdateCompletionTimeMs, boolean relaxUpdates, String backingBrowserPackageName,
      boolean isBackingBrowser, String updateStatus) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkHandlerDelegate_onWebApkInfoRetrieved(nativeWebApkHandlerDelegate, name, shortName, packageName, id, shellApkVersion, versionCode, uri, scope, manifestUrl, manifestStartUrl, displayMode, orientation, themeColor, backgroundColor, lastUpdateCheckTimeMs, lastUpdateCompletionTimeMs, relaxUpdates, backingBrowserPackageName, isBackingBrowser, updateStatus);
  }

  public static WebApkHandlerDelegate.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkHandlerDelegate.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkHandlerDelegateJni();
  }
}
