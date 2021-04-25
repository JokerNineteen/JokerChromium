/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.browser_ui.photo_picker;
/**
 * This interface is called by the Photo Picker to start image decoding jobs in
 * a separate process.
 */
public interface IDecoderService extends android.os.IInterface
{
  /** Default implementation for IDecoderService. */
  public static class Default implements org.chromium.components.browser_ui.photo_picker.IDecoderService
  {
    /**
       * Decode an image.
       * @param payload The data containing the details for the decoding request.
       */
    @Override public void decodeImage(android.os.Bundle payload, org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.browser_ui.photo_picker.IDecoderService
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.browser_ui.photo_picker.IDecoderService";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.browser_ui.photo_picker.IDecoderService interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.browser_ui.photo_picker.IDecoderService asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.browser_ui.photo_picker.IDecoderService))) {
        return ((org.chromium.components.browser_ui.photo_picker.IDecoderService)iin);
      }
      return new org.chromium.components.browser_ui.photo_picker.IDecoderService.Stub.Proxy(obj);
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
        case TRANSACTION_decodeImage:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback _arg1;
          _arg1 = org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback.Stub.asInterface(data.readStrongBinder());
          this.decodeImage(_arg0, _arg1);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.browser_ui.photo_picker.IDecoderService
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
         * Decode an image.
         * @param payload The data containing the details for the decoding request.
         */
      @Override public void decodeImage(android.os.Bundle payload, org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback listener) throws android.os.RemoteException
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
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_decodeImage, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().decodeImage(payload, listener);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.components.browser_ui.photo_picker.IDecoderService sDefaultImpl;
    }
    static final int TRANSACTION_decodeImage = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(org.chromium.components.browser_ui.photo_picker.IDecoderService impl) {
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
    public static org.chromium.components.browser_ui.photo_picker.IDecoderService getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
     * Decode an image.
     * @param payload The data containing the details for the decoding request.
     */
  public void decodeImage(android.os.Bundle payload, org.chromium.components.browser_ui.photo_picker.IDecoderServiceCallback listener) throws android.os.RemoteException;
}
