package org.chromium.components.prefs;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PrefServiceJni implements PrefService.Natives {
  private static PrefService.Natives testInstance;

  public static final JniStaticTestMocker<PrefService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.prefs.PrefService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.components.prefs.PrefService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void clearPref(long nativePrefServiceAndroid, String preference) {
    GEN_JNI.org_chromium_components_prefs_PrefService_clearPref(nativePrefServiceAndroid, preference);
  }

  @Override
  public boolean getBoolean(long nativePrefServiceAndroid, String preference) {
    return (boolean)GEN_JNI.org_chromium_components_prefs_PrefService_getBoolean(nativePrefServiceAndroid, preference);
  }

  @Override
  public void setBoolean(long nativePrefServiceAndroid, String preference, boolean value) {
    GEN_JNI.org_chromium_components_prefs_PrefService_setBoolean(nativePrefServiceAndroid, preference, value);
  }

  @Override
  public int getInteger(long nativePrefServiceAndroid, String preference) {
    return (int)GEN_JNI.org_chromium_components_prefs_PrefService_getInteger(nativePrefServiceAndroid, preference);
  }

  @Override
  public void setInteger(long nativePrefServiceAndroid, String preference, int value) {
    GEN_JNI.org_chromium_components_prefs_PrefService_setInteger(nativePrefServiceAndroid, preference, value);
  }

  @Override
  public String getString(long nativePrefServiceAndroid, String preference) {
    return (String)GEN_JNI.org_chromium_components_prefs_PrefService_getString(nativePrefServiceAndroid, preference);
  }

  @Override
  public void setString(long nativePrefServiceAndroid, String preference, String value) {
    GEN_JNI.org_chromium_components_prefs_PrefService_setString(nativePrefServiceAndroid, preference, value);
  }

  @Override
  public boolean isManagedPreference(long nativePrefServiceAndroid, String preference) {
    return (boolean)GEN_JNI.org_chromium_components_prefs_PrefService_isManagedPreference(nativePrefServiceAndroid, preference);
  }

  public static PrefService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.prefs.PrefService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PrefServiceJni();
  }
}
