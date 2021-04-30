package org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CloseButtonVisibilityManager;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarCoordinator;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityBrowserControlsVisibilityManager_Factory implements Factory<TrustedWebActivityBrowserControlsVisibilityManager> {
  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider;

  private final Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public TrustedWebActivityBrowserControlsVisibilityManager_Factory(
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.tabProvider = tabProvider;
    this.toolbarCoordinatorProvider = toolbarCoordinatorProvider;
    this.closeButtonVisibilityManagerProvider = closeButtonVisibilityManagerProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public TrustedWebActivityBrowserControlsVisibilityManager get() {
    return newInstance(tabObserverRegistrarProvider.get(), tabProvider.get(), toolbarCoordinatorProvider.get(), closeButtonVisibilityManagerProvider.get(), intentDataProvider.get());
  }

  public static TrustedWebActivityBrowserControlsVisibilityManager_Factory create(
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabToolbarCoordinator> toolbarCoordinatorProvider,
      Provider<CloseButtonVisibilityManager> closeButtonVisibilityManagerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new TrustedWebActivityBrowserControlsVisibilityManager_Factory(tabObserverRegistrarProvider, tabProvider, toolbarCoordinatorProvider, closeButtonVisibilityManagerProvider, intentDataProvider);
  }

  public static TrustedWebActivityBrowserControlsVisibilityManager newInstance(
      TabObserverRegistrar tabObserverRegistrar, CustomTabActivityTabProvider tabProvider,
      CustomTabToolbarCoordinator toolbarCoordinator,
      CloseButtonVisibilityManager closeButtonVisibilityManager,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new TrustedWebActivityBrowserControlsVisibilityManager(tabObserverRegistrar, tabProvider, toolbarCoordinator, closeButtonVisibilityManager, intentDataProvider);
  }
}
