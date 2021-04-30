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
final class BrowserMediaRouterJni implements BrowserMediaRouter.Natives {
  private static BrowserMediaRouter.Natives testInstance;

  public static final JniStaticTestMocker<BrowserMediaRouter.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.media_router.BrowserMediaRouter.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.media_router.BrowserMediaRouter.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onSinksReceived(long nativeMediaRouterAndroidBridge, BrowserMediaRouter caller,
      String sourceUrn, int count) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onSinksReceived(nativeMediaRouterAndroidBridge, caller, sourceUrn, count);
  }

  @Override
  public void onRouteCreated(long nativeMediaRouterAndroidBridge, BrowserMediaRouter caller,
      String mediaRouteId, String mediaSinkId, int createRouteRequestId, boolean wasLaunched) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onRouteCreated(nativeMediaRouterAndroidBridge, caller, mediaRouteId, mediaSinkId, createRouteRequestId, wasLaunched);
  }

  @Override
  public void onCreateRouteRequestError(long nativeMediaRouterAndroidBridge,
      BrowserMediaRouter caller, String errorText, int requestId) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onCreateRouteRequestError(nativeMediaRouterAndroidBridge, caller, errorText, requestId);
  }

  @Override
  public void onJoinRouteRequestError(long nativeMediaRouterAndroidBridge,
      BrowserMediaRouter caller, String errorText, int requestId) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onJoinRouteRequestError(nativeMediaRouterAndroidBridge, caller, errorText, requestId);
  }

  @Override
  public void onRouteTerminated(long nativeMediaRouterAndroidBridge, BrowserMediaRouter caller,
      String mediaRouteId) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onRouteTerminated(nativeMediaRouterAndroidBridge, caller, mediaRouteId);
  }

  @Override
  public void onRouteClosed(long nativeMediaRouterAndroidBridge, BrowserMediaRouter caller,
      String mediaRouteId, String message) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onRouteClosed(nativeMediaRouterAndroidBridge, caller, mediaRouteId, message);
  }

  @Override
  public void onMessage(long nativeMediaRouterAndroidBridge, BrowserMediaRouter caller,
      String mediaRouteId, String message) {
    GEN_JNI.org_chromium_components_media_1router_BrowserMediaRouter_onMessage(nativeMediaRouterAndroidBridge, caller, mediaRouteId, message);
  }

  public static BrowserMediaRouter.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.media_router.BrowserMediaRouter.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new BrowserMediaRouterJni();
  }
}
