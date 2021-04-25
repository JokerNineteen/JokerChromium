/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package org.chromium.components.payments;
/**
 * Helper interface used by the browser to notify the invoked native app about
 * merchant's response to one of the paymentmethodchange, shippingoptionchange,
 * or shippingaddresschange events.
 */
public interface IPaymentDetailsUpdateServiceCallback extends android.os.IInterface
{
  /** Default implementation for IPaymentDetailsUpdateServiceCallback. */
  public static class Default implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
  {
    /**
         * Called to notify the invoked payment app about updated payment details
         * received from the merchant.
         *
         * @param updatedPaymentDetails The updated payment details received from
         *      the merchant.
         */
    @Override public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException
    {
    }
    /**
         * Called to notify the invoked payment app that the merchant has not
         * modified the payment details.
         */
    @Override public void paymentDetailsNotUpdated() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
  {
    private static final java.lang.String DESCRIPTOR = "org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback interface,
     * generating a proxy if needed.
     */
    public static org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback))) {
        return ((org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback)iin);
      }
      return new org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback.Stub.Proxy(obj);
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
        case TRANSACTION_updateWith:
        {
          data.enforceInterface(descriptor);
          android.os.Bundle _arg0;
          if ((0!=data.readInt())) {
            _arg0 = android.os.Bundle.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.updateWith(_arg0);
          return true;
        }
        case TRANSACTION_paymentDetailsNotUpdated:
        {
          data.enforceInterface(descriptor);
          this.paymentDetailsNotUpdated();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback
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
           * Called to notify the invoked payment app about updated payment details
           * received from the merchant.
           *
           * @param updatedPaymentDetails The updated payment details received from
           *      the merchant.
           */
      @Override public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((updatedPaymentDetails!=null)) {
            _data.writeInt(1);
            updatedPaymentDetails.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateWith, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateWith(updatedPaymentDetails);
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
           * Called to notify the invoked payment app that the merchant has not
           * modified the payment details.
           */
      @Override public void paymentDetailsNotUpdated() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_paymentDetailsNotUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().paymentDetailsNotUpdated();
            return;
          }
        }
        finally {
          _data.recycle();
        }
      }
      public static org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback sDefaultImpl;
    }
    static final int TRANSACTION_updateWith = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_paymentDetailsNotUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    public static boolean setDefaultImpl(org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback impl) {
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
    public static org.chromium.components.payments.IPaymentDetailsUpdateServiceCallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  /**
       * Called to notify the invoked payment app about updated payment details
       * received from the merchant.
       *
       * @param updatedPaymentDetails The updated payment details received from
       *      the merchant.
       */
  public void updateWith(android.os.Bundle updatedPaymentDetails) throws android.os.RemoteException;
  /**
       * Called to notify the invoked payment app that the merchant has not
       * modified the payment details.
       */
  public void paymentDetailsNotUpdated() throws android.os.RemoteException;
}
