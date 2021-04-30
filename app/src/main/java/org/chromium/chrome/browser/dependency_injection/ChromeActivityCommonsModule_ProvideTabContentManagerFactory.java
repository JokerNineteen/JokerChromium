package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabContentManagerFactory implements Factory<TabContentManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabContentManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public TabContentManager get() {
    return provideTabContentManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabContentManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabContentManagerFactory(module);
  }

  public static TabContentManager provideTabContentManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabContentManager());
  }
}
