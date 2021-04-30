package org.chromium.chrome.browser.webapps;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.ActivityTabProvider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class WebApkUpdateManager_Factory implements Factory<WebApkUpdateManager> {
  private final Provider<ActivityTabProvider> tabProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  public WebApkUpdateManager_Factory(Provider<ActivityTabProvider> tabProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    this.tabProvider = tabProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
  }

  @Override
  public WebApkUpdateManager get() {
    return newInstance(tabProvider.get(), lifecycleDispatcherProvider.get());
  }

  public static WebApkUpdateManager_Factory create(Provider<ActivityTabProvider> tabProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider) {
    return new WebApkUpdateManager_Factory(tabProvider, lifecycleDispatcherProvider);
  }

  public static WebApkUpdateManager newInstance(ActivityTabProvider tabProvider,
      ActivityLifecycleDispatcher lifecycleDispatcher) {
    return new WebApkUpdateManager(tabProvider, lifecycleDispatcher);
  }
}
