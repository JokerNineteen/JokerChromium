package org.chromium.components.omnibox;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OmniboxUrlEmphasizerJni implements OmniboxUrlEmphasizer.Natives {
  private static OmniboxUrlEmphasizer.Natives testInstance;

  public static final JniStaticTestMocker<OmniboxUrlEmphasizer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.omnibox.OmniboxUrlEmphasizer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.omnibox.OmniboxUrlEmphasizer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int[] parseForEmphasizeComponents(String text,
      AutocompleteSchemeClassifier autocompleteSchemeClassifier) {
    return (int[])GEN_JNI.org_chromium_components_omnibox_OmniboxUrlEmphasizer_parseForEmphasizeComponents(text, autocompleteSchemeClassifier);
  }

  public static OmniboxUrlEmphasizer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.omnibox.OmniboxUrlEmphasizer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OmniboxUrlEmphasizerJni();
  }
}
