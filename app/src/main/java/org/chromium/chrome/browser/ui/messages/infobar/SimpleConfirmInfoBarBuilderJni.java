package org.chromium.chrome.browser.ui.messages.infobar;

import android.graphics.Bitmap;
import java.lang.Object;
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
final class SimpleConfirmInfoBarBuilderJni implements SimpleConfirmInfoBarBuilder.Natives {
  private static SimpleConfirmInfoBarBuilder.Natives testInstance;

  public static final JniStaticTestMocker<SimpleConfirmInfoBarBuilder.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void create(WebContents webContents, int infobarTypeIdentifier, Bitmap drawable,
      String message, String primaryText, String secondaryText, String linkText, boolean autoExpire,
      Object listener) {
    GEN_JNI.org_chromium_chrome_browser_ui_messages_infobar_SimpleConfirmInfoBarBuilder_create(webContents, infobarTypeIdentifier, drawable, message, primaryText, secondaryText, linkText, autoExpire, listener);
  }

  public static SimpleConfirmInfoBarBuilder.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.ui.messages.infobar.SimpleConfirmInfoBarBuilder.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new SimpleConfirmInfoBarBuilderJni();
  }
}
