package org.chromium.chrome.browser.tab;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TrustedCdnJni implements TrustedCdn.Natives {
  private static TrustedCdn.Natives testInstance;

  public static final JniStaticTestMocker<TrustedCdn.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TrustedCdn.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.tab.TrustedCdn.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TrustedCdn caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_init(caller);
  }

  @Override
  public void onDestroyed(long nativeTrustedCdn, TrustedCdn caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_onDestroyed(nativeTrustedCdn, caller);
  }

  @Override
  public void setWebContents(long nativeTrustedCdn, TrustedCdn caller, WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_setWebContents(nativeTrustedCdn, caller, webContents);
  }

  @Override
  public void resetWebContents(long nativeTrustedCdn, TrustedCdn caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TrustedCdn_resetWebContents(nativeTrustedCdn, caller);
  }

  public static TrustedCdn.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TrustedCdn.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedCdnJni();
  }
}
