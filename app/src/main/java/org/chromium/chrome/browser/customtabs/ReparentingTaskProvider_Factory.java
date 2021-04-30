package org.chromium.chrome.browser.customtabs;

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
public final class ReparentingTaskProvider_Factory implements Factory<ReparentingTaskProvider> {
  @Override
  public ReparentingTaskProvider get() {
    return newInstance();
  }

  public static ReparentingTaskProvider_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ReparentingTaskProvider newInstance() {
    return new ReparentingTaskProvider();
  }

  private static final class InstanceHolder {
    private static final ReparentingTaskProvider_Factory INSTANCE = new ReparentingTaskProvider_Factory();
  }
}
