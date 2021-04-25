package org.chromium.chrome.browser.consent_auditor;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ConsentAuditorBridgeJni implements ConsentAuditorBridge.Natives {
  private static ConsentAuditorBridge.Natives testInstance;

  public static final JniStaticTestMocker<ConsentAuditorBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.consent_auditor.ConsentAuditorBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.consent_auditor.ConsentAuditorBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void recordConsent(ConsentAuditorBridge caller, Profile profile, String accountId,
      int feature, int[] consentDescription, int consentConfirmation) {
    GEN_JNI.org_chromium_chrome_browser_consent_1auditor_ConsentAuditorBridge_recordConsent(caller, profile, accountId, feature, consentDescription, consentConfirmation);
  }

  public static ConsentAuditorBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.consent_auditor.ConsentAuditorBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ConsentAuditorBridgeJni();
  }
}
