package org.chromium.components.page_info;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CertificateChainHelperJni implements CertificateChainHelper.Natives {
  private static CertificateChainHelper.Natives testInstance;

  public static final JniStaticTestMocker<CertificateChainHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.page_info.CertificateChainHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.page_info.CertificateChainHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public byte[][] getCertificateChain(WebContents webContents) {
    return (byte[][])GEN_JNI.org_chromium_components_page_1info_CertificateChainHelper_getCertificateChain(webContents);
  }

  public static CertificateChainHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.page_info.CertificateChainHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CertificateChainHelperJni();
  }
}
