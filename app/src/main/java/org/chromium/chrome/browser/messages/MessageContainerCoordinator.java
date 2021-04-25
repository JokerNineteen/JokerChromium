// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.messages;

import android.content.res.Resources;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import org.chromium.chrome.R;
import org.chromium.chrome.browser.browser_controls.BrowserControlsStateProvider;
import org.chromium.chrome.browser.fullscreen.BrowserControlsManager;
import org.chromium.components.messages.MessageContainer;

/**
 * Coordinator of {@link MessageContainer}, which can adjust margins of the message container
 * and control the visibility of browser control when message is being shown.
 */
public class MessageContainerCoordinator implements BrowserControlsStateProvider.Observer {
    private MessageContainer mContainer;
    private BrowserControlsManager mControlsManager;

    public MessageContainerCoordinator(
            @NonNull MessageContainer container, @NonNull BrowserControlsManager controlsManager) {
        mContainer = container;
        mControlsManager = controlsManager;
        mControlsManager.addObserver(this);
    }

    public void destroy() {
        mControlsManager.removeObserver(this);
        mContainer = null;
        mControlsManager = null;
    }

    private void updateMargins() {
        CoordinatorLayout.LayoutParams params =
                (CoordinatorLayout.LayoutParams) mContainer.getLayoutParams();
        // TODO(crbug.com/1123947): Update dimens for PWAs.
        params.topMargin = getContainerTopOffset();
        mContainer.setLayoutParams(params);
    }

    public void showMessageContainer() {
        mContainer.setVisibility(View.VISIBLE);
        updateMargins();
    }

    public void hideMessageContainer() {
        mContainer.setVisibility(View.GONE);
    }

    /**
     * @return The maximum translation Y value the message banner can have as a result of the
     *         animations or the gestures. Positive values mean the message banner can be translated
     *         upward from the top of the MessagesContainer.
     */
    public int getMessageMaxTranslation() {
        // TODO(sinansahin): We need to account for other scenarios where there are no browser
        // controls visible (e.g. PWAs).
        return getContainerTopOffset();
    }

    @Override
    public void onControlsOffsetChanged(int topOffset, int topControlsMinHeightOffset,
            int bottomOffset, int bottomControlsMinHeightOffset, boolean needsAnimate) {
        updateMargins();
    }

    @Override
    public void onTopControlsHeightChanged(int topControlsHeight, int topControlsMinHeight) {
        updateMargins();
    }

    /** @return Offset of the message container from the top of the screen. */
    private int getContainerTopOffset() {
        final Resources res = mContainer.getResources();
        return mControlsManager.getTopControlsHeight()
                - res.getDimensionPixelOffset(R.dimen.message_bubble_inset)
                - res.getDimensionPixelOffset(R.dimen.message_shadow_top_margin);
    }
}
