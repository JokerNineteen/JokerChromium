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
final class TrustedVaultClientJni implements TrustedVaultClient.Natives {
  private static TrustedVaultClient.Natives testInstance;

  public static final JniStaticTestMocker<TrustedVaultClient.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.sync.TrustedVaultClient.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.sync.TrustedVaultClient.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void fetchKeysCompleted(long nativeTrustedVaultClientAndroid, String gaiaId,
      byte[][] keys) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_fetchKeysCompleted(nativeTrustedVaultClientAndroid, gaiaId, keys);
  }

  @Override
  public void markKeysAsStaleCompleted(long nativeTrustedVaultClientAndroid, boolean result) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_markKeysAsStaleCompleted(nativeTrustedVaultClientAndroid, result);
  }

  @Override
  public void notifyKeysChanged(long nativeTrustedVaultClientAndroid) {
    GEN_JNI.org_chromium_chrome_browser_sync_TrustedVaultClient_notifyKeysChanged(nativeTrustedVaultClientAndroid);
  }

  public static TrustedVaultClient.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.sync.TrustedVaultClient.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TrustedVaultClientJni();
  }
}
