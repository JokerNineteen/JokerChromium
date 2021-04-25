package org.chromium.components.language;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AndroidLanguageMetricsBridgeJni implements AndroidLanguageMetricsBridge.Natives {
  private static AndroidLanguageMetricsBridge.Natives testInstance;

  public static final JniStaticTestMocker<AndroidLanguageMetricsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.language.AndroidLanguageMetricsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.language.AndroidLanguageMetricsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void reportExplicitLanguageAskStateChanged(String language, boolean added) {
    GEN_JNI.org_chromium_components_language_AndroidLanguageMetricsBridge_reportExplicitLanguageAskStateChanged(language, added);
  }

  public static AndroidLanguageMetricsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.language.AndroidLanguageMetricsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AndroidLanguageMetricsBridgeJni();
  }
}
