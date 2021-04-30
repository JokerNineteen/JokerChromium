package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.Lazy;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.ui.controller.EmptyVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.Verifier;
import org.chromium.chrome.browser.browserservices.ui.controller.trustedwebactivity.TwaVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.AddToHomescreenVerifier;
import org.chromium.chrome.browser.browserservices.ui.controller.webapps.WebApkVerifier;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideVerifierFactory implements Factory<Verifier> {
  private final BaseCustomTabActivityModule module;

  private final Provider<WebApkVerifier> webApkVerifierProvider;

  private final Provider<AddToHomescreenVerifier> addToHomescreenVerifierProvider;

  private final Provider<TwaVerifier> twaVerifierProvider;

  private final Provider<EmptyVerifier> emptyVerifierProvider;

  public BaseCustomTabActivityModule_ProvideVerifierFactory(BaseCustomTabActivityModule module,
      Provider<WebApkVerifier> webApkVerifierProvider,
      Provider<AddToHomescreenVerifier> addToHomescreenVerifierProvider,
      Provider<TwaVerifier> twaVerifierProvider, Provider<EmptyVerifier> emptyVerifierProvider) {
    this.module = module;
    this.webApkVerifierProvider = webApkVerifierProvider;
    this.addToHomescreenVerifierProvider = addToHomescreenVerifierProvider;
    this.twaVerifierProvider = twaVerifierProvider;
    this.emptyVerifierProvider = emptyVerifierProvider;
  }

  @Override
  public Verifier get() {
    return provideVerifier(module, DoubleCheck.lazy(webApkVerifierProvider), DoubleCheck.lazy(addToHomescreenVerifierProvider), DoubleCheck.lazy(twaVerifierProvider), DoubleCheck.lazy(emptyVerifierProvider));
  }

  public static BaseCustomTabActivityModule_ProvideVerifierFactory create(
      BaseCustomTabActivityModule module, Provider<WebApkVerifier> webApkVerifierProvider,
      Provider<AddToHomescreenVerifier> addToHomescreenVerifierProvider,
      Provider<TwaVerifier> twaVerifierProvider, Provider<EmptyVerifier> emptyVerifierProvider) {
    return new BaseCustomTabActivityModule_ProvideVerifierFactory(module, webApkVerifierProvider, addToHomescreenVerifierProvider, twaVerifierProvider, emptyVerifierProvider);
  }

  public static Verifier provideVerifier(BaseCustomTabActivityModule instance,
      Lazy<WebApkVerifier> webApkVerifier, Lazy<AddToHomescreenVerifier> addToHomescreenVerifier,
      Lazy<TwaVerifier> twaVerifier, Lazy<EmptyVerifier> emptyVerifier) {
    return Preconditions.checkNotNullFromProvides(instance.provideVerifier(webApkVerifier, addToHomescreenVerifier, twaVerifier, emptyVerifier));
  }
}
