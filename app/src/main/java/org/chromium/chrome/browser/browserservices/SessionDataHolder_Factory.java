package org.chromium.chrome.browser.browserservices;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SessionDataHolder_Factory implements Factory<SessionDataHolder> {
  private final Provider<CustomTabsConnection> connectionProvider;

  public SessionDataHolder_Factory(Provider<CustomTabsConnection> connectionProvider) {
    this.connectionProvider = connectionProvider;
  }

  @Override
  public SessionDataHolder get() {
    return newInstance(DoubleCheck.lazy(connectionProvider));
  }

  public static SessionDataHolder_Factory create(
      Provider<CustomTabsConnection> connectionProvider) {
    return new SessionDataHolder_Factory(connectionProvider);
  }

  public static SessionDataHolder newInstance(Lazy<CustomTabsConnection> connection) {
    return new SessionDataHolder(connection);
  }
}
