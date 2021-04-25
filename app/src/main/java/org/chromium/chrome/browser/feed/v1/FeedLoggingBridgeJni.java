package org.chromium.chrome.browser.feed.v1;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FeedLoggingBridgeJni implements FeedLoggingBridge.Natives {
  private static FeedLoggingBridge.Natives testInstance;

  public static final JniStaticTestMocker<FeedLoggingBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feed.v1.FeedLoggingBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feed.v1.FeedLoggingBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FeedLoggingBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_destroy(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onContentViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller, int position,
      long publishedTimeMs, long timeContentBecameAvailableMs, float score,
      boolean isAvailableOffline) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onContentViewed(nativeFeedLoggingBridge, caller, position, publishedTimeMs, timeContentBecameAvailableMs, score, isAvailableOffline);
  }

  @Override
  public void onContentDismissed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, String uri, boolean wasCommitted) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onContentDismissed(nativeFeedLoggingBridge, caller, position, uri, wasCommitted);
  }

  @Override
  public void onContentSwiped(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onContentSwiped(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onClientAction(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int windowOpenDisposition, int position, long publishedTimeMs, float score,
      boolean isAvailableOffline) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onClientAction(nativeFeedLoggingBridge, caller, windowOpenDisposition, position, publishedTimeMs, score, isAvailableOffline);
  }

  @Override
  public void onContentContextMenuOpened(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, long publishedTimeMs, float score) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onContentContextMenuOpened(nativeFeedLoggingBridge, caller, position, publishedTimeMs, score);
  }

  @Override
  public void onMoreButtonViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onMoreButtonViewed(nativeFeedLoggingBridge, caller, position);
  }

  @Override
  public void onMoreButtonClicked(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onMoreButtonClicked(nativeFeedLoggingBridge, caller, position);
  }

  @Override
  public void onNotInterestedInSource(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, boolean wasCommitted) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onNotInterestedInSource(nativeFeedLoggingBridge, caller, position, wasCommitted);
  }

  @Override
  public void onNotInterestedInTopic(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int position, boolean wasCommitted) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onNotInterestedInTopic(nativeFeedLoggingBridge, caller, position, wasCommitted);
  }

  @Override
  public void onOpenedWithContent(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int timeToPopulateMs, int contentCount) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onOpenedWithContent(nativeFeedLoggingBridge, caller, timeToPopulateMs, contentCount);
  }

  @Override
  public void onOpenedWithNoImmediateContent(long nativeFeedLoggingBridge,
      FeedLoggingBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onOpenedWithNoImmediateContent(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onOpenedWithNoContent(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onOpenedWithNoContent(nativeFeedLoggingBridge, caller);
  }

  @Override
  public void onSpinnerStarted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int spinnerType) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onSpinnerStarted(nativeFeedLoggingBridge, caller, spinnerType);
  }

  @Override
  public void onSpinnerFinished(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      long spinnerShownTimeMs, int spinnerType) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onSpinnerFinished(nativeFeedLoggingBridge, caller, spinnerShownTimeMs, spinnerType);
  }

  @Override
  public void onSpinnerDestroyedWithoutCompleting(long nativeFeedLoggingBridge,
      FeedLoggingBridge caller, long spinnerShownTimeMs, int spinnerType) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onSpinnerDestroyedWithoutCompleting(nativeFeedLoggingBridge, caller, spinnerShownTimeMs, spinnerType);
  }

  @Override
  public void onPietFrameRenderingEvent(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int[] pietErrorCodes) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onPietFrameRenderingEvent(nativeFeedLoggingBridge, caller, pietErrorCodes);
  }

  @Override
  public void onVisualElementClicked(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int elementType, int position, long timeContentBecameAvailableMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onVisualElementClicked(nativeFeedLoggingBridge, caller, elementType, position, timeContentBecameAvailableMs);
  }

  @Override
  public void onVisualElementViewed(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int elementType, int position, long timeContentBecameAvailableMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onVisualElementViewed(nativeFeedLoggingBridge, caller, elementType, position, timeContentBecameAvailableMs);
  }

  @Override
  public void onInternalError(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int internalError) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onInternalError(nativeFeedLoggingBridge, caller, internalError);
  }

  @Override
  public void onTokenCompleted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      boolean wasSynthetic, int contentCount, int tokenCount) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onTokenCompleted(nativeFeedLoggingBridge, caller, wasSynthetic, contentCount, tokenCount);
  }

  @Override
  public void onTokenFailedToComplete(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      boolean wasSynthetic, int failureCount) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onTokenFailedToComplete(nativeFeedLoggingBridge, caller, wasSynthetic, failureCount);
  }

  @Override
  public void onServerRequest(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int requestReason) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onServerRequest(nativeFeedLoggingBridge, caller, requestReason);
  }

  @Override
  public void onZeroStateShown(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int zeroStateShowReason) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onZeroStateShown(nativeFeedLoggingBridge, caller, zeroStateShowReason);
  }

  @Override
  public void onZeroStateRefreshCompleted(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      int newContentCount, int newTokenCount) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onZeroStateRefreshCompleted(nativeFeedLoggingBridge, caller, newContentCount, newTokenCount);
  }

  @Override
  public void onTaskFinished(long nativeFeedLoggingBridge, FeedLoggingBridge caller, int task,
      int delayTimeMs, int taskTimeMs) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onTaskFinished(nativeFeedLoggingBridge, caller, task, delayTimeMs, taskTimeMs);
  }

  @Override
  public void onContentTargetVisited(long nativeFeedLoggingBridge, FeedLoggingBridge caller,
      long visitTimeMs, boolean returnToNtp) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_onContentTargetVisited(nativeFeedLoggingBridge, caller, visitTimeMs, returnToNtp);
  }

  @Override
  public void reportScrolledAfterOpen(long nativeFeedLoggingBridge, FeedLoggingBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_feed_v1_FeedLoggingBridge_reportScrolledAfterOpen(nativeFeedLoggingBridge, caller);
  }

  public static FeedLoggingBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feed.v1.FeedLoggingBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FeedLoggingBridgeJni();
  }
}
