package org.chromium.chrome.browser;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SearchGeolocationDisclosureTabHelperJni implements SearchGeolocationDisclosureTabHelper.Natives {
  private static SearchGeolocationDisclosureTabHelper.Natives testInstance;

  public static final JniStaticTestMocker<SearchGeolocationDisclosureTabHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void setIgnoreUrlChecksForTesting() {
    GEN_JNI.org_chromium_chrome_browser_SearchGeolocationDisclosureTabHelper_setIgnoreUrlChecksForTesting();
  }

  @Override
  public void setDayOffsetForTesting(int days) {
    GEN_JNI.org_chromium_chrome_browser_SearchGeolocationDisclosureTabHelper_setDayOffsetForTesting(days);
  }

  public static SearchGeolocationDisclosureTabHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.SearchGeolocationDisclosureTabHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SearchGeolocationDisclosureTabHelperJni();
  }
}
