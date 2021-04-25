package org.chromium.chrome.browser.webapps.addtohomescreen;

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
final class AddToHomescreenMediatorJni implements AddToHomescreenMediator.Natives {
  private static AddToHomescreenMediator.Natives testInstance;

  public static final JniStaticTestMocker<AddToHomescreenMediator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initialize(AddToHomescreenMediator instance) {
    return (long)GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_initialize(instance);
  }

  @Override
  public void startForAppMenu(long nativeAddToHomescreenMediator, WebContents webContents,
      int titleId) {
    GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_startForAppMenu(nativeAddToHomescreenMediator, webContents, titleId);
  }

  @Override
  public void addToHomescreen(long nativeAddToHomescreenMediator, String title) {
    GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_addToHomescreen(nativeAddToHomescreenMediator, title);
  }

  @Override
  public void onNativeDetailsShown(long nativeAddToHomescreenMediator) {
    GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_onNativeDetailsShown(nativeAddToHomescreenMediator);
  }

  @Override
  public void onUiDismissed(long nativeAddToHomescreenMediator) {
    GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_onUiDismissed(nativeAddToHomescreenMediator);
  }

  @Override
  public void destroy(long nativeAddToHomescreenMediator) {
    GEN_JNI.org_chromium_chrome_browser_webapps_addtohomescreen_AddToHomescreenMediator_destroy(nativeAddToHomescreenMediator);
  }

  public static AddToHomescreenMediator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webapps.addtohomescreen.AddToHomescreenMediator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AddToHomescreenMediatorJni();
  }
}
