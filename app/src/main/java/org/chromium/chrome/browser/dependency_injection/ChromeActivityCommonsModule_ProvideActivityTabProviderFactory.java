package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.ActivityTabProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideActivityTabProviderFactory implements Factory<ActivityTabProvider> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideActivityTabProviderFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ActivityTabProvider get() {
    return provideActivityTabProvider(module);
  }

  public static ChromeActivityCommonsModule_ProvideActivityTabProviderFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideActivityTabProviderFactory(module);
  }

  public static ActivityTabProvider provideActivityTabProvider(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideActivityTabProvider());
  }
}
