package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityNavigationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;
import org.chromium.ui.base.WindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabIncognitoManager_Factory implements Factory<CustomTabIncognitoManager> {
  private final Provider<Activity> activityProvider;

  private final Provider<WindowAndroid> windowAndroidProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabActivityNavigationController> navigationControllerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public CustomTabIncognitoManager_Factory(Provider<Activity> activityProvider,
      Provider<WindowAndroid> windowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.activityProvider = activityProvider;
    this.windowAndroidProvider = windowAndroidProvider;
    this.intentDataProvider = intentDataProvider;
    this.navigationControllerProvider = navigationControllerProvider;
    this.tabProvider = tabProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public CustomTabIncognitoManager get() {
    return newInstance(activityProvider.get(), windowAndroidProvider.get(), intentDataProvider.get(), navigationControllerProvider.get(), tabProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static CustomTabIncognitoManager_Factory create(Provider<Activity> activityProvider,
      Provider<WindowAndroid> windowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabActivityNavigationController> navigationControllerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new CustomTabIncognitoManager_Factory(activityProvider, windowAndroidProvider, intentDataProvider, navigationControllerProvider, tabProvider, lifecycleDispatcherProvider);
  }

  public static CustomTabIncognitoManager newInstance(Activity activity,
      WindowAndroid windowAndroid, BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabActivityNavigationController navigationController,
      CustomTabActivityTabProvider tabProvider, ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new CustomTabIncognitoManager(activity, windowAndroid, intentDataProvider, navigationController, tabProvider, lifecycleDispatcher);
  }
}
