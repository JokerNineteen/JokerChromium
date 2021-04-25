package org.chromium.components.module_installer.builder;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.annotations.MainDex;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@MainDex
@CheckDiscard("crbug.com/993421")
final class ModuleJni implements Module.Natives {
  private static Module.Natives testInstance;

  public static final JniStaticTestMocker<Module.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.module_installer.builder.Module.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.module_installer.builder.Module.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void loadNative(String name, String[] libraries, String[] paks) {
    GEN_JNI.org_chromium_components_module_1installer_builder_Module_loadNative(name, libraries, paks);
  }

  public static Module.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.module_installer.builder.Module.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(true);
    return new ModuleJni();
  }
}
