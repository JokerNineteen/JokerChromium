package org.chromium.chrome.browser.customtabs.features.toolbar;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.browser_controls.BrowserControlsVisibilityManager;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabBrowserControlsVisibilityDelegate_Factory implements Factory<CustomTabBrowserControlsVisibilityDelegate> {
  private final Provider<BrowserControlsVisibilityManager> controlsVisibilityManagerProvider;

  private final Provider<ActivityTabProvider> tabProvider;

  public CustomTabBrowserControlsVisibilityDelegate_Factory(
      Provider<BrowserControlsVisibilityManager> controlsVisibilityManagerProvider,
      Provider<ActivityTabProvider> tabProvider) {
    this.controlsVisibilityManagerProvider = controlsVisibilityManagerProvider;
    this.tabProvider = tabProvider;
  }

  @Override
  public CustomTabBrowserControlsVisibilityDelegate get() {
    return newInstance(DoubleCheck.lazy(controlsVisibilityManagerProvider), tabProvider.get());
  }

  public static CustomTabBrowserControlsVisibilityDelegate_Factory create(
      Provider<BrowserControlsVisibilityManager> controlsVisibilityManagerProvider,
      Provider<ActivityTabProvider> tabProvider) {
    return new CustomTabBrowserControlsVisibilityDelegate_Factory(controlsVisibilityManagerProvider, tabProvider);
  }

  public static CustomTabBrowserControlsVisibilityDelegate newInstance(
      Lazy<BrowserControlsVisibilityManager> controlsVisibilityManager,
      ActivityTabProvider tabProvider) {
    return new CustomTabBrowserControlsVisibilityDelegate(controlsVisibilityManager, tabProvider);
  }
}
