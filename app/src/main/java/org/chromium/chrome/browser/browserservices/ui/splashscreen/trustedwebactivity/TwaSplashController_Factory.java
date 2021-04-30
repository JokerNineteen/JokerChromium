package org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TwaSplashController_Factory implements Factory<TwaSplashController> {
  private final Provider<SplashController> splashControllerProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<SplashImageHolder> splashImageCacheProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public TwaSplashController_Factory(Provider<SplashController> splashControllerProvider,
      Provider<Activity> activityProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<SplashImageHolder> splashImageCacheProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.splashControllerProvider = splashControllerProvider;
    this.activityProvider = activityProvider;
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.splashImageCacheProvider = splashImageCacheProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public TwaSplashController get() {
    return newInstance(splashControllerProvider.get(), activityProvider.get(), activityWindowAndroidProvider.get(), splashImageCacheProvider.get(), intentDataProvider.get());
  }

  public static TwaSplashController_Factory create(
      Provider<SplashController> splashControllerProvider, Provider<Activity> activityProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<SplashImageHolder> splashImageCacheProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new TwaSplashController_Factory(splashControllerProvider, activityProvider, activityWindowAndroidProvider, splashImageCacheProvider, intentDataProvider);
  }

  public static TwaSplashController newInstance(SplashController splashController,
      Activity activity, ActivityWindowAndroid activityWindowAndroid,
      SplashImageHolder splashImageCache, BrowserServicesIntentDataProvider intentDataProvider) {
    return new TwaSplashController(splashController, activity, activityWindowAndroid, splashImageCache, intentDataProvider);
  }
}
