package org.chromium.chrome.browser.suggestions.mostvisited;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MostVisitedSitesBridgeJni implements MostVisitedSitesBridge.Natives {
  private static MostVisitedSitesBridge.Natives testInstance;

  public static final JniStaticTestMocker<MostVisitedSitesBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(MostVisitedSitesBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_destroy(nativeMostVisitedSitesBridge, caller);
  }

  @Override
  public void onHomepageStateChanged(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_onHomepageStateChanged(nativeMostVisitedSitesBridge, caller);
  }

  @Override
  public void setHomepageClient(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      MostVisitedSites.HomepageClient homePageClient) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_setHomepageClient(nativeMostVisitedSitesBridge, caller, homePageClient);
  }

  @Override
  public void setObserver(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      MostVisitedSitesBridge observer, int numSites) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_setObserver(nativeMostVisitedSitesBridge, caller, observer, numSites);
  }

  @Override
  public void addOrRemoveBlockedUrl(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller, GURL url, boolean addUrl) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_addOrRemoveBlockedUrl(nativeMostVisitedSitesBridge, caller, url, addUrl);
  }

  @Override
  public void recordPageImpression(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      int tilesCount) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_recordPageImpression(nativeMostVisitedSitesBridge, caller, tilesCount);
  }

  @Override
  public void recordTileImpression(long nativeMostVisitedSitesBridge, MostVisitedSitesBridge caller,
      int index, int type, int iconType, int titleSource, int source, long dataGenerationTimeMs,
      GURL url) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_recordTileImpression(nativeMostVisitedSitesBridge, caller, index, type, iconType, titleSource, source, dataGenerationTimeMs, url);
  }

  @Override
  public void recordOpenedMostVisitedItem(long nativeMostVisitedSitesBridge,
      MostVisitedSitesBridge caller, int index, int tileType, int titleSource, int source,
      long dataGenerationTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_suggestions_mostvisited_MostVisitedSitesBridge_recordOpenedMostVisitedItem(nativeMostVisitedSitesBridge, caller, index, tileType, titleSource, source, dataGenerationTimeMs);
  }

  public static MostVisitedSitesBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.suggestions.mostvisited.MostVisitedSitesBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MostVisitedSitesBridgeJni();
  }
}
