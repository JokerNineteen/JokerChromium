package org.chromium.chrome.browser.feedback;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SystemInfoFeedbackSourceJni implements SystemInfoFeedbackSource.Natives {
  private static SystemInfoFeedbackSource.Natives testInstance;

  public static final JniStaticTestMocker<SystemInfoFeedbackSource.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getCpuArchitecture() {
    return (String)GEN_JNI.org_chromium_chrome_browser_feedback_SystemInfoFeedbackSource_getCpuArchitecture();
  }

  @Override
  public String getGpuVendor() {
    return (String)GEN_JNI.org_chromium_chrome_browser_feedback_SystemInfoFeedbackSource_getGpuVendor();
  }

  @Override
  public String getGpuModel() {
    return (String)GEN_JNI.org_chromium_chrome_browser_feedback_SystemInfoFeedbackSource_getGpuModel();
  }

  @Override
  public int getAvailableMemoryMB() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feedback_SystemInfoFeedbackSource_getAvailableMemoryMB();
  }

  @Override
  public int getTotalMemoryMB() {
    return (int)GEN_JNI.org_chromium_chrome_browser_feedback_SystemInfoFeedbackSource_getTotalMemoryMB();
  }

  public static SystemInfoFeedbackSource.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.feedback.SystemInfoFeedbackSource.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SystemInfoFeedbackSourceJni();
  }
}
