package org.chromium.components.user_prefs;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.embedder_support.browser_context.BrowserContextHandle;
import org.chromium.components.prefs.PrefService;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class UserPrefsJni implements UserPrefs.Natives {
  private static UserPrefs.Natives testInstance;

  public static final JniStaticTestMocker<UserPrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.user_prefs.UserPrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.user_prefs.UserPrefs.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public PrefService get(BrowserContextHandle browserContextHandle) {
    return (PrefService)GEN_JNI.org_chromium_components_user_1prefs_UserPrefs_get(browserContextHandle);
  }

  public static UserPrefs.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.user_prefs.UserPrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UserPrefsJni();
  }
}
