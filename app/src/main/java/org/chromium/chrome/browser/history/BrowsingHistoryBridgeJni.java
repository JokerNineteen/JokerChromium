package org.chromium.chrome.browser.history;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowsingHistoryBridgeJni implements BrowsingHistoryBridge.Natives {
  private static BrowsingHistoryBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingHistoryBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(BrowsingHistoryBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_destroy(nativeBrowsingHistoryBridge, caller);
  }

  @Override
  public void queryHistory(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller,
      List<HistoryItem> historyItems, String query) {
    GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_queryHistory(nativeBrowsingHistoryBridge, caller, historyItems, query);
  }

  @Override
  public void queryHistoryContinuation(long nativeBrowsingHistoryBridge,
      BrowsingHistoryBridge caller, List<HistoryItem> historyItems) {
    GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_queryHistoryContinuation(nativeBrowsingHistoryBridge, caller, historyItems);
  }

  @Override
  public void markItemForRemoval(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller,
      String url, long[] nativeTimestamps) {
    GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_markItemForRemoval(nativeBrowsingHistoryBridge, caller, url, nativeTimestamps);
  }

  @Override
  public void removeItems(long nativeBrowsingHistoryBridge, BrowsingHistoryBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_history_BrowsingHistoryBridge_removeItems(nativeBrowsingHistoryBridge, caller);
  }

  public static BrowsingHistoryBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.history.BrowsingHistoryBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowsingHistoryBridgeJni();
  }
}
