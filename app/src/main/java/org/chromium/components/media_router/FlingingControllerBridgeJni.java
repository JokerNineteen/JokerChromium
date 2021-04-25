package org.chromium.components.media_router;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class FlingingControllerBridgeJni implements FlingingControllerBridge.Natives {
  private static FlingingControllerBridge.Natives testInstance;

  public static final JniStaticTestMocker<FlingingControllerBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.media_router.FlingingControllerBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.media_router.FlingingControllerBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onMediaStatusUpdated(long nativeFlingingControllerBridge,
      FlingingControllerBridge caller, MediaStatusBridge status) {
    GEN_JNI.org_chromium_components_media_1router_FlingingControllerBridge_onMediaStatusUpdated(nativeFlingingControllerBridge, caller, status);
  }

  public static FlingingControllerBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.media_router.FlingingControllerBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FlingingControllerBridgeJni();
  }
}
