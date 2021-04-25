package org.chromium.chrome.browser.layouts.scene_layer;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SceneLayerJni implements SceneLayer.Natives {
  private static SceneLayer.Natives testInstance;

  public static final JniStaticTestMocker<SceneLayer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.layouts.scene_layer.SceneLayer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.layouts.scene_layer.SceneLayer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(SceneLayer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_layouts_scene_1layer_SceneLayer_init(caller);
  }

  @Override
  public void removeFromParent(long nativeSceneLayer, SceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_layouts_scene_1layer_SceneLayer_removeFromParent(nativeSceneLayer, caller);
  }

  @Override
  public void destroy(long nativeSceneLayer, SceneLayer caller) {
    GEN_JNI.org_chromium_chrome_browser_layouts_scene_1layer_SceneLayer_destroy(nativeSceneLayer, caller);
  }

  public static SceneLayer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.layouts.scene_layer.SceneLayer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SceneLayerJni();
  }
}
