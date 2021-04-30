package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabNavigationEventObserver_Factory implements Factory<CustomTabNavigationEventObserver> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  public CustomTabNavigationEventObserver_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    this.intentDataProvider = intentDataProvider;
    this.connectionProvider = connectionProvider;
  }

  @Override
  public CustomTabNavigationEventObserver get() {
    return newInstance(intentDataProvider.get(), connectionProvider.get());
  }

  public static CustomTabNavigationEventObserver_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabsConnection> connectionProvider) {
    return new CustomTabNavigationEventObserver_Factory(intentDataProvider, connectionProvider);
  }

  public static CustomTabNavigationEventObserver newInstance(
      BrowserServicesIntentDataProvider intentDataProvider, CustomTabsConnection connection) {
    return new CustomTabNavigationEventObserver(intentDataProvider, connection);
  }
}
