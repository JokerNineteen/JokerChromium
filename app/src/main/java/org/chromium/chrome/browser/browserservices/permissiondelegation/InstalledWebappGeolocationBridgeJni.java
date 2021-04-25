package org.chromium.chrome.browser.browserservices.permissiondelegation;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstalledWebappGeolocationBridgeJni implements InstalledWebappGeolocationBridge.Natives {
  private static InstalledWebappGeolocationBridge.Natives testInstance;

  public static final JniStaticTestMocker<InstalledWebappGeolocationBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappGeolocationBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappGeolocationBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onNewLocationAvailable(long nativeInstalledWebappGeolocationBridge, double latitude,
      double longitude, double timeStamp, boolean hasAltitude, double altitude, boolean hasAccuracy,
      double accuracy, boolean hasHeading, double heading, boolean hasSpeed, double speed) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_permissiondelegation_InstalledWebappGeolocationBridge_onNewLocationAvailable(nativeInstalledWebappGeolocationBridge, latitude, longitude, timeStamp, hasAltitude, altitude, hasAccuracy, accuracy, hasHeading, heading, hasSpeed, speed);
  }

  @Override
  public void onNewErrorAvailable(long nativeInstalledWebappGeolocationBridge, String message) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_permissiondelegation_InstalledWebappGeolocationBridge_onNewErrorAvailable(nativeInstalledWebappGeolocationBridge, message);
  }

  public static InstalledWebappGeolocationBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.permissiondelegation.InstalledWebappGeolocationBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstalledWebappGeolocationBridgeJni();
  }
}
