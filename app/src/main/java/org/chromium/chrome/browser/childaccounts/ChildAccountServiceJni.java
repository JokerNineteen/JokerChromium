package org.chromium.chrome.browser.childaccounts;

import java.lang.Boolean;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChildAccountServiceJni implements ChildAccountService.Natives {
  private static ChildAccountService.Natives testInstance;

  public static final JniStaticTestMocker<ChildAccountService.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.childaccounts.ChildAccountService.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.childaccounts.ChildAccountService.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void listenForChildStatusReceived(Callback<Boolean> callback) {
    GEN_JNI.org_chromium_chrome_browser_childaccounts_ChildAccountService_listenForChildStatusReceived(callback);
  }

  @Override
  public void onReauthenticationResult(long callbackPtr, boolean reauthSuccessful) {
    GEN_JNI.org_chromium_chrome_browser_childaccounts_ChildAccountService_onReauthenticationResult(callbackPtr, reauthSuccessful);
  }

  public static ChildAccountService.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.childaccounts.ChildAccountService.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChildAccountServiceJni();
  }
}