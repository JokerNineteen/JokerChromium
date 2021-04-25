package org.chromium.chrome.browser.share.send_tab_to_self;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SendTabToSelfModelObserverBridgeJni implements SendTabToSelfModelObserverBridge.Natives {
  private static SendTabToSelfModelObserverBridge.Natives testInstance;

  public static final JniStaticTestMocker<SendTabToSelfModelObserverBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SendTabToSelfModelObserverBridge bridge, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfModelObserverBridge_init(bridge, profile);
  }

  @Override
  public void destroy(long nativeSendTabToSelfModelObserverBridge) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfModelObserverBridge_destroy(nativeSendTabToSelfModelObserverBridge);
  }

  public static SendTabToSelfModelObserverBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfModelObserverBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SendTabToSelfModelObserverBridgeJni();
  }
}
