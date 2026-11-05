/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.security.keymint-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3/android/hardware/security/keymint/IKeyMintOperation.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.security.keymint;
/** @hide */
public interface IKeyMintOperation extends android.os.IInterface
{
  /** Default implementation for IKeyMintOperation. */
  public static class Default implements android.hardware.security.keymint.IKeyMintOperation
  {
    @Override public void updateAad(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException
    {
    }
    @Override public byte[] update(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public byte[] finish(byte[] input, byte[] signature, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timestampToken, byte[] confirmationToken) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void abort() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.security.keymint.IKeyMintOperation
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.security.keymint.IKeyMintOperation interface,
     * generating a proxy if needed.
     */
    public static android.hardware.security.keymint.IKeyMintOperation asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.security.keymint.IKeyMintOperation))) {
        return ((android.hardware.security.keymint.IKeyMintOperation)iin);
      }
      return new android.hardware.security.keymint.IKeyMintOperation.Stub.Proxy(obj);
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
        case TRANSACTION_updateAad:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          android.hardware.security.keymint.HardwareAuthToken _arg1;
          _arg1 = data.readTypedObject(android.hardware.security.keymint.HardwareAuthToken.CREATOR);
          android.hardware.security.secureclock.TimeStampToken _arg2;
          _arg2 = data.readTypedObject(android.hardware.security.secureclock.TimeStampToken.CREATOR);
          data.enforceNoDataAvail();
          this.updateAad(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_update:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          android.hardware.security.keymint.HardwareAuthToken _arg1;
          _arg1 = data.readTypedObject(android.hardware.security.keymint.HardwareAuthToken.CREATOR);
          android.hardware.security.secureclock.TimeStampToken _arg2;
          _arg2 = data.readTypedObject(android.hardware.security.secureclock.TimeStampToken.CREATOR);
          data.enforceNoDataAvail();
          byte[] _result = this.update(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_finish:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          android.hardware.security.keymint.HardwareAuthToken _arg2;
          _arg2 = data.readTypedObject(android.hardware.security.keymint.HardwareAuthToken.CREATOR);
          android.hardware.security.secureclock.TimeStampToken _arg3;
          _arg3 = data.readTypedObject(android.hardware.security.secureclock.TimeStampToken.CREATOR);
          byte[] _arg4;
          _arg4 = data.createByteArray();
          data.enforceNoDataAvail();
          byte[] _result = this.finish(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          reply.writeByteArray(_result);
          break;
        }
        case TRANSACTION_abort:
        {
          this.abort();
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
    private static final class Proxy implements android.hardware.security.keymint.IKeyMintOperation
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
      @Override public void updateAad(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(input);
          _data.writeTypedObject(authToken, 0);
          _data.writeTypedObject(timeStampToken, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAad, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public byte[] update(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(input);
          _data.writeTypedObject(authToken, 0);
          _data.writeTypedObject(timeStampToken, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_update, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public byte[] finish(byte[] input, byte[] signature, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timestampToken, byte[] confirmationToken) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        byte[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(input);
          _data.writeByteArray(signature);
          _data.writeTypedObject(authToken, 0);
          _data.writeTypedObject(timestampToken, 0);
          _data.writeByteArray(confirmationToken);
          boolean _status = mRemote.transact(Stub.TRANSACTION_finish, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
          _result = _reply.createByteArray();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void abort() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        _data.markSensitive();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_abort, _data, _reply, android.os.IBinder.FLAG_CLEAR_BUF);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_updateAad = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_update = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_finish = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_abort = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$security$keymint$IKeyMintOperation".replace('$', '.');
  public void updateAad(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException;
  public byte[] update(byte[] input, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timeStampToken) throws android.os.RemoteException;
  public byte[] finish(byte[] input, byte[] signature, android.hardware.security.keymint.HardwareAuthToken authToken, android.hardware.security.secureclock.TimeStampToken timestampToken, byte[] confirmationToken) throws android.os.RemoteException;
  public void abort() throws android.os.RemoteException;
}
