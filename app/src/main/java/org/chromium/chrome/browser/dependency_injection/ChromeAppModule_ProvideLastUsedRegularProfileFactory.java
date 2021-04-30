package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.profiles.Profile;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideLastUsedRegularProfileFactory implements Factory<Profile> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideLastUsedRegularProfileFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public Profile get() {
    return provideLastUsedRegularProfile(module);
  }

  public static ChromeAppModule_ProvideLastUsedRegularProfileFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvideLastUsedRegularProfileFactory(module);
  }

  public static Profile provideLastUsedRegularProfile(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLastUsedRegularProfile());
  }
}
