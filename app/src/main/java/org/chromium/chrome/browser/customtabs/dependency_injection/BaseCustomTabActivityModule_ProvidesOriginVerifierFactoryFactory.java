package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.browserservices.verification.OriginVerifierFactory;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory implements Factory<OriginVerifierFactory> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public OriginVerifierFactory get() {
    return providesOriginVerifierFactory(module);
  }

  public static BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvidesOriginVerifierFactoryFactory(module);
  }

  public static OriginVerifierFactory providesOriginVerifierFactory(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesOriginVerifierFactory());
  }
}
