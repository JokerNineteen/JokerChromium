package org.chromium.chrome.browser.webapps;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class WebApkPostShareTargetNavigatorJni implements WebApkPostShareTargetNavigator.Natives {
  private static WebApkPostShareTargetNavigator.Natives testInstance;

  public static final JniStaticTestMocker<WebApkPostShareTargetNavigator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void nativeLoadViewForShareTargetPost(boolean isMultipartEncoding, String[] names,
      String[] values, boolean[] isValueFileUris, String[] filenames, String[] types,
      String startUrl, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_webapps_WebApkPostShareTargetNavigator_nativeLoadViewForShareTargetPost(isMultipartEncoding, names, values, isValueFileUris, filenames, types, startUrl, webContents);
  }

  public static WebApkPostShareTargetNavigator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebApkPostShareTargetNavigatorJni();
  }
}
