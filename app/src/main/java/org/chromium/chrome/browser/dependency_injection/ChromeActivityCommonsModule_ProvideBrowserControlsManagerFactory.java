package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.fullscreen.BrowserControlsManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideBrowserControlsManagerFactory implements Factory<BrowserControlsManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideBrowserControlsManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public BrowserControlsManager get() {
    return provideBrowserControlsManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideBrowserControlsManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideBrowserControlsManagerFactory(module);
  }

  public static BrowserControlsManager provideBrowserControlsManager(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBrowserControlsManager());
  }
}
