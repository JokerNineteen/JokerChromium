package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.theme.TopUiThemeColorProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory implements Factory<TopUiThemeColorProvider> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public TopUiThemeColorProvider get() {
    return provideTopUiThemeColorProvider(module);
  }

  public static BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideTopUiThemeColorProviderFactory(module);
  }

  public static TopUiThemeColorProvider provideTopUiThemeColorProvider(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTopUiThemeColorProvider());
  }
}
