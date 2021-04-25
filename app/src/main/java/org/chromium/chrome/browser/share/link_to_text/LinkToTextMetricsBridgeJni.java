package org.chromium.chrome.browser.share.link_to_text;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class LinkToTextMetricsBridgeJni implements LinkToTextMetricsBridge.Natives {
  private static LinkToTextMetricsBridge.Natives testInstance;

  public static final JniStaticTestMocker<LinkToTextMetricsBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.share.link_to_text.LinkToTextMetricsBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.share.link_to_text.LinkToTextMetricsBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void logGenerateErrorTabHidden() {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextMetricsBridge_logGenerateErrorTabHidden();
  }

  @Override
  public void logGenerateErrorOmniboxNavigation() {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextMetricsBridge_logGenerateErrorOmniboxNavigation();
  }

  @Override
  public void logGenerateErrorTabCrash() {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextMetricsBridge_logGenerateErrorTabCrash();
  }

  @Override
  public void logGenerateErrorIFrame() {
    GEN_JNI.org_chromium_chrome_browser_share_link_1to_1text_LinkToTextMetricsBridge_logGenerateErrorIFrame();
  }

  public static LinkToTextMetricsBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.share.link_to_text.LinkToTextMetricsBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new LinkToTextMetricsBridgeJni();
  }
}
