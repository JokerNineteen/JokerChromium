package org.chromium.chrome.browser.toolbar.top;

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
final class TopToolbarSceneLayerJni implements TopToolbarSceneLayer.Natives {
  private static TopToolbarSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<TopToolbarSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.toolbar.top.TopToolbarSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.toolbar.top.TopToolbarSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TopToolbarSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_toolbar_top_TopToolbarSceneLayer_init(caller);
  }

  @Override
  public void setContentTree(long nativeTopToolbarSceneLayer, TopToolbarSceneLayer caller,
      SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_top_TopToolbarSceneLayer_setContentTree(nativeTopToolbarSceneLayer, caller, contentTree);
  }

  @Override
  public void updateToolbarLayer(long nativeTopToolbarSceneLayer, TopToolbarSceneLayer caller,
      ResourceManager resourceManager, int resourceId, int toolbarBackgroundColor,
      int urlBarResourceId, int urlBarColor, float contentOffset, boolean showShadow,
      boolean visible) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_top_TopToolbarSceneLayer_updateToolbarLayer(nativeTopToolbarSceneLayer, caller, resourceManager, resourceId, toolbarBackgroundColor, urlBarResourceId, urlBarColor, contentOffset, showShadow, visible);
  }

  @Override
  public void updateProgressBar(long nativeTopToolbarSceneLayer, TopToolbarSceneLayer caller,
      int progressBarX, int progressBarY, int progressBarWidth, int progressBarHeight,
      int progressBarColor, int progressBarBackgroundX, int progressBarBackgroundY,
      int progressBarBackgroundWidth, int progressBarBackgroundHeight,
      int progressBarBackgroundColor) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_top_TopToolbarSceneLayer_updateProgressBar(nativeTopToolbarSceneLayer, caller, progressBarX, progressBarY, progressBarWidth, progressBarHeight, progressBarColor, progressBarBackgroundX, progressBarBackgroundY, progressBarBackgroundWidth, progressBarBackgroundHeight, progressBarBackgroundColor);
  }

  public static TopToolbarSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.toolbar.top.TopToolbarSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TopToolbarSceneLayerJni();
  }
}
