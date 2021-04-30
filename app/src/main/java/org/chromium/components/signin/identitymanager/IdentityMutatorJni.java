package org.chromium.components.signin.identitymanager;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.CoreAccountId;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class IdentityMutatorJni implements IdentityMutator.Natives {
  private static IdentityMutator.Natives testInstance;

  public static final JniStaticTestMocker<IdentityMutator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.IdentityMutator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.IdentityMutator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean setPrimaryAccount(long nativeJniIdentityMutator, CoreAccountId accountId,
      int consentLevel) {
    return (boolean)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityMutator_setPrimaryAccount(nativeJniIdentityMutator, accountId, consentLevel);
  }

  @Override
  public boolean clearPrimaryAccount(long nativeJniIdentityMutator, int sourceMetric,
      int deleteMetric) {
    return (boolean)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityMutator_clearPrimaryAccount(nativeJniIdentityMutator, sourceMetric, deleteMetric);
  }

  @Override
  public void reloadAllAccountsFromSystemWithPrimaryAccount(long nativeJniIdentityMutator,
      CoreAccountId accountId) {
    GEN_JNI.org_chromium_components_signin_identitymanager_IdentityMutator_reloadAllAccountsFromSystemWithPrimaryAccount(nativeJniIdentityMutator, accountId);
  }

  public static IdentityMutator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.IdentityMutator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IdentityMutatorJni();
  }
}
