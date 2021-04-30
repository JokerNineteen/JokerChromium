package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CurrencyFormatterJni implements CurrencyFormatter.Natives {
  private static CurrencyFormatter.Natives testInstance;

  public static final JniStaticTestMocker<CurrencyFormatter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.CurrencyFormatter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.CurrencyFormatter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initCurrencyFormatterAndroid(CurrencyFormatter caller, String currencyCode,
      String localeName) {
    return (long)GEN_JNI.org_chromium_components_payments_CurrencyFormatter_initCurrencyFormatterAndroid(caller, currencyCode, localeName);
  }

  @Override
  public void destroy(long nativeCurrencyFormatterAndroid, CurrencyFormatter caller) {
    GEN_JNI.org_chromium_components_payments_CurrencyFormatter_destroy(nativeCurrencyFormatterAndroid, caller);
  }

  @Override
  public String format(long nativeCurrencyFormatterAndroid, CurrencyFormatter caller,
      String amountValue) {
    return (String)GEN_JNI.org_chromium_components_payments_CurrencyFormatter_format(nativeCurrencyFormatterAndroid, caller, amountValue);
  }

  @Override
  public void setMaxFractionalDigits(long nativeCurrencyFormatterAndroid, int maxFractionalDigits) {
    GEN_JNI.org_chromium_components_payments_CurrencyFormatter_setMaxFractionalDigits(nativeCurrencyFormatterAndroid, maxFractionalDigits);
  }

  @Override
  public String getFormattedCurrencyCode(long nativeCurrencyFormatterAndroid,
      CurrencyFormatter caller) {
    return (String)GEN_JNI.org_chromium_components_payments_CurrencyFormatter_getFormattedCurrencyCode(nativeCurrencyFormatterAndroid, caller);
  }

  public static CurrencyFormatter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.CurrencyFormatter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CurrencyFormatterJni();
  }
}
