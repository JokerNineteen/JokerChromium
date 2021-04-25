package org.chromium.chrome.browser.feed.v1;

import java.lang.Override;
import java.lang.Runnable;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedSchedulerBridgeJni implements FeedSchedulerBridge.Natives {
  private static FeedSchedulerBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedSchedulerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedSchedulerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedSchedulerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedSchedulerBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_destroy(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public int shouldSessionRequestData(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      boolean hasContent, long contentCreationDateTimeMs, boolean hasOutstandingRequest) {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_shouldSessionRequestData(nativeFeedSchedulerBridge, caller, hasContent, contentCreationDateTimeMs, hasOutstandingRequest);
  }

  @Override
  public void onReceiveNewContent(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      long contentCreationDateTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onReceiveNewContent(nativeFeedSchedulerBridge, caller, contentCreationDateTimeMs);
  }

  @Override
  public void onRequestError(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      int networkResponseCode) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onRequestError(nativeFeedSchedulerBridge, caller, networkResponseCode);
  }

  @Override
  public void onForegrounded(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onForegrounded(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public void onFixedTimer(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      Runnable onCompletion) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onFixedTimer(nativeFeedSchedulerBridge, caller, onCompletion);
  }

  @Override
  public void onSuggestionConsumed(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onSuggestionConsumed(nativeFeedSchedulerBridge, caller);
  }

  @Override
  public boolean onArticlesCleared(long nativeFeedSchedulerBridge, FeedSchedulerBridge caller,
      boolean suppressRefreshes) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedSchedulerBridge_onArticlesCleared(nativeFeedSchedulerBridge, caller, suppressRefreshes);
  }

  public static FeedSchedulerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedSchedulerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedSchedulerBridgeJni();
  }
}
