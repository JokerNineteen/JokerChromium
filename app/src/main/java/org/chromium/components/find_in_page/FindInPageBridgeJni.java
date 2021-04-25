package org.chromium.components.find_in_page;

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
final class FindInPageBridgeJni implements FindInPageBridge.Natives {
  private static FindInPageBridge.Natives testInstance;

  public static final JniStaticTestMocker<FindInPageBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.components.find_in_page.FindInPageBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.components.find_in_page.FindInPageBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(FindInPageBridge caller, WebContents webContents) {
    return (long)GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_init(caller, webContents);
  }

  @Override
  public void destroy(long nativeFindInPageBridge, FindInPageBridge caller) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_destroy(nativeFindInPageBridge, caller);
  }

  @Override
  public void startFinding(long nativeFindInPageBridge, FindInPageBridge caller,
      String searchString, boolean forwardDirection, boolean caseSensitive) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_startFinding(nativeFindInPageBridge, caller, searchString, forwardDirection, caseSensitive);
  }

  @Override
  public void stopFinding(long nativeFindInPageBridge, FindInPageBridge caller,
      boolean clearSelection) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_stopFinding(nativeFindInPageBridge, caller, clearSelection);
  }

  @Override
  public String getPreviousFindText(long nativeFindInPageBridge, FindInPageBridge caller) {
    return (String)GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_getPreviousFindText(nativeFindInPageBridge, caller);
  }

  @Override
  public void requestFindMatchRects(long nativeFindInPageBridge, FindInPageBridge caller,
      int currentVersion) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_requestFindMatchRects(nativeFindInPageBridge, caller, currentVersion);
  }

  @Override
  public void activateNearestFindResult(long nativeFindInPageBridge, FindInPageBridge caller,
      float x, float y) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_activateNearestFindResult(nativeFindInPageBridge, caller, x, y);
  }

  @Override
  public void activateFindInPageResultForAccessibility(long nativeFindInPageBridge,
      FindInPageBridge caller) {
    GEN_JNI.org_chromium_components_find_1in_1page_FindInPageBridge_activateFindInPageResultForAccessibility(nativeFindInPageBridge, caller);
  }

  public static FindInPageBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.components.find_in_page.FindInPageBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new FindInPageBridgeJni();
  }
}
