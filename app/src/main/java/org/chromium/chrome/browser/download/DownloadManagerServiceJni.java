package org.chromium.chrome.browser.download;

import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.profiles.ProfileKey;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DownloadManagerServiceJni implements DownloadManagerService.Natives {
  private static DownloadManagerService.Natives testInstance;

  public static final JniStaticTestMocker<DownloadManagerService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.download.DownloadManagerService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.download.DownloadManagerService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isSupportedMimeType(String mimeType) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_isSupportedMimeType(mimeType);
  }

  @Override
  public int getAutoResumptionLimit() {
    return (int)GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_getAutoResumptionLimit();
  }

  @Override
  public long init(DownloadManagerService caller, boolean isProfileAdded) {
    return (long)GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_init(caller, isProfileAdded);
  }

  @Override
  public void openDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey, int source) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_openDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey, source);
  }

  @Override
  public void resumeDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey, boolean hasUserGesture) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_resumeDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey, hasUserGesture);
  }

  @Override
  public void retryDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey, boolean hasUserGesture) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_retryDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey, hasUserGesture);
  }

  @Override
  public void cancelDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_cancelDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey);
  }

  @Override
  public void pauseDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_pauseDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey);
  }

  @Override
  public void removeDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_removeDownload(nativeDownloadManagerService, caller, downloadGuid, profileKey);
  }

  @Override
  public void renameDownload(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, String targetName, Callback<Integer> callback, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_renameDownload(nativeDownloadManagerService, caller, downloadGuid, targetName, callback, profileKey);
  }

  @Override
  public void changeSchedule(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, boolean onlyOnWifi, long startTimeMs, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_changeSchedule(nativeDownloadManagerService, caller, downloadGuid, onlyOnWifi, startTimeMs, profileKey);
  }

  @Override
  public void getAllDownloads(long nativeDownloadManagerService, DownloadManagerService caller,
      ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_getAllDownloads(nativeDownloadManagerService, caller, profileKey);
  }

  @Override
  public void checkForExternallyRemovedDownloads(long nativeDownloadManagerService,
      DownloadManagerService caller, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_checkForExternallyRemovedDownloads(nativeDownloadManagerService, caller, profileKey);
  }

  @Override
  public void updateLastAccessTime(long nativeDownloadManagerService, DownloadManagerService caller,
      String downloadGuid, ProfileKey profileKey) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_updateLastAccessTime(nativeDownloadManagerService, caller, downloadGuid, profileKey);
  }

  @Override
  public void onProfileAdded(long nativeDownloadManagerService, DownloadManagerService caller,
      Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_onProfileAdded(nativeDownloadManagerService, caller, profile);
  }

  @Override
  public void createInterruptedDownloadForTest(long nativeDownloadManagerService,
      DownloadManagerService caller, String url, String guid, String targetPath) {
    GEN_JNI.org_chromium_chrome_browser_download_DownloadManagerService_createInterruptedDownloadForTest(nativeDownloadManagerService, caller, url, guid, targetPath);
  }

  public static DownloadManagerService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.download.DownloadManagerService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DownloadManagerServiceJni();
  }
}
