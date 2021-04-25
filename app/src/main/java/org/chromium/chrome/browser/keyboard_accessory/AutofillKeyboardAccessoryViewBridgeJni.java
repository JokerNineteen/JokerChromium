package org.chromium.chrome.browser.keyboard_accessory;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillKeyboardAccessoryViewBridgeJni implements AutofillKeyboardAccessoryViewBridge.Natives {
  private static AutofillKeyboardAccessoryViewBridge.Natives testInstance;

  public static final JniStaticTestMocker<AutofillKeyboardAccessoryViewBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void viewDismissed(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_AutofillKeyboardAccessoryViewBridge_viewDismissed(nativeAutofillKeyboardAccessoryView, caller);
  }

  @Override
  public void suggestionSelected(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller, int listIndex) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_AutofillKeyboardAccessoryViewBridge_suggestionSelected(nativeAutofillKeyboardAccessoryView, caller, listIndex);
  }

  @Override
  public void deletionRequested(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller, int listIndex) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_AutofillKeyboardAccessoryViewBridge_deletionRequested(nativeAutofillKeyboardAccessoryView, caller, listIndex);
  }

  @Override
  public void deletionConfirmed(long nativeAutofillKeyboardAccessoryView,
      AutofillKeyboardAccessoryViewBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_AutofillKeyboardAccessoryViewBridge_deletionConfirmed(nativeAutofillKeyboardAccessoryView, caller);
  }

  public static AutofillKeyboardAccessoryViewBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.keyboard_accessory.AutofillKeyboardAccessoryViewBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillKeyboardAccessoryViewBridgeJni();
  }
}
