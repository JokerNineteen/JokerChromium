package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideCompositorViewHolderSupplierFactory implements Factory<Supplier<CompositorViewHolder>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideCompositorViewHolderSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<CompositorViewHolder> get() {
    return provideCompositorViewHolderSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideCompositorViewHolderSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideCompositorViewHolderSupplierFactory(module);
  }

  public static Supplier<CompositorViewHolder> provideCompositorViewHolderSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCompositorViewHolderSupplier());
  }
}
