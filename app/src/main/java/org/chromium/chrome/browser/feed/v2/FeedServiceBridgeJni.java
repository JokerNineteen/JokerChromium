package org.chromium.chrome.browser.feed.v2;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedServiceBridgeJni implements FeedServiceBridge.Natives {
  private static FeedServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v2.FeedServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v2.FeedServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedServiceBridge_isEnabled();
  }

  @Override
  public void startup() {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedServiceBridge_startup();
  }

  @Override
  public int getLoadMoreTriggerLookahead() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedServiceBridge_getLoadMoreTriggerLookahead();
  }

  @Override
  public String getClientInstanceId() {
    return (String)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedServiceBridge_getClientInstanceId();
  }

  @Override
  public void reportOpenVisitComplete(long visitTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedServiceBridge_reportOpenVisitComplete(visitTimeMs);
  }

  public static FeedServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v2.FeedServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedServiceBridgeJni();
  }
}
