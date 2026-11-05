/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.cas-V1-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/cas/aidl/aidl_api/android.hardware.cas/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/cas/aidl/aidl_api/android.hardware.cas/1/android/hardware/cas/IDescrambler.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.cas;
/** @hide */
public interface IDescrambler extends android.os.IInterface
{
  /** Default implementation for IDescrambler. */
  public static class Default implements android.hardware.cas.IDescrambler
  {
    @Override public int descramble(int scramblingControl, android.hardware.cas.SubSample[] subSamples, android.hardware.cas.SharedBuffer srcBuffer, long srcOffset, android.hardware.cas.DestinationBuffer dstBuffer, long dstOffset) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void release() throws android.os.RemoteException
    {
    }
    @Override public boolean requiresSecureDecoderComponent(java.lang.String mime) throws android.os.RemoteException
    {
      return false;
    }
    @Override public void setMediaCasSession(byte[] sessionId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.cas.IDescrambler
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.cas.IDescrambler interface,
     * generating a proxy if needed.
     */
    public static android.hardware.cas.IDescrambler asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.cas.IDescrambler))) {
        return ((android.hardware.cas.IDescrambler)iin);
      }
      return new android.hardware.cas.IDescrambler.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(DESCRIPTOR);
      }
      switch (code)
      {
        case TRANSACTION_descramble:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.cas.SubSample[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.cas.SubSample.CREATOR);
          android.hardware.cas.SharedBuffer _arg2;
          _arg2 = data.readTypedObject(android.hardware.cas.SharedBuffer.CREATOR);
          long _arg3;
          _arg3 = data.readLong();
          android.hardware.cas.DestinationBuffer _arg4;
          _arg4 = data.readTypedObject(android.hardware.cas.DestinationBuffer.CREATOR);
          long _arg5;
          _arg5 = data.readLong();
          data.enforceNoDataAvail();
          int _result = this.descramble(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_release:
        {
          this.release();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_requiresSecureDecoderComponent:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          data.enforceNoDataAvail();
          boolean _result = this.requiresSecureDecoderComponent(_arg0);
          reply.writeNoException();
          reply.writeBoolean(_result);
          break;
        }
        case TRANSACTION_setMediaCasSession:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          data.enforceNoDataAvail();
          this.setMediaCasSession(_arg0);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.cas.IDescrambler
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
      public final java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int descramble(int scramblingControl, android.hardware.cas.SubSample[] subSamples, android.hardware.cas.SharedBuffer srcBuffer, long srcOffset, android.hardware.cas.DestinationBuffer dstBuffer, long dstOffset) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(scramblingControl);
          _data.writeTypedArray(subSamples, 0);
          _data.writeTypedObject(srcBuffer, 0);
          _data.writeLong(srcOffset);
          _data.writeTypedObject(dstBuffer, 0);
          _data.writeLong(dstOffset);
          boolean _status = mRemote.transact(Stub.TRANSACTION_descramble, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void release() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_release, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean requiresSecureDecoderComponent(java.lang.String mime) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(mime);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requiresSecureDecoderComponent, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readBoolean();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void setMediaCasSession(byte[] sessionId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(sessionId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMediaCasSession, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_descramble = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_release = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_requiresSecureDecoderComponent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setMediaCasSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$cas$IDescrambler".replace('$', '.');
  public int descramble(int scramblingControl, android.hardware.cas.SubSample[] subSamples, android.hardware.cas.SharedBuffer srcBuffer, long srcOffset, android.hardware.cas.DestinationBuffer dstBuffer, long dstOffset) throws android.os.RemoteException;
  public void release() throws android.os.RemoteException;
  public boolean requiresSecureDecoderComponent(java.lang.String mime) throws android.os.RemoteException;
  public void setMediaCasSession(byte[] sessionId) throws android.os.RemoteException;
}
