// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.externalauth.ExternalAuthUtils;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppHooksModule_ProvideExternalAuthUtilsFactory implements Factory<ExternalAuthUtils> {
  private final AppHooksModule module;

  public AppHooksModule_ProvideExternalAuthUtilsFactory(AppHooksModule module) {
    this.module = module;
  }

  @Override
  public ExternalAuthUtils get() {
    return provideExternalAuthUtils(module);
  }

  public static AppHooksModule_ProvideExternalAuthUtilsFactory create(AppHooksModule module) {
    return new AppHooksModule_ProvideExternalAuthUtilsFactory(module);
  }

  public static ExternalAuthUtils provideExternalAuthUtils(AppHooksModule instance) {
    return Preconditions.checkNotNull(instance.provideExternalAuthUtils(), "Cannot return null from a non-@Nullable @Provides method");
  }
}