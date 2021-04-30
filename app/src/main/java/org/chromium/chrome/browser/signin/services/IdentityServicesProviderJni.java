package org.chromium.chrome.browser.signin.services;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.components.signin.AccountTrackerService;
import org.chromium.components.signin.identitymanager.IdentityManager;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class IdentityServicesProviderJni implements IdentityServicesProvider.Natives {
  private static IdentityServicesProvider.Natives testInstance;

  public static final JniStaticTestMocker<IdentityServicesProvider.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.services.IdentityServicesProvider.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.services.IdentityServicesProvider.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public IdentityManager getIdentityManager(Profile profile) {
    return (IdentityManager)GEN_JNI.org_chromium_chrome_browser_signin_services_IdentityServicesProvider_getIdentityManager(profile);
  }

  @Override
  public AccountTrackerService getAccountTrackerService(Profile profile) {
    return (AccountTrackerService)GEN_JNI.org_chromium_chrome_browser_signin_services_IdentityServicesProvider_getAccountTrackerService(profile);
  }

  @Override
  public SigninManager getSigninManager(Profile profile) {
    return (SigninManager)GEN_JNI.org_chromium_chrome_browser_signin_services_IdentityServicesProvider_getSigninManager(profile);
  }

  public static IdentityServicesProvider.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.services.IdentityServicesProvider.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new IdentityServicesProviderJni();
  }
}
