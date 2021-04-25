package org.chromium.chrome.browser.tab;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabWebContentsDelegateAndroidImplJni implements TabWebContentsDelegateAndroidImpl.Natives {
  private static TabWebContentsDelegateAndroidImpl.Natives testInstance;

  public static final JniStaticTestMocker<TabWebContentsDelegateAndroidImpl.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroidImpl.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroidImpl.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onRendererUnresponsive(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabWebContentsDelegateAndroidImpl_onRendererUnresponsive(webContents);
  }

  @Override
  public void onRendererResponsive(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabWebContentsDelegateAndroidImpl_onRendererResponsive(webContents);
  }

  @Override
  public void showFramebustBlockInfoBar(WebContents webContents, String url) {
    GEN_JNI.org_chromium_chrome_browser_tab_TabWebContentsDelegateAndroidImpl_showFramebustBlockInfoBar(webContents, url);
  }

  public static TabWebContentsDelegateAndroidImpl.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.TabWebContentsDelegateAndroidImpl.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabWebContentsDelegateAndroidImplJni();
  }
}
