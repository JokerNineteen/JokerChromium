package org.chromium.chrome.browser.image_fetcher;

import android.graphics.Bitmap;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.Callback;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.chrome.browser.profiles.Profile;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ImageFetcherBridgeJni implements ImageFetcherBridge.Natives {
  private static ImageFetcherBridge.Natives testInstance;

  public static final JniStaticTestMocker<ImageFetcherBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public String getFilePath(Profile profile, String url) {
    return (String)GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_getFilePath(profile, url);
  }

  @Override
  public void fetchImageData(Profile profile, int config, String url, String clientName,
      int expirationIntervalMinutes, Callback<byte[]> callback) {
    GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_fetchImageData(profile, config, url, clientName, expirationIntervalMinutes, callback);
  }

  @Override
  public void fetchImage(Profile profile, int config, String url, String clientName,
      int expirationIntervalMinutes, Callback<Bitmap> callback) {
    GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_fetchImage(profile, config, url, clientName, expirationIntervalMinutes, callback);
  }

  @Override
  public void reportEvent(String clientName, int eventId) {
    GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_reportEvent(clientName, eventId);
  }

  @Override
  public void reportCacheHitTime(String clientName, long startTimeMillis) {
    GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_reportCacheHitTime(clientName, startTimeMillis);
  }

  @Override
  public void reportTotalFetchTimeFromNative(String clientName, long startTimeMillis) {
    GEN_JNI.org_chromium_chrome_browser_image_1fetcher_ImageFetcherBridge_reportTotalFetchTimeFromNative(clientName, startTimeMillis);
  }

  public static ImageFetcherBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.image_fetcher.ImageFetcherBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ImageFetcherBridgeJni();
  }
}
