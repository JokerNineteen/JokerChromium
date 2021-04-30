package org.chromium.chrome.browser.webapps;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PwaBottomSheetControllerJni implements PwaBottomSheetController.Natives {
  private static PwaBottomSheetController.Natives testInstance;

  public static final JniStaticTestMocker<PwaBottomSheetController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.PwaBottomSheetController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.PwaBottomSheetController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean requestOrExpandBottomSheetInstaller(WebContents webContents, int trigger) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_webapps_PwaBottomSheetController_requestOrExpandBottomSheetInstaller(webContents, trigger);
  }

  @Override
  public void onSheetExpanded(long nativePwaBottomSheetController) {
    GEN_JNI.org_chromium_chrome_browser_webapps_PwaBottomSheetController_onSheetExpanded(nativePwaBottomSheetController);
  }

  @Override
  public void updateInstallSource(long nativePwaBottomSheetController, int installSource) {
    GEN_JNI.org_chromium_chrome_browser_webapps_PwaBottomSheetController_updateInstallSource(nativePwaBottomSheetController, installSource);
  }

  @Override
  public void onAddToHomescreen(long nativePwaBottomSheetController, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_webapps_PwaBottomSheetController_onAddToHomescreen(nativePwaBottomSheetController, webContents);
  }

  @Override
  public void destroy(long nativePwaBottomSheetController) {
    GEN_JNI.org_chromium_chrome_browser_webapps_PwaBottomSheetController_destroy(nativePwaBottomSheetController);
  }

  public static PwaBottomSheetController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.PwaBottomSheetController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PwaBottomSheetControllerJni();
  }
}
