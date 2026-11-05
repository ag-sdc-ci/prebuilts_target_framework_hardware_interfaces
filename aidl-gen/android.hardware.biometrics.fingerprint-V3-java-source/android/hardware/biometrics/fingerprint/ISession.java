/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.biometrics.fingerprint-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3/android/hardware/biometrics/fingerprint/ISession.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.biometrics.fingerprint;
/** @hide */
public interface ISession extends android.os.IInterface
{
  /** Default implementation for ISession. */
  public static class Default implements android.hardware.biometrics.fingerprint.ISession
  {
    @Override public void generateChallenge() throws android.os.RemoteException
    {
    }
    @Override public void revokeChallenge(long challenge) throws android.os.RemoteException
    {
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal authenticate(long operationId) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void enumerateEnrollments() throws android.os.RemoteException
    {
    }
    @Override public void removeEnrollments(int[] enrollmentIds) throws android.os.RemoteException
    {
    }
    @Override public void getAuthenticatorId() throws android.os.RemoteException
    {
    }
    @Override public void invalidateAuthenticatorId() throws android.os.RemoteException
    {
    }
    @Override public void resetLockout(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
    {
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    /** @deprecated use onPointerDownWithContext instead. */
    @Deprecated
    @Override public void onPointerDown(int pointerId, int x, int y, float minor, float major) throws android.os.RemoteException
    {
    }
    /** @deprecated use onPointerUpWithContext instead. */
    @Deprecated
    @Override public void onPointerUp(int pointerId) throws android.os.RemoteException
    {
    }
    @Override public void onUiReady() throws android.os.RemoteException
    {
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long operationId, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken hat, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
    {
      return null;
    }
    @Override public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
    {
    }
    @Override public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
    {
    }
    @Override public void onContextChanged(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
    {
    }
    @Override public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
    {
    }
    @Override public void setIgnoreDisplayTouches(boolean shouldIgnore) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.biometrics.fingerprint.ISession
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.biometrics.fingerprint.ISession interface,
     * generating a proxy if needed.
     */
    public static android.hardware.biometrics.fingerprint.ISession asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.biometrics.fingerprint.ISession))) {
        return ((android.hardware.biometrics.fingerprint.ISession)iin);
      }
      return new android.hardware.biometrics.fingerprint.ISession.Stub.Proxy(obj);
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
        case TRANSACTION_generateChallenge:
        {
          this.generateChallenge();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_revokeChallenge:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          this.revokeChallenge(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_enroll:
        {
          android.hardware.keymaster.HardwareAuthToken _arg0;
          _arg0 = data.readTypedObject(android.hardware.keymaster.HardwareAuthToken.CREATOR);
          data.enforceNoDataAvail();
          android.hardware.biometrics.common.ICancellationSignal _result = this.enroll(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_authenticate:
        {
          long _arg0;
          _arg0 = data.readLong();
          data.enforceNoDataAvail();
          android.hardware.biometrics.common.ICancellationSignal _result = this.authenticate(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_detectInteraction:
        {
          android.hardware.biometrics.common.ICancellationSignal _result = this.detectInteraction();
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_enumerateEnrollments:
        {
          this.enumerateEnrollments();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_removeEnrollments:
        {
          int[] _arg0;
          _arg0 = data.createIntArray();
          data.enforceNoDataAvail();
          this.removeEnrollments(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getAuthenticatorId:
        {
          this.getAuthenticatorId();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_invalidateAuthenticatorId:
        {
          this.invalidateAuthenticatorId();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_resetLockout:
        {
          android.hardware.keymaster.HardwareAuthToken _arg0;
          _arg0 = data.readTypedObject(android.hardware.keymaster.HardwareAuthToken.CREATOR);
          data.enforceNoDataAvail();
          this.resetLockout(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onPointerDown:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          float _arg3;
          _arg3 = data.readFloat();
          float _arg4;
          _arg4 = data.readFloat();
          data.enforceNoDataAvail();
          this.onPointerDown(_arg0, _arg1, _arg2, _arg3, _arg4);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onPointerUp:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.onPointerUp(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onUiReady:
        {
          this.onUiReady();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_authenticateWithContext:
        {
          long _arg0;
          _arg0 = data.readLong();
          android.hardware.biometrics.common.OperationContext _arg1;
          _arg1 = data.readTypedObject(android.hardware.biometrics.common.OperationContext.CREATOR);
          data.enforceNoDataAvail();
          android.hardware.biometrics.common.ICancellationSignal _result = this.authenticateWithContext(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_enrollWithContext:
        {
          android.hardware.keymaster.HardwareAuthToken _arg0;
          _arg0 = data.readTypedObject(android.hardware.keymaster.HardwareAuthToken.CREATOR);
          android.hardware.biometrics.common.OperationContext _arg1;
          _arg1 = data.readTypedObject(android.hardware.biometrics.common.OperationContext.CREATOR);
          data.enforceNoDataAvail();
          android.hardware.biometrics.common.ICancellationSignal _result = this.enrollWithContext(_arg0, _arg1);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_detectInteractionWithContext:
        {
          android.hardware.biometrics.common.OperationContext _arg0;
          _arg0 = data.readTypedObject(android.hardware.biometrics.common.OperationContext.CREATOR);
          data.enforceNoDataAvail();
          android.hardware.biometrics.common.ICancellationSignal _result = this.detectInteractionWithContext(_arg0);
          reply.writeNoException();
          reply.writeStrongInterface(_result);
          break;
        }
        case TRANSACTION_onPointerDownWithContext:
        {
          android.hardware.biometrics.fingerprint.PointerContext _arg0;
          _arg0 = data.readTypedObject(android.hardware.biometrics.fingerprint.PointerContext.CREATOR);
          data.enforceNoDataAvail();
          this.onPointerDownWithContext(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onPointerUpWithContext:
        {
          android.hardware.biometrics.fingerprint.PointerContext _arg0;
          _arg0 = data.readTypedObject(android.hardware.biometrics.fingerprint.PointerContext.CREATOR);
          data.enforceNoDataAvail();
          this.onPointerUpWithContext(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onContextChanged:
        {
          android.hardware.biometrics.common.OperationContext _arg0;
          _arg0 = data.readTypedObject(android.hardware.biometrics.common.OperationContext.CREATOR);
          data.enforceNoDataAvail();
          this.onContextChanged(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_onPointerCancelWithContext:
        {
          android.hardware.biometrics.fingerprint.PointerContext _arg0;
          _arg0 = data.readTypedObject(android.hardware.biometrics.fingerprint.PointerContext.CREATOR);
          data.enforceNoDataAvail();
          this.onPointerCancelWithContext(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setIgnoreDisplayTouches:
        {
          boolean _arg0;
          _arg0 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setIgnoreDisplayTouches(_arg0);
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
    private static final class Proxy implements android.hardware.biometrics.fingerprint.ISession
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
      @Override public void generateChallenge() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_generateChallenge, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void revokeChallenge(long challenge) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(challenge);
          boolean _status = mRemote.transact(Stub.TRANSACTION_revokeChallenge, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(hat, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enroll, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal authenticate(long operationId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(operationId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authenticate, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_detectInteraction, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void enumerateEnrollments() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enumerateEnrollments, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeEnrollments(int[] enrollmentIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(enrollmentIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeEnrollments, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void getAuthenticatorId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAuthenticatorId, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void invalidateAuthenticatorId() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_invalidateAuthenticatorId, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void resetLockout(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(hat, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_resetLockout, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void close() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** @deprecated use onPointerDownWithContext instead. */
      @Deprecated
      @Override public void onPointerDown(int pointerId, int x, int y, float minor, float major) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pointerId);
          _data.writeInt(x);
          _data.writeInt(y);
          _data.writeFloat(minor);
          _data.writeFloat(major);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPointerDown, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /** @deprecated use onPointerUpWithContext instead. */
      @Deprecated
      @Override public void onPointerUp(int pointerId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(pointerId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPointerUp, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onUiReady() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onUiReady, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long operationId, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeLong(operationId);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_authenticateWithContext, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken hat, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(hat, 0);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enrollWithContext, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        android.hardware.biometrics.common.ICancellationSignal _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_detectInteractionWithContext, _data, _reply, 0);
          _reply.readException();
          _result = android.hardware.biometrics.common.ICancellationSignal.Stub.asInterface(_reply.readStrongBinder());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPointerDownWithContext, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPointerUpWithContext, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onContextChanged(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onContextChanged, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(context, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPointerCancelWithContext, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setIgnoreDisplayTouches(boolean shouldIgnore) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeBoolean(shouldIgnore);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIgnoreDisplayTouches, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_generateChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_revokeChallenge = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_enroll = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_authenticate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_detectInteraction = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_enumerateEnrollments = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_removeEnrollments = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getAuthenticatorId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_invalidateAuthenticatorId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_resetLockout = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_onPointerDown = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_onPointerUp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_onUiReady = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_authenticateWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_enrollWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_detectInteractionWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_onPointerDownWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_onPointerUpWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_onContextChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_onPointerCancelWithContext = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_setIgnoreDisplayTouches = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$biometrics$fingerprint$ISession".replace('$', '.');
  public void generateChallenge() throws android.os.RemoteException;
  public void revokeChallenge(long challenge) throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal enroll(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal authenticate(long operationId) throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal detectInteraction() throws android.os.RemoteException;
  public void enumerateEnrollments() throws android.os.RemoteException;
  public void removeEnrollments(int[] enrollmentIds) throws android.os.RemoteException;
  public void getAuthenticatorId() throws android.os.RemoteException;
  public void invalidateAuthenticatorId() throws android.os.RemoteException;
  public void resetLockout(android.hardware.keymaster.HardwareAuthToken hat) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  /** @deprecated use onPointerDownWithContext instead. */
  @Deprecated
  public void onPointerDown(int pointerId, int x, int y, float minor, float major) throws android.os.RemoteException;
  /** @deprecated use onPointerUpWithContext instead. */
  @Deprecated
  public void onPointerUp(int pointerId) throws android.os.RemoteException;
  public void onUiReady() throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal authenticateWithContext(long operationId, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal enrollWithContext(android.hardware.keymaster.HardwareAuthToken hat, android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException;
  public android.hardware.biometrics.common.ICancellationSignal detectInteractionWithContext(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException;
  public void onPointerDownWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException;
  public void onPointerUpWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException;
  public void onContextChanged(android.hardware.biometrics.common.OperationContext context) throws android.os.RemoteException;
  public void onPointerCancelWithContext(android.hardware.biometrics.fingerprint.PointerContext context) throws android.os.RemoteException;
  public void setIgnoreDisplayTouches(boolean shouldIgnore) throws android.os.RemoteException;
}
