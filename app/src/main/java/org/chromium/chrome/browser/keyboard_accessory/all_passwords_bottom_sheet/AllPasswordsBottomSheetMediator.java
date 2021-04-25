// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet;

import static org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetMetricsRecorder.UMA_ALL_PASSWORDS_BOTTOM_SHEET_ACTIONS;
import static org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetMetricsRecorder.UMA_WARNING_ACTIONS;
import static org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetMetricsRecorder.recordHistogram;
import static org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetProperties.SHEET_ITEMS;
import static org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetProperties.VISIBLE;

import org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetMetricsRecorder.AllPasswordsBottomSheetActions;
import org.chromium.chrome.browser.keyboard_accessory.all_passwords_bottom_sheet.AllPasswordsBottomSheetMetricsRecorder.AllPasswordsWarningActions;
import org.chromium.components.browser_ui.bottomsheet.BottomSheetController.StateChangeReason;
import org.chromium.components.embedder_support.util.UrlUtilities;
import org.chromium.ui.modaldialog.DialogDismissalCause;
import org.chromium.ui.modaldialog.ModalDialogManager;
import org.chromium.ui.modaldialog.ModalDialogProperties;
import org.chromium.ui.modelutil.ListModel;
import org.chromium.ui.modelutil.MVCListAdapter.ListItem;
import org.chromium.ui.modelutil.PropertyModel;

import java.util.Arrays;
import java.util.Locale;

/**
 * Contains the logic for the AllPasswordsBottomSheet. It sets the state of the model and reacts to
 * events like clicks.
 */
class AllPasswordsBottomSheetMediator implements ModalDialogProperties.Controller {
    private AllPasswordsBottomSheetCoordinator.Delegate mDelegate;
    private PropertyModel mModel;
    private Credential[] mCredentials;
    private boolean mIsPasswordField;
    private ModalDialogManager mModalDialogManager;
    private PropertyModel mDialogModel;
    private boolean mSearchUsed;

    @Override
    public void onClick(PropertyModel model, int buttonType) {
        int dismissalCause = DialogDismissalCause.NEGATIVE_BUTTON_CLICKED;
        if (buttonType == ModalDialogProperties.ButtonType.POSITIVE) {
            recordHistogram(UMA_WARNING_ACTIONS, AllPasswordsWarningActions.WARNING_ACCEPTED,
                    AllPasswordsWarningActions.COUNT);
            showCredentials();
            dismissalCause = DialogDismissalCause.POSITIVE_BUTTON_CLICKED;
        }
        mModalDialogManager.dismissDialog(mDialogModel, dismissalCause);
    }

    @Override
    public void onDismiss(PropertyModel model, int dismissalCause) {
        if (dismissalCause != DialogDismissalCause.POSITIVE_BUTTON_CLICKED) {
            recordHistogram(UMA_WARNING_ACTIONS, AllPasswordsWarningActions.WARNING_CANCELED,
                    AllPasswordsWarningActions.COUNT);
            mDelegate.onDismissed();
        }
    }

    void initialize(ModalDialogManager modalDialogManager, PropertyModel dialogModel,
            AllPasswordsBottomSheetCoordinator.Delegate delegate, PropertyModel model) {
        assert delegate != null;
        assert dialogModel != null;
        mModalDialogManager = modalDialogManager;
        mDialogModel = dialogModel;
        mDelegate = delegate;
        mModel = model;
    }

    void setCredentials(Credential[] credentials, boolean isPasswordField) {
        assert credentials != null;
        Arrays.sort(credentials, AllPasswordsBottomSheetMediator::compareCredentials);

        mCredentials = credentials;
        mIsPasswordField = isPasswordField;

        ListModel<ListItem> sheetItems = mModel.get(SHEET_ITEMS);
        sheetItems.clear();

        for (Credential credential : mCredentials) {
            if (credential.getPassword().isEmpty() && isPasswordField) continue;
            final PropertyModel model =
                    AllPasswordsBottomSheetProperties.CredentialProperties.createCredentialModel(
                            credential, this::onCredentialSelected, mIsPasswordField);
            sheetItems.add(
                    new ListItem(AllPasswordsBottomSheetProperties.ItemType.CREDENTIAL, model));
        }
    }

    void warnAndShow() {
        // Shows the warning dialog only if the user is about to fill a password field.
        if (mIsPasswordField) {
            mModalDialogManager.showDialog(mDialogModel, ModalDialogManager.ModalDialogType.APP);
            recordHistogram(UMA_WARNING_ACTIONS, AllPasswordsWarningActions.WARNING_DIALOG_SHOWN,
                    AllPasswordsWarningActions.COUNT);
        } else {
            showCredentials();
        }
    }

    private void showCredentials() {
        mModel.set(VISIBLE, true);
    }

    /**
     * Filters the credentials list based on the passed text and adds the resulting credentials to
     * the model.
     * @param newText the text used to filter the credentials.
     */
    void onQueryTextChange(String newText) {
        mSearchUsed = true;
        ListModel<ListItem> sheetItems = mModel.get(SHEET_ITEMS);
        sheetItems.clear();

        for (Credential credential : mCredentials) {
            if ((credential.getPassword().isEmpty() && mIsPasswordField)
                    || shouldBeFiltered(newText, credential)) {
                continue;
            }
            final PropertyModel model =
                    AllPasswordsBottomSheetProperties.CredentialProperties.createCredentialModel(
                            credential, this::onCredentialSelected, mIsPasswordField);
            sheetItems.add(
                    new ListItem(AllPasswordsBottomSheetProperties.ItemType.CREDENTIAL, model));
        }
    }

    /**
     * Returns true if no substring in the passed credential matches the searchQuery ignoring the
     * characters case.
     * @param searchQuery the text to check if passed credential has it.
     * @param credential its username and origin will be checked for matching string.
     * @return Returns whether the entry with the passed credential should be filtered.
     */
    private boolean shouldBeFiltered(final String searchQuery, final Credential credential) {
        return searchQuery != null
                && !credential.getOriginUrl()
                            .toLowerCase(Locale.ENGLISH)
                            .contains(searchQuery.toLowerCase(Locale.ENGLISH))
                && !credential.getUsername()
                            .toLowerCase(Locale.getDefault())
                            .contains(searchQuery.toLowerCase(Locale.getDefault()));
    }

    void onCredentialSelected(Credential credential) {
        recordHistogram(UMA_ALL_PASSWORDS_BOTTOM_SHEET_ACTIONS,
                AllPasswordsBottomSheetActions.CREDENTIAL_SELECTED,
                AllPasswordsBottomSheetActions.COUNT);
        if (mSearchUsed) {
            recordHistogram(UMA_ALL_PASSWORDS_BOTTOM_SHEET_ACTIONS,
                    AllPasswordsBottomSheetActions.SEARCH_USED,
                    AllPasswordsBottomSheetActions.COUNT);
        }
        mModel.set(VISIBLE, false);
        mDelegate.onCredentialSelected(credential);
    }

    void onDismissed(@StateChangeReason Integer reason) {
        if (!mModel.get(VISIBLE)) return; // Dismiss only if not dismissed yet.
        recordHistogram(UMA_ALL_PASSWORDS_BOTTOM_SHEET_ACTIONS,
                AllPasswordsBottomSheetActions.SHEET_DISMISSED,
                AllPasswordsBottomSheetActions.COUNT);
        mModel.set(VISIBLE, false);
        mDelegate.onDismissed();
    }

    private static int compareCredentials(Credential credential1, Credential credential2) {
        String displayOrigin1 = credential1.isAndroidCredential()
                ? credential1.getAppDisplayName().toLowerCase(Locale.ENGLISH)
                : UrlUtilities.getDomainAndRegistry(credential1.getOriginUrl(), false);
        String displayOrigin2 = credential2.isAndroidCredential()
                ? credential2.getAppDisplayName().toLowerCase(Locale.ENGLISH)
                : UrlUtilities.getDomainAndRegistry(credential2.getOriginUrl(), false);
        return displayOrigin1.compareTo(displayOrigin2);
    }
}
