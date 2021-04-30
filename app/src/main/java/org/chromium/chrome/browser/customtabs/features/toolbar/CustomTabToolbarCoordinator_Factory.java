package org.chromium.chrome.browser.customtabs.features.toolbar;

import android.app.Activity;
import android.content.Context;
import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browser_controls.BrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CloseButtonVisibilityManager;
import org.chromium.chrome.browser.customtabs.CustomTabCompositorContentInitializer;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabToolbarCoordinator_Factory implements Factory<CustomTabToolbarCoordinator> {
  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabsConnection> connectionProvider;

  private final Provider<Activity> activityProvider;

  private final Provider<Context> appContextProvider;

  private final Provider<CustomTabActivityTabController> tabControllerProvider;

  private final Provider<BrowserControlsVisibilityManager> controlsVisiblityManagerProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider;

  private final Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider;

  private final Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider;

  private final Provider<CustomTabToolbarColorController> toolbarColorControllerProvider;

  public CustomTabToolbarCoordinator_Factory(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Activity> activityProvider,
      Provider<Context> appContextProvider,
      Provider<CustomTabActivityTabController> tabControllerProvider,
      Provider<BrowserControlsVisibilityManager> controlsVisiblityManagerProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider) {
    this.intentDataProvider = intentDataProvider;
    this.tabProvider = tabProvider;
    this.connectionProvider = connectionProvider;
    this.activityProvider = activityProvider;
    this.appContextProvider = appContextProvider;
    this.tabControllerProvider = tabControllerProvider;
    this.controlsVisiblityManagerProvider = controlsVisiblityManagerProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.closeButtonVisibilityManagerProvider = closeButtonVisibilityManagerProvider;
    this.visibilityDelegateProvider = visibilityDelegateProvider;
    this.compositorContentInitializerProvider = compositorContentInitializerProvider;
    this.toolbarColorControllerProvider = toolbarColorControllerProvider;
  }

  @Override
  public CustomTabToolbarCoordinator get() {
    return newInstance(intentDataProvider.get(), tabProvider.get(), connectionProvider.get(), activityProvider.get(), appContextProvider.get(), tabControllerProvider.get(), DoubleCheck.lazy(controlsVisiblityManagerProvider), navigationControllerProvider.get(), closeButtonVisibilityManagerProvider.get(), visibilityDelegateProvider.get(), compositorContentInitializerProvider.get(), toolbarColorControllerProvider.get());
  }

  public static CustomTabToolbarCoordinator_Factory create(
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabsConnection> connectionProvider, Provider<Activity> activityProvider,
      Provider<Context> appContextProvider,
      Provider<CustomTabActivityTabController> tabControllerProvider,
      Provider<BrowserControlsVisibilityManager> controlsVisiblityManagerProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<CustomTabBrowserControlsVisibilityDelegate> visibilityDelegateProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider) {
    return new CustomTabToolbarCoordinator_Factory(intentDataProvider, tabProvider, connectionProvider, activityProvider, appContextProvider, tabControllerProvider, controlsVisiblityManagerProvider, navigationControllerProvider, closeButtonVisibilityManagerProvider, visibilityDelegateProvider, compositorContentInitializerProvider, toolbarColorControllerProvider);
  }

  public static CustomTabToolbarCoordinator newInstance(
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabActivityTabProvider tabProvider, CustomTabsConnection connection, Activity activity,
      Context appContext, CustomTabActivityTabController tabController,
      Lazy<BrowserControlsVisibilityManager> controlsVisiblityManager,
      CustomTabActivityNavigationController navigationController,
      CloseButtonVisibilityManager closeButtonVisibilityManager,
      CustomTabBrowserControlsVisibilityDelegate visibilityDelegate,
      CustomTabCompositorContentInitializer compositorContentInitializer,
      CustomTabToolbarColorController toolbarColorController) {
    return new CustomTabToolbarCoordinator(intentDataProvider, tabProvider, connection, activity, appContext, tabController, controlsVisiblityManager, navigationController, closeButtonVisibilityManager, visibilityDelegate, compositorContentInitializer, toolbarColorController);
  }
}
