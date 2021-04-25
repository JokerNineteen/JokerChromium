package org.chromium.net.impl;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CronetLibraryLoaderJni implements CronetLibraryLoader.Natives {
  private static CronetLibraryLoader.Natives testInstance;

  public static final JniStaticTestMocker<CronetLibraryLoader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.net.impl.CronetLibraryLoader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.net.impl.CronetLibraryLoader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void cronetInitOnInitThread() {
    GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_cronetInitOnInitThread();
  }

  @Override
  public String getCronetVersion() {
    return (String)GEN_JNI.org_chromium_net_impl_CronetLibraryLoader_getCronetVersion();
  }

  public static CronetLibraryLoader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.net.impl.CronetLibraryLoader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CronetLibraryLoaderJni();
  }
}
