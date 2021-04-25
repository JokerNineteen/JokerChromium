package org.chromium.base;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PathServiceJni implements PathService.Natives {
  private static PathService.Natives testInstance;

  public static final JniStaticTestMocker<PathService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.base.PathService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.base.PathService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void override(int what, String path) {
    GEN_JNI.org_chromium_base_PathService_override(what, path);
  }

  public static PathService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.base.PathService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PathServiceJni();
  }
}
