package org.chromium.chrome.browser.browserservices.permissiondelegation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PermissionUpdater_Factory implements Factory<PermissionUpdater> {
  private final Provider<TrustedWebActivityPermissionManager> permissionManagerProvider;

  private final Provider<NotificationPermissionUpdater> notificationPermissionUpdaterProvider;

  private final Provider<LocationPermissionUpdater> locationPermissionUpdaterProvider;

  public PermissionUpdater_Factory(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<NotificationPermissionUpdater> notificationPermissionUpdaterProvider,
      Provider<LocationPermissionUpdater> locationPermissionUpdaterProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.notificationPermissionUpdaterProvider = notificationPermissionUpdaterProvider;
    this.locationPermissionUpdaterProvider = locationPermissionUpdaterProvider;
  }

  @Override
  public PermissionUpdater get() {
    return newInstance(permissionManagerProvider.get(), notificationPermissionUpdaterProvider.get(), locationPermissionUpdaterProvider.get());
  }

  public static PermissionUpdater_Factory create(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<NotificationPermissionUpdater> notificationPermissionUpdaterProvider,
      Provider<LocationPermissionUpdater> locationPermissionUpdaterProvider) {
    return new PermissionUpdater_Factory(permissionManagerProvider, notificationPermissionUpdaterProvider, locationPermissionUpdaterProvider);
  }

  public static PermissionUpdater newInstance(TrustedWebActivityPermissionManager permissionManager,
      NotificationPermissionUpdater notificationPermissionUpdater,
      LocationPermissionUpdater locationPermissionUpdater) {
    return new PermissionUpdater(permissionManager, notificationPermissionUpdater, locationPermissionUpdater);
  }
}
