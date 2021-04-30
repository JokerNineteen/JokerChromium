package org.chromium.chrome.browser;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.multiwindow.MultiWindowUtils;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppHooksModule_ProvideMultiWindowUtilsFactory implements Factory<MultiWindowUtils> {
  private final AppHooksModule module;

  public AppHooksModule_ProvideMultiWindowUtilsFactory(AppHooksModule module) {
    this.module = module;
  }

  @Override
  public MultiWindowUtils get() {
    return provideMultiWindowUtils(module);
  }

  public static AppHooksModule_ProvideMultiWindowUtilsFactory create(AppHooksModule module) {
    return new AppHooksModule_ProvideMultiWindowUtilsFactory(module);
  }

  public static MultiWindowUtils provideMultiWindowUtils(AppHooksModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideMultiWindowUtils());
  }
}
