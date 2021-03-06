// NavigationInitiator.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/frame/navigation_initiator.mojom
//

package org.chromium.blink.mojom;


public interface NavigationInitiator extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends NavigationInitiator, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<NavigationInitiator, NavigationInitiator.Proxy> MANAGER = NavigationInitiator_Internal.MANAGER;


    void sendViolationReport(
org.chromium.network.mojom.CspViolation violation);


}
