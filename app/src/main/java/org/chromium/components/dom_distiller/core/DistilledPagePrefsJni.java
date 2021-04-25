package org.chromium.components.dom_distiller.core;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DistilledPagePrefsJni implements DistilledPagePrefs.Natives {
  private static DistilledPagePrefs.Natives testInstance;

  public static final JniStaticTestMocker<DistilledPagePrefs.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(DistilledPagePrefs caller, long distilledPagePrefPtr) {
    return (long)GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_init(caller, distilledPagePrefPtr);
  }

  @Override
  public void setFontFamily(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      int fontFamily) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_setFontFamily(nativeDistilledPagePrefsAndroid, caller, fontFamily);
  }

  @Override
  public int getFontFamily(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (int)GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_getFontFamily(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void setTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller, int theme) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_setTheme(nativeDistilledPagePrefsAndroid, caller, theme);
  }

  @Override
  public int getTheme(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (int)GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_getTheme(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void setFontScaling(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      float scaling) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_setFontScaling(nativeDistilledPagePrefsAndroid, caller, scaling);
  }

  @Override
  public float getFontScaling(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller) {
    return (float)GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_getFontScaling(nativeDistilledPagePrefsAndroid, caller);
  }

  @Override
  public void addObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      long nativeObserverPtr) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_addObserver(nativeDistilledPagePrefsAndroid, caller, nativeObserverPtr);
  }

  @Override
  public void removeObserver(long nativeDistilledPagePrefsAndroid, DistilledPagePrefs caller,
      long nativeObserverPtr) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_removeObserver(nativeDistilledPagePrefsAndroid, caller, nativeObserverPtr);
  }

  @Override
  public long initObserverAndroid(DistilledPagePrefs.DistilledPagePrefsObserverWrapper caller) {
    return (long)GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_initObserverAndroid(caller);
  }

  @Override
  public void destroyObserverAndroid(long nativeDistilledPagePrefsObserverAndroid) {
    GEN_JNI.org_chromium_components_dom_1distiller_core_DistilledPagePrefs_destroyObserverAndroid(nativeDistilledPagePrefsObserverAndroid);
  }

  public static DistilledPagePrefs.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.dom_distiller.core.DistilledPagePrefs.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DistilledPagePrefsJni();
  }
}
