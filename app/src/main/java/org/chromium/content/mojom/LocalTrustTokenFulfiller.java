// LocalTrustTokenFulfiller.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     content/public/common/trust_tokens.mojom
//

package org.chromium.content.mojom;


public interface LocalTrustTokenFulfiller extends org.chromium.mojo.bindings.Interface {



    public interface Proxy extends LocalTrustTokenFulfiller, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<LocalTrustTokenFulfiller, LocalTrustTokenFulfiller.Proxy> MANAGER = LocalTrustTokenFulfiller_Internal.MANAGER;


    void fulfillTrustTokenIssuance(
org.chromium.network.mojom.FulfillTrustTokenIssuanceRequest request, 
FulfillTrustTokenIssuanceResponse callback);

    interface FulfillTrustTokenIssuanceResponse extends org.chromium.mojo.bindings.Callbacks.Callback1<org.chromium.network.mojom.FulfillTrustTokenIssuanceAnswer> { }


}
