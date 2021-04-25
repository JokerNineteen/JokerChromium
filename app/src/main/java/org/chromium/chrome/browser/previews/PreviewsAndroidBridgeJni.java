package org.chromium.chrome.browser.previews;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PreviewsAndroidBridgeJni implements PreviewsAndroidBridge.Natives {
  private static PreviewsAndroidBridge.Natives testInstance;

  public static final JniStaticTestMocker<PreviewsAndroidBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PreviewsAndroidBridge caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_previews_PreviewsAndroidBridge_init(caller);
  }

  @Override
  public boolean shouldShowPreviewUI(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_previews_PreviewsAndroidBridge_shouldShowPreviewUI(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public void loadOriginal(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_previews_PreviewsAndroidBridge_loadOriginal(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public String getPreviewsType(long nativePreviewsAndroidBridge, PreviewsAndroidBridge caller,
      WebContents webContents) {
    return (String)GEN_JNI.org_chromium_chrome_browser_previews_PreviewsAndroidBridge_getPreviewsType(nativePreviewsAndroidBridge, caller, webContents);
  }

  @Override
  public boolean isHttpsImageCompressionApplied(long nativePreviewsAndroidBridge,
      PreviewsAndroidBridge caller, WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_previews_PreviewsAndroidBridge_isHttpsImageCompressionApplied(nativePreviewsAndroidBridge, caller, webContents);
  }

  public static PreviewsAndroidBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.previews.PreviewsAndroidBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PreviewsAndroidBridgeJni();
  }
}
