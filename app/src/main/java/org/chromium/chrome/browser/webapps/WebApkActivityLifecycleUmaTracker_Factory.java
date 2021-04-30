package org.chromium.chrome.browser.webapps;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.SplashController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.chrome.browser.metrics.ActivityTabStartupMetricsTracker;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkActivityLifecycleUmaTracker_Factory implements Factory<WebApkActivityLifecycleUmaTracker> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<SplashController> splashControllerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider;

  public WebApkActivityLifecycleUmaTracker_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider) {
    this.activityProvider = activityProvider;
    this.intentDataProvider = intentDataProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.startupMetricsTrackerProvider = startupMetricsTrackerProvider;
  }

  @Override
  public WebApkActivityLifecycleUmaTracker get() {
    return newInstance(activityProvider.get(), intentDataProvider.get(), splashControllerProvider.get(), lifecycleDispatcherProvider.get(), deferredStartupWithStorageHandlerProvider.get(), DoubleCheck.lazy(startupMetricsTrackerProvider));
  }

  public static WebApkActivityLifecycleUmaTracker_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<SplashController> splashControllerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<ActivityTabStartupMetricsTracker> startupMetricsTrackerProvider) {
    return new WebApkActivityLifecycleUmaTracker_Factory(activityProvider, intentDataProvider, splashControllerProvider, lifecycleDispatcherProvider, deferredStartupWithStorageHandlerProvider, startupMetricsTrackerProvider);
  }

  public static WebApkActivityLifecycleUmaTracker newInstance(ChromeActivity<?> activity,
      BrowserServicesIntentDataProvider intentDataProvider, SplashController splashController,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      Lazy<ActivityTabStartupMetricsTracker> startupMetricsTracker) {
    return new WebApkActivityLifecycleUmaTracker(activity, intentDataProvider, splashController, lifecycleDispatcher, deferredStartupWithStorageHandler, startupMetricsTracker);
  }
}
