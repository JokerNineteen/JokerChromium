package org.chromium.chrome.browser.video_tutorials;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VideoTutorialServiceFactoryJni implements VideoTutorialServiceFactory.Natives {
  private static VideoTutorialServiceFactory.Natives testInstance;

  public static final JniStaticTestMocker<VideoTutorialServiceFactory.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.video_tutorials.VideoTutorialServiceFactory.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.video_tutorials.VideoTutorialServiceFactory.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public VideoTutorialService getForProfile(Profile profile) {
    return (VideoTutorialService)GEN_JNI.org_chromium_chrome_browser_video_1tutorials_VideoTutorialServiceFactory_getForProfile(profile);
  }

  public static VideoTutorialServiceFactory.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.video_tutorials.VideoTutorialServiceFactory.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VideoTutorialServiceFactoryJni();
  }
}
