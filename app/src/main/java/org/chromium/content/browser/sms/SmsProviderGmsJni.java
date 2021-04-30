package org.chromium.content.browser.sms;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class SmsProviderGmsJni implements SmsProviderGms.Natives {
  private static SmsProviderGms.Natives testInstance;

  public static final JniStaticTestMocker<SmsProviderGms.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.content.browser.sms.SmsProviderGms.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.content.browser.sms.SmsProviderGms.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void onReceive(long nativeSmsProviderGms, String sms, int backend) {
    GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onReceive(nativeSmsProviderGms, sms, backend);
  }

  @Override
  public void onTimeout(long nativeSmsProviderGms) {
    GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onTimeout(nativeSmsProviderGms);
  }

  @Override
  public void onCancel(long nativeSmsProviderGms) {
    GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onCancel(nativeSmsProviderGms);
  }

  @Override
  public void onNotAvailable(long nativeSmsProviderGms) {
    GEN_JNI.org_chromium_content_browser_sms_SmsProviderGms_onNotAvailable(nativeSmsProviderGms);
  }

  public static SmsProviderGms.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.content.browser.sms.SmsProviderGms.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SmsProviderGmsJni();
  }
}
