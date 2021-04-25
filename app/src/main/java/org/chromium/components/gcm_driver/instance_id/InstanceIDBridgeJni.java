package org.chromium.components.gcm_driver.instance_id;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstanceIDBridgeJni implements InstanceIDBridge.Natives {
  private static InstanceIDBridge.Natives testInstance;

  public static final JniStaticTestMocker<InstanceIDBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void didGetID(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      String id) {
    GEN_JNI.org_chromium_components_gcm_1driver_instance_1id_InstanceIDBridge_didGetID(nativeInstanceIDAndroid, caller, requestId, id);
  }

  @Override
  public void didGetCreationTime(long nativeInstanceIDAndroid, InstanceIDBridge caller,
      int requestId, long creationTime) {
    GEN_JNI.org_chromium_components_gcm_1driver_instance_1id_InstanceIDBridge_didGetCreationTime(nativeInstanceIDAndroid, caller, requestId, creationTime);
  }

  @Override
  public void didGetToken(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      String token) {
    GEN_JNI.org_chromium_components_gcm_1driver_instance_1id_InstanceIDBridge_didGetToken(nativeInstanceIDAndroid, caller, requestId, token);
  }

  @Override
  public void didDeleteToken(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      boolean success) {
    GEN_JNI.org_chromium_components_gcm_1driver_instance_1id_InstanceIDBridge_didDeleteToken(nativeInstanceIDAndroid, caller, requestId, success);
  }

  @Override
  public void didDeleteID(long nativeInstanceIDAndroid, InstanceIDBridge caller, int requestId,
      boolean success) {
    GEN_JNI.org_chromium_components_gcm_1driver_instance_1id_InstanceIDBridge_didDeleteID(nativeInstanceIDAndroid, caller, requestId, success);
  }

  public static InstanceIDBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.gcm_driver.instance_id.InstanceIDBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstanceIDBridgeJni();
  }
}
