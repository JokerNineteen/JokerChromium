package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.metrics.ActivityTabStartupMetricsTracker;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeActivityCommonsModule_ProvideActivityTabStartupMetricsTrackerFactory implements Factory<ActivityTabStartupMetricsTracker> {
  private final ChromeActivityCommonsModule module;

  public ChromeActivityCommonsModule_ProvideActivityTabStartupMetricsTrackerFactory(
      ChromeActivityCommonsModule module) {
    this.module = module;
  }

  @Override
  public ActivityTabStartupMetricsTracker get() {
    return provideActivityTabStartupMetricsTracker(module);
  }

  public static ChromeActivityCommonsModule_ProvideActivityTabStartupMetricsTrackerFactory create(
      ChromeActivityCommonsModule module) {
    return new ChromeActivityCommonsModule_ProvideActivityTabStartupMetricsTrackerFactory(module);
  }

  public static ActivityTabStartupMetricsTracker provideActivityTabStartupMetricsTracker(
      ChromeActivityCommonsModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideActivityTabStartupMetricsTracker());
  }
}
