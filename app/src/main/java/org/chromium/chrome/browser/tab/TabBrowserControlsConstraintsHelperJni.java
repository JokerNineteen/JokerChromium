package org.chromium.chrome.browser.tab;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabBrowserControlsConstraintsHelperJni implements TabBrowserControlsConstraintsHelper.Natives {
  private static TabBrowserControlsConstraintsHelper.Natives testInstance;

  public static final JniStaticTestMocker<TabBrowserControlsConstraintsHelper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabBrowserControlsConstraintsHelper caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_tab_TabBrowserControlsConstraintsHelper_init(caller);
  }

  @Override
  public void onDestroyed(long nativeTabBrowserControlsConstraintsHelper,
      TabBrowserControlsConstraintsHelper caller) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabBrowserControlsConstraintsHelper_onDestroyed(nativeTabBrowserControlsConstraintsHelper, caller);
  }

  @Override
  public void updateState(long nativeTabBrowserControlsConstraintsHelper,
      TabBrowserControlsConstraintsHelper caller, WebContents webContents, int contraints,
      int current, boolean animate) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabBrowserControlsConstraintsHelper_updateState(nativeTabBrowserControlsConstraintsHelper, caller, webContents, contraints, current, animate);
  }

  public static TabBrowserControlsConstraintsHelper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabBrowserControlsConstraintsHelper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabBrowserControlsConstraintsHelperJni();
  }
}
