package org.chromium.chrome.browser.compositor.bottombar;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OverlayPanelContentJni implements OverlayPanelContent.Natives {
  private static OverlayPanelContent.Natives testInstance;

  public static final JniStaticTestMocker<OverlayPanelContent.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OverlayPanelContent caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_init(caller);
  }

  @Override
  public void destroy(long nativeOverlayPanelContent, OverlayPanelContent caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_destroy(nativeOverlayPanelContent, caller);
  }

  @Override
  public void removeLastHistoryEntry(long nativeOverlayPanelContent, OverlayPanelContent caller,
      String historyUrl, long urlTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_removeLastHistoryEntry(nativeOverlayPanelContent, caller, historyUrl, urlTimeMs);
  }

  @Override
  public void onPhysicalBackingSizeChanged(long nativeOverlayPanelContent,
      OverlayPanelContent caller, WebContents webContents, int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_onPhysicalBackingSizeChanged(nativeOverlayPanelContent, caller, webContents, width, height);
  }

  @Override
  public void setWebContents(long nativeOverlayPanelContent, OverlayPanelContent caller,
      WebContents webContents, WebContentsDelegateAndroid delegate) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_setWebContents(nativeOverlayPanelContent, caller, webContents, delegate);
  }

  @Override
  public void destroyWebContents(long nativeOverlayPanelContent, OverlayPanelContent caller) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_destroyWebContents(nativeOverlayPanelContent, caller);
  }

  @Override
  public void setInterceptNavigationDelegate(long nativeOverlayPanelContent,
      OverlayPanelContent caller, InterceptNavigationDelegate delegate, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_setInterceptNavigationDelegate(nativeOverlayPanelContent, caller, delegate, webContents);
  }

  @Override
  public void updateBrowserControlsState(long nativeOverlayPanelContent, OverlayPanelContent caller,
      boolean areControlsHidden) {
    GEN_JNI.org_chromium_chrome_browser_compositor_bottombar_OverlayPanelContent_updateBrowserControlsState(nativeOverlayPanelContent, caller, areControlsHidden);
  }

  public static OverlayPanelContent.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.bottombar.OverlayPanelContent.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OverlayPanelContentJni();
  }
}
