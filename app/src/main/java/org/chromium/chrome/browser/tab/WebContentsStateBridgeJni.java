package org.chromium.chrome.browser.tab;

import java.lang.Override;
import java.lang.String;
import java.nio.ByteBuffer;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.Origin;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
public final class WebContentsStateBridgeJni implements WebContentsStateBridge.Natives {
  private static WebContentsStateBridge.Natives testInstance;

  public static final JniStaticTestMocker<WebContentsStateBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.tab.WebContentsStateBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.tab.WebContentsStateBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public WebContents restoreContentsFromByteBuffer(ByteBuffer buffer, int savedStateVersion,
      boolean initiallyHidden) {
    return (WebContents)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_restoreContentsFromByteBuffer(buffer, savedStateVersion, initiallyHidden);
  }

  @Override
  public ByteBuffer getContentsStateAsByteBuffer(WebContents webcontents) {
    return (ByteBuffer)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_getContentsStateAsByteBuffer(webcontents);
  }

  @Override
  public ByteBuffer deleteNavigationEntries(ByteBuffer state, int saveStateVersion,
      long predicate) {
    return (ByteBuffer)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_deleteNavigationEntries(state, saveStateVersion, predicate);
  }

  @Override
  public ByteBuffer createSingleNavigationStateAsByteBuffer(String url, String referrerUrl,
      int referrerPolicy, Origin initiatorOrigin, boolean isIncognito) {
    return (ByteBuffer)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_createSingleNavigationStateAsByteBuffer(url, referrerUrl, referrerPolicy, initiatorOrigin, isIncognito);
  }

  @Override
  public String getDisplayTitleFromByteBuffer(ByteBuffer state, int savedStateVersion) {
    return (String)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_getDisplayTitleFromByteBuffer(state, savedStateVersion);
  }

  @Override
  public String getVirtualUrlFromByteBuffer(ByteBuffer state, int savedStateVersion) {
    return (String)GEN_JNI.org_chromium_chrome_browser_tab_WebContentsStateBridge_getVirtualUrlFromByteBuffer(state, savedStateVersion);
  }

  public static WebContentsStateBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.tab.WebContentsStateBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new WebContentsStateBridgeJni();
  }
}
