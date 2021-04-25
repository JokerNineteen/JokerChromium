package org.chromium.chrome.browser.net.spdyproxy;

import java.lang.Override;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.datareduction.settings.DataReductionDataUseItem;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DataReductionProxySettingsJni implements DataReductionProxySettings.Natives {
  private static DataReductionProxySettings.Natives testInstance;

  public static final JniStaticTestMocker<DataReductionProxySettings.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DataReductionProxySettings caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_init(caller);
  }

  @Override
  public boolean isDataReductionProxyPromoAllowed(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_isDataReductionProxyPromoAllowed(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyFREPromoAllowed(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_isDataReductionProxyFREPromoAllowed(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyEnabled(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_isDataReductionProxyEnabled(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyManaged(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_isDataReductionProxyManaged(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public void setDataReductionProxyEnabled(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_setDataReductionProxyEnabled(nativeDataReductionProxySettingsAndroid, caller, enabled);
  }

  @Override
  public long getDataReductionLastUpdateTime(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_getDataReductionLastUpdateTime(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public void clearDataSavingStatistics(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, int reason) {
    GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_clearDataSavingStatistics(nativeDataReductionProxySettingsAndroid, caller, reason);
  }

  @Override
  public DataReductionProxySettings.ContentLengths getContentLengths(
      long nativeDataReductionProxySettingsAndroid, DataReductionProxySettings caller) {
    return (DataReductionProxySettings.ContentLengths)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_getContentLengths(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long getTotalHttpContentLengthSaved(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_getTotalHttpContentLengthSaved(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long[] getDailyOriginalContentLengths(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long[])GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_getDailyOriginalContentLengths(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public long[] getDailyReceivedContentLengths(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (long[])GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_getDailyReceivedContentLengths(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public boolean isDataReductionProxyUnreachable(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_isDataReductionProxyUnreachable(nativeDataReductionProxySettingsAndroid, caller);
  }

  @Override
  public void queryDataUsage(long nativeDataReductionProxySettingsAndroid,
      DataReductionProxySettings caller, List<DataReductionDataUseItem> items, int numDays) {
    GEN_JNI.org_chromium_chrome_browser_net_spdyproxy_DataReductionProxySettings_queryDataUsage(nativeDataReductionProxySettingsAndroid, caller, items, numDays);
  }

  public static DataReductionProxySettings.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.net.spdyproxy.DataReductionProxySettings.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DataReductionProxySettingsJni();
  }
}
