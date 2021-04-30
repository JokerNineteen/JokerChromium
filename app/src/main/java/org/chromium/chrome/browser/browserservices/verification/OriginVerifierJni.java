package org.chromium.chrome.browser.browserservices.verification;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OriginVerifierJni implements OriginVerifier.Natives {
  private static OriginVerifier.Natives testInstance;

  public static final JniStaticTestMocker<OriginVerifier.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browserservices.verification.OriginVerifier.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browserservices.verification.OriginVerifier.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OriginVerifier caller, WebContents webContents, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_browserservices_verification_OriginVerifier_init(caller, webContents, profile);
  }

  @Override
  public boolean verifyOrigin(long nativeOriginVerifier, OriginVerifier caller, String packageName,
      String signatureFingerprint, String origin, String relationship) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_browserservices_verification_OriginVerifier_verifyOrigin(nativeOriginVerifier, caller, packageName, signatureFingerprint, origin, relationship);
  }

  @Override
  public void destroy(long nativeOriginVerifier, OriginVerifier caller) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_verification_OriginVerifier_destroy(nativeOriginVerifier, caller);
  }

  public static OriginVerifier.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.verification.OriginVerifier.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OriginVerifierJni();
  }
}
