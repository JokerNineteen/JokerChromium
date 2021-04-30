package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.preferences.SharedPreferencesManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvidesSharedPreferencesManagerFactory implements Factory<SharedPreferencesManager> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvidesSharedPreferencesManagerFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferencesManager get() {
    return providesSharedPreferencesManager(module);
  }

  public static ChromeAppModule_ProvidesSharedPreferencesManagerFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvidesSharedPreferencesManagerFactory(module);
  }

  public static SharedPreferencesManager providesSharedPreferencesManager(
      ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesSharedPreferencesManager());
  }
}
