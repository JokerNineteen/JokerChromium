package org.chromium.components.payments;

import java.lang.Override;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PaymentValidatorJni implements PaymentValidator.Natives {
  private static PaymentValidator.Natives testInstance;

  public static final JniStaticTestMocker<PaymentValidator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.PaymentValidator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.PaymentValidator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean validatePaymentDetailsAndroid(ByteBuffer buffer) {
    return (boolean)GEN_JNI.org_chromium_components_payments_PaymentValidator_validatePaymentDetailsAndroid(buffer);
  }

  @Override
  public boolean validatePaymentValidationErrorsAndroid(ByteBuffer buffer) {
    return (boolean)GEN_JNI.org_chromium_components_payments_PaymentValidator_validatePaymentValidationErrorsAndroid(buffer);
  }

  public static PaymentValidator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.PaymentValidator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PaymentValidatorJni();
  }
}
