package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.theme.TopUiThemeColorProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabTaskDescriptionHelper_Factory implements Factory<CustomTabTaskDescriptionHelper> {
  private final Provider<Activity> activityProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider;

  private final Provider<TopUiThemeColorProvider> topUiThemeColorProvider;

  public CustomTabTaskDescriptionHelper_Factory(Provider<Activity> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    this.activityProvider = activityProvider;
    this.tabProvider = tabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityLifecycleDispatcherProvider = activityLifecycleDispatcherProvider;
    this.topUiThemeColorProvider = topUiThemeColorProvider;
  }

  @Override
  public CustomTabTaskDescriptionHelper get() {
    return newInstance(activityProvider.get(), tabProvider.get(), tabObserverRegistrarProvider.get(), intentDataProvider.get(), activityLifecycleDispatcherProvider.get(), topUiThemeColorProvider.get());
  }

  public static CustomTabTaskDescriptionHelper_Factory create(Provider<Activity> activityProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> activityLifecycleDispatcherProvider,
      Provider<TopUiThemeColorProvider> topUiThemeColorProvider) {
    return new CustomTabTaskDescriptionHelper_Factory(activityProvider, tabProvider, tabObserverRegistrarProvider, intentDataProvider, activityLifecycleDispatcherProvider, topUiThemeColorProvider);
  }

  public static CustomTabTaskDescriptionHelper newInstance(Activity activity,
      CustomTabActivityTabProvider tabProvider, TabObserverRegistrar tabObserverRegistrar,
      BrowserServicesIntentDataProvider intentDataProvider,
      ActivityLifecycleDispatcher activityLifecycleDispatcher,
      TopUiThemeColorProvider topUiThemeColorProvider) {
    return new CustomTabTaskDescriptionHelper(activity, tabProvider, tabObserverRegistrar, intentDataProvider, activityLifecycleDispatcher, topUiThemeColorProvider);
  }
}
