package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.init.ChromeActivityNativeDelegate;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideChromeActivityNativeDelegateFactory implements Factory<ChromeActivityNativeDelegate> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideChromeActivityNativeDelegateFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ChromeActivityNativeDelegate get() {
    return provideChromeActivityNativeDelegate(module);
  }

  public static ChromeActivityCommonsModule_ProvideChromeActivityNativeDelegateFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideChromeActivityNativeDelegateFactory(module);
  }

  public static ChromeActivityNativeDelegate provideChromeActivityNativeDelegate(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideChromeActivityNativeDelegate());
  }
}
