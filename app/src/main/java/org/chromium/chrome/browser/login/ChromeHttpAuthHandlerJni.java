package org.chromium.chrome.browser.login;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeHttpAuthHandlerJni implements ChromeHttpAuthHandler.Natives {
  private static ChromeHttpAuthHandler.Natives testInstance;

  public static final JniStaticTestMocker<ChromeHttpAuthHandler.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setAuth(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller,
      String username, String password) {
    GEN_JNI.org_chromium_chrome_browser_login_ChromeHttpAuthHandler_setAuth(nativeChromeHttpAuthHandler, caller, username, password);
  }

  @Override
  public void cancelAuth(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller) {
    GEN_JNI.org_chromium_chrome_browser_login_ChromeHttpAuthHandler_cancelAuth(nativeChromeHttpAuthHandler, caller);
  }

  @Override
  public String getMessageBody(long nativeChromeHttpAuthHandler, ChromeHttpAuthHandler caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_login_ChromeHttpAuthHandler_getMessageBody(nativeChromeHttpAuthHandler, caller);
  }

  public static ChromeHttpAuthHandler.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.login.ChromeHttpAuthHandler.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeHttpAuthHandlerJni();
  }
}
