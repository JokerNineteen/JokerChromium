package org.chromium.components.spellcheck;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SpellCheckerSessionBridgeJni implements SpellCheckerSessionBridge.Natives {
  private static SpellCheckerSessionBridge.Natives testInstance;

  public static final JniStaticTestMocker<SpellCheckerSessionBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.spellcheck.SpellCheckerSessionBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.spellcheck.SpellCheckerSessionBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void processSpellCheckResults(long nativeSpellCheckerSessionBridge,
      SpellCheckerSessionBridge caller, int[] offsets, int[] lengths, String[][] suggestions) {
    GEN_JNI.org_chromium_components_spellcheck_SpellCheckerSessionBridge_processSpellCheckResults(nativeSpellCheckerSessionBridge, caller, offsets, lengths, suggestions);
  }

  public static SpellCheckerSessionBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.spellcheck.SpellCheckerSessionBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SpellCheckerSessionBridgeJni();
  }
}
