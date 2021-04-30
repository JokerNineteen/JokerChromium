package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory implements Factory<ActivityWindowAndroid> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ActivityWindowAndroid get() {
    return provideActivityWindowAndroid(module);
  }

  public static ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideActivityWindowAndroidFactory(module);
  }

  public static ActivityWindowAndroid provideActivityWindowAndroid(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideActivityWindowAndroid());
  }
}
