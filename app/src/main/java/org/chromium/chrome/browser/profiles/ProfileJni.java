package org.chromium.chrome.browser.profiles;

import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class ProfileJni implements Profile.Natives {
  private static Profile.Natives testInstance;

  public static final JniStaticTestMocker<Profile.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.profiles.Profile.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.profiles.Profile.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public Object getLastUsedRegularProfile() {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getLastUsedRegularProfile();
  }

  @Override
  public Object fromWebContents(WebContents webContents) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_fromWebContents(webContents);
  }

  @Override
  public void destroyWhenAppropriate(long nativeProfileAndroid, Profile caller) {
    GEN_JNI.org_chromium_chrome_browser_profiles_Profile_destroyWhenAppropriate(nativeProfileAndroid, caller);
  }

  @Override
  public Object getOriginalProfile(long nativeProfileAndroid, Profile caller) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getOriginalProfile(nativeProfileAndroid, caller);
  }

  @Override
  public Object getOffTheRecordProfile(long nativeProfileAndroid, Profile caller,
      OTRProfileID otrProfileID) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getOffTheRecordProfile(nativeProfileAndroid, caller, otrProfileID);
  }

  @Override
  public Object getPrimaryOTRProfile(long nativeProfileAndroid, Profile caller) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getPrimaryOTRProfile(nativeProfileAndroid, caller);
  }

  @Override
  public boolean hasOffTheRecordProfile(long nativeProfileAndroid, Profile caller,
      OTRProfileID otrProfileID) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_hasOffTheRecordProfile(nativeProfileAndroid, caller, otrProfileID);
  }

  @Override
  public boolean hasPrimaryOTRProfile(long nativeProfileAndroid, Profile caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_hasPrimaryOTRProfile(nativeProfileAndroid, caller);
  }

  @Override
  public boolean isOffTheRecord(long nativeProfileAndroid, Profile caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_isOffTheRecord(nativeProfileAndroid, caller);
  }

  @Override
  public boolean isPrimaryOTRProfile(long nativeProfileAndroid, Profile caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_isPrimaryOTRProfile(nativeProfileAndroid, caller);
  }

  @Override
  public boolean isChild(long nativeProfileAndroid, Profile caller) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_isChild(nativeProfileAndroid, caller);
  }

  @Override
  public void wipe(long nativeProfileAndroid, Profile caller) {
    GEN_JNI.org_chromium_chrome_browser_profiles_Profile_wipe(nativeProfileAndroid, caller);
  }

  @Override
  public Object getProfileKey(long nativeProfileAndroid, Profile caller) {
    return (Object)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getProfileKey(nativeProfileAndroid, caller);
  }

  @Override
  public long getBrowserContextPointer(long nativeProfileAndroid) {
    return (long)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getBrowserContextPointer(nativeProfileAndroid);
  }

  @Override
  public OTRProfileID getOTRProfileID(long nativeProfileAndroid, Profile caller) {
    return (OTRProfileID)GEN_JNI.org_chromium_chrome_browser_profiles_Profile_getOTRProfileID(nativeProfileAndroid, caller);
  }

  public static Profile.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.profiles.Profile.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ProfileJni();
  }
}
