package org.chromium.chrome.browser.dependency_injection;

import android.content.res.Resources;
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
public final class ChromeActivityCommonsModule_ProvideResourcesFactory implements Factory<Resources> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideResourcesFactory(ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Resources get() {
    return provideResources(module);
  }

  public static ChromeActivityCommonsModule_ProvideResourcesFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideResourcesFactory(module);
  }

  public static Resources provideResources(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideResources());
  }
}
