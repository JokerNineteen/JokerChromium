package org.chromium.chrome.browser.browserservices.ui.trustedwebactivity;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureInfobar;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureNotification;
import org.chromium.chrome.browser.browserservices.ui.view.DisclosureSnackbar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.components.browser_ui.notifications.NotificationManagerProxy;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DisclosureUiPicker_Factory implements Factory<DisclosureUiPicker> {
  private final Provider<DisclosureInfobar> disclosureInfobarProvider;

  private final Provider<DisclosureSnackbar> disclosureSnackbarProvider;

  private final Provider<DisclosureNotification> disclosureNotificationProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<NotificationManagerProxy> notificationManagerProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public DisclosureUiPicker_Factory(Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<DisclosureSnackbar> disclosureSnackbarProvider,
      Provider<DisclosureNotification> disclosureNotificationProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<NotificationManagerProxy> notificationManagerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.disclosureInfobarProvider = disclosureInfobarProvider;
    this.disclosureSnackbarProvider = disclosureSnackbarProvider;
    this.disclosureNotificationProvider = disclosureNotificationProvider;
    this.intentDataProvider = intentDataProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public DisclosureUiPicker get() {
    return newInstance(DoubleCheck.lazy(disclosureInfobarProvider), DoubleCheck.lazy(disclosureSnackbarProvider), DoubleCheck.lazy(disclosureNotificationProvider), intentDataProvider.get(), notificationManagerProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static DisclosureUiPicker_Factory create(
      Provider<DisclosureInfobar> disclosureInfobarProvider,
      Provider<DisclosureSnackbar> disclosureSnackbarProvider,
      Provider<DisclosureNotification> disclosureNotificationProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<NotificationManagerProxy> notificationManagerProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new DisclosureUiPicker_Factory(disclosureInfobarProvider, disclosureSnackbarProvider, disclosureNotificationProvider, intentDataProvider, notificationManagerProvider, lifecycleDispatcherProvider);
  }

  public static DisclosureUiPicker newInstance(Lazy<DisclosureInfobar> disclosureInfobar,
      Lazy<DisclosureSnackbar> disclosureSnackbar,
      Lazy<DisclosureNotification> disclosureNotification,
      BrowserServicesIntentDataProvider intentDataProvider,
      NotificationManagerProxy notificationManager,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new DisclosureUiPicker(disclosureInfobar, disclosureSnackbar, disclosureNotification, intentDataProvider, notificationManager, lifecycleDispatcher);
  }
}
