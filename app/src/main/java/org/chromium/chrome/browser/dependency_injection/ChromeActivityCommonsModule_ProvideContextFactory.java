// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideContextFactory implements Factory<Context> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideContextFactory(ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ChromeActivityCommonsModule_ProvideContextFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNull(instance.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}