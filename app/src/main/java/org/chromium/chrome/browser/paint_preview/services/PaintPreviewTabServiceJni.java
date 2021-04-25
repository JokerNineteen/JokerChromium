package org.chromium.chrome.browser.paint_preview.services;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaintPreviewTabServiceJni implements PaintPreviewTabService.Natives {
  private static PaintPreviewTabService.Natives testInstance;

  public static final JniStaticTestMocker<PaintPreviewTabService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void captureTabAndroid(long nativePaintPreviewTabService, int tabId,
      WebContents webContents, Callback<Boolean> successCallback) {
    GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_captureTabAndroid(nativePaintPreviewTabService, tabId, webContents, successCallback);
  }

  @Override
  public void tabClosedAndroid(long nativePaintPreviewTabService, int tabId) {
    GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_tabClosedAndroid(nativePaintPreviewTabService, tabId);
  }

  @Override
  public boolean hasCaptureForTabAndroid(long nativePaintPreviewTabService, int tabId) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_hasCaptureForTabAndroid(nativePaintPreviewTabService, tabId);
  }

  @Override
  public void auditArtifactsAndroid(long nativePaintPreviewTabService, int[] activeTabIds) {
    GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_auditArtifactsAndroid(nativePaintPreviewTabService, activeTabIds);
  }

  @Override
  public boolean isCacheInitializedAndroid(long nativePaintPreviewTabService) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_isCacheInitializedAndroid(nativePaintPreviewTabService);
  }

  @Override
  public String getPathAndroid(long nativePaintPreviewTabService) {
    return (String)GEN_JNI.org_chromium_chrome_browser_paint_1preview_services_PaintPreviewTabService_getPathAndroid(nativePaintPreviewTabService);
  }

  public static PaintPreviewTabService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.paint_preview.services.PaintPreviewTabService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaintPreviewTabServiceJni();
  }
}
