// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.fullscreen.FullscreenManager;

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
    return Preconditions.checkNotNull(instance.provideFullscreenManager(), "Cannot return null from a non-@Nullable @Provides method");
  }
}