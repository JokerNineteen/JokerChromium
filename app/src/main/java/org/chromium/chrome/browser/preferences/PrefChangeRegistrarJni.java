package org.chromium.chrome.browser.preferences;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefChangeRegistrarJni implements PrefChangeRegistrar.Natives {
  private static PrefChangeRegistrar.Natives testInstance;

  public static final JniStaticTestMocker<PrefChangeRegistrar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PrefChangeRegistrar caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_preferences_PrefChangeRegistrar_init(caller);
  }

  @Override
  public void add(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller,
      String preference) {
    GEN_JNI.org_chromium_chrome_browser_preferences_PrefChangeRegistrar_add(nativePrefChangeRegistrarAndroid, caller, preference);
  }

  @Override
  public void remove(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller,
      String preference) {
    GEN_JNI.org_chromium_chrome_browser_preferences_PrefChangeRegistrar_remove(nativePrefChangeRegistrarAndroid, caller, preference);
  }

  @Override
  public void destroy(long nativePrefChangeRegistrarAndroid, PrefChangeRegistrar caller) {
    GEN_JNI.org_chromium_chrome_browser_preferences_PrefChangeRegistrar_destroy(nativePrefChangeRegistrarAndroid, caller);
  }

  public static PrefChangeRegistrar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.preferences.PrefChangeRegistrar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefChangeRegistrarJni();
  }
}
