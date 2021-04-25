package org.chromium.chrome.browser.rappor;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RapporServiceBridgeJni implements RapporServiceBridge.Natives {
  private static RapporServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<RapporServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void sampleDomainAndRegistryFromURL(String metric, String url) {
    GEN_JNI.org_chromium_chrome_browser_rappor_RapporServiceBridge_sampleDomainAndRegistryFromURL(metric, url);
  }

  @Override
  public void sampleString(String metric, String sampleValue) {
    GEN_JNI.org_chromium_chrome_browser_rappor_RapporServiceBridge_sampleString(metric, sampleValue);
  }

  public static RapporServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.rappor.RapporServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RapporServiceBridgeJni();
  }
}
