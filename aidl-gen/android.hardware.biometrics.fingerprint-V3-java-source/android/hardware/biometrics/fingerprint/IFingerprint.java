/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.biometrics.fingerprint-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3/android/hardware/biometrics/fingerprint/IFingerprint.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.biometrics.fingerprint;
/** @hide */
public interface IFingerprint extends android.os.IInterface
{
  /** Default implementation for IFingerprint. */
  public static class Default implements android.hardware.biometrics.fingerprint.IFingerprint
  {
    @Override public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.biometrics.fingerprint.ISession createSession(int sensorId, int userId, android.hardware.biometrics.fingerprint.ISessionCallback cb) throws android.os.RemoteException
    {
      return null;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.IFingerprint
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.biometrics.fingerprint.IFingerprint interface,
     * generating a proxy if needed.
     */
    public static android.hardware.biometrics.fingerprint.IFingerprint asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.biometrics.fingerprint.IFingerprint))) {
        return ((android.hardware.biometrics.fingerprint.IFingerprint)iin);
      }
      return new android.hardware.biometrics.fingerprint.IFingerprint.Stub.Proxy(obj);
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
        case TRANSACTION_getSensorProps:
        {
          android.hardware.biometrics.fingerprint.SensorProps[] _result = this.getSensorProps();
          reply.writeNoException();
          reply.writeTypedArray(_result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_createSession:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          android.hardware.biometrics.fingerprint.ISessionCallback _arg2;
          _arg2 = android.hardware.biometrics.fingerprint.ISessionCallback.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          android.hardware.biometrics.fingerprint.ISession _result = this.createSession(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static final class Proxy implements android.hardware.biometrics.fingerprint.IFingerprint
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
      @Override public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.fingerprint.SensorProps[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSensorProps, _data, _reply, 0);
          _reply.readException();
          _result = _reply.createTypedArray(android.hardware.biometrics.fingerprint.SensorProps.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.biometrics.fingerprint.ISession createSession(int sensorId, int userId, android.hardware.biometrics.fingerprint.ISessionCallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.fingerprint.ISession _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(sensorId);
          _data.writeInt(userId);
          _data.writeStrongInterface(cb);
          boolean _status = mRemote.transact(Stub.TRANSACTION_createSession, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.fingerprint.ISession.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
    }
    static final int TRANSACTION_getSensorProps = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_createSession = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$biometrics$fingerprint$IFingerprint".replace('$', '.');
  public android.hardware.biometrics.fingerprint.SensorProps[] getSensorProps() throws android.os.RemoteException;
  public android.hardware.biometrics.fingerprint.ISession createSession(int sensorId, int userId, android.hardware.biometrics.fingerprint.ISessionCallback cb) throws android.os.RemoteException;
}
