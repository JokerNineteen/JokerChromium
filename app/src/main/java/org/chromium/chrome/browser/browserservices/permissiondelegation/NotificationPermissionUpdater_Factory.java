package org.chromium.chrome.browser.browserservices.permissiondelegation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationPermissionUpdater_Factory implements Factory<NotificationPermissionUpdater> {
  private final Provider<TrustedWebActivityPermissionManager> permissionManagerProvider;

  private final Provider<TrustedWebActivityClient> trustedWebActivityClientProvider;

  public NotificationPermissionUpdater_Factory(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityClient> trustedWebActivityClientProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.trustedWebActivityClientProvider = trustedWebActivityClientProvider;
  }

  @Override
  public NotificationPermissionUpdater get() {
    return newInstance(permissionManagerProvider.get(), trustedWebActivityClientProvider.get());
  }

  public static NotificationPermissionUpdater_Factory create(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityClient> trustedWebActivityClientProvider) {
    return new NotificationPermissionUpdater_Factory(permissionManagerProvider, trustedWebActivityClientProvider);
  }

  public static NotificationPermissionUpdater newInstance(
      TrustedWebActivityPermissionManager permissionManager,
      TrustedWebActivityClient trustedWebActivityClient) {
    return new NotificationPermissionUpdater(permissionManager, trustedWebActivityClient);
  }
}
