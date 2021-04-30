package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.base.supplier.Supplier;
import org.chromium.ui.modaldialog.ModalDialogManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideModalDialogManagerSupplierFactory implements Factory<Supplier<ModalDialogManager>> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideModalDialogManagerSupplierFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public Supplier<ModalDialogManager> get() {
    return provideModalDialogManagerSupplier(module);
  }

  public static ChromeActivityCommonsModule_ProvideModalDialogManagerSupplierFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideModalDialogManagerSupplierFactory(module);
  }

  public static Supplier<ModalDialogManager> provideModalDialogManagerSupplier(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideModalDialogManagerSupplier());
  }
}
