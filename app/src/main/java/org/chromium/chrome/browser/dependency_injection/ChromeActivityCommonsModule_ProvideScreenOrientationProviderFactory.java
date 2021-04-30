package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.content_public.browser.ScreenOrientationProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory implements Factory<ScreenOrientationProvider> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ScreenOrientationProvider get() {
    return provideScreenOrientationProvider(module);
  }

  public static ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideScreenOrientationProviderFactory(module);
  }

  public static ScreenOrientationProvider provideScreenOrientationProvider(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideScreenOrientationProvider());
  }
}
