package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.CustomTabNightModeStateController;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideNightModeControllerFactory implements Factory<CustomTabNightModeStateController> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideNightModeControllerFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public CustomTabNightModeStateController get() {
    return provideNightModeController(module);
  }

  public static BaseCustomTabActivityModule_ProvideNightModeControllerFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideNightModeControllerFactory(module);
  }

  public static CustomTabNightModeStateController provideNightModeController(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideNightModeController());
  }
}
