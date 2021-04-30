package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetController;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideBottomSheetControllerFactory implements Factory<BottomSheetController> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideBottomSheetControllerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public BottomSheetController get() {
    return provideBottomSheetController(module);
  }

  public static ChromeActivityCommonsModule_ProvideBottomSheetControllerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideBottomSheetControllerFactory(module);
  }

  public static BottomSheetController provideBottomSheetController(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideBottomSheetController());
  }
}
