package org.chromium.chrome.browser.compositor.scene_layer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.compositor.LayerTitleCache;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabListSceneLayerJni implements TabListSceneLayer.Natives {
  private static TabListSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<TabListSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabListSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_init(caller);
  }

  @Override
  public void beginBuildingFrame(long nativeTabListSceneLayer, TabListSceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_beginBuildingFrame(nativeTabListSceneLayer, caller);
  }

  @Override
  public void finishBuildingFrame(long nativeTabListSceneLayer, TabListSceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_finishBuildingFrame(nativeTabListSceneLayer, caller);
  }

  @Override
  public void setDependencies(long nativeTabListSceneLayer, TabListSceneLayer caller,
      TabContentManager tabContentManager, LayerTitleCache layerTitleCache,
      ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_setDependencies(nativeTabListSceneLayer, caller, tabContentManager, layerTitleCache, resourceManager);
  }

  @Override
  public void updateLayer(long nativeTabListSceneLayer, TabListSceneLayer caller,
      int backgroundColor, float viewportX, float viewportY, float viewportWidth,
      float viewportHeight) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_updateLayer(nativeTabListSceneLayer, caller, backgroundColor, viewportX, viewportY, viewportWidth, viewportHeight);
  }

  @Override
  public void putTabLayer(long nativeTabListSceneLayer, TabListSceneLayer caller, int selectedId,
      int[] ids, boolean useAdditionalIds, int toolbarResourceId, int closeButtonResourceId,
      int shadowResourceId, int contourResourceId, int backLogoResourceId, int borderResourceId,
      int borderInnerShadowResourceId, boolean canUseLiveLayer, int tabBackgroundColor,
      int backLogoColor, boolean incognito, boolean isPortrait, float x, float y, float width,
      float height, float contentWidth, float contentHeight, float shadowX, float shadowY,
      float shadowWidth, float shadowHeight, float pivotX, float pivotY, float rotationX,
      float rotationY, float alpha, float borderAlpha, float borderInnerShadowAlpha,
      float contourAlpha, float shadowAlpha, float closeAlpha, float closeBtnWidth,
      float closeBtnAssetSize, float staticToViewBlend, float borderScale, float saturation,
      float brightness, boolean showToolbar, int defaultThemeColor, int toolbarBackgroundColor,
      int closeButtonColor, boolean anonymizeToolbar, boolean showTabTitle,
      int toolbarTextBoxResource, int toolbarTextBoxBackgroundColor, float toolbarTextBoxAlpha,
      float contentOffset, float sideBorderScale, boolean insetVerticalBorder) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_putTabLayer(nativeTabListSceneLayer, caller, selectedId, ids, useAdditionalIds, toolbarResourceId, closeButtonResourceId, shadowResourceId, contourResourceId, backLogoResourceId, borderResourceId, borderInnerShadowResourceId, canUseLiveLayer, tabBackgroundColor, backLogoColor, incognito, isPortrait, x, y, width, height, contentWidth, contentHeight, shadowX, shadowY, shadowWidth, shadowHeight, pivotX, pivotY, rotationX, rotationY, alpha, borderAlpha, borderInnerShadowAlpha, contourAlpha, shadowAlpha, closeAlpha, closeBtnWidth, closeBtnAssetSize, staticToViewBlend, borderScale, saturation, brightness, showToolbar, defaultThemeColor, toolbarBackgroundColor, closeButtonColor, anonymizeToolbar, showTabTitle, toolbarTextBoxResource, toolbarTextBoxBackgroundColor, toolbarTextBoxAlpha, contentOffset, sideBorderScale, insetVerticalBorder);
  }

  @Override
  public void putBackgroundLayer(long nativeTabListSceneLayer, TabListSceneLayer caller,
      int resourceId, float alpha, int topOffset) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_TabListSceneLayer_putBackgroundLayer(nativeTabListSceneLayer, caller, resourceId, alpha, topOffset);
  }

  public static TabListSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.TabListSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabListSceneLayerJni();
  }
}
