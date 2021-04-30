package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideIsPromotableToTabFactory implements Factory<Boolean> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideIsPromotableToTabFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Boolean get() {
    return provideIsPromotableToTab(module);
  }

  public static ChromeActivityCommonsModule_ProvideIsPromotableToTabFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideIsPromotableToTabFactory(module);
  }

  public static boolean provideIsPromotableToTab(ChromeActivityCommonsModule instance) {
    return instance.provideIsPromotableToTab();
  }
}
