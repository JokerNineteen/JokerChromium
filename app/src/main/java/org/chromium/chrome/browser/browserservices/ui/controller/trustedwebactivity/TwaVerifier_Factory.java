package org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifierFactory;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.components.externalauth.ExternalAuthUtils;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TwaVerifier_Factory implements Factory<TwaVerifier> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<OriginVerifierFactory> originVerifierFactoryProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<ClientPackageNameProvider> clientPackageNameProvider;

  private final Provider<ExternalAuthUtils> externalAuthUtilsProvider;

  public TwaVerifier_Factory(Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<OriginVerifierFactory> originVerifierFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<ExternalAuthUtils> externalAuthUtilsProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.intentDataProvider = intentDataProvider;
    this.originVerifierFactoryProvider = originVerifierFactoryProvider;
    this.tabProvider = tabProvider;
    this.clientPackageNameProvider = clientPackageNameProvider;
    this.externalAuthUtilsProvider = externalAuthUtilsProvider;
  }

  @Override
  public TwaVerifier get() {
    return newInstance(lifecycleDispatcherProvider.get(), intentDataProvider.get(), originVerifierFactoryProvider.get(), tabProvider.get(), clientPackageNameProvider.get(), externalAuthUtilsProvider.get());
  }

  public static TwaVerifier_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<OriginVerifierFactory> originVerifierFactoryProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ClientPackageNameProvider> clientPackageNameProvider,
      Provider<ExternalAuthUtils> externalAuthUtilsProvider) {
    return new TwaVerifier_Factory(lifecycleDispatcherProvider, intentDataProvider, originVerifierFactoryProvider, tabProvider, clientPackageNameProvider, externalAuthUtilsProvider);
  }

  public static TwaVerifier newInstance(ActivityLifecycleDispatcher lifecycleDispatcher,
      BrowserServicesIntentDataProvider intentDataProvider,
      OriginVerifierFactory originVerifierFactory, CustomTabActivityTabProvider tabProvider,
      ClientPackageNameProvider clientPackageNameProvider, ExternalAuthUtils externalAuthUtils) {
    return new TwaVerifier(lifecycleDispatcher, intentDataProvider, originVerifierFactory, tabProvider, clientPackageNameProvider, externalAuthUtils);
  }
}
