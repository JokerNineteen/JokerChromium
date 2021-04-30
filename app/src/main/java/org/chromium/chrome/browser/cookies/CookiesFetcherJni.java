package org.chromium.chrome.browser.cookies;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CookiesFetcherJni implements CookiesFetcher.Natives {
  private static CookiesFetcher.Natives testInstance;

  public static final JniStaticTestMocker<CookiesFetcher.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.cookies.CookiesFetcher.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.cookies.CookiesFetcher.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void persistCookies() {
    GEN_JNI.org_chromium_chrome_browser_cookies_CookiesFetcher_persistCookies();
  }

  @Override
  public void restoreCookies(String name, String value, String domain, String path, long creation,
      long expiration, long lastAccess, boolean secure, boolean httpOnly, int sameSite,
      int priority, boolean sameParty, int sourceScheme, int sourcePort) {
    GEN_JNI.org_chromium_chrome_browser_cookies_CookiesFetcher_restoreCookies(name, value, domain, path, creation, expiration, lastAccess, secure, httpOnly, sameSite, priority, sameParty, sourceScheme, sourcePort);
  }

  public static CookiesFetcher.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.cookies.CookiesFetcher.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CookiesFetcherJni();
  }
}
