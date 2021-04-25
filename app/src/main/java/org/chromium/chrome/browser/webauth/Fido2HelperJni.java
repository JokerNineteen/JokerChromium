package org.chromium.chrome.browser.webauth;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class Fido2HelperJni implements Fido2Helper.Natives {
  private static Fido2Helper.Natives testInstance;

  public static final JniStaticTestMocker<Fido2Helper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.webauth.Fido2Helper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.webauth.Fido2Helper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean parseAttestationObject(byte[] attestationObject,
      Fido2Helper.AttestationObjectParts result) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_webauth_Fido2Helper_parseAttestationObject(attestationObject, result);
  }

  public static Fido2Helper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.webauth.Fido2Helper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new Fido2HelperJni();
  }
}
