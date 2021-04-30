package org.chromium.chrome.browser.customtabs.content;

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
public final class ProfileProvider_Factory implements Factory<ProfileProvider> {
  @Override
  public ProfileProvider get() {
    return newInstance();
  }

  public static ProfileProvider_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProfileProvider newInstance() {
    return new ProfileProvider();
  }

  private static final class InstanceHolder {
    private static final ProfileProvider_Factory INSTANCE = new ProfileProvider_Factory();
  }
}
