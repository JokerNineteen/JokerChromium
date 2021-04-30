package org.chromium.chrome.browser.browserservices.permissiondelegation;

import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityPermissionManager_Factory implements Factory<TrustedWebActivityPermissionManager> {
  private final Provider<Context> contextProvider;

  private final Provider<TrustedWebActivityPermissionStore> storeProvider;

  private final Provider<NotificationChannelPreserver> preserverProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public TrustedWebActivityPermissionManager_Factory(Provider<Context> contextProvider,
      Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.contextProvider = contextProvider;
    this.storeProvider = storeProvider;
    this.preserverProvider = preserverProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public TrustedWebActivityPermissionManager get() {
    return newInstance(contextProvider.get(), storeProvider.get(), DoubleCheck.lazy(preserverProvider), umaRecorderProvider.get());
  }

  public static TrustedWebActivityPermissionManager_Factory create(
      Provider<Context> contextProvider, Provider<TrustedWebActivityPermissionStore> storeProvider,
      Provider<NotificationChannelPreserver> preserverProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new TrustedWebActivityPermissionManager_Factory(contextProvider, storeProvider, preserverProvider, umaRecorderProvider);
  }

  public static TrustedWebActivityPermissionManager newInstance(Context context,
      TrustedWebActivityPermissionStore store, Lazy<NotificationChannelPreserver> preserver,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new TrustedWebActivityPermissionManager(context, store, preserver, umaRecorder);
  }
}
