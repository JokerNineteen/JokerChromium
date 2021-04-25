package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillPopupBridgeJni implements AutofillPopupBridge.Natives {
  private static AutofillPopupBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillPopupBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.AutofillPopupBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.AutofillPopupBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void suggestionSelected(long nativeAutofillPopupViewAndroid, AutofillPopupBridge caller,
      int listIndex) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillPopupBridge_suggestionSelected(nativeAutofillPopupViewAndroid, caller, listIndex);
  }

  @Override
  public void deletionRequested(long nativeAutofillPopupViewAndroid, AutofillPopupBridge caller,
      int listIndex) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillPopupBridge_deletionRequested(nativeAutofillPopupViewAndroid, caller, listIndex);
  }

  @Override
  public void deletionConfirmed(long nativeAutofillPopupViewAndroid, AutofillPopupBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillPopupBridge_deletionConfirmed(nativeAutofillPopupViewAndroid, caller);
  }

  @Override
  public void popupDismissed(long nativeAutofillPopupViewAndroid, AutofillPopupBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_AutofillPopupBridge_popupDismissed(nativeAutofillPopupViewAndroid, caller);
  }

  public static AutofillPopupBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.AutofillPopupBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillPopupBridgeJni();
  }
}
