package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesStore;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.ui.TrustedWebActivityModel;
import org.chromium.chrome.browser.browserservices.ui.controller.CurrentPageVerifier;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrustedWebActivityDisclosureController_Factory implements Factory<TrustedWebActivityDisclosureController> {
  private final Provider<BrowserServicesStore> browserServicesStoreProvider;

  private final Provider<TrustedWebActivityModel> modelProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<CurrentPageVerifier> currentPageVerifierProvider;

  private final Provider<TrustedWebActivityUmaRecorder> recorderProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  public TrustedWebActivityDisclosureController_Factory(
      Provider<BrowserServicesStore> browserServicesStoreProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    this.browserServicesStoreProvider = browserServicesStoreProvider;
    this.modelProvider = modelProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.currentPageVerifierProvider = currentPageVerifierProvider;
    this.recorderProvider = recorderProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
  }

  @Override
  public TrustedWebActivityDisclosureController get() {
    return newInstance(browserServicesStoreProvider.get(), modelProvider.get(), lifecycleDispatcherProvider.get(), currentPageVerifierProvider.get(), recorderProvider.get(), clientPackageNameProvider.get());
  }

  public static TrustedWebActivityDisclosureController_Factory create(
      Provider<BrowserServicesStore> browserServicesStoreProvider,
      Provider<TrustedWebActivityModel> modelProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<CurrentPageVerifier> currentPageVerifierProvider,
      Provider<TrustedWebActivityUmaRecorder> recorderProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider) {
    return new TrustedWebActivityDisclosureController_Factory(browserServicesStoreProvider, modelProvider, lifecycleDispatcherProvider, currentPageVerifierProvider, recorderProvider, clientPackageNameProvider);
  }

  public static TrustedWebActivityDisclosureController newInstance(
      BrowserServicesStore browserServicesStore, TrustedWebActivityModel model,
      ActivityLifecycleDispatcher lifecycleDispatcher, CurrentPageVerifier currentPageVerifier,
      TrustedWebActivityUmaRecorder recorder, ClientPackageNameProvider clientPackageNameProvider) {
    return new TrustedWebActivityDisclosureController(browserServicesStore, model, lifecycleDispatcher, currentPageVerifier, recorder, clientPackageNameProvider);
  }
}
