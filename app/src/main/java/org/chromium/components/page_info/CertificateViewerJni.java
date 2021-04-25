package org.chromium.components.page_info;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CertificateViewerJni implements CertificateViewer.Natives {
  private static CertificateViewer.Natives testInstance;

  public static final JniStaticTestMocker<CertificateViewer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.page_info.CertificateViewer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.page_info.CertificateViewer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getCertIssuedToText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertIssuedToText();
  }

  @Override
  public String getCertInfoCommonNameText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertInfoCommonNameText();
  }

  @Override
  public String getCertInfoOrganizationText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertInfoOrganizationText();
  }

  @Override
  public String getCertInfoSerialNumberText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertInfoSerialNumberText();
  }

  @Override
  public String getCertInfoOrganizationUnitText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertInfoOrganizationUnitText();
  }

  @Override
  public String getCertIssuedByText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertIssuedByText();
  }

  @Override
  public String getCertValidityText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertValidityText();
  }

  @Override
  public String getCertIssuedOnText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertIssuedOnText();
  }

  @Override
  public String getCertExpiresOnText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertExpiresOnText();
  }

  @Override
  public String getCertFingerprintsText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertFingerprintsText();
  }

  @Override
  public String getCertSHA256FingerprintText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertSHA256FingerprintText();
  }

  @Override
  public String getCertSHA1FingerprintText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertSHA1FingerprintText();
  }

  @Override
  public String getCertExtensionText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertExtensionText();
  }

  @Override
  public String getCertSANText() {
    return (String)GEN_JNI.org_chromium_components_page_1info_CertificateViewer_getCertSANText();
  }

  public static CertificateViewer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.page_info.CertificateViewer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CertificateViewerJni();
  }
}
