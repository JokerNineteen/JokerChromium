package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browser_controls.BrowserControlsStateProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideBrowserControlsStateProviderFactory implements Factory<BrowserControlsStateProvider> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideBrowserControlsStateProviderFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public BrowserControlsStateProvider get() {
    return provideBrowserControlsStateProvider(module);
  }

  public static ChromeActivityCommonsModule_ProvideBrowserControlsStateProviderFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideBrowserControlsStateProviderFactory(module);
  }

  public static BrowserControlsStateProvider provideBrowserControlsStateProvider(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBrowserControlsStateProvider());
  }
}
