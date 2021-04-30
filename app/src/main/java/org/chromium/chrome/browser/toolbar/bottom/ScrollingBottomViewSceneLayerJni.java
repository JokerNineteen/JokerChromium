package org.chromium.chrome.browser.toolbar.bottom;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ScrollingBottomViewSceneLayerJni implements ScrollingBottomViewSceneLayer.Natives {
  private static ScrollingBottomViewSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ScrollingBottomViewSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ScrollingBottomViewSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_toolbar_bottom_ScrollingBottomViewSceneLayer_init(caller);
  }

  @Override
  public void setContentTree(long nativeScrollingBottomViewSceneLayer,
      ScrollingBottomViewSceneLayer caller, SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_bottom_ScrollingBottomViewSceneLayer_setContentTree(nativeScrollingBottomViewSceneLayer, caller, contentTree);
  }

  @Override
  public void updateScrollingBottomViewLayer(long nativeScrollingBottomViewSceneLayer,
      ScrollingBottomViewSceneLayer caller, ResourceManager resourceManager, int viewResourceId,
      int shadowHeightPx, float xOffset, float yOffset, boolean showShadow) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_bottom_ScrollingBottomViewSceneLayer_updateScrollingBottomViewLayer(nativeScrollingBottomViewSceneLayer, caller, resourceManager, viewResourceId, shadowHeightPx, xOffset, yOffset, showShadow);
  }

  public static ScrollingBottomViewSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.toolbar.bottom.ScrollingBottomViewSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ScrollingBottomViewSceneLayerJni();
  }
}
