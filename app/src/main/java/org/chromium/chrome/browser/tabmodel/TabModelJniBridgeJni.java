package org.chromium.chrome.browser.tabmodel;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabModelJniBridgeJni implements TabModelJniBridge.Natives {
  private static TabModelJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<TabModelJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(TabModelJniBridge caller, Profile profile, boolean isTabbedActivity) {
    return (long)GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelJniBridge_init(caller, profile, isTabbedActivity);
  }

  @Override
  public Profile getProfileAndroid(long nativeTabModelJniBridge, TabModelJniBridge caller) {
    return (Profile)GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelJniBridge_getProfileAndroid(nativeTabModelJniBridge, caller);
  }

  @Override
  public void broadcastSessionRestoreComplete(long nativeTabModelJniBridge,
      TabModelJniBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelJniBridge_broadcastSessionRestoreComplete(nativeTabModelJniBridge, caller);
  }

  @Override
  public void destroy(long nativeTabModelJniBridge, TabModelJniBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelJniBridge_destroy(nativeTabModelJniBridge, caller);
  }

  @Override
  public void tabAddedToModel(long nativeTabModelJniBridge, TabModelJniBridge caller, Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelJniBridge_tabAddedToModel(nativeTabModelJniBridge, caller, tab);
  }

  public static TabModelJniBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tabmodel.TabModelJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabModelJniBridgeJni();
  }
}
