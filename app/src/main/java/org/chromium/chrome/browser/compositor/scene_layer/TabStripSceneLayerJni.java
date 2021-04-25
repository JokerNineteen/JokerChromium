package org.chromium.chrome.browser.compositor.scene_layer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabStripSceneLayerJni implements TabStripSceneLayer.Natives {
  private static TabStripSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<TabStripSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabStripSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_init(caller);
  }

  @Override
  public void beginBuildingFrame(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      boolean visible) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_beginBuildingFrame(nativeTabStripSceneLayer, caller, visible);
  }

  @Override
  public void finishBuildingFrame(long nativeTabStripSceneLayer, TabStripSceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_finishBuildingFrame(nativeTabStripSceneLayer, caller);
  }

  @Override
  public void updateTabStripLayer(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      float width, float height, float yOffset, float backgroundTabBrightness, float brightness,
      boolean shouldReaddBackground) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_updateTabStripLayer(nativeTabStripSceneLayer, caller, width, height, yOffset, backgroundTabBrightness, brightness, shouldReaddBackground);
  }

  @Override
  public void updateNewTabButton(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float x, float y, float width, float height, boolean visible,
      ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_updateNewTabButton(nativeTabStripSceneLayer, caller, resourceId, x, y, width, height, visible, resourceManager);
  }

  @Override
  public void updateModelSelectorButton(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float x, float y, float width, float height, boolean incognito,
      boolean visible, ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_updateModelSelectorButton(nativeTabStripSceneLayer, caller, resourceId, x, y, width, height, incognito, visible, resourceManager);
  }

  @Override
  public void updateTabStripLeftFade(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float opacity, ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_updateTabStripLeftFade(nativeTabStripSceneLayer, caller, resourceId, opacity, resourceManager);
  }

  @Override
  public void updateTabStripRightFade(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      int resourceId, float opacity, ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_updateTabStripRightFade(nativeTabStripSceneLayer, caller, resourceId, opacity, resourceManager);
  }

  @Override
  public void putStripTabLayer(long nativeTabStripSceneLayer, TabStripSceneLayer caller, int id,
      int closeResourceId, int handleResourceId, int handleOutlineResourceId, int closeTint,
      int handleTint, int handleOutlineTint, boolean foreground, boolean closePressed,
      float toolbarWidth, float x, float y, float width, float height, float contentOffsetX,
      float closeButtonAlpha, boolean isLoading, float spinnerRotation,
      LayerTitleCache layerTitleCache, ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_putStripTabLayer(nativeTabStripSceneLayer, caller, id, closeResourceId, handleResourceId, handleOutlineResourceId, closeTint, handleTint, handleOutlineTint, foreground, closePressed, toolbarWidth, x, y, width, height, contentOffsetX, closeButtonAlpha, isLoading, spinnerRotation, layerTitleCache, resourceManager);
  }

  @Override
  public void setContentTree(long nativeTabStripSceneLayer, TabStripSceneLayer caller,
      SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabStripSceneLayer_setContentTree(nativeTabStripSceneLayer, caller, contentTree);
  }

  public static TabStripSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.TabStripSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabStripSceneLayerJni();
  }
}
