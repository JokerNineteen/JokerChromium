package org.chromium.services.data_decoder;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class JsonSanitizerJni implements JsonSanitizer.Natives {
  private static JsonSanitizer.Natives testInstance;

  public static final JniStaticTestMocker<JsonSanitizer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.services.data_decoder.JsonSanitizer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.services.data_decoder.JsonSanitizer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onSuccess(long id, String json) {
    GEN_JNI.org_chromium_services_data_1decoder_JsonSanitizer_onSuccess(id, json);
  }

  @Override
  public void onError(long id, String error) {
    GEN_JNI.org_chromium_services_data_1decoder_JsonSanitizer_onError(id, error);
  }

  public static JsonSanitizer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.services.data_decoder.JsonSanitizer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new JsonSanitizerJni();
  }
}
