package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.lifecycle.ActivityLifecycleDispatcher;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory implements Factory<ActivityLifecycleDispatcher> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ActivityLifecycleDispatcher get() {
    return provideLifecycleDispatcher(module);
  }

  public static ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideLifecycleDispatcherFactory(module);
  }

  public static ActivityLifecycleDispatcher provideLifecycleDispatcher(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLifecycleDispatcher());
  }
}
