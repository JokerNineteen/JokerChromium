package org.chromium.chrome.browser.browsing_data;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UrlFilterBridgeJni implements UrlFilterBridge.Natives {
  private static UrlFilterBridge.Natives testInstance;

  public static final JniStaticTestMocker<UrlFilterBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browsing_data.UrlFilterBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browsing_data.UrlFilterBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean matchesUrl(long nativeUrlFilterBridge, UrlFilterBridge caller, String url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_browsing_1data_UrlFilterBridge_matchesUrl(nativeUrlFilterBridge, caller, url);
  }

  @Override
  public void destroy(long nativeUrlFilterBridge, UrlFilterBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_UrlFilterBridge_destroy(nativeUrlFilterBridge, caller);
  }

  public static UrlFilterBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browsing_data.UrlFilterBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UrlFilterBridgeJni();
  }
}
