package org.chromium.chrome.browser.customtabs.content;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TabObserverRegistrar_Factory implements Factory<TabObserverRegistrar> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  public TabObserverRegistrar_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabProvider = tabProvider;
  }

  @Override
  public TabObserverRegistrar get() {
    return newInstance(lifecycleDispatcherProvider.get(), tabProvider.get());
  }

  public static TabObserverRegistrar_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CustomTabActivityTabProvider> tabProvider) {
    return new TabObserverRegistrar_Factory(lifecycleDispatcherProvider, tabProvider);
  }

  public static TabObserverRegistrar newInstance(ActivityLifecycleDispatcher lifecycleDispatcher,
      CustomTabActivityTabProvider tabProvider) {
    return new TabObserverRegistrar(lifecycleDispatcher, tabProvider);
  }
}
