package org.chromium.chrome.browser.browserservices.permissiondelegation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.notifications.channels.SiteChannelsManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NotificationChannelPreserver_Factory implements Factory<NotificationChannelPreserver> {
  private final Provider<TrustedWebActivityPermissionStore> storeProvider;

  private final Provider<SiteChannelsManager> siteChannelsManagerProvider;

  public NotificationChannelPreserver_Factory(
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<SiteChannelsManager> siteChannelsManagerProvider) {
    this.storeProvider = storeProvider;
    this.siteChannelsManagerProvider = siteChannelsManagerProvider;
  }

  @Override
  public NotificationChannelPreserver get() {
    return newInstance(storeProvider.get(), siteChannelsManagerProvider.get());
  }

  public static NotificationChannelPreserver_Factory create(
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<SiteChannelsManager> siteChannelsManagerProvider) {
    return new NotificationChannelPreserver_Factory(storeProvider, siteChannelsManagerProvider);
  }

  public static NotificationChannelPreserver newInstance(TrustedWebActivityPermissionStore store,
      SiteChannelsManager siteChannelsManager) {
    return new NotificationChannelPreserver(store, siteChannelsManager);
  }
}
