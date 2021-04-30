package org.chromium.chrome.browser.customtabs;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
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
public final class CloseButtonNavigator_Factory implements Factory<CloseButtonNavigator> {
  private final Provider<CustomTabActivityTabController> tabControllerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  public CloseButtonNavigator_Factory(
      Provider<CustomTabActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    this.tabControllerProvider = tabControllerProvider;
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
  }

  @Override
  public CloseButtonNavigator get() {
    return newInstance(tabControllerProvider.get(), tabProvider.get(), intentDataProvider.get());
  }

  public static CloseButtonNavigator_Factory create(
      Provider<CustomTabActivityTabController> tabControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider) {
    return new CloseButtonNavigator_Factory(tabControllerProvider, tabProvider, intentDataProvider);
  }

  public static CloseButtonNavigator newInstance(CustomTabActivityTabController tabController,
      CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider) {
    return new CloseButtonNavigator(tabController, tabProvider, intentDataProvider);
  }
}
