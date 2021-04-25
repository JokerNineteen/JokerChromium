package org.chromium.chrome.browser.contextualsearch;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CtrSuppressionJni implements CtrSuppression.Natives {
  private static CtrSuppression.Natives testInstance;

  public static final JniStaticTestMocker<CtrSuppression.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CtrSuppression caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_init(caller);
  }

  @Override
  public void destroy(long nativeCtrSuppression, CtrSuppression caller) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_destroy(nativeCtrSuppression, caller);
  }

  @Override
  public void recordImpression(long nativeCtrSuppression, CtrSuppression caller, boolean wasSeen) {
    GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_recordImpression(nativeCtrSuppression, caller, wasSeen);
  }

  @Override
  public int getCurrentWeekNumber(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_getCurrentWeekNumber(nativeCtrSuppression, caller);
  }

  @Override
  public boolean hasPreviousWeekData(long nativeCtrSuppression, CtrSuppression caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_hasPreviousWeekData(nativeCtrSuppression, caller);
  }

  @Override
  public int getPreviousWeekImpressions(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_getPreviousWeekImpressions(nativeCtrSuppression, caller);
  }

  @Override
  public float getPreviousWeekCtr(long nativeCtrSuppression, CtrSuppression caller) {
    return (float)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_getPreviousWeekCtr(nativeCtrSuppression, caller);
  }

  @Override
  public boolean hasPrevious28DayData(long nativeCtrSuppression, CtrSuppression caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_hasPrevious28DayData(nativeCtrSuppression, caller);
  }

  @Override
  public int getPrevious28DayImpressions(long nativeCtrSuppression, CtrSuppression caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_getPrevious28DayImpressions(nativeCtrSuppression, caller);
  }

  @Override
  public float getPrevious28DayCtr(long nativeCtrSuppression, CtrSuppression caller) {
    return (float)GEN_JNI.org_chromium_chrome_browser_contextualsearch_CtrSuppression_getPrevious28DayCtr(nativeCtrSuppression, caller);
  }

  public static CtrSuppression.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.contextualsearch.CtrSuppression.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CtrSuppressionJni();
  }
}
