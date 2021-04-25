package org.chromium.chrome.browser.gesturenav;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.layouts.scene_layer.SceneLayer;
import org.chromium.ui.base.WindowAndroid;
import org.chromium.ui.resources.ResourceManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OverscrollSceneLayerJni implements OverscrollSceneLayer.Natives {
  private static OverscrollSceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<OverscrollSceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.gesturenav.OverscrollSceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.gesturenav.OverscrollSceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OverscrollSceneLayer caller, WindowAndroid window) {
    return (long)GEN_JNI.org_chromium_chrome_browser_gesturenav_OverscrollSceneLayer_init(caller, window);
  }

  @Override
  public void prepare(long nativeOverscrollSceneLayer, OverscrollSceneLayer caller, float startX,
      float startY, int width, int height) {
    GEN_JNI.org_chromium_chrome_browser_gesturenav_OverscrollSceneLayer_prepare(nativeOverscrollSceneLayer, caller, startX, startY, width, height);
  }

  @Override
  public void setContentTree(long nativeOverscrollSceneLayer, OverscrollSceneLayer caller,
      SceneLayer contentTree) {
    GEN_JNI.org_chromium_chrome_browser_gesturenav_OverscrollSceneLayer_setContentTree(nativeOverscrollSceneLayer, caller, contentTree);
  }

  @Override
  public boolean update(long nativeOverscrollSceneLayer, OverscrollSceneLayer caller,
      ResourceManager resourceManager, float accumulatedScroll, float delta) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_gesturenav_OverscrollSceneLayer_update(nativeOverscrollSceneLayer, caller, resourceManager, accumulatedScroll, delta);
  }

  @Override
  public void onReset(long nativeOverscrollSceneLayer, OverscrollSceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_gesturenav_OverscrollSceneLayer_onReset(nativeOverscrollSceneLayer, caller);
  }

  public static OverscrollSceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.gesturenav.OverscrollSceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OverscrollSceneLayerJni();
  }
}
