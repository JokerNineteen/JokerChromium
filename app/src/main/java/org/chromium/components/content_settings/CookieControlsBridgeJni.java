package org.chromium.components.content_settings;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.browser_context.BrowserContextHandle;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookieControlsBridgeJni implements CookieControlsBridge.Natives {
  private static CookieControlsBridge.Natives testInstance;

  public static final JniStaticTestMocker<CookieControlsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.content_settings.CookieControlsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.content_settings.CookieControlsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CookieControlsBridge caller, WebContents webContents,
      BrowserContextHandle originalContextHandle) {
    return (long)GEN_JNI.org_chromium_components_content_1settings_CookieControlsBridge_init(caller, webContents, originalContextHandle);
  }

  @Override
  public void destroy(long nativeCookieControlsBridge, CookieControlsBridge caller) {
    GEN_JNI.org_chromium_components_content_1settings_CookieControlsBridge_destroy(nativeCookieControlsBridge, caller);
  }

  @Override
  public void setThirdPartyCookieBlockingEnabledForSite(long nativeCookieControlsBridge,
      boolean blockCookies) {
    GEN_JNI.org_chromium_components_content_1settings_CookieControlsBridge_setThirdPartyCookieBlockingEnabledForSite(nativeCookieControlsBridge, blockCookies);
  }

  @Override
  public void onUiClosing(long nativeCookieControlsBridge) {
    GEN_JNI.org_chromium_components_content_1settings_CookieControlsBridge_onUiClosing(nativeCookieControlsBridge);
  }

  @Override
  public boolean isCookieControlsEnabled(BrowserContextHandle browserContextHandle) {
    return (boolean)GEN_JNI.org_chromium_components_content_1settings_CookieControlsBridge_isCookieControlsEnabled(browserContextHandle);
  }

  public static CookieControlsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.content_settings.CookieControlsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CookieControlsBridgeJni();
  }
}
