package org.chromium.chrome.browser.explore_sites;

import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ExploreSitesBridgeExperimentalJni implements ExploreSitesBridgeExperimental.Natives {
  private static ExploreSitesBridgeExperimental.Natives testInstance;

  public static final JniStaticTestMocker<ExploreSitesBridgeExperimental.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.explore_sites.ExploreSitesBridgeExperimental.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.explore_sites.ExploreSitesBridgeExperimental.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getNtpCategories(Profile profile, List<ExploreSitesCategoryTile> result,
      Callback<List<ExploreSitesCategoryTile>> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridgeExperimental_getNtpCategories(profile, result, callback);
  }

  @Override
  public String getCatalogUrl() {
    return (String)GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridgeExperimental_getCatalogUrl();
  }

  @Override
  public void getIcon(Profile profile, String iconUrl, Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridgeExperimental_getIcon(profile, iconUrl, callback);
  }

  public static ExploreSitesBridgeExperimental.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.explore_sites.ExploreSitesBridgeExperimental.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ExploreSitesBridgeExperimentalJni();
  }
}
