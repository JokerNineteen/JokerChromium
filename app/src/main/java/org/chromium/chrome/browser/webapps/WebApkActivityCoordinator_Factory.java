package org.chromium.chrome.browser.webapps;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebappDisclosureController;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkActivityCoordinator_Factory implements Factory<WebApkActivityCoordinator> {
  private final Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider;

  private final Provider<WebappDisclosureController> disclosureControllerProvider;

  private final Provider<DisclosureInfobar> disclosureInfobarProvider;

  private final Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intendDataProvider;

  private final Provider<WebApkUpdateManager> webApkUpdateManagerProvider;

  public WebApkActivityCoordinator_Factory(
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappDisclosureController> disclosureControllerProvider,
      Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intendDataProvider,
      Provider<WebApkUpdateManager> webApkUpdateManagerProvider) {
    this.deferredStartupWithStorageHandlerProvider = deferredStartupWithStorageHandlerProvider;
    this.disclosureControllerProvider = disclosureControllerProvider;
    this.disclosureInfobarProvider = disclosureInfobarProvider;
    this.webApkActivityLifecycleUmaTrackerProvider = webApkActivityLifecycleUmaTrackerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intendDataProvider = intendDataProvider;
    this.webApkUpdateManagerProvider = webApkUpdateManagerProvider;
  }

  @Override
  public WebApkActivityCoordinator get() {
    return newInstance(deferredStartupWithStorageHandlerProvider.get(), disclosureControllerProvider.get(), disclosureInfobarProvider.get(), webApkActivityLifecycleUmaTrackerProvider.get(), lifecycleDispatcherProvider.get(), intendDataProvider.get(), DoubleCheck.lazy(webApkUpdateManagerProvider));
  }

  public static WebApkActivityCoordinator_Factory create(
      Provider<WebappDeferredStartupWithStorageHandler> deferredStartupWithStorageHandlerProvider,
      Provider<WebappDisclosureController> disclosureControllerProvider,
      Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<WebApkActivityLifecycleUmaTracker> webApkActivityLifecycleUmaTrackerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intendDataProvider,
      Provider<WebApkUpdateManager> webApkUpdateManagerProvider) {
    return new WebApkActivityCoordinator_Factory(deferredStartupWithStorageHandlerProvider, disclosureControllerProvider, disclosureInfobarProvider, webApkActivityLifecycleUmaTrackerProvider, lifecycleDispatcherProvider, intendDataProvider, webApkUpdateManagerProvider);
  }

  public static WebApkActivityCoordinator newInstance(
      WebappDeferredStartupWithStorageHandler deferredStartupWithStorageHandler,
      WebappDisclosureController disclosureController, DisclosureInfobar disclosureInfobar,
      WebApkActivityLifecycleUmaTracker webApkActivityLifecycleUmaTracker,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intendDataProvider,
      Lazy<WebApkUpdateManager> webApkUpdateManager) {
    return new WebApkActivityCoordinator(deferredStartupWithStorageHandler, disclosureController, disclosureInfobar, webApkActivityLifecycleUmaTracker, lifecycleDispatcher, intendDataProvider, webApkUpdateManager);
  }
}
