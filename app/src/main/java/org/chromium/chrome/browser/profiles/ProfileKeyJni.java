package org.chromium.chrome.browser.profiles;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ProfileKeyJni implements ProfileKey.Natives {
  private static ProfileKey.Natives testInstance;

  public static final JniStaticTestMocker<ProfileKey.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.ProfileKey.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.profiles.ProfileKey.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public ProfileKey getLastUsedRegularProfileKey() {
    return (ProfileKey)GEN_JNI.org_chromium_chrome_browser_profiles_ProfileKey_getLastUsedRegularProfileKey();
  }

  @Override
  public ProfileKey getOriginalKey(long nativeProfileKeyAndroid) {
    return (ProfileKey)GEN_JNI.org_chromium_chrome_browser_profiles_ProfileKey_getOriginalKey(nativeProfileKeyAndroid);
  }

  @Override
  public boolean isOffTheRecord(long nativeProfileKeyAndroid) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_ProfileKey_isOffTheRecord(nativeProfileKeyAndroid);
  }

  public static ProfileKey.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.ProfileKey.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileKeyJni();
  }
}
