package org.chromium.components.thinwebview.internal;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.delegate.WebContentsDelegateAndroid;
import org.chromium.components.thinwebview.CompositorView;
import org.chromium.content_public.browser.WebContents;
import org.chromium.ui.base.WindowAndroid;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ThinWebViewImplJni implements ThinWebViewImpl.Natives {
  private static ThinWebViewImpl.Natives testInstance;

  public static final JniStaticTestMocker<ThinWebViewImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.thinwebview.internal.ThinWebViewImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.thinwebview.internal.ThinWebViewImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ThinWebViewImpl caller, CompositorView compositorView,
      WindowAndroid windowAndroid) {
    return (long)GEN_JNI.org_chromium_components_thinwebview_internal_ThinWebViewImpl_init(caller, compositorView, windowAndroid);
  }

  @Override
  public void destroy(long nativeThinWebView, ThinWebViewImpl caller) {
    GEN_JNI.org_chromium_components_thinwebview_internal_ThinWebViewImpl_destroy(nativeThinWebView, caller);
  }

  @Override
  public void setWebContents(long nativeThinWebView, ThinWebViewImpl caller,
      WebContents webContents, WebContentsDelegateAndroid delegate) {
    GEN_JNI.org_chromium_components_thinwebview_internal_ThinWebViewImpl_setWebContents(nativeThinWebView, caller, webContents, delegate);
  }

  @Override
  public void sizeChanged(long nativeThinWebView, ThinWebViewImpl caller, int width, int height) {
    GEN_JNI.org_chromium_components_thinwebview_internal_ThinWebViewImpl_sizeChanged(nativeThinWebView, caller, width, height);
  }

  public static ThinWebViewImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.thinwebview.internal.ThinWebViewImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ThinWebViewImplJni();
  }
}
