package org.chromium.chrome.browser.device_dialog;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BluetoothChooserDialogJni implements BluetoothChooserDialog.Natives {
  private static BluetoothChooserDialog.Natives testInstance;

  public static final JniStaticTestMocker<BluetoothChooserDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDialogFinished(long nativeBluetoothChooserAndroid, int eventType, String deviceId) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothChooserDialog_onDialogFinished(nativeBluetoothChooserAndroid, eventType, deviceId);
  }

  @Override
  public void restartSearch(long nativeBluetoothChooserAndroid) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothChooserDialog_restartSearch(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showBluetoothOverviewLink(long nativeBluetoothChooserAndroid) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothChooserDialog_showBluetoothOverviewLink(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showBluetoothAdapterOffLink(long nativeBluetoothChooserAndroid) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothChooserDialog_showBluetoothAdapterOffLink(nativeBluetoothChooserAndroid);
  }

  @Override
  public void showNeedLocationPermissionLink(long nativeBluetoothChooserAndroid) {
    GEN_JNI.org_chromium_chrome_browser_device_1dialog_BluetoothChooserDialog_showNeedLocationPermissionLink(nativeBluetoothChooserAndroid);
  }

  public static BluetoothChooserDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.device_dialog.BluetoothChooserDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BluetoothChooserDialogJni();
  }
}
