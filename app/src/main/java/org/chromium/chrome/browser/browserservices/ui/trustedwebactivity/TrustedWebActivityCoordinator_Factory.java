package org.chromium.chrome.browser.browserservices.ui.trustedwebactivity;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.QualityEnforcer;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.ui.SharedActivityCoordinator;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.ClientPackageNameProvider;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityDisclosureController;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TrustedWebActivityOpenTimeRecorder;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TwaRegistrar;
import org.chromium.chrome.browser.browserservices.ui.splashscreen.trustedwebactivity.TwaSplashController;
import org.chromium.chrome.browser.customtabs.CustomTabsConnection;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityCoordinator_Factory implements Factory<TrustedWebActivityCoordinator> {
  private final Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider;

  private final Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider;

  private final Provider<DisclosureUiPicker> disclosureUiPickerProvider;

  private final Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<TwaSplashController> splashControllerProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TwaRegistrar> twaRegistrarProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  private final Provider<CustomTabsConnection> customTabsConnectionProvider;

  private final Provider<QualityEnforcer> enforcerProvider;

  public TrustedWebActivityCoordinator_Factory(
      Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider,
      Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider,
      Provider<DisclosureUiPicker> disclosureUiPickerProvider,
      Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TwaSplashController> splashControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TwaRegistrar> twaRegistrarProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider,
      Provider<QualityEnforcer> enforcerProvider) {
    this.sharedActivityCoordinatorProvider = sharedActivityCoordinatorProvider;
    this.disclosureControllerProvider = disclosureControllerProvider;
    this.disclosureUiPickerProvider = disclosureUiPickerProvider;
    this.openTimeRecorderProvider = openTimeRecorderProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.splashControllerProvider = splashControllerProvider;
    this.intentDataProvider = intentDataProvider;
    this.umaRecorderProvider = umaRecorderProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.twaRegistrarProvider = twaRegistrarProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
    this.customTabsConnectionProvider = customTabsConnectionProvider;
    this.enforcerProvider = enforcerProvider;
  }

  @Override
  public TrustedWebActivityCoordinator get() {
    return newInstance(sharedActivityCoordinatorProvider.get(), disclosureControllerProvider.get(), disclosureUiPickerProvider.get(), openTimeRecorderProvider.get(), currentPageVerifierProvider.get(), DoubleCheck.lazy(splashControllerProvider), intentDataProvider.get(), umaRecorderProvider.get(), lifecycleDispatcherProvider.get(), twaRegistrarProvider.get(), clientPackageNameProvider.get(), customTabsConnectionProvider.get(), enforcerProvider.get());
  }

  public static TrustedWebActivityCoordinator_Factory create(
      Provider<SharedActivityCoordinator> sharedActivityCoordinatorProvider,
      Provider<TrustedWebActivityDisclosureController> disclosureControllerProvider,
      Provider<DisclosureUiPicker> disclosureUiPickerProvider,
      Provider<TrustedWebActivityOpenTimeRecorder> openTimeRecorderProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TwaSplashController> splashControllerProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TwaRegistrar> twaRegistrarProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<CustomTabsConnection> customTabsConnectionProvider,
      Provider<QualityEnforcer> enforcerProvider) {
    return new TrustedWebActivityCoordinator_Factory(sharedActivityCoordinatorProvider, disclosureControllerProvider, disclosureUiPickerProvider, openTimeRecorderProvider, currentPageVerifierProvider, splashControllerProvider, intentDataProvider, umaRecorderProvider, lifecycleDispatcherProvider, twaRegistrarProvider, clientPackageNameProvider, customTabsConnectionProvider, enforcerProvider);
  }

  public static TrustedWebActivityCoordinator newInstance(
      SharedActivityCoordinator sharedActivityCoordinator,
      TrustedWebActivityDisclosureController disclosureController,
      DisclosureUiPicker disclosureUiPicker, TrustedWebActivityOpenTimeRecorder openTimeRecorder,
      CurrentPageVerifier currentPageVerifier, Lazy<TwaSplashController> splashController,
      BrowserServicesIntentDataProvider intentDataProvider,
      TrustedWebActivityUmaRecorder umaRecorder, ActivityLifecycleDispatcher lifecycleDispatcher,
      TwaRegistrar twaRegistrar, ClientPackageNameProvider clientPackageNameProvider,
      CustomTabsConnection customTabsConnection, QualityEnforcer enforcer) {
    return new TrustedWebActivityCoordinator(sharedActivityCoordinator, disclosureController, disclosureUiPicker, openTimeRecorder, currentPageVerifier, splashController, intentDataProvider, umaRecorder, lifecycleDispatcher, twaRegistrar, clientPackageNameProvider, customTabsConnection, enforcer);
  }
}
