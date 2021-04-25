package org.chromium.chrome.browser.browsing_data;

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
final class BrowsingDataBridgeJni implements BrowsingDataBridge.Natives {
  private static BrowsingDataBridge.Natives testInstance;

  public static final JniStaticTestMocker<BrowsingDataBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browsing_data.BrowsingDataBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browsing_data.BrowsingDataBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void clearBrowsingData(BrowsingDataBridge caller, Profile profile, int[] dataTypes,
      int timePeriod, String[] blacklistDomains, int[] blacklistedDomainReasons,
      String[] ignoredDomains, int[] ignoredDomainReasons) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_clearBrowsingData(caller, profile, dataTypes, timePeriod, blacklistDomains, blacklistedDomainReasons, ignoredDomains, ignoredDomainReasons);
  }

  @Override
  public void requestInfoAboutOtherFormsOfBrowsingHistory(BrowsingDataBridge caller,
      Profile profile, BrowsingDataBridge.OtherFormsOfBrowsingHistoryListener listener) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_requestInfoAboutOtherFormsOfBrowsingHistory(caller, profile, listener);
  }

  @Override
  public void fetchImportantSites(Profile profile,
      BrowsingDataBridge.ImportantSitesCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_fetchImportantSites(profile, callback);
  }

  @Override
  public int getMaxImportantSites() {
    return (int)GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_getMaxImportantSites();
  }

  @Override
  public void markOriginAsImportantForTesting(Profile profile, String origin) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_markOriginAsImportantForTesting(profile, origin);
  }

  @Override
  public boolean getBrowsingDataDeletionPreference(BrowsingDataBridge caller, int dataType,
      int clearBrowsingDataTab) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_getBrowsingDataDeletionPreference(caller, dataType, clearBrowsingDataTab);
  }

  @Override
  public void setBrowsingDataDeletionPreference(BrowsingDataBridge caller, int dataType,
      int clearBrowsingDataTab, boolean value) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_setBrowsingDataDeletionPreference(caller, dataType, clearBrowsingDataTab, value);
  }

  @Override
  public int getBrowsingDataDeletionTimePeriod(BrowsingDataBridge caller,
      int clearBrowsingDataTab) {
    return (int)GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_getBrowsingDataDeletionTimePeriod(caller, clearBrowsingDataTab);
  }

  @Override
  public void setBrowsingDataDeletionTimePeriod(BrowsingDataBridge caller, int clearBrowsingDataTab,
      int timePeriod) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_setBrowsingDataDeletionTimePeriod(caller, clearBrowsingDataTab, timePeriod);
  }

  @Override
  public int getLastClearBrowsingDataTab(BrowsingDataBridge caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_getLastClearBrowsingDataTab(caller);
  }

  @Override
  public void setLastClearBrowsingDataTab(BrowsingDataBridge caller, int lastTab) {
    GEN_JNI.org_chromium_chrome_browser_browsing_1data_BrowsingDataBridge_setLastClearBrowsingDataTab(caller, lastTab);
  }

  public static BrowsingDataBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browsing_data.BrowsingDataBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowsingDataBridgeJni();
  }
}
