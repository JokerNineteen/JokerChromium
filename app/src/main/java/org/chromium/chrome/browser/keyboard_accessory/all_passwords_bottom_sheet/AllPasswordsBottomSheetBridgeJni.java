package org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AllPasswordsBottomSheetBridgeJni implements AllPasswordsBottomSheetBridge.Natives {
  private static AllPasswordsBottomSheetBridge.Natives testInstance;

  public static final JniStaticTestMocker<AllPasswordsBottomSheetBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onCredentialSelected(long nativeAllPasswordsBottomSheetViewImpl, String username,
      String password) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_all_1passwords_1bottom_1sheet_AllPasswordsBottomSheetBridge_onCredentialSelected(nativeAllPasswordsBottomSheetViewImpl, username, password);
  }

  @Override
  public void onDismiss(long nativeAllPasswordsBottomSheetViewImpl) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_all_1passwords_1bottom_1sheet_AllPasswordsBottomSheetBridge_onDismiss(nativeAllPasswordsBottomSheetViewImpl);
  }

  public static AllPasswordsBottomSheetBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AllPasswordsBottomSheetBridgeJni();
  }
}
