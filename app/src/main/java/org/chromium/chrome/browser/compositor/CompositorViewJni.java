package org.chromium.chrome.browser.compositor;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CompositorViewJni implements CompositorView.Natives {
  private static CompositorView.Natives testInstance;

  public static final JniStaticTestMocker<CompositorView.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.CompositorView.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.CompositorView.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CompositorView caller, boolean lowMemDevice, WindowAndroid windowAndroid,
      TabContentManager tabContentManager) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_init(caller, lowMemDevice, windowAndroid, tabContentManager);
  }

  @Override
  public void destroy(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_destroy(nativeCompositorView, caller);
  }

  @Override
  public ResourceManager getResourceManager(long nativeCompositorView, CompositorView caller) {
    return (ResourceManager)GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_getResourceManager(nativeCompositorView, caller);
  }

  @Override
  public void surfaceCreated(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_surfaceCreated(nativeCompositorView, caller);
  }

  @Override
  public void surfaceDestroyed(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_surfaceDestroyed(nativeCompositorView, caller);
  }

  @Override
  public void surfaceChanged(long nativeCompositorView, CompositorView caller, int format,
      int width, int height, boolean backedBySurfaceTexture, Surface surface) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_surfaceChanged(nativeCompositorView, caller, format, width, height, backedBySurfaceTexture, surface);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeCompositorView, CompositorView caller,
      WebContents webContents, int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_onPhysicalBackingSizeChanged(nativeCompositorView, caller, webContents, width, height);
  }

  @Override
  public void onControlsResizeViewChanged(long nativeCompositorView, CompositorView caller,
      WebContents webContents, boolean controlsResizeView) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_onControlsResizeViewChanged(nativeCompositorView, caller, webContents, controlsResizeView);
  }

  @Override
  public void notifyVirtualKeyboardOverlayRect(long nativeCompositorView, CompositorView caller,
      WebContents webContents, int x, int y, int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_notifyVirtualKeyboardOverlayRect(nativeCompositorView, caller, webContents, x, y, width, height);
  }

  @Override
  public void finalizeLayers(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_finalizeLayers(nativeCompositorView, caller);
  }

  @Override
  public void setNeedsComposite(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setNeedsComposite(nativeCompositorView, caller);
  }

  @Override
  public void setLayoutBounds(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setLayoutBounds(nativeCompositorView, caller);
  }

  @Override
  public void setOverlayVideoMode(long nativeCompositorView, CompositorView caller,
      boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setOverlayVideoMode(nativeCompositorView, caller, enabled);
  }

  @Override
  public void setOverlayImmersiveArMode(long nativeCompositorView, CompositorView caller,
      boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setOverlayImmersiveArMode(nativeCompositorView, caller, enabled);
  }

  @Override
  public void setSceneLayer(long nativeCompositorView, CompositorView caller,
      SceneLayer sceneLayer) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setSceneLayer(nativeCompositorView, caller, sceneLayer);
  }

  @Override
  public void setCompositorWindow(long nativeCompositorView, CompositorView caller,
      WindowAndroid window) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_setCompositorWindow(nativeCompositorView, caller, window);
  }

  @Override
  public void cacheBackBufferForCurrentSurface(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_cacheBackBufferForCurrentSurface(nativeCompositorView, caller);
  }

  @Override
  public void evictCachedBackBuffer(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_evictCachedBackBuffer(nativeCompositorView, caller);
  }

  @Override
  public void onTabChanged(long nativeCompositorView, CompositorView caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_CompositorView_onTabChanged(nativeCompositorView, caller);
  }

  public static CompositorView.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.CompositorView.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CompositorViewJni();
  }
}
