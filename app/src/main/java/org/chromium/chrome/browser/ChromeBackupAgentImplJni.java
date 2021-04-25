package org.chromium.chrome.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ChromeBackupAgentImplJni implements ChromeBackupAgentImpl.Natives {
  private static ChromeBackupAgentImpl.Natives testInstance;

  public static final JniStaticTestMocker<ChromeBackupAgentImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ChromeBackupAgentImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ChromeBackupAgentImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String[] getBoolBackupNames(ChromeBackupAgentImpl caller) {
    return (String[])GEN_JNI.org_chromium_chrome_browser_ChromeBackupAgentImpl_getBoolBackupNames(caller);
  }

  @Override
  public boolean[] getBoolBackupValues(ChromeBackupAgentImpl caller) {
    return (boolean[])GEN_JNI.org_chromium_chrome_browser_ChromeBackupAgentImpl_getBoolBackupValues(caller);
  }

  @Override
  public void setBoolBackupPrefs(ChromeBackupAgentImpl caller, String[] name, boolean[] value) {
    GEN_JNI.org_chromium_chrome_browser_ChromeBackupAgentImpl_setBoolBackupPrefs(caller, name, value);
  }

  public static ChromeBackupAgentImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ChromeBackupAgentImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ChromeBackupAgentImplJni();
  }
}
