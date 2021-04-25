package org.chromium.chrome.browser.paint_preview;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaintPreviewCompositorUtilsJni implements PaintPreviewCompositorUtils.Natives {
  private static PaintPreviewCompositorUtils.Natives testInstance;

  public static final JniStaticTestMocker<PaintPreviewCompositorUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.paint_preview.PaintPreviewCompositorUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.paint_preview.PaintPreviewCompositorUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void warmupCompositor() {
    GEN_JNI.org_chromium_chrome_browser_paint_1preview_PaintPreviewCompositorUtils_warmupCompositor();
  }

  @Override
  public boolean stopWarmCompositor() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_paint_1preview_PaintPreviewCompositorUtils_stopWarmCompositor();
  }

  public static PaintPreviewCompositorUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.paint_preview.PaintPreviewCompositorUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaintPreviewCompositorUtilsJni();
  }
}
