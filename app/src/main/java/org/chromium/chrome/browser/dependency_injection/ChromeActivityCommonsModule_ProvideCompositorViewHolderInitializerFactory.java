package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideCompositorViewHolderInitializerFactory implements Factory<CompositorViewHolder.Initializer> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideCompositorViewHolderInitializerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public CompositorViewHolder.Initializer get() {
    return provideCompositorViewHolderInitializer(module);
  }

  public static ChromeActivityCommonsModule_ProvideCompositorViewHolderInitializerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideCompositorViewHolderInitializerFactory(module);
  }

  public static CompositorViewHolder.Initializer provideCompositorViewHolderInitializer(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCompositorViewHolderInitializer());
  }
}
