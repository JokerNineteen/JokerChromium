package org.chromium.chrome.browser.thumbnail.generator;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ThumbnailGeneratorJni implements ThumbnailGenerator.Natives {
  private static ThumbnailGenerator.Natives testInstance;

  public static final JniStaticTestMocker<ThumbnailGenerator.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long init(ThumbnailGenerator caller) {
    return (long)GEN_JNI.org_chromium_chrome_browser_thumbnail_generator_ThumbnailGenerator_init(caller);
  }

  @Override
  public void destroy(long nativeThumbnailGenerator, ThumbnailGenerator caller) {
    GEN_JNI.org_chromium_chrome_browser_thumbnail_generator_ThumbnailGenerator_destroy(nativeThumbnailGenerator, caller);
  }

  @Override
  public void retrieveThumbnail(long nativeThumbnailGenerator, ThumbnailGenerator caller,
      String contentId, String filePath, String mimeType, int thumbnailSize,
      ThumbnailGeneratorCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_thumbnail_generator_ThumbnailGenerator_retrieveThumbnail(nativeThumbnailGenerator, caller, contentId, filePath, mimeType, thumbnailSize, callback);
  }

  public static ThumbnailGenerator.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.thumbnail.generator.ThumbnailGenerator.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ThumbnailGeneratorJni();
  }
}
