package org.chromium.chrome.browser;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppHooksModule_ProvideCustomTabsConnectionFactory implements Factory<CustomTabsConnection> {
  @Override
  public CustomTabsConnection get() {
    return provideCustomTabsConnection();
  }

  public static AppHooksModule_ProvideCustomTabsConnectionFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CustomTabsConnection provideCustomTabsConnection() {
    return Preconditions.checkNotNullFromProvides(AppHooksModule.provideCustomTabsConnection());
  }

  private static final class InstanceHolder {
    private static final AppHooksModule_ProvideCustomTabsConnectionFactory INSTANCE = new AppHooksModule_ProvideCustomTabsConnectionFactory();
  }
}
