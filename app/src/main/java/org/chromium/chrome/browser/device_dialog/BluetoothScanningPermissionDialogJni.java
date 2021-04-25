package org.chromium.chrome.browser.device_dialog;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BluetoothScanningPermissionDialogJni implements BluetoothScanningPermissionDialog.Natives {
  private static BluetoothScanningPermissionDialog.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothScanningPermissionDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDialogFinished(long nativeBluetoothScanningPromptAndroid, int eventType) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothScanningPermissionDialog_onDialogFinished(nativeBluetoothScanningPromptAndroid, eventType);
  }

  public static BluetoothScanningPermissionDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_dialog.BluetoothScanningPermissionDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BluetoothScanningPermissionDialogJni();
  }
}
