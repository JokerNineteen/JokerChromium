package org.chromium.chrome.browser.autofill;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CardUnmaskBridgeJni implements CardUnmaskBridge.Natives {
  private static CardUnmaskBridge.Natives testInstance;

  public static final JniStaticTestMocker<CardUnmaskBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void promptDismissed(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_CardUnmaskBridge_promptDismissed(nativeCardUnmaskPromptViewAndroid, caller);
  }

  @Override
  public boolean checkUserInputValidity(long nativeCardUnmaskPromptViewAndroid,
      CardUnmaskBridge caller, String userResponse) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_autofill_CardUnmaskBridge_checkUserInputValidity(nativeCardUnmaskPromptViewAndroid, caller, userResponse);
  }

  @Override
  public void onUserInput(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller,
      String cvc, String month, String year, boolean shouldStoreLocally, boolean enableFidoAuth) {
    GEN_JNI.org_chromium_chrome_browser_autofill_CardUnmaskBridge_onUserInput(nativeCardUnmaskPromptViewAndroid, caller, cvc, month, year, shouldStoreLocally, enableFidoAuth);
  }

  @Override
  public void onNewCardLinkClicked(long nativeCardUnmaskPromptViewAndroid,
      CardUnmaskBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_autofill_CardUnmaskBridge_onNewCardLinkClicked(nativeCardUnmaskPromptViewAndroid, caller);
  }

  @Override
  public int getExpectedCvcLength(long nativeCardUnmaskPromptViewAndroid, CardUnmaskBridge caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_autofill_CardUnmaskBridge_getExpectedCvcLength(nativeCardUnmaskPromptViewAndroid, caller);
  }

  public static CardUnmaskBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.autofill.CardUnmaskBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CardUnmaskBridgeJni();
  }
}
