package org.chromium.components.payments;

import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentHandlerHostJni implements PaymentHandlerHost.Natives {
  private static PaymentHandlerHost.Natives testInstance;

  public static final JniStaticTestMocker<PaymentHandlerHost.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentHandlerHost.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentHandlerHost.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(WebContents webContents, PaymentRequestUpdateEventListener listener) {
    return (long)GEN_JNI.org_chromium_components_payments_PaymentHandlerHost_init(webContents, listener);
  }

  @Override
  public boolean isWaitingForPaymentDetailsUpdate(long nativePaymentHandlerHost) {
    return (boolean)GEN_JNI.org_chromium_components_payments_PaymentHandlerHost_isWaitingForPaymentDetailsUpdate(nativePaymentHandlerHost);
  }

  @Override
  public void updateWith(long nativePaymentHandlerHost, ByteBuffer responseBuffer) {
    GEN_JNI.org_chromium_components_payments_PaymentHandlerHost_updateWith(nativePaymentHandlerHost, responseBuffer);
  }

  @Override
  public void onPaymentDetailsNotUpdated(long nativePaymentHandlerHost) {
    GEN_JNI.org_chromium_components_payments_PaymentHandlerHost_onPaymentDetailsNotUpdated(nativePaymentHandlerHost);
  }

  @Override
  public void destroy(long nativePaymentHandlerHost) {
    GEN_JNI.org_chromium_components_payments_PaymentHandlerHost_destroy(nativePaymentHandlerHost);
  }

  public static PaymentHandlerHost.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentHandlerHost.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentHandlerHostJni();
  }
}
