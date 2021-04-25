package org.chromium.chrome.browser;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.chromium.base.JniStaticTestMocker;
import org.chromium.base.NativeLibraryLoadedStatus;
import org.chromium.base.annotations.CheckDiscard;
import org.chromium.base.natives.GEN_JNI;

@Generated("org.chromium.jni_generator.JniProcessor")
@CheckDiscard("crbug.com/993421")
final class DevToolsServerJni implements DevToolsServer.Natives {
  private static DevToolsServer.Natives testInstance;

  public static final JniStaticTestMocker<DevToolsServer.Natives> TEST_HOOKS = new org.chromium.base.JniStaticTestMocker<org.chromium.chrome.browser.DevToolsServer.Natives>() {
    @java.lang.Override
    public void setInstanceForTesting(org.chromium.chrome.browser.DevToolsServer.Natives instance) {
      if (!org.chromium.base.natives.GEN_JNI.TESTING_ENABLED) {
        throw new RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
      }
      testInstance = instance;
    }
  };

  @Override
  public long initRemoteDebugging(DevToolsServer caller, String socketNamePrefix) {
    return (long)GEN_JNI.org_chromium_chrome_browser_DevToolsServer_initRemoteDebugging(caller, socketNamePrefix);
  }

  @Override
  public void destroyRemoteDebugging(DevToolsServer caller, long devToolsServer) {
    GEN_JNI.org_chromium_chrome_browser_DevToolsServer_destroyRemoteDebugging(caller, devToolsServer);
  }

  @Override
  public boolean isRemoteDebuggingEnabled(DevToolsServer caller, long devToolsServer) {
    return (boolean)GEN_JNI.org_chromium_chrome_browser_DevToolsServer_isRemoteDebuggingEnabled(caller, devToolsServer);
  }

  @Override
  public void setRemoteDebuggingEnabled(DevToolsServer caller, long devToolsServer, boolean enabled,
      boolean allowDebugPermission) {
    GEN_JNI.org_chromium_chrome_browser_DevToolsServer_setRemoteDebuggingEnabled(caller, devToolsServer, enabled, allowDebugPermission);
  }

  public static DevToolsServer.Natives get() {
    if (GEN_JNI.TESTING_ENABLED) {
      if (testInstance != null) {
        return testInstance;
      }
      if (GEN_JNI.REQUIRE_MOCK) {
        throw new UnsupportedOperationException("No mock found for the native implementation for org.chromium.chrome.browser.DevToolsServer.Natives. The current configuration requires all native implementations to have a mock instance.");
      }
    }
    NativeLibraryLoadedStatus.checkLoaded(false);
    return new DevToolsServerJni();
  }
}
