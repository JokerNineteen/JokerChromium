package org.chromium.chrome.browser.media;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.thinwebview.CompositorView;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PictureInPictureActivityJni implements PictureInPictureActivity.Natives {
  private static PictureInPictureActivity.Natives testInstance;

  public static final JniStaticTestMocker<PictureInPictureActivity.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.media.PictureInPictureActivity.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.media.PictureInPictureActivity.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onActivityStart(long nativeOverlayWindowAndroid, PictureInPictureActivity self,
      WindowAndroid window) {
    GEN_JNI.org_chromium_chrome_browser_media_PictureInPictureActivity_onActivityStart(nativeOverlayWindowAndroid, self, window);
  }

  @Override
  public void destroy(long nativeOverlayWindowAndroid) {
    GEN_JNI.org_chromium_chrome_browser_media_PictureInPictureActivity_destroy(nativeOverlayWindowAndroid);
  }

  @Override
  public void play(long nativeOverlayWindowAndroid) {
    GEN_JNI.org_chromium_chrome_browser_media_PictureInPictureActivity_play(nativeOverlayWindowAndroid);
  }

  @Override
  public void compositorViewCreated(long nativeOverlayWindowAndroid,
      CompositorView compositorView) {
    GEN_JNI.org_chromium_chrome_browser_media_PictureInPictureActivity_compositorViewCreated(nativeOverlayWindowAndroid, compositorView);
  }

  @Override
  public void onViewSizeChanged(long nativeOverlayWindowAndroid, int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_media_PictureInPictureActivity_onViewSizeChanged(nativeOverlayWindowAndroid, width, height);
  }

  public static PictureInPictureActivity.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.media.PictureInPictureActivity.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PictureInPictureActivityJni();
  }
}
