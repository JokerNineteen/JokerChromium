package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabOrientationController_Factory implements Factory<CustomTabOrientationController> {
  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public CustomTabOrientationController_Factory(
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public CustomTabOrientationController get() {
    return newInstance(activityWindowAndroidProvider.get(), intentDataProvider.get());
  }

  public static CustomTabOrientationController_Factory create(
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CustomTabOrientationController_Factory(activityWindowAndroidProvider, intentDataProvider);
  }

  public static CustomTabOrientationController newInstance(
      ActivityWindowAndroid activityWindowAndroid,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new CustomTabOrientationController(activityWindowAndroid, intentDataProvider);
  }
}
