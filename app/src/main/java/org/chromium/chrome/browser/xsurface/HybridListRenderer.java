// Copyright 2020 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package org.chromium.chrome.browser.xsurface;

import android.view.View;

import androidx.annotation.Nullable;

/**
 * A renderer that can handle mixing externally-provided views with native Android views
 * in a RecyclerView.
 */
public interface HybridListRenderer {
    /**
     * Binds a contentmanager with this renderer.
     * @return a View that the HybridListRenderer is managing, which can then be
     * attached to other view
     */
    @Nullable
    default View bind(ListContentManager manager) {
        return null;
    }

    /**
     * Notify the HybridListRender when the externally provided view surface (embedded in
     * bind/update) is activated. This should include:
     *
     *   - the user opening a new tab containing the (opened) surface.
     *   - the user switching to a tab containing the (opened) surface.
     *   - the user reactivating the previously deactivated surface.
     */
    default void onSurfaceOpened() {}

    /**
     * Notify the HybridListRender when the externally provided view surface (embedded in
     * bind/update) is deactivated. This should include:
     *
     *   - the user switching to another app.
     *   - the user browsing away to other content.
     *   - the user deactivates the surface.
     *   - the user switching to another tab.
     */
    default void onSurfaceClosed() {}

    /**
     * Unbinds a previously attached recyclerview and contentmanager.
     *
     * Does nothing if nothing was previously bound.
     */
    default void unbind() {}

    /**
     * Updates the renderer with templates and initializing data.
     */
    default void update(byte[] data) {}
}
