/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/IGnssGeofence.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss;
/** @hide */
public interface IGnssGeofence extends android.os.IInterface
{
  /** Default implementation for IGnssGeofence. */
  public static class Default implements android.hardware.gnss.IGnssGeofence
  {
    @Override public void setCallback(android.hardware.gnss.IGnssGeofenceCallback callback) throws android.os.RemoteException
    {
    }
    @Override public void addGeofence(int geofenceId, double latitudeDegrees, double longitudeDegrees, double radiusMeters, int lastTransition, int monitorTransitions, int notificationResponsivenessMs, int unknownTimerMs) throws android.os.RemoteException
    {
    }
    @Override public void pauseGeofence(int geofenceId) throws android.os.RemoteException
    {
    }
    @Override public void resumeGeofence(int geofenceId, int monitorTransitions) throws android.os.RemoteException
    {
    }
    @Override public void removeGeofence(int geofenceId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssGeofence
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.IGnssGeofence interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.IGnssGeofence asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.IGnssGeofence))) {
        return ((android.hardware.gnss.IGnssGeofence)iin);
      }
      return new android.hardware.gnss.IGnssGeofence.Stub.Proxy(obj);
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
        case TRANSACTION_setCallback:
        {
          android.hardware.gnss.IGnssGeofenceCallback _arg0;
          _arg0 = android.hardware.gnss.IGnssGeofenceCallback.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setCallback(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_addGeofence:
        {
          int _arg0;
          _arg0 = data.readInt();
          double _arg1;
          _arg1 = data.readDouble();
          double _arg2;
          _arg2 = data.readDouble();
          double _arg3;
          _arg3 = data.readDouble();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          int _arg6;
          _arg6 = data.readInt();
          int _arg7;
          _arg7 = data.readInt();
          data.enforceNoDataAvail();
          this.addGeofence(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_pauseGeofence:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.pauseGeofence(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_resumeGeofence:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.resumeGeofence(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeGeofence:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.removeGeofence(_arg0);
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
    private static final class Proxy implements android.hardware.gnss.IGnssGeofence
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
      @Override public void setCallback(android.hardware.gnss.IGnssGeofenceCallback callback) throws android.os.RemoteException
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
      @Override public void addGeofence(int geofenceId, double latitudeDegrees, double longitudeDegrees, double radiusMeters, int lastTransition, int monitorTransitions, int notificationResponsivenessMs, int unknownTimerMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(geofenceId);
          _data.writeDouble(latitudeDegrees);
          _data.writeDouble(longitudeDegrees);
          _data.writeDouble(radiusMeters);
          _data.writeInt(lastTransition);
          _data.writeInt(monitorTransitions);
          _data.writeInt(notificationResponsivenessMs);
          _data.writeInt(unknownTimerMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_addGeofence, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void pauseGeofence(int geofenceId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(geofenceId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_pauseGeofence, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void resumeGeofence(int geofenceId, int monitorTransitions) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(geofenceId);
          _data.writeInt(monitorTransitions);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resumeGeofence, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeGeofence(int geofenceId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(geofenceId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeGeofence, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_addGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_pauseGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_resumeGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_removeGeofence = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$IGnssGeofence".replace('$', '.');
  public void setCallback(android.hardware.gnss.IGnssGeofenceCallback callback) throws android.os.RemoteException;
  public void addGeofence(int geofenceId, double latitudeDegrees, double longitudeDegrees, double radiusMeters, int lastTransition, int monitorTransitions, int notificationResponsivenessMs, int unknownTimerMs) throws android.os.RemoteException;
  public void pauseGeofence(int geofenceId) throws android.os.RemoteException;
  public void resumeGeofence(int geofenceId, int monitorTransitions) throws android.os.RemoteException;
  public void removeGeofence(int geofenceId) throws android.os.RemoteException;
}
