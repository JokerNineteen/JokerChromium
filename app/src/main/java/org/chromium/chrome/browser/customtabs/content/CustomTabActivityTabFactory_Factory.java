package org.chromium.chrome.browser.customtabs.content;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.app.tabmodel.ChromeTabModelFilterFactory;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.CustomTabDelegateFactory;
import org.chromium.chrome.browser.customtabs.CustomTabTabPersistencePolicy;
import org.chromium.chrome.browser.init.StartupTabPreloader;
import org.chromium.chrome.browser.tabmodel.AsyncTabParamsManager;
import org.chromium.ui.base.ActivityWindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabActivityTabFactory_Factory implements Factory<CustomTabActivityTabFactory> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider;

  private final Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider;

  private final Provider<ActivityWindowAndroid> activityWindowAndroidProvider;

  private final Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<StartupTabPreloader> startupTabPreloaderProvider;

  private final Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider;

  public CustomTabActivityTabFactory_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider) {
    this.activityProvider = activityProvider;
    this.persistencePolicyProvider = persistencePolicyProvider;
    this.tabModelFilterFactoryProvider = tabModelFilterFactoryProvider;
    this.activityWindowAndroidProvider = activityWindowAndroidProvider;
    this.customTabDelegateFactoryProvider = customTabDelegateFactoryProvider;
    this.intentDataProvider = intentDataProvider;
    this.startupTabPreloaderProvider = startupTabPreloaderProvider;
    this.asyncTabParamsManagerProvider = asyncTabParamsManagerProvider;
  }

  @Override
  public CustomTabActivityTabFactory get() {
    return newInstance(activityProvider.get(), persistencePolicyProvider.get(), tabModelFilterFactoryProvider.get(), DoubleCheck.lazy(activityWindowAndroidProvider), DoubleCheck.lazy(customTabDelegateFactoryProvider), intentDataProvider.get(), startupTabPreloaderProvider.get(), DoubleCheck.lazy(asyncTabParamsManagerProvider));
  }

  public static CustomTabActivityTabFactory_Factory create(
      Provider<ChromeActivity<?>> activityProvider,
      Provider<CustomTabTabPersistencePolicy> persistencePolicyProvider,
      Provider<ChromeTabModelFilterFactory> tabModelFilterFactoryProvider,
      Provider<ActivityWindowAndroid> activityWindowAndroidProvider,
      Provider<CustomTabDelegateFactory> customTabDelegateFactoryProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<StartupTabPreloader> startupTabPreloaderProvider,
      Provider<AsyncTabParamsManager> asyncTabParamsManagerProvider) {
    return new CustomTabActivityTabFactory_Factory(activityProvider, persistencePolicyProvider, tabModelFilterFactoryProvider, activityWindowAndroidProvider, customTabDelegateFactoryProvider, intentDataProvider, startupTabPreloaderProvider, asyncTabParamsManagerProvider);
  }

  public static CustomTabActivityTabFactory newInstance(ChromeActivity<?> activity,
      CustomTabTabPersistencePolicy persistencePolicy,
      ChromeTabModelFilterFactory tabModelFilterFactory,
      Lazy<ActivityWindowAndroid> activityWindowAndroid,
      Lazy<CustomTabDelegateFactory> customTabDelegateFactory,
      BrowserServicesIntentDataProvider intentDataProvider, StartupTabPreloader startupTabPreloader,
      Lazy<AsyncTabParamsManager> asyncTabParamsManager) {
    return new CustomTabActivityTabFactory(activity, persistencePolicy, tabModelFilterFactory, activityWindowAndroid, customTabDelegateFactory, intentDataProvider, startupTabPreloader, asyncTabParamsManager);
  }
}
