package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browser_controls.BrowserControlsSizer;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.night_mode.SystemNightModeMonitor;
import org.chromium.ui.base.WindowAndroid;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabBottomBarDelegate_Factory implements Factory<CustomTabBottomBarDelegate> {
  private final Provider<Activity> activityProvider;

  private final Provider<WindowAndroid> windowAndroidProvider;

  private final Provider<BrowserServicesIntentDataProvider> dataProvider;

  private final Provider<BrowserControlsSizer> browserControlsSizerProvider;

  private final Provider<CustomTabNightModeStateController> nightModeStateControllerProvider;

  private final Provider<SystemNightModeMonitor> systemNightModeMonitorProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider;

  public CustomTabBottomBarDelegate_Factory(Provider<Activity> activityProvider,
      Provider<WindowAndroid> windowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> dataProvider,
      Provider<BrowserControlsSizer> browserControlsSizerProvider,
      Provider<CustomTabNightModeStateController> nightModeStateControllerProvider,
      Provider<SystemNightModeMonitor> systemNightModeMonitorProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider) {
    this.activityProvider = activityProvider;
    this.windowAndroidProvider = windowAndroidProvider;
    this.dataProvider = dataProvider;
    this.browserControlsSizerProvider = browserControlsSizerProvider;
    this.nightModeStateControllerProvider = nightModeStateControllerProvider;
    this.systemNightModeMonitorProvider = systemNightModeMonitorProvider;
    this.tabProvider = tabProvider;
    this.compositorContentInitializerProvider = compositorContentInitializerProvider;
  }

  @Override
  public CustomTabBottomBarDelegate get() {
    return newInstance(activityProvider.get(), windowAndroidProvider.get(), dataProvider.get(), browserControlsSizerProvider.get(), nightModeStateControllerProvider.get(), systemNightModeMonitorProvider.get(), tabProvider.get(), compositorContentInitializerProvider.get());
  }

  public static CustomTabBottomBarDelegate_Factory create(Provider<Activity> activityProvider,
      Provider<WindowAndroid> windowAndroidProvider,
      Provider<BrowserServicesIntentDataProvider> dataProvider,
      Provider<BrowserControlsSizer> browserControlsSizerProvider,
      Provider<CustomTabNightModeStateController> nightModeStateControllerProvider,
      Provider<SystemNightModeMonitor> systemNightModeMonitorProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CustomTabCompositorContentInitializer> compositorContentInitializerProvider) {
    return new CustomTabBottomBarDelegate_Factory(activityProvider, windowAndroidProvider, dataProvider, browserControlsSizerProvider, nightModeStateControllerProvider, systemNightModeMonitorProvider, tabProvider, compositorContentInitializerProvider);
  }

  public static CustomTabBottomBarDelegate newInstance(Activity activity,
      WindowAndroid windowAndroid, BrowserServicesIntentDataProvider dataProvider,
      BrowserControlsSizer browserControlsSizer,
      CustomTabNightModeStateController nightModeStateController,
      SystemNightModeMonitor systemNightModeMonitor, CustomTabActivityTabProvider tabProvider,
      CustomTabCompositorContentInitializer compositorContentInitializer) {
    return new CustomTabBottomBarDelegate(activity, windowAndroid, dataProvider, browserControlsSizer, nightModeStateController, systemNightModeMonitor, tabProvider, compositorContentInitializer);
  }
}
