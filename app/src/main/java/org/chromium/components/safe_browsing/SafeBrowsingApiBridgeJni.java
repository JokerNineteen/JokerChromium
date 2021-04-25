package org.chromium.components.safe_browsing;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SafeBrowsingApiBridgeJni implements SafeBrowsingApiBridge.Natives {
  private static SafeBrowsingApiBridge.Natives testInstance;

  public static final JniStaticTestMocker<SafeBrowsingApiBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onUrlCheckDone(long callbackId, int resultStatus, String metadata, long checkDelta) {
    GEN_JNI.org_chromium_components_safe_1browsing_SafeBrowsingApiBridge_onUrlCheckDone(callbackId, resultStatus, metadata, checkDelta);
  }

  public static SafeBrowsingApiBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.safe_browsing.SafeBrowsingApiBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SafeBrowsingApiBridgeJni();
  }
}
