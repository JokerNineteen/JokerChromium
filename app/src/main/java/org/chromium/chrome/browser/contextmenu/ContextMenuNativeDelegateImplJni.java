package org.chromium.chrome.browser.contextmenu;

import android.graphics.Bitmap;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.contextmenu.ContextMenuParams;
import org.chromium.content_public.browser.RenderFrameHost;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ContextMenuNativeDelegateImplJni implements ContextMenuNativeDelegateImpl.Natives {
  private static ContextMenuNativeDelegateImpl.Natives testInstance;

  public static final JniStaticTestMocker<ContextMenuNativeDelegateImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContents webContents, ContextMenuParams contextMenuParams) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuNativeDelegateImpl_init(webContents, contextMenuParams);
  }

  @Override
  public void retrieveImageForShare(long nativeContextMenuNativeDelegateImpl,
      ContextMenuNativeDelegateImpl caller, RenderFrameHost renderFrameHost,
      Callback<ContextMenuNativeDelegateImpl.ImageCallbackResult> callback, int maxWidthPx,
      int maxHeightPx, int imageFormat) {
    GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuNativeDelegateImpl_retrieveImageForShare(nativeContextMenuNativeDelegateImpl, caller, renderFrameHost, callback, maxWidthPx, maxHeightPx, imageFormat);
  }

  @Override
  public void retrieveImageForContextMenu(long nativeContextMenuNativeDelegateImpl,
      ContextMenuNativeDelegateImpl caller, RenderFrameHost renderFrameHost,
      Callback<Bitmap> callback, int maxWidthPx, int maxHeightPx) {
    GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuNativeDelegateImpl_retrieveImageForContextMenu(nativeContextMenuNativeDelegateImpl, caller, renderFrameHost, callback, maxWidthPx, maxHeightPx);
  }

  @Override
  public void startDownload(long nativeContextMenuNativeDelegateImpl,
      ContextMenuNativeDelegateImpl caller, boolean isLink) {
    GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuNativeDelegateImpl_startDownload(nativeContextMenuNativeDelegateImpl, caller, isLink);
  }

  @Override
  public void searchForImage(long nativeContextMenuNativeDelegateImpl,
      ContextMenuNativeDelegateImpl caller, RenderFrameHost renderFrameHost) {
    GEN_JNI.org_chromium_chrome_browser_contextmenu_ContextMenuNativeDelegateImpl_searchForImage(nativeContextMenuNativeDelegateImpl, caller, renderFrameHost);
  }

  public static ContextMenuNativeDelegateImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextmenu.ContextMenuNativeDelegateImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ContextMenuNativeDelegateImplJni();
  }
}
