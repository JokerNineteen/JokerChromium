package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityLifecycleUmaTracker_Factory implements Factory<CustomTabActivityLifecycleUmaTracker> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> customTabsConnectionProvider;

  public CustomTabActivityLifecycleUmaTracker_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.customTabsConnectionProvider = customTabsConnectionProvider;
  }

  @Override
  public CustomTabActivityLifecycleUmaTracker get() {
    return newInstance(lifecycleDispatcherProvider.get(), activityProvider.get(), intentDataProvider.get(), customTabsConnectionProvider.get());
  }

  public static CustomTabActivityLifecycleUmaTracker_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    return new CustomTabActivityLifecycleUmaTracker_Factory(lifecycleDispatcherProvider, activityProvider, intentDataProvider, customTabsConnectionProvider);
  }

  public static CustomTabActivityLifecycleUmaTracker newInstance(
      ActivityLifecycleDispatcher lifecycleDispatcher, ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabsConnection customTabsConnection) {
    return new CustomTabActivityLifecycleUmaTracker(lifecycleDispatcher, activity, intentDataProvider, customTabsConnection);
  }
}
