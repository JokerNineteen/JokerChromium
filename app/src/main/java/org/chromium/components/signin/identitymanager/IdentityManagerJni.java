package org.chromium.components.signin.identitymanager;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.signin.base.AccountInfo;
import org.chromium.components.signin.base.CoreAccountInfo;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class IdentityManagerJni implements IdentityManager.Natives {
  private static IdentityManager.Natives testInstance;

  public static final JniStaticTestMocker<IdentityManager.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.signin.identitymanager.IdentityManager.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.signin.identitymanager.IdentityManager.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public CoreAccountInfo getPrimaryAccountInfo(long nativeIdentityManager, int consentLevel) {
    return (CoreAccountInfo)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_getPrimaryAccountInfo(nativeIdentityManager, consentLevel);
  }

  @Override
  public AccountInfo findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(
      long nativeIdentityManager, String email) {
    return (AccountInfo)GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_findExtendedAccountInfoForAccountWithRefreshTokenByEmailAddress(nativeIdentityManager, email);
  }

  @Override
  public CoreAccountInfo[] getAccountsWithRefreshTokens(long nativeIdentityManager) {
    return (CoreAccountInfo[])GEN_JNI.org_chromium_components_signin_identitymanager_IdentityManager_getAccountsWithRefreshTokens(nativeIdentityManager);
  }

  public static IdentityManager.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.signin.identitymanager.IdentityManager.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IdentityManagerJni();
  }
}
