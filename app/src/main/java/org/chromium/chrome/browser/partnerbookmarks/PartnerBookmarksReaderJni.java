package org.chromium.chrome.browser.partnerbookmarks;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class PartnerBookmarksReaderJni implements PartnerBookmarksReader.Natives {
  private static PartnerBookmarksReader.Natives testInstance;

  public static final JniStaticTestMocker<PartnerBookmarksReader.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(PartnerBookmarksReader caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_init(caller);
  }

  @Override
  public void reset(long nativePartnerBookmarksReader, PartnerBookmarksReader caller) {
    GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_reset(nativePartnerBookmarksReader, caller);
  }

  @Override
  public void destroy(long nativePartnerBookmarksReader, PartnerBookmarksReader caller) {
    GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_destroy(nativePartnerBookmarksReader, caller);
  }

  @Override
  public long addPartnerBookmark(long nativePartnerBookmarksReader, PartnerBookmarksReader caller,
      String url, String title, boolean isFolder, long parentId, byte[] favicon, byte[] touchicon,
      boolean fetchUncachedFaviconsFromServer, int desiredFaviconSizePx,
      PartnerBookmarksReader.FetchFaviconCallback callback) {
    return (long)GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_addPartnerBookmark(nativePartnerBookmarksReader, caller, url, title, isFolder, parentId, favicon, touchicon, fetchUncachedFaviconsFromServer, desiredFaviconSizePx, callback);
  }

  @Override
  public void partnerBookmarksCreationComplete(long nativePartnerBookmarksReader,
      PartnerBookmarksReader caller) {
    GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_partnerBookmarksCreationComplete(nativePartnerBookmarksReader, caller);
  }

  @Override
  public String getNativeUrlString(String url) {
    return (String)GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_getNativeUrlString(url);
  }

  @Override
  public void disablePartnerBookmarksEditing() {
    GEN_JNI.org_chromium_chrome_browser_partnerbookmarks_PartnerBookmarksReader_disablePartnerBookmarksEditing();
  }

  public static PartnerBookmarksReader.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.partnerbookmarks.PartnerBookmarksReader.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new PartnerBookmarksReaderJni();
  }
}
