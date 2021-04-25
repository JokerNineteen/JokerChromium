/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.browser_ui.photo_picker;
/**
 * This interface is used to communicate the results of an image decoding
 * request.
 */
public interface IDecoderServiceCallback extends android.os.IInterface
{
  /** Default implementation for IDecoderServiceCallback. */
  public static class Default implements org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback
  {
    /**
      * Called when decoding is done.
      * @param payload The results of the image decoding request, including the
      *                decoded bitmap.
      */
    @Override public void onDecodeImageDone(android.os.Bundle payload) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback))) {
        return ((org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback)iin);
      }
      return new org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onDecodeImageDone:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onDecodeImageDone(_arg0);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
        * Called when decoding is done.
        * @param payload The results of the image decoding request, including the
        *                decoded bitmap.
        */
      @Override public void onDecodeImageDone(android.os.Bundle payload) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((payload!=null)) {
            _data.writeInt(1);
            payload.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onDecodeImageDone, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onDecodeImageDone(payload);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback sDefaultImpl;
    }
    static final int TRANSACTION_onDecodeImageDone = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
    * Called when decoding is done.
    * @param payload The results of the image decoding request, including the
    *                decoded bitmap.
    */
  public void onDecodeImageDone(android.os.Bundle payload) throws android.os.RemoteException;
}
