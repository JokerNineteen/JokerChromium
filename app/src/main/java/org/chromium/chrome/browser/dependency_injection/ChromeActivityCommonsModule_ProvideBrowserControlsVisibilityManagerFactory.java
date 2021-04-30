package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browser_controls.BrowserControlsVisibilityManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideBrowserControlsVisibilityManagerFactory implements Factory<BrowserControlsVisibilityManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideBrowserControlsVisibilityManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public BrowserControlsVisibilityManager get() {
    return provideBrowserControlsVisibilityManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideBrowserControlsVisibilityManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideBrowserControlsVisibilityManagerFactory(module);
  }

  public static BrowserControlsVisibilityManager provideBrowserControlsVisibilityManager(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBrowserControlsVisibilityManager());
  }
}
