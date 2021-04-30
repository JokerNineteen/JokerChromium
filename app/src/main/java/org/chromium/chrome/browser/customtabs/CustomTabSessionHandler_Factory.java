package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.SessionDataHolder;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandler;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabSessionHandler_Factory implements Factory<CustomTabSessionHandler> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider;

  private final Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider;

  private final Provider<CustomTabIntentHandler> intentHandlerProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<SessionDataHolder> sessionDataHolderProvider;

  public CustomTabSessionHandler_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider,
      Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider,
      Provider<CustomTabIntentHandler> intentHandlerProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<SessionDataHolder> sessionDataHolderProvider) {
    this.intentDataProvider = intentDataProvider;
    this.tabProvider = tabProvider;
    this.toolbarCoordinatorProvider = toolbarCoordinatorProvider;
    this.bottomBarDelegateProvider = bottomBarDelegateProvider;
    this.intentHandlerProvider = intentHandlerProvider;
    this.connectionProvider = connectionProvider;
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.sessionDataHolderProvider = sessionDataHolderProvider;
  }

  @Override
  public CustomTabSessionHandler get() {
    return newInstance(intentDataProvider.get(), tabProvider.get(), DoubleCheck.lazy(toolbarCoordinatorProvider), DoubleCheck.lazy(bottomBarDelegateProvider), intentHandlerProvider.get(), connectionProvider.get(), activityProvider.get(), lifecycleDispatcherProvider.get(), sessionDataHolderProvider.get());
  }

  public static CustomTabSessionHandler_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider,
      Provider<CustomTabBottomBarDelegate> bottomBarDelegateProvider,
      Provider<CustomTabIntentHandler> intentHandlerProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Activity> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<SessionDataHolder> sessionDataHolderProvider) {
    return new CustomTabSessionHandler_Factory(intentDataProvider, tabProvider, toolbarCoordinatorProvider, bottomBarDelegateProvider, intentHandlerProvider, connectionProvider, activityProvider, lifecycleDispatcherProvider, sessionDataHolderProvider);
  }

  public static CustomTabSessionHandler newInstance(
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabActivityTabProvider tabProvider,
      Lazy<CustomTabToolbarCoordinator> toolbarCoordinator,
      Lazy<CustomTabBottomBarDelegate> bottomBarDelegate, CustomTabIntentHandler intentHandler,
      CustomTabsConnection connection, Activity activity,
      ActivityLifecycleDispatcher lifecycleDispatcher, SessionDataHolder sessionDataHolder) {
    return new CustomTabSessionHandler(intentDataProvider, tabProvider, toolbarCoordinator, bottomBarDelegate, intentHandler, connection, activity, lifecycleDispatcher, sessionDataHolder);
  }
}
