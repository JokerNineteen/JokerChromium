package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.ObservableSupplier;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideTabContentManagerSupplierFactory implements Factory<ObservableSupplier<TabContentManager>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideTabContentManagerSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ObservableSupplier<TabContentManager> get() {
    return provideTabContentManagerSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideTabContentManagerSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideTabContentManagerSupplierFactory(module);
  }

  public static ObservableSupplier<TabContentManager> provideTabContentManagerSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideTabContentManagerSupplier());
  }
}
