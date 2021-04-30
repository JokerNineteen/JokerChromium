package org.chromium.components.security_state;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class SecurityStateModelJni implements SecurityStateModel.Natives {
  private static SecurityStateModel.Natives testInstance;

  public static final JniStaticTestMocker<SecurityStateModel.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.security_state.SecurityStateModel.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.security_state.SecurityStateModel.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getSecurityLevelForWebContents(WebContents webContents) {
    return (int)GEN_JNI.org_chromium_components_security_1state_SecurityStateModel_getSecurityLevelForWebContents(webContents);
  }

  public static SecurityStateModel.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.security_state.SecurityStateModel.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SecurityStateModelJni();
  }
}
