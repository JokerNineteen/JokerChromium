package org.chromium.chrome.browser.offlinepages;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.ProfileKey;
import org.chromium.content_public.browser.LoadUrlParams;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OfflinePageBridgeJni implements OfflinePageBridge.Natives {
  private static OfflinePageBridge.Natives testInstance;

  public static final JniStaticTestMocker<OfflinePageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean canSavePage(String url) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_canSavePage(url);
  }

  @Override
  public OfflinePageBridge getOfflinePageBridgeForProfileKey(ProfileKey profileKey) {
    return (OfflinePageBridge)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getOfflinePageBridgeForProfileKey(profileKey);
  }

  @Override
  public void getAllPages(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> offlinePages, final Callback<List<OfflinePageItem>> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getAllPages(nativeOfflinePageBridge, caller, offlinePages, callback);
  }

  @Override
  public void willCloseTab(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_willCloseTab(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void getPageByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, Callback<OfflinePageItem> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getPageByOfflineId(nativeOfflinePageBridge, caller, offlineId, callback);
  }

  @Override
  public void getPagesByClientId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String[] namespaces, String[] ids,
      Callback<List<OfflinePageItem>> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getPagesByClientId(nativeOfflinePageBridge, caller, result, namespaces, ids, callback);
  }

  @Override
  public void getPagesByRequestOrigin(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String requestOrigin,
      Callback<List<OfflinePageItem>> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getPagesByRequestOrigin(nativeOfflinePageBridge, caller, result, requestOrigin, callback);
  }

  @Override
  public void getPagesByNamespace(long nativeOfflinePageBridge, OfflinePageBridge caller,
      List<OfflinePageItem> result, String nameSpace, Callback<List<OfflinePageItem>> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getPagesByNamespace(nativeOfflinePageBridge, caller, result, nameSpace, callback);
  }

  @Override
  public void deletePagesByClientId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String[] namespaces, String[] ids, Callback<Integer> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_deletePagesByClientId(nativeOfflinePageBridge, caller, namespaces, ids, callback);
  }

  @Override
  public void deletePagesByClientIdAndOrigin(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String[] namespaces, String[] ids, String origin, Callback<Integer> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_deletePagesByClientIdAndOrigin(nativeOfflinePageBridge, caller, namespaces, ids, origin, callback);
  }

  @Override
  public void deletePagesByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long[] offlineIds, Callback<Integer> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_deletePagesByOfflineId(nativeOfflinePageBridge, caller, offlineIds, callback);
  }

  @Override
  public void publishInternalPageByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, Callback<String> publishedCallback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_publishInternalPageByOfflineId(nativeOfflinePageBridge, caller, offlineId, publishedCallback);
  }

  @Override
  public void publishInternalPageByGuid(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String guid, Callback<String> publishedCallback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_publishInternalPageByGuid(nativeOfflinePageBridge, caller, guid, publishedCallback);
  }

  @Override
  public void selectPageForOnlineUrl(long nativeOfflinePageBridge, OfflinePageBridge caller,
      GURL onlineUrl, int tabId, Callback<OfflinePageItem> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_selectPageForOnlineUrl(nativeOfflinePageBridge, caller, onlineUrl, tabId, callback);
  }

  @Override
  public void savePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      OfflinePageBridge.SavePageCallback callback, WebContents webContents, String clientNamespace,
      String clientId, String origin) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_savePage(nativeOfflinePageBridge, caller, callback, webContents, clientNamespace, clientId, origin);
  }

  @Override
  public String getOfflinePageHeaderForReload(long nativeOfflinePageBridge,
      OfflinePageBridge caller, WebContents webContents) {
    return (String)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getOfflinePageHeaderForReload(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isShowingOfflinePreview(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isShowingOfflinePreview(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isShowingDownloadButtonInErrorPage(long nativeOfflinePageBridge,
      OfflinePageBridge caller, WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isShowingDownloadButtonInErrorPage(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void scheduleDownload(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents, String nameSpace, String url, int uiAction, String origin) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_scheduleDownload(nativeOfflinePageBridge, caller, webContents, nameSpace, url, uiAction, origin);
  }

  @Override
  public boolean isOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isOfflinePage(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public boolean isInPrivateDirectory(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String filePath) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isInPrivateDirectory(nativeOfflinePageBridge, caller, filePath);
  }

  @Override
  public boolean isTemporaryNamespace(long nativeOfflinePageBridge, OfflinePageBridge caller,
      String nameSpace) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isTemporaryNamespace(nativeOfflinePageBridge, caller, nameSpace);
  }

  @Override
  public OfflinePageItem getOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (OfflinePageItem)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getOfflinePage(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void checkForNewOfflineContent(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long freshnessTimeMillis, Callback<String> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_checkForNewOfflineContent(nativeOfflinePageBridge, caller, freshnessTimeMillis, callback);
  }

  @Override
  public void getLoadUrlParamsByOfflineId(long nativeOfflinePageBridge, OfflinePageBridge caller,
      long offlineId, int location, Callback<LoadUrlParams> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getLoadUrlParamsByOfflineId(nativeOfflinePageBridge, caller, offlineId, location, callback);
  }

  @Override
  public boolean isShowingTrustedOfflinePage(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_isShowingTrustedOfflinePage(nativeOfflinePageBridge, caller, webContents);
  }

  @Override
  public void getLoadUrlParamsForOpeningMhtmlFileOrContent(long nativeOfflinePageBridge,
      OfflinePageBridge caller, String url, Callback<LoadUrlParams> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_getLoadUrlParamsForOpeningMhtmlFileOrContent(nativeOfflinePageBridge, caller, url, callback);
  }

  @Override
  public void acquireFileAccessPermission(long nativeOfflinePageBridge, OfflinePageBridge caller,
      WebContents webContents, Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_offlinepages_OfflinePageBridge_acquireFileAccessPermission(nativeOfflinePageBridge, caller, webContents, callback);
  }

  public static OfflinePageBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.offlinepages.OfflinePageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OfflinePageBridgeJni();
  }
}
