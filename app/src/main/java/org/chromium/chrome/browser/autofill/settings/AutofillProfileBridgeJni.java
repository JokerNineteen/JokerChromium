package org.chromium.chrome.browser.autofill.settings;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillProfileBridgeJni implements AutofillProfileBridge.Natives {
  private static AutofillProfileBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillProfileBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.settings.AutofillProfileBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.settings.AutofillProfileBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getDefaultCountryCode() {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillProfileBridge_getDefaultCountryCode();
  }

  @Override
  public void getSupportedCountries(List<String> countryCodes, List<String> countryNames) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillProfileBridge_getSupportedCountries(countryCodes, countryNames);
  }

  @Override
  public void getRequiredFields(String countryCode, List<Integer> requiredFields) {
    GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillProfileBridge_getRequiredFields(countryCode, requiredFields);
  }

  @Override
  public String getAddressUiComponents(String countryCode, String languageCode,
      List<Integer> componentIds, List<String> componentNames, List<Integer> componentRequired,
      List<Integer> componentLengths) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_settings_AutofillProfileBridge_getAddressUiComponents(countryCode, languageCode, componentIds, componentNames, componentRequired, componentLengths);
  }

  public static AutofillProfileBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.settings.AutofillProfileBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillProfileBridgeJni();
  }
}
