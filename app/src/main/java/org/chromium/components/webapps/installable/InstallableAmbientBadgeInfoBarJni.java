package org.chromium.components.webapps.installable;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InstallableAmbientBadgeInfoBarJni implements InstallableAmbientBadgeInfoBar.Natives {
  private static InstallableAmbientBadgeInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<InstallableAmbientBadgeInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.webapps.installable.InstallableAmbientBadgeInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.webapps.installable.InstallableAmbientBadgeInfoBar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void addToHomescreen(long nativeInstallableAmbientBadgeInfoBar,
      InstallableAmbientBadgeInfoBar caller) {
    GEN_JNI.org_chromium_components_webapps_installable_InstallableAmbientBadgeInfoBar_addToHomescreen(nativeInstallableAmbientBadgeInfoBar, caller);
  }

  public static InstallableAmbientBadgeInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.webapps.installable.InstallableAmbientBadgeInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InstallableAmbientBadgeInfoBarJni();
  }
}
