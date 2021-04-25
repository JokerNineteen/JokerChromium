package org.chromium.chrome.browser.feed.v2;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.xsurface.ImageFetchClient;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedImageFetchClientJni implements FeedImageFetchClient.Natives {
  private static FeedImageFetchClient.Natives testInstance;

  public static final JniStaticTestMocker<FeedImageFetchClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v2.FeedImageFetchClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v2.FeedImageFetchClient.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int sendRequest(String url, ImageFetchClient.HttpResponseConsumer responseConsumer) {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedImageFetchClient_sendRequest(url, responseConsumer);
  }

  @Override
  public void cancel(int requestId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedImageFetchClient_cancel(requestId);
  }

  public static FeedImageFetchClient.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v2.FeedImageFetchClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedImageFetchClientJni();
  }
}
