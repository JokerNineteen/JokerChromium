package org.chromium.components.external_intents;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InterceptNavigationDelegateImplJni implements InterceptNavigationDelegateImpl.Natives {
  private static InterceptNavigationDelegateImpl.Natives testInstance;

  public static final JniStaticTestMocker<InterceptNavigationDelegateImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.external_intents.InterceptNavigationDelegateImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.external_intents.InterceptNavigationDelegateImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void associateWithWebContents(
      InterceptNavigationDelegateImpl nativeInterceptNavigationDelegateImpl,
      WebContents webContents) {
    GEN_JNI.org_chromium_components_external_1intents_InterceptNavigationDelegateImpl_associateWithWebContents(nativeInterceptNavigationDelegateImpl, webContents);
  }

  public static InterceptNavigationDelegateImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.external_intents.InterceptNavigationDelegateImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InterceptNavigationDelegateImplJni();
  }
}
