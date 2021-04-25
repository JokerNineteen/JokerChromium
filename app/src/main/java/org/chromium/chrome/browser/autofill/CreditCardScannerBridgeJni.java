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
final class CreditCardScannerBridgeJni implements CreditCardScannerBridge.Natives {
  private static CreditCardScannerBridge.Natives testInstance;

  public static final JniStaticTestMocker<CreditCardScannerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void scanCancelled(long nativeCreditCardScannerViewAndroid,
      CreditCardScannerBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_CreditCardScannerBridge_scanCancelled(nativeCreditCardScannerViewAndroid, caller);
  }

  @Override
  public void scanCompleted(long nativeCreditCardScannerViewAndroid, CreditCardScannerBridge caller,
      String cardHolderName, String cardNumber, int expirationMonth, int expirationYear) {
    GEN_JNI.org_chromium_chrome_browser_autofill_CreditCardScannerBridge_scanCompleted(nativeCreditCardScannerViewAndroid, caller, cardHolderName, cardNumber, expirationMonth, expirationYear);
  }

  public static CreditCardScannerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.CreditCardScannerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CreditCardScannerBridgeJni();
  }
}
