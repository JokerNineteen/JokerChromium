package org.chromium.chrome.browser.tabmodel;

import java.lang.Object;
import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.tab.Tab;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class TabModelObserverJniBridgeJni implements TabModelObserverJniBridge.Natives {
  private static TabModelObserverJniBridge.Natives testInstance;

  public static final JniStaticTestMocker<TabModelObserverJniBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void didSelectTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type, int lastId) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_didSelectTab(nativeTabModelObserverJniBridge, caller, tab, type, lastId);
  }

  @Override
  public void willCloseTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, boolean animate) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_willCloseTab(nativeTabModelObserverJniBridge, caller, tab, animate);
  }

  @Override
  public void didCloseTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      int tabId, boolean incognito) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_didCloseTab(nativeTabModelObserverJniBridge, caller, tabId, incognito);
  }

  @Override
  public void willAddTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_willAddTab(nativeTabModelObserverJniBridge, caller, tab, type);
  }

  @Override
  public void didAddTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int type) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_didAddTab(nativeTabModelObserverJniBridge, caller, tab, type);
  }

  @Override
  public void didMoveTab(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab, int newIndex, int curIndex) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_didMoveTab(nativeTabModelObserverJniBridge, caller, tab, newIndex, curIndex);
  }

  @Override
  public void tabPendingClosure(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_tabPendingClosure(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void tabClosureUndone(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_tabClosureUndone(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void tabClosureCommitted(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_tabClosureCommitted(nativeTabModelObserverJniBridge, caller, tab);
  }

  @Override
  public void allTabsPendingClosure(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller, Object[] tabs) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_allTabsPendingClosure(nativeTabModelObserverJniBridge, caller, tabs);
  }

  @Override
  public void allTabsClosureCommitted(long nativeTabModelObserverJniBridge,
      TabModelObserverJniBridge caller) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_allTabsClosureCommitted(nativeTabModelObserverJniBridge, caller);
  }

  @Override
  public void tabRemoved(long nativeTabModelObserverJniBridge, TabModelObserverJniBridge caller,
      Tab tab) {
    GEN_JNI.org_chromium_chrome_browser_tabmodel_TabModelObserverJniBridge_tabRemoved(nativeTabModelObserverJniBridge, caller, tab);
  }

  public static TabModelObserverJniBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tabmodel.TabModelObserverJniBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new TabModelObserverJniBridgeJni();
  }
}
