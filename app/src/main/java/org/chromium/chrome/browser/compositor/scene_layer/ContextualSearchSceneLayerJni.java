package org.chromium.chrome.browser.compositor.scene_layer;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextualSearchSceneLayerJni implements ContextualSearchSceneLayer.Natives {
  private static ContextualSearchSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<ContextualSearchSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ContextualSearchSceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ContextualSearchSceneLayer_init(caller);
  }

  @Override
  public void createContextualSearchLayer(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, ResourceManager resourceManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ContextualSearchSceneLayer_createContextualSearchLayer(nativeContextualSearchSceneLayer, caller, resourceManager);
  }

  @Override
  public void setContentTree(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ContextualSearchSceneLayer_setContentTree(nativeContextualSearchSceneLayer, caller, contentTree);
  }

  @Override
  public void hideTree(long nativeContextualSearchSceneLayer, ContextualSearchSceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ContextualSearchSceneLayer_hideTree(nativeContextualSearchSceneLayer, caller);
  }

  @Override
  public void updateContextualSearchLayer(long nativeContextualSearchSceneLayer,
      ContextualSearchSceneLayer caller, int searchBarBackgroundResourceId,
      int searchBarBackgroundColor, int searchContextResourceId, int searchTermResourceId,
      int searchCaptionResourceId, int searchBarShadowResourceId, int searchProviderIconResourceId,
      int quickActionIconResourceId, int dragHandlebarResourceId, int openTabIconResourceId,
      int closeIconResourceId, int progressBarBackgroundResourceId, int progressBarResourceId,
      int searchPromoResourceId, int barBannerRippleResourceId, int barBannerTextResourceId,
      float dpToPx, float layoutWidth, float layoutHeight, float basePageBrightness,
      float basePageYOffset, WebContents webContents, boolean searchPromoVisible,
      float searchPromoHeight, float searchPromoOpacity, int searchPromoBackgroundColor,
      int panelHelpResourceId, boolean panelHelpVisible, float panelHelpHeight,
      float panelHelpOpacity, int panelHelpBackgroundColor, boolean searchBarBannerVisible,
      float searchBarBannerHeight, float searchBarBannerPaddingPx, float searchBarBannerRippleWidth,
      float searchBarBannerRippleOpacity, float searchBarBannerTextOpacity, float searchPanelX,
      float searchPanelY, float searchPanelWidth, float searchPanelHeight,
      float searchBarMarginSide, float searchBarMarginTop, float searchBarHeight,
      float searchContextOpacity, float searchTextLayerMinHeight, float searchTermOpacity,
      float searchTermCaptionSpacing, float searchCaptionAnimationPercentage,
      boolean searchCaptionVisible, boolean searchBarBorderVisible, float searchBarBorderHeight,
      boolean quickActionIconVisible, boolean thumbnailVisible, String thumbnailUrl,
      float customImageVisibilityPercentage, int barImageSize, int iconColor,
      int dragHandlebarColor, float closeIconOpacity, boolean isProgressBarVisible,
      float progressBarHeight, float progressBarOpacity, float progressBarCompletion,
      boolean touchHighlightVisible, float touchHighlightXOffset, float toucHighlightWidth,
      Profile profile, int barBackgroundResourceId, int separatorLineColor) {
    GEN_JNI.org_chromium_chrome_browser_compositor_scene_1layer_ContextualSearchSceneLayer_updateContextualSearchLayer(nativeContextualSearchSceneLayer, caller, searchBarBackgroundResourceId, searchBarBackgroundColor, searchContextResourceId, searchTermResourceId, searchCaptionResourceId, searchBarShadowResourceId, searchProviderIconResourceId, quickActionIconResourceId, dragHandlebarResourceId, openTabIconResourceId, closeIconResourceId, progressBarBackgroundResourceId, progressBarResourceId, searchPromoResourceId, barBannerRippleResourceId, barBannerTextResourceId, dpToPx, layoutWidth, layoutHeight, basePageBrightness, basePageYOffset, webContents, searchPromoVisible, searchPromoHeight, searchPromoOpacity, searchPromoBackgroundColor, panelHelpResourceId, panelHelpVisible, panelHelpHeight, panelHelpOpacity, panelHelpBackgroundColor, searchBarBannerVisible, searchBarBannerHeight, searchBarBannerPaddingPx, searchBarBannerRippleWidth, searchBarBannerRippleOpacity, searchBarBannerTextOpacity, searchPanelX, searchPanelY, searchPanelWidth, searchPanelHeight, searchBarMarginSide, searchBarMarginTop, searchBarHeight, searchContextOpacity, searchTextLayerMinHeight, searchTermOpacity, searchTermCaptionSpacing, searchCaptionAnimationPercentage, searchCaptionVisible, searchBarBorderVisible, searchBarBorderHeight, quickActionIconVisible, thumbnailVisible, thumbnailUrl, customImageVisibilityPercentage, barImageSize, iconColor, dragHandlebarColor, closeIconOpacity, isProgressBarVisible, progressBarHeight, progressBarOpacity, progressBarCompletion, touchHighlightVisible, touchHighlightXOffset, toucHighlightWidth, profile, barBackgroundResourceId, separatorLineColor);
  }

  public static ContextualSearchSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.scene_layer.ContextualSearchSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextualSearchSceneLayerJni();
  }
}
