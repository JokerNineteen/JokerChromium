package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browser_controls.BrowserControlsSizer;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideBrowserControlsSizerFactory implements Factory<BrowserControlsSizer> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideBrowserControlsSizerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public BrowserControlsSizer get() {
    return provideBrowserControlsSizer(module);
  }

  public static ChromeActivityCommonsModule_ProvideBrowserControlsSizerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideBrowserControlsSizerFactory(module);
  }

  public static BrowserControlsSizer provideBrowserControlsSizer(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBrowserControlsSizer());
  }
}
