package org.chromium.chrome.browser.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.payments.WebAppManifestSection;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestWebDataServiceJni implements PaymentManifestWebDataService.Natives {
  private static PaymentManifestWebDataService.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestWebDataService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PaymentManifestWebDataService caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_init(caller);
  }

  @Override
  public void destroy(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller) {
    GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_destroy(nativePaymentManifestWebDataServiceAndroid, caller);
  }

  @Override
  public boolean getPaymentMethodManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String methodName,
      PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback callback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_getPaymentMethodManifest(nativePaymentManifestWebDataServiceAndroid, caller, methodName, callback);
  }

  @Override
  public boolean getPaymentWebAppManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String appPackageName,
      PaymentManifestWebDataService.PaymentManifestWebDataServiceCallback callback) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_getPaymentWebAppManifest(nativePaymentManifestWebDataServiceAndroid, caller, appPackageName, callback);
  }

  @Override
  public void addPaymentMethodManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, String methodName, String[] appPackageNames) {
    GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_addPaymentMethodManifest(nativePaymentManifestWebDataServiceAndroid, caller, methodName, appPackageNames);
  }

  @Override
  public void addPaymentWebAppManifest(long nativePaymentManifestWebDataServiceAndroid,
      PaymentManifestWebDataService caller, WebAppManifestSection[] manifest) {
    GEN_JNI.org_chromium_chrome_browser_payments_PaymentManifestWebDataService_addPaymentWebAppManifest(nativePaymentManifestWebDataServiceAndroid, caller, manifest);
  }

  public static PaymentManifestWebDataService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.PaymentManifestWebDataService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentManifestWebDataServiceJni();
  }
}
