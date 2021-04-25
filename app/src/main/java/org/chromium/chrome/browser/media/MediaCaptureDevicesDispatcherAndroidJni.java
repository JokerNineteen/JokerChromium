package org.chromium.chrome.browser.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MediaCaptureDevicesDispatcherAndroidJni implements MediaCaptureDevicesDispatcherAndroid.Natives {
  private static MediaCaptureDevicesDispatcherAndroid.Natives testInstance;

  public static final JniStaticTestMocker<MediaCaptureDevicesDispatcherAndroid.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isCapturingAudio(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_media_MediaCaptureDevicesDispatcherAndroid_isCapturingAudio(webContents);
  }

  @Override
  public boolean isCapturingVideo(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_media_MediaCaptureDevicesDispatcherAndroid_isCapturingVideo(webContents);
  }

  @Override
  public boolean isCapturingScreen(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_media_MediaCaptureDevicesDispatcherAndroid_isCapturingScreen(webContents);
  }

  @Override
  public void notifyStopped(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_media_MediaCaptureDevicesDispatcherAndroid_notifyStopped(webContents);
  }

  public static MediaCaptureDevicesDispatcherAndroid.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.MediaCaptureDevicesDispatcherAndroid.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MediaCaptureDevicesDispatcherAndroidJni();
  }
}
