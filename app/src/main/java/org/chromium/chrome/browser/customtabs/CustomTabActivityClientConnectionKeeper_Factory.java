package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityClientConnectionKeeper_Factory implements Factory<CustomTabActivityClientConnectionKeeper> {
  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  public CustomTabActivityClientConnectionKeeper_Factory(
      Provider<CustomTabsConnection> connectionProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    this.connectionProvider = connectionProvider;
    this.intentDataProvider = intentDataProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabProvider = tabProvider;
  }

  @Override
  public CustomTabActivityClientConnectionKeeper get() {
    return newInstance(connectionProvider.get(), intentDataProvider.get(), lifecycleDispatcherProvider.get(), tabProvider.get());
  }

  public static CustomTabActivityClientConnectionKeeper_Factory create(
      Provider<CustomTabsConnection> connectionProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new CustomTabActivityClientConnectionKeeper_Factory(connectionProvider, intentDataProvider, lifecycleDispatcherProvider, tabProvider);
  }

  public static CustomTabActivityClientConnectionKeeper newInstance(CustomTabsConnection connection,
      BrowserServicesIntentDataProvider intentDataProvider,
      ActivityLifecycleDispatcher lifecycleDispatcher, CustomTabActivityTabProvider tabProvider) {
    return new CustomTabActivityClientConnectionKeeper(connection, intentDataProvider, lifecycleDispatcher, tabProvider);
  }
}
