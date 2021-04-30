package org.chromium.chrome.browser.customtabs.content;

import android.content.Context;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;
import org.chromium.chrome.browser.browserservices.BrowserServicesIntentDataProvider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CustomTabIntentHandler_Factory implements Factory<CustomTabIntentHandler> {
  private final Provider<CustomTabActivityTabProvider> tabProvider;

  private final Provider<BrowserServicesIntentDataProvider> intentDataProvider;

  private final Provider<CustomTabIntentHandlingStrategy> handlingStrategyProvider;

  private final Provider<CustomTabIntentHandler.IntentIgnoringCriterion> intentIgnoringCriterionProvider;

  private final Provider<Context> contextProvider;

  public CustomTabIntentHandler_Factory(Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabIntentHandlingStrategy> handlingStrategyProvider,
      Provider<CustomTabIntentHandler.IntentIgnoringCriterion> intentIgnoringCriterionProvider,
      Provider<Context> contextProvider) {
    this.tabProvider = tabProvider;
    this.intentDataProvider = intentDataProvider;
    this.handlingStrategyProvider = handlingStrategyProvider;
    this.intentIgnoringCriterionProvider = intentIgnoringCriterionProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public CustomTabIntentHandler get() {
    return newInstance(tabProvider.get(), intentDataProvider.get(), handlingStrategyProvider.get(), intentIgnoringCriterionProvider.get(), contextProvider.get());
  }

  public static CustomTabIntentHandler_Factory create(
      Provider<CustomTabActivityTabProvider> tabProvider,
      Provider<BrowserServicesIntentDataProvider> intentDataProvider,
      Provider<CustomTabIntentHandlingStrategy> handlingStrategyProvider,
      Provider<CustomTabIntentHandler.IntentIgnoringCriterion> intentIgnoringCriterionProvider,
      Provider<Context> contextProvider) {
    return new CustomTabIntentHandler_Factory(tabProvider, intentDataProvider, handlingStrategyProvider, intentIgnoringCriterionProvider, contextProvider);
  }

  public static CustomTabIntentHandler newInstance(CustomTabActivityTabProvider tabProvider,
      BrowserServicesIntentDataProvider intentDataProvider,
      CustomTabIntentHandlingStrategy handlingStrategy,
      CustomTabIntentHandler.IntentIgnoringCriterion intentIgnoringCriterion, Context context) {
    return new CustomTabIntentHandler(tabProvider, intentDataProvider, handlingStrategy, intentIgnoringCriterion, context);
  }
}
