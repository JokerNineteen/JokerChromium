package org.chromium.chrome.browser.customtabs.features;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImmersiveModeController_Factory implements Factory<ImmersiveModeController> {
  private final Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider;

  private final Provider<Activity> activityProvider;

  public ImmersiveModeController_Factory(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider) {
    this.lifecycleDispatcherProvider = lifecycleDispatcherProvider;
    this.activityProvider = activityProvider;
  }

  @Override
  public ImmersiveModeController get() {
    return newInstance(lifecycleDispatcherProvider.get(), activityProvider.get());
  }

  public static ImmersiveModeController_Factory create(
      Provider<ActivityLifecycleDispatcher> lifecycleDispatcherProvider,
      Provider<Activity> activityProvider) {
    return new ImmersiveModeController_Factory(lifecycleDispatcherProvider, activityProvider);
  }

  public static ImmersiveModeController newInstance(ActivityLifecycleDispatcher lifecycleDispatcher,
      Activity activity) {
    return new ImmersiveModeController(lifecycleDispatcher, activity);
  }
}
