package org.chromium.chrome.browser.share.long_screenshots.bitmap_generation;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LongScreenshotsTabServiceFactoryJni implements LongScreenshotsTabServiceFactory.Natives {
  private static LongScreenshotsTabServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<LongScreenshotsTabServiceFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabServiceFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabServiceFactory.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public LongScreenshotsTabService getServiceInstanceForCurrentProfile() {
    return (LongScreenshotsTabService)GEN_JNI.org_chromium_chrome_browser_share_long_1screenshots_bitmap_1generation_LongScreenshotsTabServiceFactory_getServiceInstanceForCurrentProfile();
  }

  public static LongScreenshotsTabServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.long_screenshots.bitmap_generation.LongScreenshotsTabServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LongScreenshotsTabServiceFactoryJni();
  }
}
