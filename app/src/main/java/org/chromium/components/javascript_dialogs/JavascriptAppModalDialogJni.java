package org.chromium.components.javascript_dialogs;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JavascriptAppModalDialogJni implements JavascriptAppModalDialog.Natives {
  private static JavascriptAppModalDialog.Natives testInstance;

  public static final JniStaticTestMocker<JavascriptAppModalDialog.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.javascript_dialogs.JavascriptAppModalDialog.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.javascript_dialogs.JavascriptAppModalDialog.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void didAcceptAppModalDialog(long nativeAppModalDialogViewAndroid,
      JavascriptAppModalDialog caller, String prompt, boolean suppress) {
    GEN_JNI.org_chromium_components_javascript_1dialogs_JavascriptAppModalDialog_didAcceptAppModalDialog(nativeAppModalDialogViewAndroid, caller, prompt, suppress);
  }

  @Override
  public void didCancelAppModalDialog(long nativeAppModalDialogViewAndroid,
      JavascriptAppModalDialog caller, boolean suppress) {
    GEN_JNI.org_chromium_components_javascript_1dialogs_JavascriptAppModalDialog_didCancelAppModalDialog(nativeAppModalDialogViewAndroid, caller, suppress);
  }

  @Override
  public JavascriptAppModalDialog getCurrentModalDialog() {
    return (JavascriptAppModalDialog)GEN_JNI.org_chromium_components_javascript_1dialogs_JavascriptAppModalDialog_getCurrentModalDialog();
  }

  public static JavascriptAppModalDialog.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.javascript_dialogs.JavascriptAppModalDialog.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JavascriptAppModalDialogJni();
  }
}
