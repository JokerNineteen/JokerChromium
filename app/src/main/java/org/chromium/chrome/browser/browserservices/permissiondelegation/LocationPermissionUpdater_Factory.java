package org.chromium.chrome.browser.browserservices.permissiondelegation;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityClient;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocationPermissionUpdater_Factory implements Factory<LocationPermissionUpdater> {
  private final Provider<TrustedWebActivityPermissionManager> permissionManagerProvider;

  private final Provider<TrustedWebActivityClient> trustedWebActivityClientProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public LocationPermissionUpdater_Factory(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityClient> trustedWebActivityClientProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.permissionManagerProvider = permissionManagerProvider;
    this.trustedWebActivityClientProvider = trustedWebActivityClientProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public LocationPermissionUpdater get() {
    return newInstance(permissionManagerProvider.get(), trustedWebActivityClientProvider.get(), umaRecorderProvider.get());
  }

  public static LocationPermissionUpdater_Factory create(
      Provider<TrustedWebActivityPermissionManager> permissionManagerProvider,
      Provider<TrustedWebActivityClient> trustedWebActivityClientProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new LocationPermissionUpdater_Factory(permissionManagerProvider, trustedWebActivityClientProvider, umaRecorderProvider);
  }

  public static LocationPermissionUpdater newInstance(
      TrustedWebActivityPermissionManager permissionManager,
      TrustedWebActivityClient trustedWebActivityClient,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new LocationPermissionUpdater(permissionManager, trustedWebActivityClient, umaRecorder);
  }
}
