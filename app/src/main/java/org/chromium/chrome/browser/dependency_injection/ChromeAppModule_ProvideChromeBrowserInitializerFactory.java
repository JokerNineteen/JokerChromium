package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideChromeBrowserInitializerFactory implements Factory<ChromeBrowserInitializer> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideChromeBrowserInitializerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public ChromeBrowserInitializer get() {
    return provideChromeBrowserInitializer(module);
  }

  public static ChromeAppModule_ProvideChromeBrowserInitializerFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvideChromeBrowserInitializerFactory(module);
  }

  public static ChromeBrowserInitializer provideChromeBrowserInitializer(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideChromeBrowserInitializer());
  }
}
