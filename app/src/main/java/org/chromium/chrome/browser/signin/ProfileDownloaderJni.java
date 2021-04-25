package org.chromium.chrome.browser.signin;

import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileDownloaderJni implements ProfileDownloader.Natives {
  private static ProfileDownloader.Natives testInstance;

  public static final JniStaticTestMocker<ProfileDownloader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.signin.ProfileDownloader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.signin.ProfileDownloader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void startFetchingAccountInfoFor(Profile profile, String accountId, int imageSidePixels,
      boolean isPreSignin) {
    GEN_JNI.org_chromium_chrome_browser_signin_ProfileDownloader_startFetchingAccountInfoFor(profile, accountId, imageSidePixels, isPreSignin);
  }

  @Override
  public String getCachedFullNameForPrimaryAccount(Profile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_signin_ProfileDownloader_getCachedFullNameForPrimaryAccount(profile);
  }

  @Override
  public String getCachedGivenNameForPrimaryAccount(Profile profile) {
    return (String)GEN_JNI.org_chromium_chrome_browser_signin_ProfileDownloader_getCachedGivenNameForPrimaryAccount(profile);
  }

  @Override
  public Bitmap getCachedAvatarForPrimaryAccount(Profile profile) {
    return (Bitmap)GEN_JNI.org_chromium_chrome_browser_signin_ProfileDownloader_getCachedAvatarForPrimaryAccount(profile);
  }

  public static ProfileDownloader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.signin.ProfileDownloader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileDownloaderJni();
  }
}
