package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.tabmodel.TabModelSelector;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabModelSelectorSupplierFactory implements Factory<Supplier<TabModelSelector>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabModelSelectorSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<TabModelSelector> get() {
    return provideTabModelSelectorSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabModelSelectorSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabModelSelectorSupplierFactory(module);
  }

  public static Supplier<TabModelSelector> provideTabModelSelectorSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabModelSelectorSupplier());
  }
}
