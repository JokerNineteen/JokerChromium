// AudioInputStreamObserver.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     media/mojo/mojom/audio_input_stream.mojom
//

package org.chromium.media.mojom;


public interface AudioInputStreamObserver extends org.chromium.mojo.bindings.Interface {



    public static final class DisconnectReason {
        private static final boolean IS_EXTENSIBLE = false;

        public static final int DEFAULT = 0;
        public static final int PLATFORM_ERROR = 1;
        public static final int TERMINATED_BY_CLIENT = 2;
        public static final int STREAM_CREATION_FAILED = 3;
        public static final int DOCUMENT_DESTROYED = 4;
        public static final int MIN_VALUE = 0;
        public static final int MAX_VALUE = 4;

        public static boolean isKnownValue(int value) {
            return value >= 0 && value <= 4;
        }

        public static void validate(int value) {
            if (IS_EXTENSIBLE || isKnownValue(value)) return;
            throw new org.chromium.mojo.bindings.DeserializationException("Invalid enum value.");
        }

        public static int toKnownValue(int value) {
          return value;
        }

        private DisconnectReason() {}
    }


    public interface Proxy extends AudioInputStreamObserver, org.chromium.mojo.bindings.Interface.Proxy {
    }

    Manager<AudioInputStreamObserver, AudioInputStreamObserver.Proxy> MANAGER = AudioInputStreamObserver_Internal.MANAGER;


    void didStartRecording(
);


}
