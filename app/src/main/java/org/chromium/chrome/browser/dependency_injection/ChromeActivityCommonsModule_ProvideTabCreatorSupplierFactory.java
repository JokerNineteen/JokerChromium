package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.tabmodel.TabCreator;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabCreatorSupplierFactory implements Factory<Supplier<TabCreator>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabCreatorSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<TabCreator> get() {
    return provideTabCreatorSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabCreatorSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabCreatorSupplierFactory(module);
  }

  public static Supplier<TabCreator> provideTabCreatorSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabCreatorSupplier());
  }
}
