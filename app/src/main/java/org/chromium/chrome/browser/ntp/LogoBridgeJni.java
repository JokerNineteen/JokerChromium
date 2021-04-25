package org.chromium.chrome.browser.ntp;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LogoBridgeJni implements LogoBridge.Natives {
  private static LogoBridge.Natives testInstance;

  public static final JniStaticTestMocker<LogoBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.LogoBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.ntp.LogoBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(LogoBridge caller, Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_ntp_LogoBridge_init(caller, profile);
  }

  @Override
  public void getCurrentLogo(long nativeLogoBridge, LogoBridge caller,
      LogoBridge.LogoObserver logoObserver) {
    GEN_JNI.org_chromium_chrome_browser_ntp_LogoBridge_getCurrentLogo(nativeLogoBridge, caller, logoObserver);
  }

  @Override
  public void destroy(long nativeLogoBridge, LogoBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_ntp_LogoBridge_destroy(nativeLogoBridge, caller);
  }

  public static LogoBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.LogoBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LogoBridgeJni();
  }
}
