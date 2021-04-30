// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.app.tabmodel;

import org.chromium.base.supplier.ObservableSupplierImpl;
import org.chromium.chrome.browser.compositor.layouts.content.TabContentManager;
import org.chromium.chrome.browser.tabmodel.TabModelSelectorImpl;
import org.chromium.chrome.browser.tabmodel.TabPersistentStore;
import org.chromium.chrome.browser.tabmodel.TabPersistentStore.TabPersistentStoreObserver;

/**
 * Implementers are glue-level objects that manage lifetime of root .tabmodel objects: {@link
 * TabPersistentStore} and {@link TabModelSelectorImpl}.
 */
public abstract class TabModelOrchestrator {
    protected TabPersistentStore mTabPersistentStore;
    protected TabModelSelectorImpl mTabModelSelector;
    private boolean mTabModelsInitialized;

    /**
     * @return Whether the tab models have been fully initialized.
     */
    public boolean areTabModelsInitialized() {
        return mTabModelsInitialized;
    }

    /**
     * @return The {@link TabModelSelectorImpl} managed by this orchestrator.
     */
    public TabModelSelectorImpl getTabModelSelector() {
        return mTabModelSelector;
    }

    /**
     * @return The {@link TabPersistentStore} managed by this orchestrator.
     */
    public TabPersistentStore getTabPersistentStore() {
        return mTabPersistentStore;
    }

    /**
     * Destroy the {@link TabPersistentStore} and {@link TabModelSelectorImpl} members.
     */
    public void destroy() {
        if (!mTabModelsInitialized) {
            return;
        }

        // TODO(crbug.com/1169408): Set the members to null and mTabModelsInitialized to false.
        // Right now, it breaks destruction of VrShell, which relies on using TabModel after
        // its destruction.

        if (mTabPersistentStore != null) {
            mTabPersistentStore.destroy();
        }

        if (mTabModelSelector != null) {
            mTabModelSelector.destroy();
        }
    }

    public void onNativeLibraryReady(TabContentManager tabContentManager) {
        mTabModelSelector.onNativeLibraryReady(tabContentManager);
        mTabPersistentStore.onNativeLibraryReady(tabContentManager);
    }

    /**
     * Save the current state of the tab model. Usage of this method is discouraged due to it
     * writing to disk.
     */
    public void saveState() {
        mTabModelSelector.commitAllTabClosures();
        mTabPersistentStore.saveState();
    }

    /**
     * Load the saved tab state. This should be called before any new tabs are created. The saved
     * tabs shall not be restored until {@link #restoreTabs} is called.
     * @param ignoreIncognitoFiles Whether to skip loading incognito tabs.
     */
    public void loadState(boolean ignoreIncognitoFiles) {
        mTabPersistentStore.loadState(ignoreIncognitoFiles);
    }

    /**
     * Restore the saved tabs which were loaded by {@link #loadState}.
     *
     * @param setActiveTab If true, synchronously load saved active tab and set it as the current
     *                     active tab.
     */
    public void restoreTabs(boolean setActiveTab) {
        mTabPersistentStore.restoreTabs(setActiveTab);
    }

    public void mergeState() {
        mTabPersistentStore.mergeState();
    }

    public void clearState() {
        mTabPersistentStore.clearState();
    }

    /**
     * If there is an asynchronous session restore in-progress, try to synchronously restore
     * the state of a tab with the given url as a frozen tab. This method has no effect if
     * there isn't a tab being restored with this url, or the tab has already been restored.
     */
    public void tryToRestoreTabStateForUrl(String url) {
        if (mTabModelSelector.isSessionRestoreInProgress()) {
            mTabPersistentStore.restoreTabStateForUrl(url);
        }
    }

    /**
     * If there is an asynchronous session restore in-progress, try to synchronously restore
     * the state of a tab with the given id as a frozen tab. This method has no effect if
     * there isn't a tab being restored with this id, or the tab has already been restored.
     */
    public void tryToRestoreTabStateForId(int id) {
        if (mTabModelSelector.isSessionRestoreInProgress()) {
            mTabPersistentStore.restoreTabStateForId(id);
        }
    }

    /**
     * @return Number of restored tabs on cold startup.
     */
    public int getRestoredTabCount() {
        if (mTabPersistentStore == null) return 0;
        return mTabPersistentStore.getRestoredTabCount();
    }

    protected void wireSelectorAndStore() {
        // Supply TabModelSelectorImpl with TabPersistentStore.
        //
        // TODO(crbug.com/1138561): Remove this dependency by making TabModelSelectorImpl emit
        // events and TabPersistentStore react to them as an observer.
        ObservableSupplierImpl<TabPersistentStore> tabPersistentStoreSupplier =
                new ObservableSupplierImpl<>();
        tabPersistentStoreSupplier.set(mTabPersistentStore);
        mTabModelSelector.setTabPersistentStoreSupplier(tabPersistentStoreSupplier);

        // Notify TabModelSelectorImpl when TabPersistentStore initializes tab state
        final TabPersistentStoreObserver persistentStoreObserver =
                new TabPersistentStoreObserver() {
                    @Override
                    public void onStateLoaded() {
                        mTabModelSelector.markTabStateInitialized();
                    }
                };
        mTabPersistentStore.addObserver(persistentStoreObserver);
    }

    protected void markTabModelsInitialized() {
        mTabModelsInitialized = true;
    }
}