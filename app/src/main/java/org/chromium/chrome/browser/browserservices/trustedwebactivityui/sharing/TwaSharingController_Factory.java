package org.chromium.chrome.browser.browserservices.trustedwebactivityui.sharing;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.TrustedWebActivityUmaRecorder;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TwaSharingController_Factory implements Factory<TwaSharingController> {
  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<WebApkPostShareTargetNavigator> postNavigatorProvider;

  private final Provider<Verifier> verifierDelegateProvider;

  private final Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider;

  public TwaSharingController_Factory(Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<WebApkPostShareTargetNavigator> postNavigatorProvider,
      Provider<Verifier> verifierDelegateProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    this.tabProvider = tabProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.postNavigatorProvider = postNavigatorProvider;
    this.verifierDelegateProvider = verifierDelegateProvider;
    this.umaRecorderProvider = umaRecorderProvider;
  }

  @Override
  public TwaSharingController get() {
    return newInstance(tabProvider.get(), navigationControllerProvider.get(), postNavigatorProvider.get(), verifierDelegateProvider.get(), umaRecorderProvider.get());
  }

  public static TwaSharingController_Factory create(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<WebApkPostShareTargetNavigator> postNavigatorProvider,
      Provider<Verifier> verifierDelegateProvider,
      Provider<TrustedWebActivityUmaRecorder> umaRecorderProvider) {
    return new TwaSharingController_Factory(tabProvider, navigationControllerProvider, postNavigatorProvider, verifierDelegateProvider, umaRecorderProvider);
  }

  public static TwaSharingController newInstance(CustomTabActivityTabProvider tabProvider,
      CustomTabActivityNavigationController navigationController,
      WebApkPostShareTargetNavigator postNavigator, Verifier verifierDelegate,
      TrustedWebActivityUmaRecorder umaRecorder) {
    return new TwaSharingController(tabProvider, navigationController, postNavigator, verifierDelegate, umaRecorder);
  }
}
