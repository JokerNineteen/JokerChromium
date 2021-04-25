package org.chromium.components.webxr;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ArCoreJavaUtilsJni implements ArCoreJavaUtils.Natives {
  private static ArCoreJavaUtils.Natives testInstance;

  public static final JniStaticTestMocker<ArCoreJavaUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webxr.ArCoreJavaUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.webxr.ArCoreJavaUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDrawingSurfaceReady(long nativeArCoreJavaUtils, ArCoreJavaUtils caller,
      Surface surface, int rotation, int width, int height) {
    GEN_JNI.org_chromium_components_webxr_ArCoreJavaUtils_onDrawingSurfaceReady(nativeArCoreJavaUtils, caller, surface, rotation, width, height);
  }

  @Override
  public void onDrawingSurfaceTouch(long nativeArCoreJavaUtils, ArCoreJavaUtils caller,
      boolean primary, boolean touching, int pointerId, float x, float y) {
    GEN_JNI.org_chromium_components_webxr_ArCoreJavaUtils_onDrawingSurfaceTouch(nativeArCoreJavaUtils, caller, primary, touching, pointerId, x, y);
  }

  @Override
  public void onDrawingSurfaceDestroyed(long nativeArCoreJavaUtils, ArCoreJavaUtils caller) {
    GEN_JNI.org_chromium_components_webxr_ArCoreJavaUtils_onDrawingSurfaceDestroyed(nativeArCoreJavaUtils, caller);
  }

  public static ArCoreJavaUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webxr.ArCoreJavaUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ArCoreJavaUtilsJni();
  }
}
