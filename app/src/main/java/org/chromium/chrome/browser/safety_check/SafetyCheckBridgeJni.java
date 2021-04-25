package org.chromium.chrome.browser.safety_check;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SafetyCheckBridgeJni implements SafetyCheckBridge.Natives {
  private static SafetyCheckBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafetyCheckBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.safety_check.SafetyCheckBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.safety_check.SafetyCheckBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SafetyCheckBridge safetyCheckBridge,
      SafetyCheckBridge.SafetyCheckCommonObserver observer) {
    return (long)GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_init(safetyCheckBridge, observer);
  }

  @Override
  public boolean userSignedIn() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_userSignedIn();
  }

  @Override
  public void checkSafeBrowsing(long nativeSafetyCheckBridge, SafetyCheckBridge safetyCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_checkSafeBrowsing(nativeSafetyCheckBridge, safetyCheckBridge);
  }

  @Override
  public void destroy(long nativeSafetyCheckBridge, SafetyCheckBridge safetyCheckBridge) {
    GEN_JNI.org_chromium_chrome_browser_safety_1check_SafetyCheckBridge_destroy(nativeSafetyCheckBridge, safetyCheckBridge);
  }

  public static SafetyCheckBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.safety_check.SafetyCheckBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SafetyCheckBridgeJni();
  }
}
