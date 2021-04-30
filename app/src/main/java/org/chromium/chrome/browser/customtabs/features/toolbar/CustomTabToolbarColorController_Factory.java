package org.chromium.chrome.browser.customtabs.features.toolbar;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.theme.TopUiThemeColorProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabToolbarColorController_Factory implements Factory<CustomTabToolbarColorController> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<TopUiThemeColorProvider> topUiThemeColorProvider;

  public CustomTabToolbarColorController_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Activity> activityProvider, Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    this.intentDataProvider = intentDataProvider;
    this.activityProvider = activityProvider;
    this.tabProvider = tabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.topUiThemeColorProvider = topUiThemeColorProvider;
  }

  @Override
  public CustomTabToolbarColorController get() {
    return newInstance(intentDataProvider.get(), activityProvider.get(), tabProvider.get(), tabObserverRegistrarProvider.get(), topUiThemeColorProvider.get());
  }

  public static CustomTabToolbarColorController_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<Activity> activityProvider, Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    return new CustomTabToolbarColorController_Factory(intentDataProvider, activityProvider, tabProvider, tabObserverRegistrarProvider, topUiThemeColorProvider);
  }

  public static CustomTabToolbarColorController newInstance(
      BrowserServicesIntentDataProvider intentDataProvider, Activity activity,
      CustomTabActivityTabProvider tabProvider, TabObserverRegistrar tabObserverRegistrar,
      TopUiThemeColorProvider topUiThemeColorProvider) {
    return new CustomTabToolbarColorController(intentDataProvider, activity, tabProvider, tabObserverRegistrar, topUiThemeColorProvider);
  }
}
