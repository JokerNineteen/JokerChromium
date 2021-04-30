package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.ui.messages.snackbar.SnackbarManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideSnackbarManagerFactory implements Factory<SnackbarManager> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideSnackbarManagerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public SnackbarManager get() {
    return provideSnackbarManager(module);
  }

  public static ChromeActivityCommonsModule_ProvideSnackbarManagerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideSnackbarManagerFactory(module);
  }

  public static SnackbarManager provideSnackbarManager(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSnackbarManager());
  }
}
