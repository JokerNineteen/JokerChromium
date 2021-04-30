package org.chromium.chrome.browser.webapps;

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
public final class WebappActionsNotificationManager_Factory implements Factory<WebappActionsNotificationManager> {
  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public WebappActionsNotificationManager_Factory(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public WebappActionsNotificationManager get() {
    return newInstance(tabProvider.get(), intentDataProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static WebappActionsNotificationManager_Factory create(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new WebappActionsNotificationManager_Factory(tabProvider, intentDataProvider, lifecycleDispatcherProvider);
  }

  public static WebappActionsNotificationManager newInstance(
      CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new WebappActionsNotificationManager(tabProvider, intentDataProvider, lifecycleDispatcher);
  }
}
