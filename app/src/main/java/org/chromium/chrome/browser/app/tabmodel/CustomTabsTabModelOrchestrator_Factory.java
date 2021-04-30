package org.chromium.chrome.browser.app.tabmodel;

import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabsTabModelOrchestrator_Factory implements Factory<CustomTabsTabModelOrchestrator> {
  @Override
  public CustomTabsTabModelOrchestrator get() {
    return newInstance();
  }

  public static CustomTabsTabModelOrchestrator_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static CustomTabsTabModelOrchestrator newInstance() {
    return new CustomTabsTabModelOrchestrator();
  }

  private static final class InstanceHolder {
    private static final CustomTabsTabModelOrchestrator_Factory INSTANCE = new CustomTabsTabModelOrchestrator_Factory();
  }
}
