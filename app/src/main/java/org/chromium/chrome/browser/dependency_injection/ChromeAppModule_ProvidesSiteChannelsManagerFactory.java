package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.notifications.channels.SiteChannelsManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvidesSiteChannelsManagerFactory implements Factory<SiteChannelsManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesSiteChannelsManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SiteChannelsManager get() {
    return providesSiteChannelsManager(module);
  }

  public static ChromeAppModule_ProvidesSiteChannelsManagerFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvidesSiteChannelsManagerFactory(module);
  }

  public static SiteChannelsManager providesSiteChannelsManager(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesSiteChannelsManager());
  }
}
