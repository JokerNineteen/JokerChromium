package org.chromium.chrome.browser.keyboard_accessory;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.keyboard_accessory.data.UserInfoField;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ManualFillingComponentBridgeJni implements ManualFillingComponentBridge.Natives {
  private static ManualFillingComponentBridge.Natives testInstance;

  public static final JniStaticTestMocker<ManualFillingComponentBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onFillingTriggered(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, int tabType, UserInfoField userInfoField) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_onFillingTriggered(nativeManualFillingViewAndroid, caller, tabType, userInfoField);
  }

  @Override
  public void onOptionSelected(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, int accessoryAction) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_onOptionSelected(nativeManualFillingViewAndroid, caller, accessoryAction);
  }

  @Override
  public void onToggleChanged(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller, int accessoryAction, boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_onToggleChanged(nativeManualFillingViewAndroid, caller, accessoryAction, enabled);
  }

  @Override
  public void onViewDestroyed(long nativeManualFillingViewAndroid,
      ManualFillingComponentBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_onViewDestroyed(nativeManualFillingViewAndroid, caller);
  }

  @Override
  public void cachePasswordSheetDataForTesting(WebContents webContents, String[] userNames,
      String[] passwords, boolean originDenylisted) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_cachePasswordSheetDataForTesting(webContents, userNames, passwords, originDenylisted);
  }

  @Override
  public void notifyFocusedFieldTypeForTesting(WebContents webContents, int focusedFieldType) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_notifyFocusedFieldTypeForTesting(webContents, focusedFieldType);
  }

  @Override
  public void signalAutoGenerationStatusForTesting(WebContents webContents, boolean available) {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_signalAutoGenerationStatusForTesting(webContents, available);
  }

  @Override
  public void disableServerPredictionsForTesting() {
    GEN_JNI.org_chromium_chrome_browser_keyboard_1accessory_ManualFillingComponentBridge_disableServerPredictionsForTesting();
  }

  public static ManualFillingComponentBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.keyboard_accessory.ManualFillingComponentBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ManualFillingComponentBridgeJni();
  }
}
