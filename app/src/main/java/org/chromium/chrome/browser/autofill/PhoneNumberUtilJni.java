package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PhoneNumberUtilJni implements PhoneNumberUtil.Natives {
  private static PhoneNumberUtil.Natives testInstance;

  public static final JniStaticTestMocker<PhoneNumberUtil.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String formatForDisplay(String phoneNumber, String countryCode) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PhoneNumberUtil_formatForDisplay(phoneNumber, countryCode);
  }

  @Override
  public String formatForResponse(String phoneNumber) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PhoneNumberUtil_formatForResponse(phoneNumber);
  }

  @Override
  public boolean isPossibleNumber(String phoneNumber, String countryCode) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PhoneNumberUtil_isPossibleNumber(phoneNumber, countryCode);
  }

  public static PhoneNumberUtil.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.PhoneNumberUtil.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PhoneNumberUtilJni();
  }
}
