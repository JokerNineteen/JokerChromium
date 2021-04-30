package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideFullscreenManagerFactory implements Factory<FullscreenManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideFullscreenManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public FullscreenManager get() {
    return provideFullscreenManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideFullscreenManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideFullscreenManagerFactory(module);
  }

  public static FullscreenManager provideFullscreenManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideFullscreenManager());
  }
}
