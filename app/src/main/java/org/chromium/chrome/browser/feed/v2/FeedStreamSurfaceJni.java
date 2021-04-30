package org.chromium.chrome.browser.feed.v2;

import java.lang.Boolean;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedStreamSurfaceJni implements FeedStreamSurface.Natives {
  private static FeedStreamSurface.Natives testInstance;

  public static final JniStaticTestMocker<FeedStreamSurface.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v2.FeedStreamSurface.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v2.FeedStreamSurface.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedStreamSurface caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_init(caller);
  }

  @Override
  public boolean isActivityLoggingEnabled(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_isActivityLoggingEnabled(nativeFeedStreamSurface, caller);
  }

  @Override
  public int[] getExperimentIds() {
    return (int[])GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_getExperimentIds();
  }

  @Override
  public String getSessionId(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_getSessionId(nativeFeedStreamSurface, caller);
  }

  @Override
  public void reportFeedViewed(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportFeedViewed(nativeFeedStreamSurface, caller);
  }

  @Override
  public void reportSliceViewed(long nativeFeedStreamSurface, FeedStreamSurface caller,
      String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportSliceViewed(nativeFeedStreamSurface, caller, sliceId);
  }

  @Override
  public void reportPageLoaded(long nativeFeedStreamSurface, FeedStreamSurface caller,
      boolean inNewTab) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportPageLoaded(nativeFeedStreamSurface, caller, inNewTab);
  }

  @Override
  public void reportOpenAction(long nativeFeedStreamSurface, FeedStreamSurface caller,
      String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportOpenAction(nativeFeedStreamSurface, caller, sliceId);
  }

  @Override
  public void reportOpenInNewTabAction(long nativeFeedStreamSurface, FeedStreamSurface caller,
      String sliceId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportOpenInNewTabAction(nativeFeedStreamSurface, caller, sliceId);
  }

  @Override
  public void reportOtherUserAction(long nativeFeedStreamSurface, FeedStreamSurface caller,
      int userAction) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportOtherUserAction(nativeFeedStreamSurface, caller, userAction);
  }

  @Override
  public void reportStreamScrolled(long nativeFeedStreamSurface, FeedStreamSurface caller,
      int distanceDp) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportStreamScrolled(nativeFeedStreamSurface, caller, distanceDp);
  }

  @Override
  public void reportStreamScrollStart(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_reportStreamScrollStart(nativeFeedStreamSurface, caller);
  }

  @Override
  public void loadMore(long nativeFeedStreamSurface, FeedStreamSurface caller,
      Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_loadMore(nativeFeedStreamSurface, caller, callback);
  }

  @Override
  public void processThereAndBackAgain(long nativeFeedStreamSurface, FeedStreamSurface caller,
      byte[] data) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_processThereAndBackAgain(nativeFeedStreamSurface, caller, data);
  }

  @Override
  public void processViewAction(long nativeFeedStreamSurface, FeedStreamSurface caller,
      byte[] data) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_processViewAction(nativeFeedStreamSurface, caller, data);
  }

  @Override
  public int executeEphemeralChange(long nativeFeedStreamSurface, FeedStreamSurface caller,
      byte[] data) {
    return (int)GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_executeEphemeralChange(nativeFeedStreamSurface, caller, data);
  }

  @Override
  public void commitEphemeralChange(long nativeFeedStreamSurface, FeedStreamSurface caller,
      int changeId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_commitEphemeralChange(nativeFeedStreamSurface, caller, changeId);
  }

  @Override
  public void discardEphemeralChange(long nativeFeedStreamSurface, FeedStreamSurface caller,
      int changeId) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_discardEphemeralChange(nativeFeedStreamSurface, caller, changeId);
  }

  @Override
  public void surfaceOpened(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_surfaceOpened(nativeFeedStreamSurface, caller);
  }

  @Override
  public void surfaceClosed(long nativeFeedStreamSurface, FeedStreamSurface caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v2_FeedStreamSurface_surfaceClosed(nativeFeedStreamSurface, caller);
  }

  public static FeedStreamSurface.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v2.FeedStreamSurface.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedStreamSurfaceJni();
  }
}
