package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class InfoBarContainerJni implements InfoBarContainer.Natives {
  private static InfoBarContainer.Natives testInstance;

  public static final JniStaticTestMocker<InfoBarContainer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.InfoBarContainer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.InfoBarContainer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(InfoBarContainer caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_infobar_InfoBarContainer_init(caller);
  }

  @Override
  public void setWebContents(long nativeInfoBarContainerAndroid, InfoBarContainer caller,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_infobar_InfoBarContainer_setWebContents(nativeInfoBarContainerAndroid, caller, webContents);
  }

  @Override
  public void destroy(long nativeInfoBarContainerAndroid, InfoBarContainer caller) {
    GEN_JNI.org_chromium_chrome_browser_infobar_InfoBarContainer_destroy(nativeInfoBarContainerAndroid, caller);
  }

  public static InfoBarContainer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.InfoBarContainer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new InfoBarContainerJni();
  }
}
