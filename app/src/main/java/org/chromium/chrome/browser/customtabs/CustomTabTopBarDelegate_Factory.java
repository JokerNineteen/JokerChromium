package org.chromium.chrome.browser.customtabs;

import android.app.Activity;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabTopBarDelegate_Factory implements Factory<CustomTabTopBarDelegate> {
  private final Provider<Activity> activityProvider;

  public CustomTabTopBarDelegate_Factory(Provider<Activity> activityProvider) {
    this.activityProvider = activityProvider;
  }

  @Override
  public CustomTabTopBarDelegate get() {
    return newInstance(activityProvider.get());
  }

  public static CustomTabTopBarDelegate_Factory create(Provider<Activity> activityProvider) {
    return new CustomTabTopBarDelegate_Factory(activityProvider);
  }

  public static CustomTabTopBarDelegate newInstance(Activity activity) {
    return new CustomTabTopBarDelegate(activity);
  }
}
