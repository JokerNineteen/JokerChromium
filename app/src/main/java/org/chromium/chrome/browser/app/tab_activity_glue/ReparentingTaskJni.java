package org.chromium.chrome.browser.app.tab_activity_glue;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ReparentingTaskJni implements ReparentingTask.Natives {
  private static ReparentingTask.Natives testInstance;

  public static final JniStaticTestMocker<ReparentingTask.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.app.tab_activity_glue.ReparentingTask.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.app.tab_activity_glue.ReparentingTask.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void attachTab(WebContents webContents) {
    GEN_JNI.org_chromium_chrome_browser_app_tab_1activity_1glue_ReparentingTask_attachTab(webContents);
  }

  public static ReparentingTask.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.app.tab_activity_glue.ReparentingTask.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ReparentingTaskJni();
  }
}
