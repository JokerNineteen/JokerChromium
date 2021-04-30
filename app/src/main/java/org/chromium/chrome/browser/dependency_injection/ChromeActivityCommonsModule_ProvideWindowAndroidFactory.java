package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.ui.base.WindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideWindowAndroidFactory implements Factory<WindowAndroid> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideWindowAndroidFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public WindowAndroid get() {
    return provideWindowAndroid(module);
  }

  public static ChromeActivityCommonsModule_ProvideWindowAndroidFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideWindowAndroidFactory(module);
  }

  public static WindowAndroid provideWindowAndroid(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideWindowAndroid());
  }
}
