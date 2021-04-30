package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.tabmodel.TabCreatorManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory implements Factory<TabCreatorManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabCreatorManager get() {
    return provideTabCreatorManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabCreatorManagerFactory(module);
  }

  public static TabCreatorManager provideTabCreatorManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabCreatorManager());
  }
}
