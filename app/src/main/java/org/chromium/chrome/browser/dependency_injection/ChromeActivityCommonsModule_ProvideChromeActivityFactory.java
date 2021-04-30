package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.app.ChromeActivity;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideChromeActivityFactory implements Factory<ChromeActivity<?>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideChromeActivityFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ChromeActivity<?> get() {
    return provideChromeActivity(module);
  }

  public static ChromeActivityCommonsModule_ProvideChromeActivityFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideChromeActivityFactory(module);
  }

  public static ChromeActivity<?> provideChromeActivity(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideChromeActivity());
  }
}
