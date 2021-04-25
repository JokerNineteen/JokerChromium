package org.chromium.chrome.browser.infobar;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class ReaderModeInfoBarJni implements ReaderModeInfoBar.Natives {
  private static ReaderModeInfoBar.Natives testInstance;

  public static final JniStaticTestMocker<ReaderModeInfoBar.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.infobar.ReaderModeInfoBar.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.infobar.ReaderModeInfoBar.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_infobar_ReaderModeInfoBar_create(tab);
  }

  @Override
  public Tab getTab(long nativeReaderModeInfoBar, ReaderModeInfoBar caller) {
    return (Tab)GEN_JNI.org_chromium_chrome_browser_infobar_ReaderModeInfoBar_getTab(nativeReaderModeInfoBar, caller);
  }

  public static ReaderModeInfoBar.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.infobar.ReaderModeInfoBar.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ReaderModeInfoBarJni();
  }
}
