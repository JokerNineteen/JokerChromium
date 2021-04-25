package org.chromium.chrome.browser.omnibox;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class OmniboxPrerenderJni implements OmniboxPrerender.Natives {
  private static OmniboxPrerender.Natives testInstance;

  public static final JniStaticTestMocker<OmniboxPrerender.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.omnibox.OmniboxPrerender.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.omnibox.OmniboxPrerender.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(OmniboxPrerender caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_omnibox_OmniboxPrerender_init(caller);
  }

  @Override
  public void clear(long nativeOmniboxPrerender, OmniboxPrerender caller, Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_OmniboxPrerender_clear(nativeOmniboxPrerender, caller, profile);
  }

  @Override
  public void initializeForProfile(long nativeOmniboxPrerender, OmniboxPrerender caller,
      Profile profile) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_OmniboxPrerender_initializeForProfile(nativeOmniboxPrerender, caller, profile);
  }

  @Override
  public void prerenderMaybe(long nativeOmniboxPrerender, OmniboxPrerender caller, String url,
      String currentUrl, long nativeAutocompleteResult, Profile profile, Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_omnibox_OmniboxPrerender_prerenderMaybe(nativeOmniboxPrerender, caller, url, currentUrl, nativeAutocompleteResult, profile, tab);
  }

  public static OmniboxPrerender.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.omnibox.OmniboxPrerender.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new OmniboxPrerenderJni();
  }
}
