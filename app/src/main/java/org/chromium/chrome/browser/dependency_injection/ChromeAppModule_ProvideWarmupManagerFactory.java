package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.WarmupManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideWarmupManagerFactory implements Factory<WarmupManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideWarmupManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public WarmupManager get() {
    return provideWarmupManager(module);
  }

  public static ChromeAppModule_ProvideWarmupManagerFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvideWarmupManagerFactory(module);
  }

  public static WarmupManager provideWarmupManager(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWarmupManager());
  }
}
