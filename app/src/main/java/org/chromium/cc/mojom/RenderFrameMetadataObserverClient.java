// RenderFrameMetadataObserverClient.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     cc/mojom/render_frame_metadata.mojom
//

package org.chromium.cc.mojom;


public interface RenderFrameMetadataObserverClient extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends RenderFrameMetadataObserverClient, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<RenderFrameMetadataObserverClient, RenderFrameMetadataObserverClient.Proxy> MANAGER = RenderFrameMetadataObserverClient_Internal.MANAGER;


    void onRenderFrameMetadataChanged(
int frameToken, RenderFrameMetadata metadata);



    void onFrameSubmissionForTesting(
int frameToken);



    void onRootScrollOffsetChanged(
org.chromium.gfx.mojom.Vector2dF rootScrollOffset);


}
