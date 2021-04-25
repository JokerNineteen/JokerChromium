package org.chromium.chrome.browser.payments;

import java.lang.Override;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;
import org.chromium.content_public.browser.WebContents;
import org.chromium.url.GURL;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class ServiceWorkerPaymentAppBridgeJni implements ServiceWorkerPaymentAppBridge.Natives {
  private static ServiceWorkerPaymentAppBridge.Natives testInstance;

  public static final JniStaticTestMocker<ServiceWorkerPaymentAppBridge.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(
        org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public void hasServiceWorkerPaymentApps(
      ServiceWorkerPaymentAppBridge.HasServiceWorkerPaymentAppsCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_payments_ServiceWorkerPaymentAppBridge_hasServiceWorkerPaymentApps(callback);
  }

  @Override
  public void getServiceWorkerPaymentAppsInfo(
      ServiceWorkerPaymentAppBridge.GetServiceWorkerPaymentAppsInfoCallback callback) {
    GEN_JNI.org_chromium_chrome_browser_payments_ServiceWorkerPaymentAppBridge_getServiceWorkerPaymentAppsInfo(callback);
  }

  @Override
  public void onClosingPaymentAppWindow(WebContents paymentRequestWebContents, int reason) {
    GEN_JNI.org_chromium_chrome_browser_payments_ServiceWorkerPaymentAppBridge_onClosingPaymentAppWindow(paymentRequestWebContents, reason);
  }

  @Override
  public void onOpeningPaymentAppWindow(WebContents paymentRequestWebContents,
      WebContents paymentHandlerWebContents) {
    GEN_JNI.org_chromium_chrome_browser_payments_ServiceWorkerPaymentAppBridge_onOpeningPaymentAppWindow(paymentRequestWebContents, paymentHandlerWebContents);
  }

  @Override
  public long getSourceIdForPaymentAppFromScope(GURL swScope) {
    return (long)GEN_JNI.org_chromium_chrome_browser_payments_ServiceWorkerPaymentAppBridge_getSourceIdForPaymentAppFromScope(swScope);
  }

  public static ServiceWorkerPaymentAppBridge.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.payments.ServiceWorkerPaymentAppBridge.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new ServiceWorkerPaymentAppBridgeJni();
  }
}
