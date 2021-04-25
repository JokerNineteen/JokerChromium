package org.chromium.components.payments;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestDownloaderJni implements PaymentManifestDownloader.Natives {
  private static PaymentManifestDownloader.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestDownloader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentManifestDownloader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentManifestDownloader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_payments_PaymentManifestDownloader_init(webContents);
  }

  @Override
  public void downloadPaymentMethodManifest(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller, Origin merchantOrigin, GURL methodName,
      PaymentManifestDownloader.ManifestDownloadCallback callback) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestDownloader_downloadPaymentMethodManifest(nativePaymentManifestDownloaderAndroid, caller, merchantOrigin, methodName, callback);
  }

  @Override
  public void downloadWebAppManifest(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller, Origin paymentMethodManifestOrigin, GURL webAppManifestUri,
      PaymentManifestDownloader.ManifestDownloadCallback callback) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestDownloader_downloadWebAppManifest(nativePaymentManifestDownloaderAndroid, caller, paymentMethodManifestOrigin, webAppManifestUri, callback);
  }

  @Override
  public void destroy(long nativePaymentManifestDownloaderAndroid,
      PaymentManifestDownloader caller) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestDownloader_destroy(nativePaymentManifestDownloaderAndroid, caller);
  }

  @Override
  public Origin createOpaqueOriginForTest() {
    return (Origin)GEN_JNI.org_chromium_components_payments_PaymentManifestDownloader_createOpaqueOriginForTest();
  }

  public static PaymentManifestDownloader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentManifestDownloader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentManifestDownloaderJni();
  }
}
