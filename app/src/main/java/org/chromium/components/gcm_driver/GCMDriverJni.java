package org.chromium.components.gcm_driver;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GCMDriverJni implements GCMDriver.Natives {
  private static GCMDriver.Natives testInstance;

  public static final JniStaticTestMocker<GCMDriver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.gcm_driver.GCMDriver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.gcm_driver.GCMDriver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRegisterFinished(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      String registrationId, boolean success) {
    GEN_JNI.org_chromium_components_gcm_1driver_GCMDriver_onRegisterFinished(nativeGCMDriverAndroid, caller, appId, registrationId, success);
  }

  @Override
  public void onUnregisterFinished(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      boolean success) {
    GEN_JNI.org_chromium_components_gcm_1driver_GCMDriver_onUnregisterFinished(nativeGCMDriverAndroid, caller, appId, success);
  }

  @Override
  public void onMessageReceived(long nativeGCMDriverAndroid, GCMDriver caller, String appId,
      String senderId, String messageId, String collapseKey, byte[] rawData,
      String[] dataKeysAndValues) {
    GEN_JNI.org_chromium_components_gcm_1driver_GCMDriver_onMessageReceived(nativeGCMDriverAndroid, caller, appId, senderId, messageId, collapseKey, rawData, dataKeysAndValues);
  }

  public static GCMDriver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.gcm_driver.GCMDriver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GCMDriverJni();
  }
}
