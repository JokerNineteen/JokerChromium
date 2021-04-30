package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.webapps.WebApkPostShareTargetNavigator;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory implements Factory<WebApkPostShareTargetNavigator> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public WebApkPostShareTargetNavigator get() {
    return providePostShareTargetNavigator(module);
  }

  public static BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvidePostShareTargetNavigatorFactory(module);
  }

  public static WebApkPostShareTargetNavigator providePostShareTargetNavigator(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providePostShareTargetNavigator());
  }
}
