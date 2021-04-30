package org.chromium.components.messages;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class MessageWrapperJni implements MessageWrapper.Natives {
  private static MessageWrapper.Natives testInstance;

  public static final JniStaticTestMocker<MessageWrapper.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.messages.MessageWrapper.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.messages.MessageWrapper.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void handleActionClick(long nativeMessageWrapper) {
    GEN_JNI.org_chromium_components_messages_MessageWrapper_handleActionClick(nativeMessageWrapper);
  }

  @Override
  public void handleSecondaryActionClick(long nativeMessageWrapper) {
    GEN_JNI.org_chromium_components_messages_MessageWrapper_handleSecondaryActionClick(nativeMessageWrapper);
  }

  @Override
  public void handleDismissCallback(long nativeMessageWrapper, int dismissReason) {
    GEN_JNI.org_chromium_components_messages_MessageWrapper_handleDismissCallback(nativeMessageWrapper, dismissReason);
  }

  public static MessageWrapper.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.messages.MessageWrapper.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new MessageWrapperJni();
  }
}
