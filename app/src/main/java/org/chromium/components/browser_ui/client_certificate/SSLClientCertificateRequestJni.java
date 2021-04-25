package org.chromium.components.browser_ui.client_certificate;

import java.lang.Override;
import java.security.PrivateKey;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SSLClientCertificateRequestJni implements SSLClientCertificateRequest.Natives {
  private static SSLClientCertificateRequest.Natives testInstance;

  public static final JniStaticTestMocker<SSLClientCertificateRequest.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.browser_ui.client_certificate.SSLClientCertificateRequest.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.browser_ui.client_certificate.SSLClientCertificateRequest.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void notifyClientCertificatesChangedOnIOThread() {
    GEN_JNI.org_chromium_components_browser_1ui_client_1certificate_SSLClientCertificateRequest_notifyClientCertificatesChangedOnIOThread();
  }

  @Override
  public void onSystemRequestCompletion(long requestPtr, byte[][] certChain,
      PrivateKey privateKey) {
    GEN_JNI.org_chromium_components_browser_1ui_client_1certificate_SSLClientCertificateRequest_onSystemRequestCompletion(requestPtr, certChain, privateKey);
  }

  public static SSLClientCertificateRequest.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.browser_ui.client_certificate.SSLClientCertificateRequest.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SSLClientCertificateRequestJni();
  }
}
