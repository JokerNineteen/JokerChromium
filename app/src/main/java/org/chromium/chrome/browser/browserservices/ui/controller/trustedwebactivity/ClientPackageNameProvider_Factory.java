package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ClientPackageNameProvider_Factory implements Factory<ClientPackageNameProvider> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> customTabsConnectionProvider;

  public ClientPackageNameProvider_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intentDataProvider = intentDataProvider;
    this.customTabsConnectionProvider = customTabsConnectionProvider;
  }

  @Override
  public ClientPackageNameProvider get() {
    return newInstance(activityProvider.get(), lifecycleDispatcherProvider.get(), intentDataProvider.get(), customTabsConnectionProvider.get());
  }

  public static ClientPackageNameProvider_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider) {
    return new ClientPackageNameProvider_Factory(activityProvider, lifecycleDispatcherProvider, intentDataProvider, customTabsConnectionProvider);
  }

  public static ClientPackageNameProvider newInstance(ChromeActivity<?> activity,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabsConnection customTabsConnection) {
    return new ClientPackageNameProvider(activity, lifecycleDispatcher, intentDataProvider, customTabsConnection);
  }
}
