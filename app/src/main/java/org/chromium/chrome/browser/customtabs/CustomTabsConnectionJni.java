package org.chromium.chrome.browser.customtabs;

import androidx.browser.customtabs.CustomTabsSessionToken;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class CustomTabsConnectionJni implements CustomTabsConnection.Natives {
  private static CustomTabsConnection.Natives testInstance;

  public static final JniStaticTestMocker<CustomTabsConnection.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void createAndStartDetachedResourceRequest(Profile profile, CustomTabsSessionToken session,
      String packageName, String url, String origin, int referrerPolicy, int motivation) {
    GEN_JNI.org_chromium_chrome_browser_customtabs_CustomTabsConnection_createAndStartDetachedResourceRequest(profile, session, packageName, url, origin, referrerPolicy, motivation);
  }

  @Override
  public void setClientDataHeader(WebContents webContents, String header) {
    GEN_JNI.org_chromium_chrome_browser_customtabs_CustomTabsConnection_setClientDataHeader(webContents, header);
  }

  public static CustomTabsConnection.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.customtabs.CustomTabsConnection.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new CustomTabsConnectionJni();
  }
}
