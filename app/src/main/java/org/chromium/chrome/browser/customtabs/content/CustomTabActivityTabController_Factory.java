package org.chromium.chrome.browser.customtabs.content;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.WarmupManager;
import org.chromium.chrome.browser.WebContentsFactory;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabIncognitoManager;
import org.chromium.chrome.browser.customtabs.CustomTabNavigationEventObserver;
import org.chromium.chrome.browser.customtabs.CustomTabObserver;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.ReparentingTaskProvider;
import org.chromium.chrome.browser.init.StartupTabPreloader;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityTabController_Factory implements Factory<CustomTabActivityTabController> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityTabProvider> activityTabProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<CompositorViewHolder> compositorViewHolderProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<WarmupManager> warmupManagerProvider;

  private final Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider;

  private final Provider<CustomTabActivityTabFactory> tabFactoryProvider;

  private final Provider<CustomTabObserver> customTabObserverProvider;

  private final Provider<WebContentsFactory> webContentsFactoryProvider;

  private final Provider<CustomTabNavigationEventObserver> tabNavigationEventObserverProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<StartupTabPreloader> startupTabPreloaderProvider;

  private final Provider<ReparentingTaskProvider> reparentingTaskProvider;

  private final Provider<CustomTabIncognitoManager> customTabIncognitoManagerProvider;

  private final Provider<ProfileProvider> profileProvider;

  private final Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider;

  public CustomTabActivityTabController_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WarmupManager> warmupManagerProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<CustomTabActivityTabFactory> tabFactoryProvider,
      Provider<CustomTabObserver> customTabObserverProvider,
      Provider<WebContentsFactory> webContentsFactoryProvider,
      Provider<CustomTabNavigationEventObserver> tabNavigationEventObserverProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider,
      Provider<ReparentingTaskProvider> reparentingTaskProvider,
      Provider<CustomTabIncognitoManager> customTabIncognitoManagerProvider,
      Provider<ProfileProvider> profileProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider) {
    this.activityProvider = activityProvider;
    this.customTabDelegateFactoryProvider = customTabDelegateFactoryProvider;
    this.connectionProvider = connectionProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityTabProvider = activityTabProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.compositorViewHolderProvider = compositorViewHolderProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.warmupManagerProvider = warmupManagerProvider;
    this.persistencePolicyProvider = persistencePolicyProvider;
    this.tabFactoryProvider = tabFactoryProvider;
    this.customTabObserverProvider = customTabObserverProvider;
    this.webContentsFactoryProvider = webContentsFactoryProvider;
    this.tabNavigationEventObserverProvider = tabNavigationEventObserverProvider;
    this.tabProvider = tabProvider;
    this.startupTabPreloaderProvider = startupTabPreloaderProvider;
    this.reparentingTaskProvider = reparentingTaskProvider;
    this.customTabIncognitoManagerProvider = customTabIncognitoManagerProvider;
    this.profileProvider = profileProvider;
    this.asyncTabParamsManagerProvider = asyncTabParamsManagerProvider;
  }

  @Override
  public CustomTabActivityTabController get() {
    return newInstance(activityProvider.get(), DoubleCheck.lazy(customTabDelegateFactoryProvider), connectionProvider.get(), intentDataProvider.get(), activityTabProvider.get(), tabObserverRegistrarProvider.get(), DoubleCheck.lazy(compositorViewHolderProvider), lifecycleDispatcherProvider.get(), warmupManagerProvider.get(), persistencePolicyProvider.get(), tabFactoryProvider.get(), DoubleCheck.lazy(customTabObserverProvider), webContentsFactoryProvider.get(), tabNavigationEventObserverProvider.get(), tabProvider.get(), startupTabPreloaderProvider.get(), reparentingTaskProvider.get(), DoubleCheck.lazy(customTabIncognitoManagerProvider), profileProvider.get(), DoubleCheck.lazy(asyncTabParamsManagerProvider));
  }

  public static CustomTabActivityTabController_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<CustomTabsConnection> connectionProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WarmupManager> warmupManagerProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<CustomTabActivityTabFactory> tabFactoryProvider,
      Provider<CustomTabObserver> customTabObserverProvider,
      Provider<WebContentsFactory> webContentsFactoryProvider,
      Provider<CustomTabNavigationEventObserver> tabNavigationEventObserverProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider,
      Provider<ReparentingTaskProvider> reparentingTaskProvider,
      Provider<CustomTabIncognitoManager> customTabIncognitoManagerProvider,
      Provider<ProfileProvider> profileProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider) {
    return new CustomTabActivityTabController_Factory(activityProvider, customTabDelegateFactoryProvider, connectionProvider, intentDataProvider, activityTabProvider, tabObserverRegistrarProvider, compositorViewHolderProvider, lifecycleDispatcherProvider, warmupManagerProvider, persistencePolicyProvider, tabFactoryProvider, customTabObserverProvider, webContentsFactoryProvider, tabNavigationEventObserverProvider, tabProvider, startupTabPreloaderProvider, reparentingTaskProvider, customTabIncognitoManagerProvider, profileProvider, asyncTabParamsManagerProvider);
  }

  public static CustomTabActivityTabController newInstance(ChromeActivity<?> activity,
      Lazy<CustomTabDelegateFactory> customTabDelegateFactory, CustomTabsConnection connection,
      BrowserServicesIntentDataProvider intentDataProvider, ActivityTabProvider activityTabProvider,
      TabObserverRegistrar tabObserverRegistrar, Lazy<CompositorViewHolder> compositorViewHolder,
      ActivityLifecycleDispatcher lifecycleDispatcher, WarmupManager warmupManager,
      CustomTabTabPersistencePolicy persistencePolicy, CustomTabActivityTabFactory tabFactory,
      Lazy<CustomTabObserver> customTabObserver, WebContentsFactory webContentsFactory,
      CustomTabNavigationEventObserver tabNavigationEventObserver,
      CustomTabActivityTabProvider tabProvider, StartupTabPreloader startupTabPreloader,
      ReparentingTaskProvider reparentingTaskProvider,
      Lazy<CustomTabIncognitoManager> customTabIncognitoManager, ProfileProvider profileProvider,
      Lazy<AsyncTabParamsManager> asyncTabParamsManager) {
    return new CustomTabActivityTabController(activity, customTabDelegateFactory, connection, intentDataProvider, activityTabProvider, tabObserverRegistrar, compositorViewHolder, lifecycleDispatcher, warmupManager, persistencePolicy, tabFactory, customTabObserver, webContentsFactory, tabNavigationEventObserver, tabProvider, startupTabPreloader, reparentingTaskProvider, customTabIncognitoManager, profileProvider, asyncTabParamsManager);
  }
}
