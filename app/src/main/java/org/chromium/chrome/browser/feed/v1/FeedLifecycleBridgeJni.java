package org.chromium.chrome.browser.feed.v1;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedLifecycleBridgeJni implements FeedLifecycleBridge.Natives {
  private static FeedLifecycleBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedLifecycleBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedLifecycleBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedLifecycleBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedLifecycleBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLifecycleBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedLifecycleBridge, FeedLifecycleBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLifecycleBridge_destroy(nativeFeedLifecycleBridge, caller);
  }

  public static FeedLifecycleBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedLifecycleBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedLifecycleBridgeJni();
  }
}
