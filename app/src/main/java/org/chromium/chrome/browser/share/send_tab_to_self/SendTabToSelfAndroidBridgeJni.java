package org.chromium.chrome.browser.share.send_tab_to_self;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class SendTabToSelfAndroidBridgeJni implements SendTabToSelfAndroidBridge.Natives {
  private static SendTabToSelfAndroidBridge.Natives testInstance;

  public static final JniStaticTestMocker<SendTabToSelfAndroidBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfAndroidBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfAndroidBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public SendTabToSelfEntry addEntry(Profile profile, String url, String title, long navigationTime,
      String targetDeviceSyncCacheGuid) {
    return (SendTabToSelfEntry)GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_addEntry(profile, url, title, navigationTime, targetDeviceSyncCacheGuid);
  }

  @Override
  public void getAllGuids(Profile profile, List<String> guids) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_getAllGuids(profile, guids);
  }

  @Override
  public void deleteAllEntries(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_deleteAllEntries(profile);
  }

  @Override
  public void deleteEntry(Profile profile, String guid) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_deleteEntry(profile, guid);
  }

  @Override
  public void dismissEntry(Profile profile, String guid) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_dismissEntry(profile, guid);
  }

  @Override
  public void markEntryOpened(Profile profile, String guid) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_markEntryOpened(profile, guid);
  }

  @Override
  public SendTabToSelfEntry getEntryByGUID(Profile profile, String guid) {
    return (SendTabToSelfEntry)GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_getEntryByGUID(profile, guid);
  }

  @Override
  public boolean isFeatureAvailable(WebContents webContents) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_isFeatureAvailable(webContents);
  }

  @Override
  public void showInfoBar(WebContents webContents, String guid, String url,
      String targetDeviceSyncCacheGuid) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_showInfoBar(webContents, guid, url, targetDeviceSyncCacheGuid);
  }

  @Override
  public void getAllTargetDeviceInfos(Profile profile, List<TargetDeviceInfo> guids) {
    GEN_JNI.org_chromium_chrome_browser_share_send_1tab_1to_1self_SendTabToSelfAndroidBridge_getAllTargetDeviceInfos(profile, guids);
  }

  public static SendTabToSelfAndroidBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.send_tab_to_self.SendTabToSelfAndroidBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SendTabToSelfAndroidBridgeJni();
  }
}
