package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.init.StartupTabPreloader;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory implements Factory<StartupTabPreloader> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public StartupTabPreloader get() {
    return provideStartupTabPreloader(module);
  }

  public static BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideStartupTabPreloaderFactory(module);
  }

  public static StartupTabPreloader provideStartupTabPreloader(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideStartupTabPreloader());
  }
}
