package org.chromium.chrome.browser.browserservices.ui.splashscreen;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.app.ChromeActivity;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaFinishHandler;
import org.chromium.chrome.browser.compositor.CompositorViewHolder;
import org.chromium.chrome.browser.customtabs.CustomTabOrientationController;
import org.chromium.chrome.browser.customtabs.content.CustomTabActivityTabProvider;
import org.chromium.chrome.browser.customtabs.content.TabObserverRegistrar;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SplashController_Factory implements Factory<SplashController> {
  private final Provider<ChromeActivity<?>> activityProvider;

  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<TabObserverRegistrar> tabObserverRegistrarProvider;

  private final Provider<CustomTabOrientationController> orientationControllerProvider;

  private final Provider<TwaFinishHandler> finishHandlerProvider;

  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<CompositorViewHolder> compositorViewHolderProvider;

  public SplashController_Factory(Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabOrientationController> orientationControllerProvider,
      Provider<TwaFinishHandler> finishHandlerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider) {
    this.activityProvider = activityProvider;
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.tabObserverRegistrarProvider = tabObserverRegistrarProvider;
    this.orientationControllerProvider = orientationControllerProvider;
    this.finishHandlerProvider = finishHandlerProvider;
    this.tabProvider = tabProvider;
    this.compositorViewHolderProvider = compositorViewHolderProvider;
  }

  @Override
  public SplashController get() {
    return newInstance(activityProvider.get(), lifecycleDispatcherProvider.get(), tabObserverRegistrarProvider.get(), orientationControllerProvider.get(), finishHandlerProvider.get(), tabProvider.get(), DoubleCheck.lazy(compositorViewHolderProvider));
  }

  public static SplashController_Factory create(Provider<ChromeActivity<?>> activityProvider,
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<TabObserverRegistrar> tabObserverRegistrarProvider,
      Provider<CustomTabOrientationController> orientationControllerProvider,
      Provider<TwaFinishHandler> finishHandlerProvider,
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<CompositorViewHolder> compositorViewHolderProvider) {
    return new SplashController_Factory(activityProvider, lifecycleDispatcherProvider, tabObserverRegistrarProvider, orientationControllerProvider, finishHandlerProvider, tabProvider, compositorViewHolderProvider);
  }

  public static SplashController newInstance(ChromeActivity<?> activity,
      ActivityLifecycleDispatcher lifecycleDispatcher, TabObserverRegistrar tabObserverRegistrar,
      CustomTabOrientationController orientationController, TwaFinishHandler finishHandler,
      CustomTabActivityTabProvider tabProvider, Lazy<CompositorViewHolder> compositorViewHolder) {
    return new SplashController(activity, lifecycleDispatcher, tabObserverRegistrar, orientationController, finishHandler, tabProvider, compositorViewHolder);
  }
}
