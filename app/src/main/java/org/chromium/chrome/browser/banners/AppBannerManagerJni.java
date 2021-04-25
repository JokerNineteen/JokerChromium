package org.chromium.chrome.browser.banners;

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
final class AppBannerManagerJni implements AppBannerManager.Natives {
  private static AppBannerManager.Natives testInstance;

  public static final JniStaticTestMocker<AppBannerManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.banners.AppBannerManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.banners.AppBannerManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public AppBannerManager getJavaBannerManagerForWebContents(WebContents webContents) {
    return (AppBannerManager)GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_getJavaBannerManagerForWebContents(webContents);
  }

  @Override
  public String getInstallableWebAppName(WebContents webContents) {
    return (String)GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_getInstallableWebAppName(webContents);
  }

  @Override
  public boolean onAppDetailsRetrieved(long nativeAppBannerManagerAndroid, AppBannerManager caller,
      AppData data, String title, String packageName, String imageUrl) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_onAppDetailsRetrieved(nativeAppBannerManagerAndroid, caller, data, title, packageName, imageUrl);
  }

  @Override
  public void ignoreChromeChannelForTesting() {
    GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_ignoreChromeChannelForTesting();
  }

  @Override
  public boolean isRunningForTesting(long nativeAppBannerManagerAndroid, AppBannerManager caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_isRunningForTesting(nativeAppBannerManagerAndroid, caller);
  }

  @Override
  public void setDaysAfterDismissAndIgnoreToTrigger(int dismissDays, int ignoreDays) {
    GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_setDaysAfterDismissAndIgnoreToTrigger(dismissDays, ignoreDays);
  }

  @Override
  public void setTimeDeltaForTesting(int days) {
    GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_setTimeDeltaForTesting(days);
  }

  @Override
  public void setTotalEngagementToTrigger(double engagement) {
    GEN_JNI.org_chromium_chrome_browser_banners_AppBannerManager_setTotalEngagementToTrigger(engagement);
  }

  public static AppBannerManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.banners.AppBannerManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AppBannerManagerJni();
  }
}
