package org.chromium.chrome.browser.browserservices.ui.splashscreen.webapps;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebappSplashController_Factory implements Factory<WebappSplashController> {
  private final Provider<SplashController> splashControllerProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public WebappSplashController_Factory(Provider<SplashController> splashControllerProvider,
      Provider<Activity> activityProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.splashControllerProvider = splashControllerProvider;
    this.activityProvider = activityProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public WebappSplashController get() {
    return newInstance(splashControllerProvider.get(), activityProvider.get(), tabObserverRegistrarProvider.get(), intentDataProvider.get());
  }

  public static WebappSplashController_Factory create(
      Provider<SplashController> splashControllerProvider, Provider<Activity> activityProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new WebappSplashController_Factory(splashControllerProvider, activityProvider, tabObserverRegistrarProvider, intentDataProvider);
  }

  public static WebappSplashController newInstance(SplashController splashController,
      Activity activity, TabObserverRegistrar tabObserverRegistrar,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new WebappSplashController(splashController, activity, tabObserverRegistrar, intentDataProvider);
  }
}
