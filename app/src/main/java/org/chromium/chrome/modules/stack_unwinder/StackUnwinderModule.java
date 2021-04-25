package org.chromium.chrome.modules.stack_unwinder;

import org.chromium.components.module_installer.builder.Module;
import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

public class StackUnwinderModule {
  private static final Module<StackUnwinderModuleContents> sModule = new Module<StackUnwinderModuleContents>("stack_unwinder", StackUnwinderModuleContents.class, "org.chromium.chrome.modules.stack_unwinder.StackUnwinderModuleContentsImpl");

  private StackUnwinderModule() {
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

  public static StackUnwinderModuleContents getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
