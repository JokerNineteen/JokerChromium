package org.chromium.components.signin;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.CoreAccountId;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChildAccountInfoFetcherJni implements ChildAccountInfoFetcher.Natives {
  private static ChildAccountInfoFetcher.Natives testInstance;

  public static final JniStaticTestMocker<ChildAccountInfoFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.ChildAccountInfoFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.ChildAccountInfoFetcher.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setIsChildAccount(long accountFetcherServicePtr, CoreAccountId accountId,
      boolean isChildAccount) {
    GEN_JNI.org_chromium_components_signin_ChildAccountInfoFetcher_setIsChildAccount(accountFetcherServicePtr, accountId, isChildAccount);
  }

  public static ChildAccountInfoFetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.ChildAccountInfoFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChildAccountInfoFetcherJni();
  }
}
