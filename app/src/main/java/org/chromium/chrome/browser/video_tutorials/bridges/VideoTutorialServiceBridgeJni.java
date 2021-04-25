package org.chromium.chrome.browser.video_tutorials.bridges;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.video_tutorials.Tutorial;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VideoTutorialServiceBridgeJni implements VideoTutorialServiceBridge.Natives {
  private static VideoTutorialServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<VideoTutorialServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getTutorials(long nativeVideoTutorialServiceBridge, VideoTutorialServiceBridge caller,
      Callback<List<Tutorial>> callback) {
    GEN_JNI.org_chromium_chrome_browser_video_1tutorials_bridges_VideoTutorialServiceBridge_getTutorials(nativeVideoTutorialServiceBridge, caller, callback);
  }

  @Override
  public void getTutorial(long nativeVideoTutorialServiceBridge, VideoTutorialServiceBridge caller,
      int feature, Callback<Tutorial> callback) {
    GEN_JNI.org_chromium_chrome_browser_video_1tutorials_bridges_VideoTutorialServiceBridge_getTutorial(nativeVideoTutorialServiceBridge, caller, feature, callback);
  }

  @Override
  public String[] getSupportedLanguages(long nativeVideoTutorialServiceBridge,
      VideoTutorialServiceBridge caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_video_1tutorials_bridges_VideoTutorialServiceBridge_getSupportedLanguages(nativeVideoTutorialServiceBridge, caller);
  }

  @Override
  public String getPreferredLocale(long nativeVideoTutorialServiceBridge,
      VideoTutorialServiceBridge caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_video_1tutorials_bridges_VideoTutorialServiceBridge_getPreferredLocale(nativeVideoTutorialServiceBridge, caller);
  }

  @Override
  public void setPreferredLocale(long nativeVideoTutorialServiceBridge,
      VideoTutorialServiceBridge caller, String locale) {
    GEN_JNI.org_chromium_chrome_browser_video_1tutorials_bridges_VideoTutorialServiceBridge_setPreferredLocale(nativeVideoTutorialServiceBridge, caller, locale);
  }

  public static VideoTutorialServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.video_tutorials.bridges.VideoTutorialServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VideoTutorialServiceBridgeJni();
  }
}
