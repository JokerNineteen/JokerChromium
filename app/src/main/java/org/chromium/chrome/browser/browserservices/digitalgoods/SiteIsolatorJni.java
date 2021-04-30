package org.chromium.chrome.browser.browserservices.digitalgoods;

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
final class SiteIsolatorJni implements SiteIsolator.Natives {
  private static SiteIsolator.Natives testInstance;

  public static final JniStaticTestMocker<SiteIsolator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browserservices.digitalgoods.SiteIsolator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browserservices.digitalgoods.SiteIsolator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startIsolatingSite(Profile profile, GURL url) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_digitalgoods_SiteIsolator_startIsolatingSite(profile, url);
  }

  public static SiteIsolator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.digitalgoods.SiteIsolator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SiteIsolatorJni();
  }
}
