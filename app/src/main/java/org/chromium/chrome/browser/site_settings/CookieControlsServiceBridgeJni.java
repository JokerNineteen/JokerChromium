package org.chromium.chrome.browser.site_settings;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookieControlsServiceBridgeJni implements CookieControlsServiceBridge.Natives {
  private static CookieControlsServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<CookieControlsServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CookieControlsServiceBridge caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_site_1settings_CookieControlsServiceBridge_init(caller);
  }

  @Override
  public void destroy(long nativeCookieControlsServiceBridge, CookieControlsServiceBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_site_1settings_CookieControlsServiceBridge_destroy(nativeCookieControlsServiceBridge, caller);
  }

  @Override
  public void handleCookieControlsToggleChanged(long nativeCookieControlsServiceBridge,
      boolean enable) {
    GEN_JNI.org_chromium_chrome_browser_site_1settings_CookieControlsServiceBridge_handleCookieControlsToggleChanged(nativeCookieControlsServiceBridge, enable);
  }

  @Override
  public void updateServiceIfNecessary(long nativeCookieControlsServiceBridge) {
    GEN_JNI.org_chromium_chrome_browser_site_1settings_CookieControlsServiceBridge_updateServiceIfNecessary(nativeCookieControlsServiceBridge);
  }

  public static CookieControlsServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.site_settings.CookieControlsServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CookieControlsServiceBridgeJni();
  }
}
