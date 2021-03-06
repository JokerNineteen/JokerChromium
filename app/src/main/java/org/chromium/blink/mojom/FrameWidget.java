// FrameWidget.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/page/widget.mojom
//

package org.chromium.blink.mojom;


public interface FrameWidget extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends FrameWidget, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<FrameWidget, FrameWidget.Proxy> MANAGER = FrameWidget_Internal.MANAGER;


    void dragTargetDragEnter(
DragData dragData, org.chromium.gfx.mojom.PointF pointInViewport, org.chromium.gfx.mojom.PointF screenPoint, AllowedDragOperations operationsAllowed, int keyModifiers, 
DragTargetDragEnterResponse callback);

    interface DragTargetDragEnterResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dragTargetDragOver(
org.chromium.gfx.mojom.PointF pointInViewport, org.chromium.gfx.mojom.PointF screenPoint, AllowedDragOperations operationsAllowed, int keyModifiers, 
DragTargetDragOverResponse callback);

    interface DragTargetDragOverResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<Integer> { }



    void dragTargetDragLeave(
org.chromium.gfx.mojom.PointF pointInViewport, org.chromium.gfx.mojom.PointF screenPoint);



    void dragTargetDrop(
DragData dragData, org.chromium.gfx.mojom.PointF pointInViewport, org.chromium.gfx.mojom.PointF screenPoint, int keyModifiers);



    void dragSourceEndedAt(
org.chromium.gfx.mojom.PointF pointInViewport, org.chromium.gfx.mojom.PointF screenPoint, int dragOperation);



    void dragSourceSystemDragEnded(
);



    void setBackgroundOpaque(
boolean opaque);



    void setTextDirection(
int direction);



    void setActive(
boolean active);



    void setInheritedEffectiveTouchActionForSubFrame(
int touchAction);



    void updateRenderThrottlingStatusForSubFrame(
boolean isThrottled, boolean subtreeThrottled, boolean displayLocked);



    void setIsInertForSubFrame(
boolean inert);



    void showContextMenu(
int sourceType, org.chromium.gfx.mojom.Point location);



    void enableDeviceEmulation(
DeviceEmulationParams parameters);



    void disableDeviceEmulation(
);



    void bindWidgetCompositor(
org.chromium.mojo.bindings.InterfaceRequest<WidgetCompositor> host);



    void bindInputTargetClient(
org.chromium.mojo.bindings.InterfaceRequest<org.chromium.viz.mojom.InputTargetClient> host);



    void setViewportIntersection(
ViewportIntersectionState intersectionState, VisualProperties visualProperties);


}
