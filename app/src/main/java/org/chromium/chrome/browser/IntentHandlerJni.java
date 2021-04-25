package org.chromium.chrome.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class IntentHandlerJni implements IntentHandler.Natives {
  private static IntentHandler.Natives testInstance;

  public static final JniStaticTestMocker<IntentHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.IntentHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.IntentHandler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isCorsSafelistedHeader(String name, String value) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_IntentHandler_isCorsSafelistedHeader(name, value);
  }

  public static IntentHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.IntentHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IntentHandlerJni();
  }
}
