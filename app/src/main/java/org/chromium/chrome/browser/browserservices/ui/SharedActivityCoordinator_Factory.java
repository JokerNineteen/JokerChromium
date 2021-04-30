package org.chromium.chrome.browser.browserservices.ui;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.controller.TrustedWebActivityBrowserControlsVisibilityManager;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.customtabs.CustomTabOrientationController;
import org.chromium.chrome.browser.customtabs.CustomTabStatusBarColorProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.features.ImmersiveModeController;
import org.chromium.chrome.browser.customtabs.features.toolbar.CustomTabToolbarColorController;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedActivityCoordinator_Factory implements Factory<SharedActivityCoordinator> {
  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<Verifier> verifierProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabToolbarColorController> toolbarColorControllerProvider;

  private final Provider<CustomTabStatusBarColorProvider> statusBarColorProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TrustedWebActivityBrowserControlsVisibilityManager> browserControlsVisibilityManagerProvider;

  private final Provider<ImmersiveModeController> immersiveModeControllerProvider;

  private final Provider<CustomTabOrientationController> customTabOrientationControllerProvider;

  public SharedActivityCoordinator_Factory(
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<Verifier> verifierProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider,
      Provider<CustomTabStatusBarColorProvider> statusBarColorProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TrustedWebActivityBrowserControlsVisibilityManager> browserControlsVisibilityManagerProvider,
      Provider<ImmersiveModeController> immersiveModeControllerProvider,
      Provider<CustomTabOrientationController> customTabOrientationControllerProvider) {
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.verifierProvider = verifierProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.intentDataProvider = intentDataProvider;
    this.toolbarColorControllerProvider = toolbarColorControllerProvider;
    this.statusBarColorProvider = statusBarColorProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.browserControlsVisibilityManagerProvider = browserControlsVisibilityManagerProvider;
    this.immersiveModeControllerProvider = immersiveModeControllerProvider;
    this.customTabOrientationControllerProvider = customTabOrientationControllerProvider;
  }

  @Override
  public SharedActivityCoordinator get() {
    return newInstance(currentPageVerifierProvider.get(), verifierProvider.get(), navigationControllerProvider.get(), intentDataProvider.get(), toolbarColorControllerProvider.get(), statusBarColorProvider.get(), lifecycleDispatcherProvider.get(), browserControlsVisibilityManagerProvider.get(), DoubleCheck.lazy(immersiveModeControllerProvider), customTabOrientationControllerProvider.get());
  }

  public static SharedActivityCoordinator_Factory create(
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<Verifier> verifierProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabToolbarColorController> toolbarColorControllerProvider,
      Provider<CustomTabStatusBarColorProvider> statusBarColorProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TrustedWebActivityBrowserControlsVisibilityManager> browserControlsVisibilityManagerProvider,
      Provider<ImmersiveModeController> immersiveModeControllerProvider,
      Provider<CustomTabOrientationController> customTabOrientationControllerProvider) {
    return new SharedActivityCoordinator_Factory(currentPageVerifierProvider, verifierProvider, navigationControllerProvider, intentDataProvider, toolbarColorControllerProvider, statusBarColorProvider, lifecycleDispatcherProvider, browserControlsVisibilityManagerProvider, immersiveModeControllerProvider, customTabOrientationControllerProvider);
  }

  public static SharedActivityCoordinator newInstance(CurrentPageVerifier currentPageVerifier,
      Verifier verifier, CustomTabActivityNavigationController navigationController,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabToolbarColorController toolbarColorController,
      CustomTabStatusBarColorProvider statusBarColorProvider,
      ActivityLifecycleDispatcher lifecycleDispatcher,
      TrustedWebActivityBrowserControlsVisibilityManager browserControlsVisibilityManager,
      Lazy<ImmersiveModeController> immersiveModeController,
      CustomTabOrientationController customTabOrientationController) {
    return new SharedActivityCoordinator(currentPageVerifier, verifier, navigationController, intentDataProvider, toolbarColorController, statusBarColorProvider, lifecycleDispatcher, browserControlsVisibilityManager, immersiveModeController, customTabOrientationController);
  }
}
