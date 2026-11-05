/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/measurement_corrections/IMeasurementCorrectionsInterface.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss.measurement_corrections;
/** @hide */
public interface IMeasurementCorrectionsInterface extends android.os.IInterface
{
  /** Default implementation for IMeasurementCorrectionsInterface. */
  public static class Default implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface
  {
    @Override public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections corrections) throws android.os.RemoteException
    {
    }
    @Override public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface))) {
        return ((android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface)iin);
      }
      return new android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface.Stub.Proxy(obj);
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
        case TRANSACTION_setCorrections:
        {
          android.hardware.gnss.measurement_corrections.MeasurementCorrections _arg0;
          _arg0 = data.readTypedObject(android.hardware.gnss.measurement_corrections.MeasurementCorrections.CREATOR);
          data.enforceNoDataAvail();
          this.setCorrections(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setCallback:
        {
          android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback _arg0;
          _arg0 = android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setCallback(_arg0);
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
    private static final class Proxy implements android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsInterface
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
      @Override public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections corrections) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(corrections, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCorrections, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallback, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setCorrections = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$measurement_corrections$IMeasurementCorrectionsInterface".replace('$', '.');
  public void setCorrections(android.hardware.gnss.measurement_corrections.MeasurementCorrections corrections) throws android.os.RemoteException;
  public void setCallback(android.hardware.gnss.measurement_corrections.IMeasurementCorrectionsCallback callback) throws android.os.RemoteException;
}
