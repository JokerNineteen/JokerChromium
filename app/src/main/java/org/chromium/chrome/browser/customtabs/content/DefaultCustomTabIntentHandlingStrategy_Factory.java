package org.chromium.chrome.browser.customtabs.content;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.customtabs.CustomTabNavigationEventObserver;
import org.chromium.chrome.browser.customtabs.CustomTabObserver;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DefaultCustomTabIntentHandlingStrategy_Factory implements Factory<DefaultCustomTabIntentHandlingStrategy> {
  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<CustomTabNavigationEventObserver> navigationEventObserverProvider;

  private final Provider<CustomTabObserver> customTabObserverProvider;

  public DefaultCustomTabIntentHandlingStrategy_Factory(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CustomTabNavigationEventObserver> navigationEventObserverProvider,
      Provider<CustomTabObserver> customTabObserverProvider) {
    this.tabProvider = tabProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.navigationEventObserverProvider = navigationEventObserverProvider;
    this.customTabObserverProvider = customTabObserverProvider;
  }

  @Override
  public DefaultCustomTabIntentHandlingStrategy get() {
    return newInstance(tabProvider.get(), navigationControllerProvider.get(), navigationEventObserverProvider.get(), DoubleCheck.lazy(customTabObserverProvider));
  }

  public static DefaultCustomTabIntentHandlingStrategy_Factory create(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CustomTabNavigationEventObserver> navigationEventObserverProvider,
      Provider<CustomTabObserver> customTabObserverProvider) {
    return new DefaultCustomTabIntentHandlingStrategy_Factory(tabProvider, navigationControllerProvider, navigationEventObserverProvider, customTabObserverProvider);
  }

  public static DefaultCustomTabIntentHandlingStrategy newInstance(
      CustomTabActivityTabProvider tabProvider,
      CustomTabActivityNavigationController navigationController,
      CustomTabNavigationEventObserver navigationEventObserver,
      Lazy<CustomTabObserver> customTabObserver) {
    return new DefaultCustomTabIntentHandlingStrategy(tabProvider, navigationController, navigationEventObserver, customTabObserver);
  }
}
