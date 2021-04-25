package org.chromium.chrome.browser.toolbar;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LocationBarModelJni implements LocationBarModel.Natives {
  private static LocationBarModel.Natives testInstance;

  public static final JniStaticTestMocker<LocationBarModel.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.toolbar.LocationBarModel.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.toolbar.LocationBarModel.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(LocationBarModel caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_toolbar_LocationBarModel_init(caller);
  }

  @Override
  public void destroy(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    GEN_JNI.org_chromium_chrome_browser_toolbar_LocationBarModel_destroy(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public String getFormattedFullURL(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_toolbar_LocationBarModel_getFormattedFullURL(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public String getURLForDisplay(long nativeLocationBarModelAndroid, LocationBarModel caller) {
    return (String)GEN_JNI.org_chromium_chrome_browser_toolbar_LocationBarModel_getURLForDisplay(nativeLocationBarModelAndroid, caller);
  }

  @Override
  public int getPageClassification(long nativeLocationBarModelAndroid, LocationBarModel caller,
      boolean isFocusedFromFakebox) {
    return (int)GEN_JNI.org_chromium_chrome_browser_toolbar_LocationBarModel_getPageClassification(nativeLocationBarModelAndroid, caller, isFocusedFromFakebox);
  }

  public static LocationBarModel.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.toolbar.LocationBarModel.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LocationBarModelJni();
  }
}
