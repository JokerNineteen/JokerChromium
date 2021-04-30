package org.chromium.chrome.browser.signin.services;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class UnifiedConsentServiceBridgeJni implements UnifiedConsentServiceBridge.Natives {
  private static UnifiedConsentServiceBridge.Natives testInstance;

  public static final JniStaticTestMocker<UnifiedConsentServiceBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.services.UnifiedConsentServiceBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.services.UnifiedConsentServiceBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public boolean isUrlKeyedAnonymizedDataCollectionEnabled(Profile profile) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_signin_services_UnifiedConsentServiceBridge_isUrlKeyedAnonymizedDataCollectionEnabled(profile);
  }

  @Override
  public void setUrlKeyedAnonymizedDataCollectionEnabled(Profile profile, boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_signin_services_UnifiedConsentServiceBridge_setUrlKeyedAnonymizedDataCollectionEnabled(profile, enabled);
  }

  @Override
  public boolean isUrlKeyedAnonymizedDataCollectionManaged(Profile profile) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_signin_services_UnifiedConsentServiceBridge_isUrlKeyedAnonymizedDataCollectionManaged(profile);
  }

  @Override
  public void recordSyncSetupDataTypesHistogram(Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_signin_services_UnifiedConsentServiceBridge_recordSyncSetupDataTypesHistogram(profile);
  }

  public static UnifiedConsentServiceBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.services.UnifiedConsentServiceBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new UnifiedConsentServiceBridgeJni();
  }
}
