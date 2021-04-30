package org.chromium.chrome.browser.performance_hints;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class PerformanceHintsObserverJni implements PerformanceHintsObserver.Natives {
  private static PerformanceHintsObserver.Natives testInstance;

  public static final JniStaticTestMocker<PerformanceHintsObserver.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.performance_hints.PerformanceHintsObserver.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.performance_hints.PerformanceHintsObserver.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public int getPerformanceClassForURL(WebContents webContents, GURL url) {
    return (int)GEN_JNI.org_chromium_chrome_browser_performance_1hints_PerformanceHintsObserver_getPerformanceClassForURL(webContents, url);
  }

  @Override
  public boolean isContextMenuPerformanceInfoEnabled() {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_performance_1hints_PerformanceHintsObserver_isContextMenuPerformanceInfoEnabled();
  }

  public static PerformanceHintsObserver.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.performance_hints.PerformanceHintsObserver.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PerformanceHintsObserverJni();
  }
}
