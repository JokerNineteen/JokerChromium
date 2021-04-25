package org.chromium.chrome.browser.compositor;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LayerTitleCacheJni implements LayerTitleCache.Natives {
  private static LayerTitleCache.Natives testInstance;

  public static final JniStaticTestMocker<LayerTitleCache.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.LayerTitleCache.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.LayerTitleCache.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(LayerTitleCache caller, int fadeWidth, int faviconStartlPadding,
      int faviconEndPadding, int spinnerResId, int spinnerIncognitoResId,
      ResourceManager resourceManager) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_LayerTitleCache_init(caller, fadeWidth, faviconStartlPadding, faviconEndPadding, spinnerResId, spinnerIncognitoResId, resourceManager);
  }

  @Override
  public void destroy(long nativeLayerTitleCache) {
    GEN_JNI.org_chromium_chrome_browser_compositor_LayerTitleCache_destroy(nativeLayerTitleCache);
  }

  @Override
  public void clearExcept(long nativeLayerTitleCache, LayerTitleCache caller, int exceptId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_LayerTitleCache_clearExcept(nativeLayerTitleCache, caller, exceptId);
  }

  @Override
  public void updateLayer(long nativeLayerTitleCache, LayerTitleCache caller, int tabId,
      int titleResId, int faviconResId, boolean isIncognito, boolean isRtl) {
    GEN_JNI.org_chromium_chrome_browser_compositor_LayerTitleCache_updateLayer(nativeLayerTitleCache, caller, tabId, titleResId, faviconResId, isIncognito, isRtl);
  }

  @Override
  public void updateFavicon(long nativeLayerTitleCache, LayerTitleCache caller, int tabId,
      int faviconResId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_LayerTitleCache_updateFavicon(nativeLayerTitleCache, caller, tabId, faviconResId);
  }

  public static LayerTitleCache.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.LayerTitleCache.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LayerTitleCacheJni();
  }
}
