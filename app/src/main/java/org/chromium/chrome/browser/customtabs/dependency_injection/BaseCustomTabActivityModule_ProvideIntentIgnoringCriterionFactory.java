package org.chromium.chrome.browser.customtabs.dependency_injection;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import org.chromium.chrome.browser.customtabs.content.CustomTabIntentHandler;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory implements Factory<CustomTabIntentHandler.IntentIgnoringCriterion> {
  private final BaseCustomTabActivityModule module;

  public BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory(
      BaseCustomTabActivityModule module) {
    this.module = module;
  }

  @Override
  public CustomTabIntentHandler.IntentIgnoringCriterion get() {
    return provideIntentIgnoringCriterion(module);
  }

  public static BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory create(
      BaseCustomTabActivityModule module) {
    return new BaseCustomTabActivityModule_ProvideIntentIgnoringCriterionFactory(module);
  }

  public static CustomTabIntentHandler.IntentIgnoringCriterion provideIntentIgnoringCriterion(
      BaseCustomTabActivityModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideIntentIgnoringCriterion());
  }
}
