package org.chromium.chrome.browser.privacy.secure_dns;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SecureDnsBridgeJni implements SecureDnsBridge.Natives {
  private static SecureDnsBridge.Natives testInstance;

  public static final JniStaticTestMocker<SecureDnsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.privacy.secure_dns.SecureDnsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.privacy.secure_dns.SecureDnsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getMode() {
    return (int)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_getMode();
  }

  @Override
  public void setMode(int mode) {
    GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_setMode(mode);
  }

  @Override
  public boolean isModeManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_isModeManaged();
  }

  @Override
  public String[][] getProviders() {
    return (String[][])GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_getProviders();
  }

  @Override
  public String getTemplates() {
    return (String)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_getTemplates();
  }

  @Override
  public boolean setTemplates(String templates) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_setTemplates(templates);
  }

  @Override
  public int getManagementMode() {
    return (int)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_getManagementMode();
  }

  @Override
  public void updateDropdownHistograms(String oldTemplate, String newTemplate) {
    GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_updateDropdownHistograms(oldTemplate, newTemplate);
  }

  @Override
  public void updateValidationHistogram(boolean valid) {
    GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_updateValidationHistogram(valid);
  }

  @Override
  public String[] splitTemplateGroup(String group) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_splitTemplateGroup(group);
  }

  @Override
  public boolean probeServer(String dohTemplate) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_privacy_secure_1dns_SecureDnsBridge_probeServer(dohTemplate);
  }

  public static SecureDnsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.privacy.secure_dns.SecureDnsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SecureDnsBridgeJni();
  }
}
