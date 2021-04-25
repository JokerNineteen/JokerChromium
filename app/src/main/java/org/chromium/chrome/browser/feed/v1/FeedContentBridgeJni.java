package org.chromium.chrome.browser.feed.v1;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import java.util.Map;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedContentBridgeJni implements FeedContentBridge.Natives {
  private static FeedContentBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedContentBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedContentBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedContentBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedContentBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedContentBridge, FeedContentBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_destroy(nativeFeedContentBridge, caller);
  }

  @Override
  public void loadContent(long nativeFeedContentBridge, FeedContentBridge caller, String[] keys,
      Callback<Map<String, byte[]>> successCallback, Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_loadContent(nativeFeedContentBridge, caller, keys, successCallback, failureCallback);
  }

  @Override
  public void loadContentByPrefix(long nativeFeedContentBridge, FeedContentBridge caller,
      String prefix, Callback<Map<String, byte[]>> successCallback,
      Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_loadContentByPrefix(nativeFeedContentBridge, caller, prefix, successCallback, failureCallback);
  }

  @Override
  public void loadAllContentKeys(long nativeFeedContentBridge, FeedContentBridge caller,
      Callback<String[]> successCallback, Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_loadAllContentKeys(nativeFeedContentBridge, caller, successCallback, failureCallback);
  }

  @Override
  public void commitContentMutation(long nativeFeedContentBridge, FeedContentBridge caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_commitContentMutation(nativeFeedContentBridge, caller, callback);
  }

  @Override
  public void createContentMutation(long nativeFeedContentBridge, FeedContentBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_createContentMutation(nativeFeedContentBridge, caller);
  }

  @Override
  public void deleteContentMutation(long nativeFeedContentBridge, FeedContentBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_deleteContentMutation(nativeFeedContentBridge, caller);
  }

  @Override
  public void appendDeleteOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String key) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_appendDeleteOperation(nativeFeedContentBridge, caller, key);
  }

  @Override
  public void appendDeleteByPrefixOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String prefix) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_appendDeleteByPrefixOperation(nativeFeedContentBridge, caller, prefix);
  }

  @Override
  public void appendUpsertOperation(long nativeFeedContentBridge, FeedContentBridge caller,
      String key, byte[] data) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_appendUpsertOperation(nativeFeedContentBridge, caller, key, data);
  }

  @Override
  public void appendDeleteAllOperation(long nativeFeedContentBridge, FeedContentBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedContentBridge_appendDeleteAllOperation(nativeFeedContentBridge, caller);
  }

  public static FeedContentBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedContentBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedContentBridgeJni();
  }
}
