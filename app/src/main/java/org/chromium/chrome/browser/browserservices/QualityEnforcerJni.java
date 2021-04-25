package org.chromium.chrome.browser.browserservices;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.RenderFrameHost;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class QualityEnforcerJni implements QualityEnforcer.Natives {
  private static QualityEnforcer.Natives testInstance;

  public static final JniStaticTestMocker<QualityEnforcer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.browserservices.QualityEnforcer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.browserservices.QualityEnforcer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void reportDevtoolsIssue(RenderFrameHost renderFrameHost, int type, String url,
      int httpStatusCode) {
    GEN_JNI.org_chromium_chrome_browser_browserservices_QualityEnforcer_reportDevtoolsIssue(renderFrameHost, type, url, httpStatusCode);
  }

  public static QualityEnforcer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.browserservices.QualityEnforcer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new QualityEnforcerJni();
  }
}
