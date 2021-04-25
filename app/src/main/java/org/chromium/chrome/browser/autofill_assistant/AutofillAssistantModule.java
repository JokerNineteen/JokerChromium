package org.chromium.chrome.browser.autofill_assistant;

import org.chromium.components.module_installer.builder.Module;
import org.chromium.components.module_installer.engine.InstallEngine;
import org.chromium.components.module_installer.engine.InstallListener;

public class AutofillAssistantModule {
  private static final Module<AutofillAssistantModuleEntry> sModule = new Module<AutofillAssistantModuleEntry>("autofill_assistant", AutofillAssistantModuleEntry.class, "org.chromium.chrome.browser.autofill_assistant.AutofillAssistantModuleEntryImpl");

  private AutofillAssistantModule() {
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

  public static AutofillAssistantModuleEntry getImpl() {
    return sModule.getImpl();
  }

  public static InstallEngine getInstallEngine() {
    return sModule.getInstallEngine();
  }

  public static void setInstallEngine(InstallEngine engine) {
    sModule.setInstallEngine(engine);
  }
}
