package org.chromium.chrome.browser.dom_distiller;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.components.navigation_interception.InterceptNavigationDelegate;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DomDistillerTabUtilsJni implements DomDistillerTabUtils.Natives {
  private static DomDistillerTabUtils.Natives testInstance;

  public static final JniStaticTestMocker<DomDistillerTabUtils.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void distillCurrentPageAndView(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_distillCurrentPageAndView(webContents);
  }

  @Override
  public void distillCurrentPage(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_distillCurrentPage(webContents);
  }

  @Override
  public void distillAndView(WebContents sourceWebContents, WebContents destinationWebContents) {
    GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_distillAndView(sourceWebContents, destinationWebContents);
  }

  @Override
  public String getFormattedUrlFromOriginalDistillerUrl(GURL url) {
    return (String)GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_getFormattedUrlFromOriginalDistillerUrl(url);
  }

  @Override
  public int getDistillerHeuristics() {
    return (int)GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_getDistillerHeuristics();
  }

  @Override
  public void setInterceptNavigationDelegate(InterceptNavigationDelegate delegate,
      WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_dom_1distiller_DomDistillerTabUtils_setInterceptNavigationDelegate(delegate, webContents);
  }

  public static DomDistillerTabUtils.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.dom_distiller.DomDistillerTabUtils.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DomDistillerTabUtilsJni();
  }
}
