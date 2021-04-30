package org.chromium.chrome.browser.webapps;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.SharedActivityCoordinator;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.webapps.WebappSplashController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebappActivityCoordinator_Factory implements Factory<WebappActivityCoordinator> {
  private final Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<ActivityTabProvider> activityTabProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<WebappSplashController> splashControllerProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<WebappActionsNotificationManager> actionsNotificationManagerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public WebappActivityCoordinator_Factory(
      Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider,
      Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<WebappSplashController> splashControllerProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappActionsNotificationManager> actionsNotificationManagerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.sharedActivityCoordinatorProvider = sharedActivityCoordinatorProvider;
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.activityTabProvider = activityTabProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.actionsNotificationManagerProvider = actionsNotificationManagerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public WebappActivityCoordinator get() {
    return newInstance(sharedActivityCoordinatorProvider.get(), activityProvider.get(), intentDataProvider.get(), activityTabProvider.get(), currentPageVerifierProvider.get(), splashControllerProvider.get(), deferredStartupWithStorageHandlerProvider.get(), actionsNotificationManagerProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static WebappActivityCoordinator_Factory create(
      Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider,
      Provider<Activity> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<ActivityTabProvider> activityTabProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<WebappSplashController> splashControllerProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappActionsNotificationManager> actionsNotificationManagerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new WebappActivityCoordinator_Factory(sharedActivityCoordinatorProvider, activityProvider, intentDataProvider, activityTabProvider, currentPageVerifierProvider, splashControllerProvider, deferredStartupWithStorageHandlerProvider, actionsNotificationManagerProvider, lifecycleDispatcherProvider);
  }

  public static WebappActivityCoordinator newInstance(
      SharedActivityCoordinator sharedActivityCoordinator, Activity activity,
      BrowserServicesIntentDataProvider intentDataProvider, ActivityTabProvider activityTabProvider,
      CurrentPageVerifier currentPageVerifier, WebappSplashController splashController,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      Object actionsNotificationManager, ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new WebappActivityCoordinator(sharedActivityCoordinator, activity, intentDataProvider, activityTabProvider, currentPageVerifier, splashController, deferredStartupWithStorageHandler, (WebappActionsNotificationManager) actionsNotificationManager, lifecycleDispatcher);
  }
}
