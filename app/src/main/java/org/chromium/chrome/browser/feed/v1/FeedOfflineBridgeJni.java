package org.chromium.chrome.browser.feed.v1;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedOfflineBridgeJni implements FeedOfflineBridge.Natives {
  private static FeedOfflineBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedOfflineBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedOfflineBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedOfflineBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedOfflineBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_destroy(nativeFeedOfflineBridge, caller);
  }

  @Override
  public Object getOfflineId(long nativeFeedOfflineBridge, FeedOfflineBridge caller, String url) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_getOfflineId(nativeFeedOfflineBridge, caller, url);
  }

  @Override
  public void getOfflineStatus(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String[] urlsToRetrieve, Callback<String[]> urlListConsumer) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_getOfflineStatus(nativeFeedOfflineBridge, caller, urlsToRetrieve, urlListConsumer);
  }

  @Override
  public void onContentRemoved(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String[] urlsRemoved) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_onContentRemoved(nativeFeedOfflineBridge, caller, urlsRemoved);
  }

  @Override
  public void onNewContentReceived(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_onNewContentReceived(nativeFeedOfflineBridge, caller);
  }

  @Override
  public void onNoListeners(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_onNoListeners(nativeFeedOfflineBridge, caller);
  }

  @Override
  public void appendContentMetadata(long nativeFeedOfflineBridge, FeedOfflineBridge caller,
      String url, String title, long timePublishedMs, String imageUrl, String publisher,
      String faviconUrl, String snippet) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_appendContentMetadata(nativeFeedOfflineBridge, caller, url, title, timePublishedMs, imageUrl, publisher, faviconUrl, snippet);
  }

  @Override
  public void onGetKnownContentDone(long nativeFeedOfflineBridge, FeedOfflineBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedOfflineBridge_onGetKnownContentDone(nativeFeedOfflineBridge, caller);
  }

  public static FeedOfflineBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedOfflineBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedOfflineBridgeJni();
  }
}
