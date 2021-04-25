package org.chromium.chrome.browser.historyreport;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class HistoryReportJniBridgeJni implements HistoryReportJniBridge.Natives {
  private static HistoryReportJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<HistoryReportJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(HistoryReportJniBridge caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_init(caller);
  }

  @Override
  public long trimDeltaFile(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      long seqNoLowerBound) {
    return (long)GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_trimDeltaFile(nativeHistoryReportJniBridge, caller, seqNoLowerBound);
  }

  @Override
  public DeltaFileEntry[] query(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      long lastSeqNo, int limit) {
    return (DeltaFileEntry[])GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_query(nativeHistoryReportJniBridge, caller, lastSeqNo, limit);
  }

  @Override
  public UsageReport[] getUsageReportsBatch(long nativeHistoryReportJniBridge,
      HistoryReportJniBridge caller, int batchSize) {
    return (UsageReport[])GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_getUsageReportsBatch(nativeHistoryReportJniBridge, caller, batchSize);
  }

  @Override
  public void removeUsageReports(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller,
      String[] reportIds) {
    GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_removeUsageReports(nativeHistoryReportJniBridge, caller, reportIds);
  }

  @Override
  public void clearUsageReports(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_clearUsageReports(nativeHistoryReportJniBridge, caller);
  }

  @Override
  public boolean addHistoricVisitsToUsageReportsBuffer(long nativeHistoryReportJniBridge,
      HistoryReportJniBridge caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_addHistoricVisitsToUsageReportsBuffer(nativeHistoryReportJniBridge, caller);
  }

  @Override
  public String dump(long nativeHistoryReportJniBridge, HistoryReportJniBridge caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_historyreport_HistoryReportJniBridge_dump(nativeHistoryReportJniBridge, caller);
  }

  public static HistoryReportJniBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.historyreport.HistoryReportJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new HistoryReportJniBridgeJni();
  }
}
