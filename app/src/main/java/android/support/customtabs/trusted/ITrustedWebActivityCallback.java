/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.support.customtabs.trusted;
/**
 * Interface to a TrustedWebActivityCallback.
 * @hide
 */
public interface ITrustedWebActivityCallback extends android.os.IInterface
{
  /** Default implementation for ITrustedWebActivityCallback. */
  public static class Default implements android.support.customtabs.trusted.ITrustedWebActivityCallback
  {
    @Override public void onExtraCallback(java.lang.String callbackName, android.os.Bundle bundle) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.support.customtabs.trusted.ITrustedWebActivityCallback
  {
    private static final java.lang.String DESCRIPTOR = "android.support.customtabs.trusted.ITrustedWebActivityCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.support.customtabs.trusted.ITrustedWebActivityCallback interface,
     * generating a proxy if needed.
     */
    public static android.support.customtabs.trusted.ITrustedWebActivityCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.support.customtabs.trusted.ITrustedWebActivityCallback))) {
        return ((android.support.customtabs.trusted.ITrustedWebActivityCallback)iin);
      }
      return new android.support.customtabs.trusted.ITrustedWebActivityCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onExtraCallback:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          android.os.Bundle _arg1;
          if ((0!=data.readInt())) {
            _arg1 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg1 = null;
          }
          this.onExtraCallback(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements android.support.customtabs.trusted.ITrustedWebActivityCallback
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
      @Override public void onExtraCallback(java.lang.String callbackName, android.os.Bundle bundle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(callbackName);
          if ((bundle!=null)) {
            _data.writeInt(1);
            bundle.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onExtraCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onExtraCallback(callbackName, bundle);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static android.support.customtabs.trusted.ITrustedWebActivityCallback sDefaultImpl;
    }
    static final int TRANSACTION_onExtraCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(android.support.customtabs.trusted.ITrustedWebActivityCallback impl) {
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
    public static android.support.customtabs.trusted.ITrustedWebActivityCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onExtraCallback(java.lang.String callbackName, android.os.Bundle bundle) throws android.os.RemoteException;
}
