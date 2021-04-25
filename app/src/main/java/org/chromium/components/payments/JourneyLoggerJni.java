package org.chromium.components.payments;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JourneyLoggerJni implements JourneyLogger.Natives {
  private static JourneyLogger.Natives testInstance;

  public static final JniStaticTestMocker<JourneyLogger.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.payments.JourneyLogger.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.payments.JourneyLogger.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initJourneyLoggerAndroid(JourneyLogger caller, boolean isIncognito,
      WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_payments_JourneyLogger_initJourneyLoggerAndroid(caller, isIncognito, webContents);
  }

  @Override
  public void destroy(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_destroy(nativeJourneyLoggerAndroid, caller);
  }

  @Override
  public void setNumberOfSuggestionsShown(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      int section, int number, boolean hasCompleteSuggestion) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setNumberOfSuggestionsShown(nativeJourneyLoggerAndroid, caller, section, number, hasCompleteSuggestion);
  }

  @Override
  public void setCanMakePaymentValue(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean value) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setCanMakePaymentValue(nativeJourneyLoggerAndroid, caller, value);
  }

  @Override
  public void setHasEnrolledInstrumentValue(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean value) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setHasEnrolledInstrumentValue(nativeJourneyLoggerAndroid, caller, value);
  }

  @Override
  public void setEventOccurred(long nativeJourneyLoggerAndroid, JourneyLogger caller, int event) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setEventOccurred(nativeJourneyLoggerAndroid, caller, event);
  }

  @Override
  public void setRequestedInformation(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean requestShipping, boolean requestEmail, boolean requestPhone, boolean requestName) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setRequestedInformation(nativeJourneyLoggerAndroid, caller, requestShipping, requestEmail, requestPhone, requestName);
  }

  @Override
  public void setRequestedPaymentMethodTypes(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      boolean requestedBasicCard, boolean requestedMethodGoogle, boolean requestedMethodOther) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setRequestedPaymentMethodTypes(nativeJourneyLoggerAndroid, caller, requestedBasicCard, requestedMethodGoogle, requestedMethodOther);
  }

  @Override
  public void setCompleted(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setCompleted(nativeJourneyLoggerAndroid, caller);
  }

  @Override
  public void setAborted(long nativeJourneyLoggerAndroid, JourneyLogger caller, int reason) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setAborted(nativeJourneyLoggerAndroid, caller, reason);
  }

  @Override
  public void setNotShown(long nativeJourneyLoggerAndroid, JourneyLogger caller, int reason) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setNotShown(nativeJourneyLoggerAndroid, caller, reason);
  }

  @Override
  public void recordTransactionAmount(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      String currency, String value, boolean completed) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_recordTransactionAmount(nativeJourneyLoggerAndroid, caller, currency, value, completed);
  }

  @Override
  public void recordCheckoutStep(long nativeJourneyLoggerAndroid, JourneyLogger caller, int step) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_recordCheckoutStep(nativeJourneyLoggerAndroid, caller, step);
  }

  @Override
  public void setTriggerTime(long nativeJourneyLoggerAndroid, JourneyLogger caller) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setTriggerTime(nativeJourneyLoggerAndroid, caller);
  }

  @Override
  public void setPaymentAppUkmSourceId(long nativeJourneyLoggerAndroid, JourneyLogger caller,
      long sourceId) {
    GEN_JNI.org_chromium_components_payments_JourneyLogger_setPaymentAppUkmSourceId(nativeJourneyLoggerAndroid, caller, sourceId);
  }

  public static JourneyLogger.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.payments.JourneyLogger.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JourneyLoggerJni();
  }
}
