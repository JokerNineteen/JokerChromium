package org.chromium.components.paintpreview.player;

import android.graphics.Bitmap;
import java.lang.Integer;
import java.lang.Override;
import java.lang.Runnable;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.UnguessableToken;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PlayerCompositorDelegateImplJni implements PlayerCompositorDelegateImpl.Natives {
  private static PlayerCompositorDelegateImpl.Natives testInstance;

  public static final JniStaticTestMocker<PlayerCompositorDelegateImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initialize(PlayerCompositorDelegateImpl caller, long nativePaintPreviewBaseService,
      byte[] proto, String urlSpec, String directoryKey, boolean mainFrameMode,
      Callback<Integer> compositorErrorCallback, boolean isLowMemory) {
    return (long)GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_initialize(caller, nativePaintPreviewBaseService, proto, urlSpec, directoryKey, mainFrameMode, compositorErrorCallback, isLowMemory);
  }

  @Override
  public void destroy(long nativePlayerCompositorDelegateAndroid) {
    GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_destroy(nativePlayerCompositorDelegateAndroid);
  }

  @Override
  public int requestBitmap(long nativePlayerCompositorDelegateAndroid, UnguessableToken frameGuid,
      Callback<Bitmap> bitmapCallback, Runnable errorCallback, float scaleFactor, int clipX,
      int clipY, int clipWidth, int clipHeight) {
    return (int)GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_requestBitmap(nativePlayerCompositorDelegateAndroid, frameGuid, bitmapCallback, errorCallback, scaleFactor, clipX, clipY, clipWidth, clipHeight);
  }

  @Override
  public boolean cancelBitmapRequest(long nativePlayerCompositorDelegateAndroid, int requestId) {
    return (boolean)GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_cancelBitmapRequest(nativePlayerCompositorDelegateAndroid, requestId);
  }

  @Override
  public void cancelAllBitmapRequests(long nativePlayerCompositorDelegateAndroid) {
    GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_cancelAllBitmapRequests(nativePlayerCompositorDelegateAndroid);
  }

  @Override
  public String onClick(long nativePlayerCompositorDelegateAndroid, UnguessableToken frameGuid,
      int x, int y) {
    return (String)GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_onClick(nativePlayerCompositorDelegateAndroid, frameGuid, x, y);
  }

  @Override
  public void setCompressOnClose(long nativePlayerCompositorDelegateAndroid,
      boolean compressOnClose) {
    GEN_JNI.org_chromium_components_paintpreview_player_PlayerCompositorDelegateImpl_setCompressOnClose(nativePlayerCompositorDelegateAndroid, compressOnClose);
  }

  public static PlayerCompositorDelegateImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.paintpreview.player.PlayerCompositorDelegateImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PlayerCompositorDelegateImplJni();
  }
}
