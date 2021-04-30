package org.chromium.chrome.browser.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.night_mode.SystemNightModeMonitor;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ChromeAppModule_ProvideSystemNightModeMonitorFactory implements Factory<SystemNightModeMonitor> {
  private final ChromeAppModule module;

  public ChromeAppModule_ProvideSystemNightModeMonitorFactory(ChromeAppModule module) {
    this.module = module;
  }

  @Override
  public SystemNightModeMonitor get() {
    return provideSystemNightModeMonitor(module);
  }

  public static ChromeAppModule_ProvideSystemNightModeMonitorFactory create(
      ChromeAppModule module) {
    return new ChromeAppModule_ProvideSystemNightModeMonitorFactory(module);
  }

  public static SystemNightModeMonitor provideSystemNightModeMonitor(ChromeAppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideSystemNightModeMonitor());
  }
}
