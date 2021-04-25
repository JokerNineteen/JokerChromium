package org.chromium.chrome.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class WarmupManagerJni implements WarmupManager.Natives {
  private static WarmupManager.Natives testInstance;

  public static final JniStaticTestMocker<WarmupManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.WarmupManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.WarmupManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startPreconnectPredictorInitialization(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_WarmupManager_startPreconnectPredictorInitialization(profile);
  }

  @Override
  public void preconnectUrlAndSubresources(Profile profile, String url) {
    GEN_JNI.org_chromium_chrome_browser_WarmupManager_preconnectUrlAndSubresources(profile, url);
  }

  @Override
  public void warmupSpareRenderer(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_WarmupManager_warmupSpareRenderer(profile);
  }

  @Override
  public void reportNextLikelyNavigations(Profile profile, String[] packagesName, String[] urls) {
    GEN_JNI.org_chromium_chrome_browser_WarmupManager_reportNextLikelyNavigations(profile, packagesName, urls);
  }

  public static WarmupManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.WarmupManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WarmupManagerJni();
  }
}
