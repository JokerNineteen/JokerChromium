package org.chromium.chrome.browser.webauthn;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CableAuthenticatorModuleProviderJni implements CableAuthenticatorModuleProvider.Natives {
  private static CableAuthenticatorModuleProvider.Natives testInstance;

  public static final JniStaticTestMocker<CableAuthenticatorModuleProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webauthn.CableAuthenticatorModuleProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webauthn.CableAuthenticatorModuleProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long getSystemNetworkContext() {
    return (long)GEN_JNI.org_chromium_chrome_browser_webauthn_CableAuthenticatorModuleProvider_getSystemNetworkContext();
  }

  @Override
  public long getRegistration() {
    return (long)GEN_JNI.org_chromium_chrome_browser_webauthn_CableAuthenticatorModuleProvider_getRegistration();
  }

  @Override
  public void freeEvent(long event) {
    GEN_JNI.org_chromium_chrome_browser_webauthn_CableAuthenticatorModuleProvider_freeEvent(event);
  }

  public static CableAuthenticatorModuleProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webauthn.CableAuthenticatorModuleProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CableAuthenticatorModuleProviderJni();
  }
}
