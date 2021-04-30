package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.components.browser_ui.notifications.NotificationManagerProxy;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory implements Factory<NotificationManagerProxy> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public NotificationManagerProxy get() {
    return provideNotificationManagerProxy(module);
  }

  public static ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideNotificationManagerProxyFactory(module);
  }

  public static NotificationManagerProxy provideNotificationManagerProxy(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideNotificationManagerProxy());
  }
}
