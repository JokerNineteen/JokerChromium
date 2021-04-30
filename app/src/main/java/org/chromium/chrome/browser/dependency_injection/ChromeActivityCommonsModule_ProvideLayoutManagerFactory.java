package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.compositor.layouts.LayoutManagerImpl;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideLayoutManagerFactory implements Factory<LayoutManagerImpl> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideLayoutManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public LayoutManagerImpl get() {
    return provideLayoutManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideLayoutManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideLayoutManagerFactory(module);
  }

  public static LayoutManagerImpl provideLayoutManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLayoutManager());
  }
}
