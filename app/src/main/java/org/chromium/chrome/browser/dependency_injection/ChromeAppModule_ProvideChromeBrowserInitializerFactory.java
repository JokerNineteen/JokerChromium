// Generated by Dagger (https://dagger.dev).
package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import org.chromium.chrome.browser.init.ChromeBrowserInitializer;

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
    return Preconditions.checkNotNull(instance.provideChromeBrowserInitializer(), "Cannot return null from a non-@Nullable @Provides method");
  }
}