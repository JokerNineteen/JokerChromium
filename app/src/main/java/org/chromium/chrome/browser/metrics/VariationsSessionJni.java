package org.chromium.chrome.browser.metrics;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class VariationsSessionJni implements VariationsSession.Natives {
  private static VariationsSession.Natives testInstance;

  public static final JniStaticTestMocker<VariationsSession.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.metrics.VariationsSession.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.metrics.VariationsSession.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startVariationsSession(VariationsSession caller, String restrictMode) {
    GEN_JNI.org_chromium_chrome_browser_metrics_VariationsSession_startVariationsSession(caller, restrictMode);
  }

  @Override
  public String getLatestCountry(VariationsSession caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_metrics_VariationsSession_getLatestCountry(caller);
  }

  public static VariationsSession.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.metrics.VariationsSession.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new VariationsSessionJni();
  }
}
