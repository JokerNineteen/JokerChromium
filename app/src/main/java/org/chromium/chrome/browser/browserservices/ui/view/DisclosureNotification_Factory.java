package org.chromium.chrome.browser.browserservices.ui.view;

import android.content.Context;
import android.content.res.Resources;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
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
public final class DisclosureNotification_Factory implements Factory<DisclosureNotification> {
  private final Provider<Context> contextProvider;

  private final Provider<Resources> resourcesProvider;

  private final Provider<NotificationManagerProxy> notificationManagerProvider;

  private final Provider<TrustedWebActivityModel> modelProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public DisclosureNotification_Factory(Provider<Context> contextProvider,
      Provider<Resources> resourcesProvider,
      Provider<NotificationManagerProxy> notificationManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.contextProvider = contextProvider;
    this.resourcesProvider = resourcesProvider;
    this.notificationManagerProvider = notificationManagerProvider;
    this.modelProvider = modelProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public DisclosureNotification get() {
    return newInstance(contextProvider.get(), resourcesProvider.get(), notificationManagerProvider.get(), modelProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static DisclosureNotification_Factory create(Provider<Context> contextProvider,
      Provider<Resources> resourcesProvider,
      Provider<NotificationManagerProxy> notificationManagerProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new DisclosureNotification_Factory(contextProvider, resourcesProvider, notificationManagerProvider, modelProvider, lifecycleDispatcherProvider);
  }

  public static DisclosureNotification newInstance(Context context, Resources resources,
      NotificationManagerProxy notificationManager, TrustedWebActivityModel model,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new DisclosureNotification(context, resources, notificationManager, model, lifecycleDispatcher);
  }
}
