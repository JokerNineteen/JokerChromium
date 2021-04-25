package org.chromium.chrome.browser.explore_sites;

import android.graphics.Bitmap;
import java.lang.Boolean;
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
final class ExploreSitesBridgeJni implements ExploreSitesBridge.Natives {
  private static ExploreSitesBridge.Natives testInstance;

  public static final JniStaticTestMocker<ExploreSitesBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getVariation() {
    return (int)GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_getVariation();
  }

  @Override
  public int getDenseVariation() {
    return (int)GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_getDenseVariation();
  }

  @Override
  public void getIcon(Profile profile, int siteID, Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_getIcon(profile, siteID, callback);
  }

  @Override
  public void updateCatalogFromNetwork(Profile profile, boolean isImmediateFetch,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_updateCatalogFromNetwork(profile, isImmediateFetch, callback);
  }

  @Override
  public void getSummaryImage(Profile profile, int pixelSize, Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_getSummaryImage(profile, pixelSize, callback);
  }

  @Override
  public void blockSite(Profile profile, String url) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_blockSite(profile, url);
  }

  @Override
  public void recordClick(Profile profile, String url, int type) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_recordClick(profile, url, type);
  }

  @Override
  public void getCatalog(Profile profile, int source, List<ExploreSitesCategory> result,
      Callback<List<ExploreSitesCategory>> callback) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_getCatalog(profile, source, result, callback);
  }

  @Override
  public void initializeCatalog(Profile profile, int source) {
    GEN_JNI.org_chromium_chrome_browser_explore_1sites_ExploreSitesBridge_initializeCatalog(profile, source);
  }

  public static ExploreSitesBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.explore_sites.ExploreSitesBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ExploreSitesBridgeJni();
  }
}
