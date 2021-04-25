package org.chromium.chrome.browser.share.screenshot;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class EditorScreenshotTaskJni implements EditorScreenshotTask.Natives {
  private static EditorScreenshotTask.Natives testInstance;

  public static final JniStaticTestMocker<EditorScreenshotTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void grabWindowSnapshotAsync(EditorScreenshotTask callback, WindowAndroid window,
      int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_share_screenshot_EditorScreenshotTask_grabWindowSnapshotAsync(callback, window, width, height);
  }

  public static EditorScreenshotTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.screenshot.EditorScreenshotTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new EditorScreenshotTaskJni();
  }
}
