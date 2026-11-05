/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.network-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3/android/hardware/radio/network/NasProtocolMessage.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public @interface NasProtocolMessage {
  public static final int UNKNOWN = 0;
  public static final int ATTACH_REQUEST = 1;
  public static final int IDENTITY_RESPONSE = 2;
  public static final int DETACH_REQUEST = 3;
  public static final int TRACKING_AREA_UPDATE_REQUEST = 4;
  public static final int LOCATION_UPDATE_REQUEST = 5;
  public static final int AUTHENTICATION_AND_CIPHERING_RESPONSE = 6;
  public static final int REGISTRATION_REQUEST = 7;
  public static final int DEREGISTRATION_REQUEST = 8;
  public static final int CM_REESTABLISHMENT_REQUEST = 9;
  public static final int CM_SERVICE_REQUEST = 10;
  public static final int IMSI_DETACH_INDICATION = 11;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == UNKNOWN) return "UNKNOWN";
      if (_aidl_v == ATTACH_REQUEST) return "ATTACH_REQUEST";
      if (_aidl_v == IDENTITY_RESPONSE) return "IDENTITY_RESPONSE";
      if (_aidl_v == DETACH_REQUEST) return "DETACH_REQUEST";
      if (_aidl_v == TRACKING_AREA_UPDATE_REQUEST) return "TRACKING_AREA_UPDATE_REQUEST";
      if (_aidl_v == LOCATION_UPDATE_REQUEST) return "LOCATION_UPDATE_REQUEST";
      if (_aidl_v == AUTHENTICATION_AND_CIPHERING_RESPONSE) return "AUTHENTICATION_AND_CIPHERING_RESPONSE";
      if (_aidl_v == REGISTRATION_REQUEST) return "REGISTRATION_REQUEST";
      if (_aidl_v == DEREGISTRATION_REQUEST) return "DEREGISTRATION_REQUEST";
      if (_aidl_v == CM_REESTABLISHMENT_REQUEST) return "CM_REESTABLISHMENT_REQUEST";
      if (_aidl_v == CM_SERVICE_REQUEST) return "CM_SERVICE_REQUEST";
      if (_aidl_v == IMSI_DETACH_INDICATION) return "IMSI_DETACH_INDICATION";
      return Integer.toString(_aidl_v);
    }
    static String arrayToString(Object _aidl_v) {
      if (_aidl_v == null) return "null";
      Class<?> _aidl_cls = _aidl_v.getClass();
      if (!_aidl_cls.isArray()) throw new IllegalArgumentException("not an array: " + _aidl_v);
      Class<?> comp = _aidl_cls.getComponentType();
      java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "[", "]");
      if (comp.isArray()) {
        for (int _aidl_i = 0; _aidl_i < java.lang.reflect.Array.getLength(_aidl_v); _aidl_i++) {
          _aidl_sj.add(arrayToString(java.lang.reflect.Array.get(_aidl_v, _aidl_i)));
        }
      } else {
        if (_aidl_cls != int[].class) throw new IllegalArgumentException("wrong type: " + _aidl_cls);
        for (int e : (int[]) _aidl_v) {
          _aidl_sj.add(toString(e));
        }
      }
      return _aidl_sj.toString();
    }
  }
}
