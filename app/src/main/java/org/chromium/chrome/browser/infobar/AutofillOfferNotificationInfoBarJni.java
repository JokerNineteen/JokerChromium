package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class AutofillOfferNotificationInfoBarJni implements AutofillOfferNotificationInfoBar.Natives {
  private static AutofillOfferNotificationInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<AutofillOfferNotificationInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.AutofillOfferNotificationInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.AutofillOfferNotificationInfoBar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onOfferDeepLinkClicked(long nativeAutofillOfferNotificationInfoBar,
      AutofillOfferNotificationInfoBar caller, GURL url) {
    GEN_JNI.org_chromium_chrome_browser_infobar_AutofillOfferNotificationInfoBar_onOfferDeepLinkClicked(nativeAutofillOfferNotificationInfoBar, caller, url);
  }

  public static AutofillOfferNotificationInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.AutofillOfferNotificationInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new AutofillOfferNotificationInfoBarJni();
  }
}
