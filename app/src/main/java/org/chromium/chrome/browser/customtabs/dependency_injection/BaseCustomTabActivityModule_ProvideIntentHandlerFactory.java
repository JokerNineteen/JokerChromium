package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.trustedwebactivityui.TwaIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandlingStrategy;
import org.chromium.chrome.browser.customtabs.content.DefaultCustomTabIntentHandlingStrategy;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideIntentHandlerFactory implements Factory<CustomTabIntentHandlingStrategy> {
  private final BaseCustomTabActivityModule module;

  private final Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider;

  private final Provider<TwaIntentHandlingStrategy> twaHandlerProvider;

  public BaseCustomTabActivityModule_ProvideIntentHandlerFactory(BaseCustomTabActivityModule module,
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider,
      Provider<TwaIntentHandlingStrategy> twaHandlerProvider) {
    this.module = module;
    this.defaultHandlerProvider = defaultHandlerProvider;
    this.twaHandlerProvider = twaHandlerProvider;
  }

  @Override
  public CustomTabIntentHandlingStrategy get() {
    return provideIntentHandler(module, DoubleCheck.lazy(defaultHandlerProvider), DoubleCheck.lazy(twaHandlerProvider));
  }

  public static BaseCustomTabActivityModule_ProvideIntentHandlerFactory create(
      BaseCustomTabActivityModule module,
      Provider<DefaultCustomTabIntentHandlingStrategy> defaultHandlerProvider,
      Provider<TwaIntentHandlingStrategy> twaHandlerProvider) {
    return new BaseCustomTabActivityModule_ProvideIntentHandlerFactory(module, defaultHandlerProvider, twaHandlerProvider);
  }

  public static CustomTabIntentHandlingStrategy provideIntentHandler(
      BaseCustomTabActivityModule instance,
      Lazy<DefaultCustomTabIntentHandlingStrategy> defaultHandler,
      Lazy<TwaIntentHandlingStrategy> twaHandler) {
    return Preconditions.checkNotNullFromProvides(instance.provideIntentHandler(defaultHandler, twaHandler));
  }
}
