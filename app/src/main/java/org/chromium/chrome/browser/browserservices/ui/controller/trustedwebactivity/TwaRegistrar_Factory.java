package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.permissiondelegation.PermissionUpdater;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TwaRegistrar_Factory implements Factory<TwaRegistrar> {
  private final Provider<Context> appContextProvider;

  private final Provider<PermissionUpdater> permissionUpdaterProvider;

  private final Provider<ClientAppDataRecorder> clientAppDataRecorderProvider;

  public TwaRegistrar_Factory(Provider<Context> appContextProvider,
      Provider<PermissionUpdater> permissionUpdaterProvider,
      Provider<ClientAppDataRecorder> clientAppDataRecorderProvider) {
    this.appContextProvider = appContextProvider;
    this.permissionUpdaterProvider = permissionUpdaterProvider;
    this.clientAppDataRecorderProvider = clientAppDataRecorderProvider;
  }

  @Override
  public TwaRegistrar get() {
    return newInstance(appContextProvider.get(), permissionUpdaterProvider.get(), DoubleCheck.lazy(clientAppDataRecorderProvider));
  }

  public static TwaRegistrar_Factory create(Provider<Context> appContextProvider,
      Provider<PermissionUpdater> permissionUpdaterProvider,
      Provider<ClientAppDataRecorder> clientAppDataRecorderProvider) {
    return new TwaRegistrar_Factory(appContextProvider, permissionUpdaterProvider, clientAppDataRecorderProvider);
  }

  public static TwaRegistrar newInstance(Context appContext, PermissionUpdater permissionUpdater,
      Lazy<ClientAppDataRecorder> clientAppDataRecorder) {
    return new TwaRegistrar(appContext, permissionUpdater, clientAppDataRecorder);
  }
}
