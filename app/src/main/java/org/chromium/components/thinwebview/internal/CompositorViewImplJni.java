package org.chromium.components.thinwebview.internal;

import android.view.Surface;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CompositorViewImplJni implements CompositorViewImpl.Natives {
  private static CompositorViewImpl.Natives testInstance;

  public static final JniStaticTestMocker<CompositorViewImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.thinwebview.internal.CompositorViewImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.thinwebview.internal.CompositorViewImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(CompositorViewImpl caller, WindowAndroid windowAndroid, int backgroundColor) {
    return (long)GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_init(caller, windowAndroid, backgroundColor);
  }

  @Override
  public void destroy(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_destroy(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceCreated(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_surfaceCreated(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceDestroyed(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_surfaceDestroyed(nativeCompositorViewImpl, caller);
  }

  @Override
  public void surfaceChanged(long nativeCompositorViewImpl, CompositorViewImpl caller, int format,
      int width, int height, boolean canBeUsedWithSurfaceControl, Surface surface) {
    GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_surfaceChanged(nativeCompositorViewImpl, caller, format, width, height, canBeUsedWithSurfaceControl, surface);
  }

  @Override
  public void setNeedsComposite(long nativeCompositorViewImpl, CompositorViewImpl caller) {
    GEN_JNI.org_chromium_components_thinwebview_internal_CompositorViewImpl_setNeedsComposite(nativeCompositorViewImpl, caller);
  }

  public static CompositorViewImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.thinwebview.internal.CompositorViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CompositorViewImplJni();
  }
}
