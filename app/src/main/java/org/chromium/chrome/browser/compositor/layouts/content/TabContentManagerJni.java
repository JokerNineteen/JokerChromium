package org.chromium.chrome.browser.compositor.layouts.content;

import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabContentManagerJni implements TabContentManager.Natives {
  private static TabContentManager.Natives testInstance;

  public static final JniStaticTestMocker<TabContentManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.compositor.layouts.content.TabContentManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.compositor.layouts.content.TabContentManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabContentManager caller, int defaultCacheSize, int approximationCacheSize,
      int compressionQueueMaxSize, int writeQueueMaxSize, boolean useApproximationThumbnail,
      boolean saveJpegThumbnails) {
    return (long)GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_init(caller, defaultCacheSize, approximationCacheSize, compressionQueueMaxSize, writeQueueMaxSize, useApproximationThumbnail, saveJpegThumbnails);
  }

  @Override
  public void attachTab(long nativeTabContentManager, TabContentManager caller, Tab tab,
      int tabId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_attachTab(nativeTabContentManager, caller, tab, tabId);
  }

  @Override
  public void detachTab(long nativeTabContentManager, TabContentManager caller, Tab tab,
      int tabId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_detachTab(nativeTabContentManager, caller, tab, tabId);
  }

  @Override
  public boolean hasFullCachedThumbnail(long nativeTabContentManager, TabContentManager caller,
      int tabId) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_hasFullCachedThumbnail(nativeTabContentManager, caller, tabId);
  }

  @Override
  public void captureThumbnail(long nativeTabContentManager, TabContentManager caller, Object tab,
      float thumbnailScale, boolean writeToCache, Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_captureThumbnail(nativeTabContentManager, caller, tab, thumbnailScale, writeToCache, callback);
  }

  @Override
  public void cacheTabWithBitmap(long nativeTabContentManager, TabContentManager caller, Object tab,
      Object bitmap, float thumbnailScale) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_cacheTabWithBitmap(nativeTabContentManager, caller, tab, bitmap, thumbnailScale);
  }

  @Override
  public void invalidateIfChanged(long nativeTabContentManager, TabContentManager caller, int tabId,
      String url) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_invalidateIfChanged(nativeTabContentManager, caller, tabId, url);
  }

  @Override
  public void updateVisibleIds(long nativeTabContentManager, TabContentManager caller,
      int[] priority, int primaryTabId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_updateVisibleIds(nativeTabContentManager, caller, priority, primaryTabId);
  }

  @Override
  public void removeTabThumbnail(long nativeTabContentManager, TabContentManager caller,
      int tabId) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_removeTabThumbnail(nativeTabContentManager, caller, tabId);
  }

  @Override
  public void getEtc1TabThumbnail(long nativeTabContentManager, TabContentManager caller, int tabId,
      Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_getEtc1TabThumbnail(nativeTabContentManager, caller, tabId, callback);
  }

  @Override
  public void setCaptureMinRequestTimeForTesting(long nativeTabContentManager,
      TabContentManager caller, int timeMs) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_setCaptureMinRequestTimeForTesting(nativeTabContentManager, caller, timeMs);
  }

  @Override
  public int getPendingReadbacksForTesting(long nativeTabContentManager, TabContentManager caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_getPendingReadbacksForTesting(nativeTabContentManager, caller);
  }

  @Override
  public void destroy(long nativeTabContentManager) {
    GEN_JNI.org_chromium_chrome_browser_compositor_layouts_content_TabContentManager_destroy(nativeTabContentManager);
  }

  public static TabContentManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.compositor.layouts.content.TabContentManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabContentManagerJni();
  }
}
