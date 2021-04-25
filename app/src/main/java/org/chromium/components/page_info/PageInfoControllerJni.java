package org.chromium.components.page_info;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PageInfoControllerJni implements PageInfoController.Natives {
  private static PageInfoController.Natives testInstance;

  public static final JniStaticTestMocker<PageInfoController.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.page_info.PageInfoController.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.page_info.PageInfoController.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PageInfoController controller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_page_1info_PageInfoController_init(controller, webContents);
  }

  @Override
  public void destroy(long nativePageInfoControllerAndroid, PageInfoController caller) {
    GEN_JNI.org_chromium_components_page_1info_PageInfoController_destroy(nativePageInfoControllerAndroid, caller);
  }

  @Override
  public void recordPageInfoAction(long nativePageInfoControllerAndroid, PageInfoController caller,
      int action) {
    GEN_JNI.org_chromium_components_page_1info_PageInfoController_recordPageInfoAction(nativePageInfoControllerAndroid, caller, action);
  }

  @Override
  public void updatePermissions(long nativePageInfoControllerAndroid, PageInfoController caller) {
    GEN_JNI.org_chromium_components_page_1info_PageInfoController_updatePermissions(nativePageInfoControllerAndroid, caller);
  }

  public static PageInfoController.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.page_info.PageInfoController.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PageInfoControllerJni();
  }
}
