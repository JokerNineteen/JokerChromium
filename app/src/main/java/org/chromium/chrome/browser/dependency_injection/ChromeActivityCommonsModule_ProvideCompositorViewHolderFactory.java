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
public final class ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory implements Factory<CompositorViewHolder> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public CompositorViewHolder get() {
    return provideCompositorViewHolder(module);
  }

  public static ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideCompositorViewHolderFactory(module);
  }

  public static CompositorViewHolder provideCompositorViewHolder(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCompositorViewHolder());
  }
}
