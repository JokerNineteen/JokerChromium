package org.chromium.chrome.browser.feed.v1;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import java.lang.Void;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedJournalBridgeJni implements FeedJournalBridge.Natives {
  private static FeedJournalBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedJournalBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedJournalBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedJournalBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedJournalBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_destroy(nativeFeedJournalBridge, caller);
  }

  @Override
  public void loadJournal(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName, Callback<byte[][]> successCallback, Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_loadJournal(nativeFeedJournalBridge, caller, journalName, successCallback, failureCallback);
  }

  @Override
  public void commitJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_commitJournalMutation(nativeFeedJournalBridge, caller, callback);
  }

  @Override
  public void startJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_startJournalMutation(nativeFeedJournalBridge, caller, journalName);
  }

  @Override
  public void deleteJournalMutation(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_deleteJournalMutation(nativeFeedJournalBridge, caller);
  }

  @Override
  public void addAppendOperation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      byte[] value) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_addAppendOperation(nativeFeedJournalBridge, caller, value);
  }

  @Override
  public void addCopyOperation(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String toJournalName) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_addCopyOperation(nativeFeedJournalBridge, caller, toJournalName);
  }

  @Override
  public void addDeleteOperation(long nativeFeedJournalBridge, FeedJournalBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_addDeleteOperation(nativeFeedJournalBridge, caller);
  }

  @Override
  public void doesJournalExist(long nativeFeedJournalBridge, FeedJournalBridge caller,
      String journalName, Callback<Boolean> successCallback, Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_doesJournalExist(nativeFeedJournalBridge, caller, journalName, successCallback, failureCallback);
  }

  @Override
  public void loadAllJournalKeys(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<String[]> successCallback, Callback<Void> failureCallback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_loadAllJournalKeys(nativeFeedJournalBridge, caller, successCallback, failureCallback);
  }

  @Override
  public void deleteAllJournals(long nativeFeedJournalBridge, FeedJournalBridge caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedJournalBridge_deleteAllJournals(nativeFeedJournalBridge, caller, callback);
  }

  public static FeedJournalBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedJournalBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedJournalBridgeJni();
  }
}
