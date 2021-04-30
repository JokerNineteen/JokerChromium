package org.chromium.chrome.browser.dependency_injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideContextFactory implements Factory<Context> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideContextFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return provideContext(module);
  }

  public static ChromeAppModule_ProvideContextFactory create(ChromeAppModule module) {
    return new ChromeAppModule_ProvideContextFactory(module);
  }

  public static Context provideContext(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideContext());
  }
}
