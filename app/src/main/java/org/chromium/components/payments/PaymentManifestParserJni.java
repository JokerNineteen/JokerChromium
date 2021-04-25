package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentManifestParserJni implements PaymentManifestParser.Natives {
  private static PaymentManifestParser.Natives testInstance;

  public static final JniStaticTestMocker<PaymentManifestParser.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentManifestParser.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentManifestParser.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long createPaymentManifestParserAndroid(WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_payments_PaymentManifestParser_createPaymentManifestParserAndroid(webContents);
  }

  @Override
  public void destroyPaymentManifestParserAndroid(long nativePaymentManifestParserAndroid) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestParser_destroyPaymentManifestParserAndroid(nativePaymentManifestParserAndroid);
  }

  @Override
  public void parsePaymentMethodManifest(long nativePaymentManifestParserAndroid, GURL manifestUrl,
      String content, PaymentManifestParser.ManifestParseCallback callback) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestParser_parsePaymentMethodManifest(nativePaymentManifestParserAndroid, manifestUrl, content, callback);
  }

  @Override
  public void parseWebAppManifest(long nativePaymentManifestParserAndroid, String content,
      PaymentManifestParser.ManifestParseCallback callback) {
    GEN_JNI.org_chromium_components_payments_PaymentManifestParser_parseWebAppManifest(nativePaymentManifestParserAndroid, content, callback);
  }

  public static PaymentManifestParser.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentManifestParser.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentManifestParserJni();
  }
}
