package org.chromium.chrome.browser.ntp;

import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class RecentlyClosedBridgeJni implements RecentlyClosedBridge.Natives {
  private static RecentlyClosedBridge.Natives testInstance;

  public static final JniStaticTestMocker<RecentlyClosedBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(RecentlyClosedBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_init(caller, profile);
  }

  @Override
  public void destroy(long nativeRecentlyClosedTabsBridge, RecentlyClosedBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_destroy(nativeRecentlyClosedTabsBridge, caller);
  }

  @Override
  public boolean getRecentlyClosedTabs(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller, List<RecentlyClosedTab> tabs, int maxTabCount) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_getRecentlyClosedTabs(nativeRecentlyClosedTabsBridge, caller, tabs, maxTabCount);
  }

  @Override
  public boolean openRecentlyClosedTab(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller, Tab tab, int recentTabId, int windowOpenDisposition) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_openRecentlyClosedTab(nativeRecentlyClosedTabsBridge, caller, tab, recentTabId, windowOpenDisposition);
  }

  @Override
  public boolean openMostRecentlyClosedTab(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_openMostRecentlyClosedTab(nativeRecentlyClosedTabsBridge, caller);
  }

  @Override
  public void clearRecentlyClosedTabs(long nativeRecentlyClosedTabsBridge,
      RecentlyClosedBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentlyClosedBridge_clearRecentlyClosedTabs(nativeRecentlyClosedTabsBridge, caller);
  }

  public static RecentlyClosedBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.RecentlyClosedBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecentlyClosedBridgeJni();
  }
}
