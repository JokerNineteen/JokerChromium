package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory implements Factory<BrowserServicesIntentDataProvider> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public BrowserServicesIntentDataProvider get() {
    return providesBrowserServicesIntentDataProvider(module);
  }

  public static BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvidesBrowserServicesIntentDataProviderFactory(module);
  }

  public static BrowserServicesIntentDataProvider providesBrowserServicesIntentDataProvider(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesBrowserServicesIntentDataProvider());
  }
}
