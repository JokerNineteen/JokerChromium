package org.chromium.chrome.modules.cablev2_authenticator;

import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

public class Cablev2AuthenticatorModule {
  private static final org.chromium.components.module_installer.builder.Module<Module> sModule = new org.chromium.components.module_installer.builder.Module<Module>("cablev2_authenticator", Module.class, "org.chromium.chrome.modules.cablev2_authenticator.ModuleImpl");

  private Cablev2AuthenticatorModule() {
  }

  public static boolean isInstalled() {
    return sModule.isInstalled();
  }

  public static void install(InstallListener listener) {
    sModule.install(listener);
  }

  public static void installDeferred() {
    sModule.installDeferred();
  }

  public static void ensureNativeLoaded() {
    sModule.ensureNativeLoaded();
  }

  public static Module getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
