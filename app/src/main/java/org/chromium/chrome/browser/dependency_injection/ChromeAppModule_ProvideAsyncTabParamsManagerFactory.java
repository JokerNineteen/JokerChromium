package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideAsyncTabParamsManagerFactory implements Factory<AsyncTabParamsManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideAsyncTabParamsManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public AsyncTabParamsManager get() {
    return provideAsyncTabParamsManager(module);
  }

  public static ChromeAppModule_ProvideAsyncTabParamsManagerFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvideAsyncTabParamsManagerFactory(module);
  }

  public static AsyncTabParamsManager provideAsyncTabParamsManager(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideAsyncTabParamsManager());
  }
}
