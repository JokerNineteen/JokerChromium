package org.chromium.chrome.browser.offlinepages.downloads;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflinePageDownloadBridgeJni implements OfflinePageDownloadBridge.Natives {
  private static OfflinePageDownloadBridge.Natives testInstance;

  public static final JniStaticTestMocker<OfflinePageDownloadBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OfflinePageDownloadBridge caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_offlinepages_downloads_OfflinePageDownloadBridge_init(caller);
  }

  @Override
  public void destroy(long nativeOfflinePageDownloadBridge, OfflinePageDownloadBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_downloads_OfflinePageDownloadBridge_destroy(nativeOfflinePageDownloadBridge, caller);
  }

  @Override
  public void startDownload(Tab tab, String origin) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_downloads_OfflinePageDownloadBridge_startDownload(tab, origin);
  }

  public static OfflinePageDownloadBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.downloads.OfflinePageDownloadBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflinePageDownloadBridgeJni();
  }
}
