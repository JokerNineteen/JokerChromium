package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.ui.system.StatusBarColorController;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory implements Factory<StatusBarColorController> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public StatusBarColorController get() {
    return provideStatusBarColorController(module);
  }

  public static ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideStatusBarColorControllerFactory(module);
  }

  public static StatusBarColorController provideStatusBarColorController(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideStatusBarColorController());
  }
}
