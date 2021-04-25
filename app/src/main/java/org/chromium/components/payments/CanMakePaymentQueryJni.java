package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.payments.mojom.PaymentMethodData;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CanMakePaymentQueryJni implements CanMakePaymentQuery.Natives {
  private static CanMakePaymentQuery.Natives testInstance;

  public static final JniStaticTestMocker<CanMakePaymentQuery.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.CanMakePaymentQuery.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.CanMakePaymentQuery.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canQuery(WebContents webContents, String topLevelOrigin, String frameOrigin,
      Map<String, PaymentMethodData> query) {
    return (boolean)GEN_JNI.org_chromium_components_payments_CanMakePaymentQuery_canQuery(webContents, topLevelOrigin, frameOrigin, query);
  }

  public static CanMakePaymentQuery.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.CanMakePaymentQuery.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CanMakePaymentQueryJni();
  }
}
