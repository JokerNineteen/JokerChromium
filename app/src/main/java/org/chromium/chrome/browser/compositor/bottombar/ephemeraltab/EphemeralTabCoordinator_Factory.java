package org.chromium.chrome.browser.compositor.bottombar.ephemeraltab;

import android.content.Context;
import android.view.View;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.base.supplier.Supplier;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.tabmodel.TabCreator;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetController;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EphemeralTabCoordinator_Factory implements Factory<EphemeralTabCoordinator> {
  private final Provider<Context> contextProvider;

  private final Provider<ActivityWindowAndroid> windowProvider;

  private final Provider<View> layoutViewProvider;

  private final Provider<ActivityTabProvider> tabProvider;

  private final Provider<Supplier<TabCreator>> tabCreatorProvider;

  private final Provider<BottomSheetController> bottomSheetControllerProvider;

  private final Provider<Boolean> canPromoteToNewTabProvider;

  public EphemeralTabCoordinator_Factory(Provider<Context> contextProvider,
      Provider<ActivityWindowAndroid> windowProvider, Provider<View> layoutViewProvider,
      Provider<ActivityTabProvider> tabProvider, Provider<Supplier<TabCreator>> tabCreatorProvider,
      Provider<BottomSheetController> bottomSheetControllerProvider,
      Provider<Boolean> canPromoteToNewTabProvider) {
    this.contextProvider = contextProvider;
    this.windowProvider = windowProvider;
    this.layoutViewProvider = layoutViewProvider;
    this.tabProvider = tabProvider;
    this.tabCreatorProvider = tabCreatorProvider;
    this.bottomSheetControllerProvider = bottomSheetControllerProvider;
    this.canPromoteToNewTabProvider = canPromoteToNewTabProvider;
  }

  @Override
  public EphemeralTabCoordinator get() {
    return newInstance(contextProvider.get(), windowProvider.get(), layoutViewProvider.get(), tabProvider.get(), tabCreatorProvider.get(), bottomSheetControllerProvider.get(), canPromoteToNewTabProvider.get());
  }

  public static EphemeralTabCoordinator_Factory create(Provider<Context> contextProvider,
      Provider<ActivityWindowAndroid> windowProvider, Provider<View> layoutViewProvider,
      Provider<ActivityTabProvider> tabProvider, Provider<Supplier<TabCreator>> tabCreatorProvider,
      Provider<BottomSheetController> bottomSheetControllerProvider,
      Provider<Boolean> canPromoteToNewTabProvider) {
    return new EphemeralTabCoordinator_Factory(contextProvider, windowProvider, layoutViewProvider, tabProvider, tabCreatorProvider, bottomSheetControllerProvider, canPromoteToNewTabProvider);
  }

  public static EphemeralTabCoordinator newInstance(Context context, ActivityWindowAndroid window,
      View layoutView, ActivityTabProvider tabProvider, Supplier<TabCreator> tabCreator,
      BottomSheetController bottomSheetController, boolean canPromoteToNewTab) {
    return new EphemeralTabCoordinator(context, window, layoutView, tabProvider, tabCreator, bottomSheetController, canPromoteToNewTab);
  }
}
