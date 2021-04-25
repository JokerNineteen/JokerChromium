package org.chromium.chrome.browser.autofill;

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
final class PersonalDataManagerJni implements PersonalDataManager.Natives {
  private static PersonalDataManager.Natives testInstance;

  public static final JniStaticTestMocker<PersonalDataManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.PersonalDataManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.PersonalDataManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PersonalDataManager caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_init(caller);
  }

  @Override
  public boolean isDataLoaded(long nativePersonalDataManagerAndroid, PersonalDataManager caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isDataLoaded(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileGUIDsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileGUIDsForSettings(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileGUIDsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileGUIDsToSuggest(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileLabelsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileLabelsForSettings(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getProfileLabelsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, boolean includeNameInLabel, boolean includeOrganizationInLabel,
      boolean includeCountryInLabel) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileLabelsToSuggest(nativePersonalDataManagerAndroid, caller, includeNameInLabel, includeOrganizationInLabel, includeCountryInLabel);
  }

  @Override
  public PersonalDataManager.AutofillProfile getProfileByGUID(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (PersonalDataManager.AutofillProfile)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileByGUID(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public String setProfile(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setProfile(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String setProfileToLocal(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setProfileToLocal(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getShippingAddressLabelWithCountryForPaymentRequest(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getShippingAddressLabelWithCountryForPaymentRequest(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getShippingAddressLabelWithoutCountryForPaymentRequest(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.AutofillProfile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getShippingAddressLabelWithoutCountryForPaymentRequest(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String getBillingAddressLabelForPaymentRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.AutofillProfile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getBillingAddressLabelForPaymentRequest(nativePersonalDataManagerAndroid, caller, profile);
  }

  @Override
  public String[] getCreditCardGUIDsForSettings(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardGUIDsForSettings(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public String[] getCreditCardGUIDsToSuggest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, boolean includeServerCards) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardGUIDsToSuggest(nativePersonalDataManagerAndroid, caller, includeServerCards);
  }

  @Override
  public PersonalDataManager.CreditCard getCreditCardByGUID(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (PersonalDataManager.CreditCard)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardByGUID(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public PersonalDataManager.CreditCard getCreditCardForNumber(
      long nativePersonalDataManagerAndroid, PersonalDataManager caller, String cardNumber) {
    return (PersonalDataManager.CreditCard)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardForNumber(nativePersonalDataManagerAndroid, caller, cardNumber);
  }

  @Override
  public String setCreditCard(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      PersonalDataManager.CreditCard card) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setCreditCard(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public void updateServerCardBillingAddress(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.CreditCard card) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_updateServerCardBillingAddress(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public String getBasicCardIssuerNetwork(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String cardNumber, boolean emptyIfInvalid) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getBasicCardIssuerNetwork(nativePersonalDataManagerAndroid, caller, cardNumber, emptyIfInvalid);
  }

  @Override
  public void addServerCreditCardForTest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.CreditCard card) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_addServerCreditCardForTest(nativePersonalDataManagerAndroid, caller, card);
  }

  @Override
  public void addServerCreditCardForTestWithAdditionalFields(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.CreditCard card, String nickname,
      int cardIssuer) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_addServerCreditCardForTestWithAdditionalFields(nativePersonalDataManagerAndroid, caller, card, nickname, cardIssuer);
  }

  @Override
  public void removeByGUID(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String guid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_removeByGUID(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void recordAndLogProfileUse(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_recordAndLogProfileUse(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void setProfileUseStatsForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid, int count, long date) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setProfileUseStatsForTesting(nativePersonalDataManagerAndroid, caller, guid, count, date);
  }

  @Override
  public int getProfileUseCountForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (int)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileUseCountForTesting(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getProfileUseDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getProfileUseDateForTesting(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void recordAndLogCreditCardUse(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_recordAndLogCreditCardUse(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void setCreditCardUseStatsForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid, int count, long date) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setCreditCardUseStatsForTesting(nativePersonalDataManagerAndroid, caller, guid, count, date);
  }

  @Override
  public int getCreditCardUseCountForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (int)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardUseCountForTesting(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getCreditCardUseDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String guid) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCreditCardUseDateForTesting(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public long getCurrentDateForTesting(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getCurrentDateForTesting(nativePersonalDataManagerAndroid, caller);
  }

  @Override
  public void clearUnmaskedCache(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String guid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_clearUnmaskedCache(nativePersonalDataManagerAndroid, caller, guid);
  }

  @Override
  public void getFullCardForPaymentRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, WebContents webContents, PersonalDataManager.CreditCard card,
      PersonalDataManager.FullCardRequestDelegate delegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_getFullCardForPaymentRequest(nativePersonalDataManagerAndroid, caller, webContents, card, delegate);
  }

  @Override
  public void loadRulesForAddressNormalization(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String regionCode) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_loadRulesForAddressNormalization(nativePersonalDataManagerAndroid, caller, regionCode);
  }

  @Override
  public void loadRulesForSubKeys(long nativePersonalDataManagerAndroid, PersonalDataManager caller,
      String regionCode) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_loadRulesForSubKeys(nativePersonalDataManagerAndroid, caller, regionCode);
  }

  @Override
  public void startAddressNormalization(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, PersonalDataManager.AutofillProfile profile, int timeoutSeconds,
      PersonalDataManager.NormalizedAddressRequestDelegate delegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_startAddressNormalization(nativePersonalDataManagerAndroid, caller, profile, timeoutSeconds, delegate);
  }

  @Override
  public void startRegionSubKeysRequest(long nativePersonalDataManagerAndroid,
      PersonalDataManager caller, String regionCode, int timeoutSeconds,
      PersonalDataManager.GetSubKeysRequestDelegate delegate) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_startRegionSubKeysRequest(nativePersonalDataManagerAndroid, caller, regionCode, timeoutSeconds, delegate);
  }

  @Override
  public boolean hasProfiles(long nativePersonalDataManagerAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_hasProfiles(nativePersonalDataManagerAndroid);
  }

  @Override
  public boolean hasCreditCards(long nativePersonalDataManagerAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_hasCreditCards(nativePersonalDataManagerAndroid);
  }

  @Override
  public boolean isFidoAuthenticationAvailable(long nativePersonalDataManagerAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isFidoAuthenticationAvailable(nativePersonalDataManagerAndroid);
  }

  @Override
  public boolean isAutofillManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isAutofillManaged();
  }

  @Override
  public boolean isAutofillProfileManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isAutofillProfileManaged();
  }

  @Override
  public boolean isAutofillCreditCardManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isAutofillCreditCardManaged();
  }

  @Override
  public boolean isPaymentsIntegrationEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_isPaymentsIntegrationEnabled();
  }

  @Override
  public void setPaymentsIntegrationEnabled(boolean enable) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setPaymentsIntegrationEnabled(enable);
  }

  @Override
  public String toCountryCode(String countryName) {
    return (String)GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_toCountryCode(countryName);
  }

  @Override
  public void cancelPendingGetSubKeys(long nativePersonalDataManagerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_cancelPendingGetSubKeys(nativePersonalDataManagerAndroid);
  }

  @Override
  public void setSyncServiceForTesting(long nativePersonalDataManagerAndroid) {
    GEN_JNI.org_chromium_chrome_browser_autofill_PersonalDataManager_setSyncServiceForTesting(nativePersonalDataManagerAndroid);
  }

  public static PersonalDataManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.PersonalDataManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PersonalDataManagerJni();
  }
}
