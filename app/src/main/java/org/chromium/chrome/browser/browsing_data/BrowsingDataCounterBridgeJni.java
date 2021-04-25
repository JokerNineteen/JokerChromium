package org.chromium.chrome.browser.browsing_data;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowsingDataCounterBridgeJni implements BrowsingDataCounterBridge.Natives {
  private static BrowsingDataCounterBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingDataCounterBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browsing_data.BrowsingDataCounterBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browsing_data.BrowsingDataCounterBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(BrowsingDataCounterBridge caller, int dataType, int prefType) {
    return (long)GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataCounterBridge_init(caller, dataType, prefType);
  }

  @Override
  public void destroy(long nativeBrowsingDataCounterBridge, BrowsingDataCounterBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataCounterBridge_destroy(nativeBrowsingDataCounterBridge, caller);
  }

  public static BrowsingDataCounterBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browsing_data.BrowsingDataCounterBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowsingDataCounterBridgeJni();
  }
}
