package org.chromium.chrome.browser.sync;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileSyncServiceJni implements ProfileSyncService.Natives {
  private static ProfileSyncService.Natives testInstance;

  public static final JniStaticTestMocker<ProfileSyncService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sync.ProfileSyncService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sync.ProfileSyncService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ProfileSyncService caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_init(caller);
  }

  @Override
  public void requestStart(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_requestStart(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void requestStop(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_requestStop(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setSyncAllowedByPlatform(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, boolean allowed) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setSyncAllowedByPlatform(nativeProfileSyncServiceAndroid, caller, allowed);
  }

  @Override
  public void setSyncSessionsId(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      String tag) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setSyncSessionsId(nativeProfileSyncServiceAndroid, caller, tag);
  }

  @Override
  public int getAuthError(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getAuthError(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean requiresClientUpgrade(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_requiresClientUpgrade(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setDecoupledFromAndroidMasterSync(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setDecoupledFromAndroidMasterSync(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean getDecoupledFromAndroidMasterSync(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getDecoupledFromAndroidMasterSync(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isAuthenticatedAccountPrimary(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isAuthenticatedAccountPrimary(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEngineInitialized(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isEngineInitialized(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEncryptEverythingAllowed(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isEncryptEverythingAllowed(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isEncryptEverythingEnabled(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isEncryptEverythingEnabled(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTransportStateActive(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isTransportStateActive(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isPassphraseRequiredForPreferredDataTypes(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isPassphraseRequiredForPreferredDataTypes(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTrustedVaultKeyRequired(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isTrustedVaultKeyRequired(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isTrustedVaultKeyRequiredForPreferredDataTypes(
      long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isTrustedVaultKeyRequiredForPreferredDataTypes(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isUsingSecondaryPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isUsingSecondaryPassphrase(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean setDecryptionPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, String passphrase) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setDecryptionPassphrase(nativeProfileSyncServiceAndroid, caller, passphrase);
  }

  @Override
  public void setEncryptionPassphrase(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, String passphrase) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setEncryptionPassphrase(nativeProfileSyncServiceAndroid, caller, passphrase);
  }

  @Override
  public int getPassphraseType(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getPassphraseType(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasExplicitPassphraseTime(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_hasExplicitPassphraseTime(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public long getExplicitPassphraseTime(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getExplicitPassphraseTime(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterGooglePassphraseBodyWithDateText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getSyncEnterGooglePassphraseBodyWithDateText(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterCustomPassphraseBodyWithDateText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getSyncEnterCustomPassphraseBodyWithDateText(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getCurrentSignedInAccountText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getCurrentSignedInAccountText(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public String getSyncEnterCustomPassphraseBodyText(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getSyncEnterCustomPassphraseBodyText(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int getNumberOfSyncedDevices(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (int)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getNumberOfSyncedDevices(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getActiveDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int[])GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getActiveDataTypes(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getChosenDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (int[])GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getChosenDataTypes(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public int[] getPreferredDataTypes(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (int[])GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getPreferredDataTypes(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setChosenDataTypes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean syncEverything, int[] modelTypeArray) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setChosenDataTypes(nativeProfileSyncServiceAndroid, caller, syncEverything, modelTypeArray);
  }

  @Override
  public void triggerRefresh(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_triggerRefresh(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setSetupInProgress(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean inProgress) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setSetupInProgress(nativeProfileSyncServiceAndroid, caller, inProgress);
  }

  @Override
  public void setFirstSetupComplete(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      int syncFirstSetupCompleteSource) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setFirstSetupComplete(nativeProfileSyncServiceAndroid, caller, syncFirstSetupCompleteSource);
  }

  @Override
  public boolean isFirstSetupComplete(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isFirstSetupComplete(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncRequested(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isSyncRequested(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean canSyncFeatureStart(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_canSyncFeatureStart(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncActive(long nativeProfileSyncServiceAndroid, ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isSyncActive(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isSyncDisabledByEnterprisePolicy(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isSyncDisabledByEnterprisePolicy(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasKeepEverythingSynced(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_hasKeepEverythingSynced(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean hasUnrecoverableError(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_hasUnrecoverableError(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public boolean isPassphrasePrompted(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_isPassphrasePrompted(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void setPassphrasePrompted(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      boolean prompted) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_setPassphrasePrompted(nativeProfileSyncServiceAndroid, caller, prompted);
  }

  @Override
  public long getProfileSyncServiceForTest(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getProfileSyncServiceForTest(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public long getLastSyncedTimeForTest(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getLastSyncedTimeForTest(nativeProfileSyncServiceAndroid, caller);
  }

  @Override
  public void getAllNodes(long nativeProfileSyncServiceAndroid, ProfileSyncService caller,
      ProfileSyncService.GetAllNodesCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_getAllNodes(nativeProfileSyncServiceAndroid, caller, callback);
  }

  @Override
  public void recordKeyRetrievalTrigger(long nativeProfileSyncServiceAndroid,
      ProfileSyncService caller, int keyRetrievalTrigger) {
    GEN_JNI.org_chromium_chrome_browser_sync_ProfileSyncService_recordKeyRetrievalTrigger(nativeProfileSyncServiceAndroid, caller, keyRetrievalTrigger);
  }

  public static ProfileSyncService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.ProfileSyncService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileSyncServiceJni();
  }
}
