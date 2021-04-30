package org.chromium.chrome.browser.dependency_injection;

import android.view.View;
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
public final class ChromeActivityCommonsModule_ProvideDecorViewFactory implements Factory<View> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideDecorViewFactory(ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public View get() {
    return provideDecorView(module);
  }

  public static ChromeActivityCommonsModule_ProvideDecorViewFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideDecorViewFactory(module);
  }

  public static View provideDecorView(ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideDecorView());
  }
}
