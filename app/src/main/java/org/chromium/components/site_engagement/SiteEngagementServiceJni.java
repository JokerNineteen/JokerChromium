package org.chromium.components.site_engagement;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.browser_context.BrowserContextHandle;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SiteEngagementServiceJni implements SiteEngagementService.Natives {
  private static SiteEngagementService.Natives testInstance;

  public static final JniStaticTestMocker<SiteEngagementService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.site_engagement.SiteEngagementService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.site_engagement.SiteEngagementService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public SiteEngagementService siteEngagementServiceForBrowserContext(
      BrowserContextHandle browserContext) {
    return (SiteEngagementService)GEN_JNI.org_chromium_components_site_1engagement_SiteEngagementService_siteEngagementServiceForBrowserContext(browserContext);
  }

  @Override
  public void setParamValuesForTesting() {
    GEN_JNI.org_chromium_components_site_1engagement_SiteEngagementService_setParamValuesForTesting();
  }

  @Override
  public double getScore(long nativeSiteEngagementServiceAndroid, SiteEngagementService caller,
      String url) {
    return (double)GEN_JNI.org_chromium_components_site_1engagement_SiteEngagementService_getScore(nativeSiteEngagementServiceAndroid, caller, url);
  }

  @Override
  public void resetBaseScoreForURL(long nativeSiteEngagementServiceAndroid,
      SiteEngagementService caller, String url, double score) {
    GEN_JNI.org_chromium_components_site_1engagement_SiteEngagementService_resetBaseScoreForURL(nativeSiteEngagementServiceAndroid, caller, url, score);
  }

  public static SiteEngagementService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.site_engagement.SiteEngagementService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SiteEngagementServiceJni();
  }
}
