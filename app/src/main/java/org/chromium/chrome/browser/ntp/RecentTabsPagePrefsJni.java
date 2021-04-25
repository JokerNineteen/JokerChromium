package org.chromium.chrome.browser.ntp;

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
final class RecentTabsPagePrefsJni implements RecentTabsPagePrefs.Natives {
  private static RecentTabsPagePrefs.Natives testInstance;

  public static final JniStaticTestMocker<RecentTabsPagePrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_init(profile);
  }

  @Override
  public void destroy(long nativeRecentTabsPagePrefs) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_destroy(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setSnapshotDocumentCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_setSnapshotDocumentCollapsed(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getSnapshotDocumentCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_getSnapshotDocumentCollapsed(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setRecentlyClosedTabsCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_setRecentlyClosedTabsCollapsed(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getRecentlyClosedTabsCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_getRecentlyClosedTabsCollapsed(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setSyncPromoCollapsed(long nativeRecentTabsPagePrefs, boolean isCollapsed) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_setSyncPromoCollapsed(nativeRecentTabsPagePrefs, isCollapsed);
  }

  @Override
  public boolean getSyncPromoCollapsed(long nativeRecentTabsPagePrefs) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_getSyncPromoCollapsed(nativeRecentTabsPagePrefs);
  }

  @Override
  public void setForeignSessionCollapsed(long nativeRecentTabsPagePrefs, String sessionTag,
      boolean isCollapsed) {
    GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_setForeignSessionCollapsed(nativeRecentTabsPagePrefs, sessionTag, isCollapsed);
  }

  @Override
  public boolean getForeignSessionCollapsed(long nativeRecentTabsPagePrefs, String sessionTag) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_RecentTabsPagePrefs_getForeignSessionCollapsed(nativeRecentTabsPagePrefs, sessionTag);
  }

  public static RecentTabsPagePrefs.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.RecentTabsPagePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new RecentTabsPagePrefsJni();
  }
}
