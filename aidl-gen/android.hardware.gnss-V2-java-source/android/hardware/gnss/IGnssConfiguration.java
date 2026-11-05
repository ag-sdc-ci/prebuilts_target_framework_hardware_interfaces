/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.gnss-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/gnss/aidl/aidl_api/android.hardware.gnss/2/android/hardware/gnss/IGnssConfiguration.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.gnss;
/** @hide */
public interface IGnssConfiguration extends android.os.IInterface
{
  /** Default implementation for IGnssConfiguration. */
  public static class Default implements android.hardware.gnss.IGnssConfiguration
  {
    @Override public void setSuplVersion(int version) throws android.os.RemoteException
    {
    }
    @Override public void setSuplMode(int mode) throws android.os.RemoteException
    {
    }
    @Override public void setLppProfile(int lppProfile) throws android.os.RemoteException
    {
    }
    @Override public void setGlonassPositioningProtocol(int protocol) throws android.os.RemoteException
    {
    }
    @Override public void setEmergencySuplPdn(boolean enable) throws android.os.RemoteException
    {
    }
    @Override public void setEsExtensionSec(int emergencyExtensionSeconds) throws android.os.RemoteException
    {
    }
    @Override public void setBlocklist(android.hardware.gnss.BlocklistedSource[] blocklist) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.gnss.IGnssConfiguration
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.gnss.IGnssConfiguration interface,
     * generating a proxy if needed.
     */
    public static android.hardware.gnss.IGnssConfiguration asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.gnss.IGnssConfiguration))) {
        return ((android.hardware.gnss.IGnssConfiguration)iin);
      }
      return new android.hardware.gnss.IGnssConfiguration.Stub.Proxy(obj);
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
        case TRANSACTION_setSuplVersion:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setSuplVersion(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setSuplMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setSuplMode(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setLppProfile:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setLppProfile(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setGlonassPositioningProtocol:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setGlonassPositioningProtocol(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setEmergencySuplPdn:
        {
          boolean _arg0;
          _arg0 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setEmergencySuplPdn(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setEsExtensionSec:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setEsExtensionSec(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setBlocklist:
        {
          android.hardware.gnss.BlocklistedSource[] _arg0;
          _arg0 = data.createTypedArray(android.hardware.gnss.BlocklistedSource.CREATOR);
          data.enforceNoDataAvail();
          this.setBlocklist(_arg0);
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
    private static final class Proxy implements android.hardware.gnss.IGnssConfiguration
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
      @Override public void setSuplVersion(int version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSuplVersion, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setSuplMode(int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSuplMode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setLppProfile(int lppProfile) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(lppProfile);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLppProfile, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setGlonassPositioningProtocol(int protocol) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(protocol);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setGlonassPositioningProtocol, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setEmergencySuplPdn(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEmergencySuplPdn, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setEsExtensionSec(int emergencyExtensionSeconds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(emergencyExtensionSeconds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEsExtensionSec, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setBlocklist(android.hardware.gnss.BlocklistedSource[] blocklist) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedArray(blocklist, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBlocklist, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_setSuplVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_setSuplMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setLppProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setGlonassPositioningProtocol = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setEmergencySuplPdn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setEsExtensionSec = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setBlocklist = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$gnss$IGnssConfiguration".replace('$', '.');
  public static final int SUPL_MODE_MSB = 1;
  public static final int SUPL_MODE_MSA = 2;
  public static final int LPP_PROFILE_USER_PLANE = 1;
  public static final int LPP_PROFILE_CONTROL_PLANE = 2;
  public static final int GLONASS_POS_PROTOCOL_RRC_CPLANE = 1;
  public static final int GLONASS_POS_PROTOCOL_RRLP_UPLANE = 2;
  public static final int GLONASS_POS_PROTOCOL_LPP_UPLANE = 4;
  public void setSuplVersion(int version) throws android.os.RemoteException;
  public void setSuplMode(int mode) throws android.os.RemoteException;
  public void setLppProfile(int lppProfile) throws android.os.RemoteException;
  public void setGlonassPositioningProtocol(int protocol) throws android.os.RemoteException;
  public void setEmergencySuplPdn(boolean enable) throws android.os.RemoteException;
  public void setEsExtensionSec(int emergencyExtensionSeconds) throws android.os.RemoteException;
  public void setBlocklist(android.hardware.gnss.BlocklistedSource[] blocklist) throws android.os.RemoteException;
}
