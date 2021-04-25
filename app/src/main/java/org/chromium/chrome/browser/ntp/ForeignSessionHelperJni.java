package org.chromium.chrome.browser.ntp;

import java.lang.Override;
import java.lang.String;
import java.util.List;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ForeignSessionHelperJni implements ForeignSessionHelper.Natives {
  private static ForeignSessionHelper.Natives testInstance;

  public static final JniStaticTestMocker<ForeignSessionHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(Profile profile) {
    return (long)GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_init(profile);
  }

  @Override
  public void destroy(long nativeForeignSessionHelper) {
    GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_destroy(nativeForeignSessionHelper);
  }

  @Override
  public boolean isTabSyncEnabled(long nativeForeignSessionHelper) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_isTabSyncEnabled(nativeForeignSessionHelper);
  }

  @Override
  public void triggerSessionSync(long nativeForeignSessionHelper) {
    GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_triggerSessionSync(nativeForeignSessionHelper);
  }

  @Override
  public void setOnForeignSessionCallback(long nativeForeignSessionHelper,
      ForeignSessionHelper.ForeignSessionCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_setOnForeignSessionCallback(nativeForeignSessionHelper, callback);
  }

  @Override
  public boolean getForeignSessions(long nativeForeignSessionHelper,
      List<ForeignSessionHelper.ForeignSession> resultSessions) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_getForeignSessions(nativeForeignSessionHelper, resultSessions);
  }

  @Override
  public boolean openForeignSessionTab(long nativeForeignSessionHelper, Tab tab, String sessionTag,
      int tabId, int disposition) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_openForeignSessionTab(nativeForeignSessionHelper, tab, sessionTag, tabId, disposition);
  }

  @Override
  public void deleteForeignSession(long nativeForeignSessionHelper, String sessionTag) {
    GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_deleteForeignSession(nativeForeignSessionHelper, sessionTag);
  }

  @Override
  public void setInvalidationsForSessionsEnabled(long nativeForeignSessionHelper, boolean enabled) {
    GEN_JNI.org_chromium_chrome_browser_ntp_ForeignSessionHelper_setInvalidationsForSessionsEnabled(nativeForeignSessionHelper, enabled);
  }

  public static ForeignSessionHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ntp.ForeignSessionHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ForeignSessionHelperJni();
  }
}
