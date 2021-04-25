package org.chromium.chrome.browser.safe_browsing;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SafeBrowsingBridgeJni implements SafeBrowsingBridge.Natives {
  private static SafeBrowsingBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafeBrowsingBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.safe_browsing.SafeBrowsingBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.safe_browsing.SafeBrowsingBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int umaValueForFile(String path) {
    return (int)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_umaValueForFile(path);
  }

  @Override
  public boolean getSafeBrowsingExtendedReportingEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_getSafeBrowsingExtendedReportingEnabled();
  }

  @Override
  public void setSafeBrowsingExtendedReportingEnabled(boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_setSafeBrowsingExtendedReportingEnabled(enabled);
  }

  @Override
  public boolean getSafeBrowsingExtendedReportingManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_getSafeBrowsingExtendedReportingManaged();
  }

  @Override
  public int getSafeBrowsingState() {
    return (int)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_getSafeBrowsingState();
  }

  @Override
  public void setSafeBrowsingState(int state) {
    GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_setSafeBrowsingState(state);
  }

  @Override
  public boolean hasAccountForLeakCheckRequest() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_hasAccountForLeakCheckRequest();
  }

  @Override
  public boolean isSafeBrowsingManaged() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safe_1browsing_SafeBrowsingBridge_isSafeBrowsingManaged();
  }

  public static SafeBrowsingBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.safe_browsing.SafeBrowsingBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SafeBrowsingBridgeJni();
  }
}
