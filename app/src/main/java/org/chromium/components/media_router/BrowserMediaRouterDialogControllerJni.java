package org.chromium.components.media_router;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class BrowserMediaRouterDialogControllerJni implements BrowserMediaRouterDialogController.Natives {
  private static BrowserMediaRouterDialogController.Natives testInstance;

  public static final JniStaticTestMocker<BrowserMediaRouterDialogController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.media_router.BrowserMediaRouterDialogController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.media_router.BrowserMediaRouterDialogController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onDialogCancelled(long nativeMediaRouterDialogControllerAndroid,
      BrowserMediaRouterDialogController caller) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouterDialogController_onDialogCancelled(nativeMediaRouterDialogControllerAndroid, caller);
  }

  @Override
  public void onSinkSelected(long nativeMediaRouterDialogControllerAndroid,
      BrowserMediaRouterDialogController caller, String sourceUrn, String sinkId) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouterDialogController_onSinkSelected(nativeMediaRouterDialogControllerAndroid, caller, sourceUrn, sinkId);
  }

  @Override
  public void onRouteClosed(long nativeMediaRouterDialogControllerAndroid,
      BrowserMediaRouterDialogController caller, String routeId) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouterDialogController_onRouteClosed(nativeMediaRouterDialogControllerAndroid, caller, routeId);
  }

  @Override
  public void onMediaSourceNotSupported(long nativeMediaRouterDialogControllerAndroid,
      BrowserMediaRouterDialogController caller) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouterDialogController_onMediaSourceNotSupported(nativeMediaRouterDialogControllerAndroid, caller);
  }

  public static BrowserMediaRouterDialogController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.media_router.BrowserMediaRouterDialogController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowserMediaRouterDialogControllerJni();
  }
}
