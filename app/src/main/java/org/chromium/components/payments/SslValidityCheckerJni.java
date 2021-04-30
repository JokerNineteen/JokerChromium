package org.chromium.components.payments;

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
final class SslValidityCheckerJni implements SslValidityChecker.Natives {
  private static SslValidityChecker.Natives testInstance;

  public static final JniStaticTestMocker<SslValidityChecker.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.SslValidityChecker.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.SslValidityChecker.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getInvalidSslCertificateErrorMessage(WebContents webContents) {
    return (String)GEN_JNI.org_chromium_components_payments_SslValidityChecker_getInvalidSslCertificateErrorMessage(webContents);
  }

  @Override
  public boolean isValidPageInPaymentHandlerWindow(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_components_payments_SslValidityChecker_isValidPageInPaymentHandlerWindow(webContents);
  }

  public static SslValidityChecker.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.SslValidityChecker.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SslValidityCheckerJni();
  }
}
