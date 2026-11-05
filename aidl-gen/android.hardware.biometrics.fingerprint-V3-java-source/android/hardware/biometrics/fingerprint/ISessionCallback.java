/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.biometrics.fingerprint-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3/android/hardware/biometrics/fingerprint/ISessionCallback.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.biometrics.fingerprint;
/** @hide */
public interface ISessionCallback extends android.os.IInterface
{
  /** Default implementation for ISessionCallback. */
  public static class Default implements android.hardware.biometrics.fingerprint.ISessionCallback
  {
    @Override public void onChallengeGenerated(long challenge) throws android.os.RemoteException
    {
    }
    @Override public void onChallengeRevoked(long challenge) throws android.os.RemoteException
    {
    }
    @Override public void onAcquired(byte info, int vendorCode) throws android.os.RemoteException
    {
    }
    @Override public void onError(byte error, int vendorCode) throws android.os.RemoteException
    {
    }
    @Override public void onEnrollmentProgress(int enrollmentId, int remaining) throws android.os.RemoteException
    {
    }
    @Override public void onAuthenticationSucceeded(int enrollmentId, android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
    {
    }
    @Override public void onAuthenticationFailed() throws android.os.RemoteException
    {
    }
    @Override public void onLockoutTimed(long durationMillis) throws android.os.RemoteException
    {
    }
    @Override public void onLockoutPermanent() throws android.os.RemoteException
    {
    }
    @Override public void onLockoutCleared() throws android.os.RemoteException
    {
    }
    @Override public void onInteractionDetected() throws android.os.RemoteException
    {
    }
    @Override public void onEnrollmentsEnumerated(int[] enrollmentIds) throws android.os.RemoteException
    {
    }
    @Override public void onEnrollmentsRemoved(int[] enrollmentIds) throws android.os.RemoteException
    {
    }
    @Override public void onAuthenticatorIdRetrieved(long authenticatorId) throws android.os.RemoteException
    {
    }
    @Override public void onAuthenticatorIdInvalidated(long newAuthenticatorId) throws android.os.RemoteException
    {
    }
    @Override public void onSessionClosed() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.ISessionCallback
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.biometrics.fingerprint.ISessionCallback interface,
     * generating a proxy if needed.
     */
    public static android.hardware.biometrics.fingerprint.ISessionCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.biometrics.fingerprint.ISessionCallback))) {
        return ((android.hardware.biometrics.fingerprint.ISessionCallback)iin);
      }
      return new android.hardware.biometrics.fingerprint.ISessionCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onChallengeGenerated:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.onChallengeGenerated(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onChallengeRevoked:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.onChallengeRevoked(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onAcquired:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.onAcquired(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onError:
        {
          byte _arg0;
          _arg0 = data.readByte();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.onError(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onEnrollmentProgress:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.onEnrollmentProgress(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onAuthenticationSucceeded:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.keymaster.HardwareAuthToken _arg1;
          _arg1 = data.readTypedObject(android.hardware.keymaster.HardwareAuthToken.CREATOR);
          data.enforceNoDataAvail();
          this.onAuthenticationSucceeded(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onAuthenticationFailed:
        {
          this.onAuthenticationFailed();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onLockoutTimed:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.onLockoutTimed(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onLockoutPermanent:
        {
          this.onLockoutPermanent();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onLockoutCleared:
        {
          this.onLockoutCleared();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onInteractionDetected:
        {
          this.onInteractionDetected();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onEnrollmentsEnumerated:
        {
          int[] _arg0;
          _arg0 = data.createIntArray();
          data.enforceNoDataAvail();
          this.onEnrollmentsEnumerated(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onEnrollmentsRemoved:
        {
          int[] _arg0;
          _arg0 = data.createIntArray();
          data.enforceNoDataAvail();
          this.onEnrollmentsRemoved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onAuthenticatorIdRetrieved:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.onAuthenticatorIdRetrieved(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onAuthenticatorIdInvalidated:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.onAuthenticatorIdInvalidated(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onSessionClosed:
        {
          this.onSessionClosed();
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
    private static final class Proxy implements android.hardware.biometrics.fingerprint.ISessionCallback
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
      @Override public void onChallengeGenerated(long challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(challenge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onChallengeGenerated, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onChallengeRevoked(long challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(challenge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onChallengeRevoked, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onAcquired(byte info, int vendorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(info);
          _data.writeInt(vendorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAcquired, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onError(byte error, int vendorCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByte(error);
          _data.writeInt(vendorCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onError, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onEnrollmentProgress(int enrollmentId, int remaining) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(enrollmentId);
          _data.writeInt(remaining);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onEnrollmentProgress, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onAuthenticationSucceeded(int enrollmentId, android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(enrollmentId);
          _data.writeTypedObject(hat, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAuthenticationSucceeded, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onAuthenticationFailed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAuthenticationFailed, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onLockoutTimed(long durationMillis) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(durationMillis);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onLockoutTimed, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onLockoutPermanent() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onLockoutPermanent, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onLockoutCleared() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onLockoutCleared, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onInteractionDetected() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onInteractionDetected, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onEnrollmentsEnumerated(int[] enrollmentIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(enrollmentIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onEnrollmentsEnumerated, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onEnrollmentsRemoved(int[] enrollmentIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(enrollmentIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onEnrollmentsRemoved, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onAuthenticatorIdRetrieved(long authenticatorId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(authenticatorId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAuthenticatorIdRetrieved, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onAuthenticatorIdInvalidated(long newAuthenticatorId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(newAuthenticatorId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onAuthenticatorIdInvalidated, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onSessionClosed() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSessionClosed, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onChallengeGenerated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onChallengeRevoked = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onAcquired = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_onEnrollmentProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onAuthenticationSucceeded = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_onAuthenticationFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_onLockoutTimed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_onLockoutPermanent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_onLockoutCleared = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_onInteractionDetected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onEnrollmentsEnumerated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onEnrollmentsRemoved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_onAuthenticatorIdRetrieved = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_onAuthenticatorIdInvalidated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_onSessionClosed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$biometrics$fingerprint$ISessionCallback".replace('$', '.');
  public void onChallengeGenerated(long challenge) throws android.os.RemoteException;
  public void onChallengeRevoked(long challenge) throws android.os.RemoteException;
  public void onAcquired(byte info, int vendorCode) throws android.os.RemoteException;
  public void onError(byte error, int vendorCode) throws android.os.RemoteException;
  public void onEnrollmentProgress(int enrollmentId, int remaining) throws android.os.RemoteException;
  public void onAuthenticationSucceeded(int enrollmentId, android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException;
  public void onAuthenticationFailed() throws android.os.RemoteException;
  public void onLockoutTimed(long durationMillis) throws android.os.RemoteException;
  public void onLockoutPermanent() throws android.os.RemoteException;
  public void onLockoutCleared() throws android.os.RemoteException;
  public void onInteractionDetected() throws android.os.RemoteException;
  public void onEnrollmentsEnumerated(int[] enrollmentIds) throws android.os.RemoteException;
  public void onEnrollmentsRemoved(int[] enrollmentIds) throws android.os.RemoteException;
  public void onAuthenticatorIdRetrieved(long authenticatorId) throws android.os.RemoteException;
  public void onAuthenticatorIdInvalidated(long newAuthenticatorId) throws android.os.RemoteException;
  public void onSessionClosed() throws android.os.RemoteException;
}
