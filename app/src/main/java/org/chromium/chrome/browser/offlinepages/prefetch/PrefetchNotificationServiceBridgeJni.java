package org.chromium.chrome.browser.offlinepages.prefetch;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefetchNotificationServiceBridgeJni implements PrefetchNotificationServiceBridge.Natives {
  private static PrefetchNotificationServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<PrefetchNotificationServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.prefetch.PrefetchNotificationServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.prefetch.PrefetchNotificationServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void schedule(String title, String message) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_prefetch_PrefetchNotificationServiceBridge_schedule(title, message);
  }

  public static PrefetchNotificationServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.prefetch.PrefetchNotificationServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefetchNotificationServiceBridgeJni();
  }
}
