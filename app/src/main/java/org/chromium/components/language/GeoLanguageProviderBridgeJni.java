package org.chromium.components.language;

import java.lang.Override;
import java.lang.String;
import java.util.LinkedHashSet;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class GeoLanguageProviderBridgeJni implements GeoLanguageProviderBridge.Natives {
  private static GeoLanguageProviderBridge.Natives testInstance;

  public static final JniStaticTestMocker<GeoLanguageProviderBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.language.GeoLanguageProviderBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.language.GeoLanguageProviderBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void getCurrentGeoLanguages(LinkedHashSet<String> set) {
    GEN_JNI.org_chromium_components_language_GeoLanguageProviderBridge_getCurrentGeoLanguages(set);
  }

  public static GeoLanguageProviderBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.language.GeoLanguageProviderBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new GeoLanguageProviderBridgeJni();
  }
}
