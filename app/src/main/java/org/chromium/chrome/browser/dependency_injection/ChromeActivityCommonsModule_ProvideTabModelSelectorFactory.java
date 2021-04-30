package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabModelSelectorFactory implements Factory<TabModelSelector> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabModelSelectorFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabModelSelector get() {
    return provideTabModelSelector(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabModelSelectorFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabModelSelectorFactory(module);
  }

  public static TabModelSelector provideTabModelSelector(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabModelSelector());
  }
}
