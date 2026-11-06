/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=3 --hash=c45c122528c07c449ea08f6eacaace17bb7abc38 --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.network-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/3/android/hardware/radio/network/RegState.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public @interface RegState {
  public static final int NOT_REG_MT_NOT_SEARCHING_OP = 0;
  public static final int REG_HOME = 1;
  public static final int NOT_REG_MT_SEARCHING_OP = 2;
  public static final int REG_DENIED = 3;
  public static final int UNKNOWN = 4;
  public static final int REG_ROAMING = 5;
  public static final int NOT_REG_MT_NOT_SEARCHING_OP_EM = 10;
  public static final int NOT_REG_MT_SEARCHING_OP_EM = 12;
  public static final int REG_DENIED_EM = 13;
  public static final int UNKNOWN_EM = 14;
  public static final int REG_EM = 20;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NOT_REG_MT_NOT_SEARCHING_OP) return "NOT_REG_MT_NOT_SEARCHING_OP";
      if (_aidl_v == REG_HOME) return "REG_HOME";
      if (_aidl_v == NOT_REG_MT_SEARCHING_OP) return "NOT_REG_MT_SEARCHING_OP";
      if (_aidl_v == REG_DENIED) return "REG_DENIED";
      if (_aidl_v == UNKNOWN) return "UNKNOWN";
      if (_aidl_v == REG_ROAMING) return "REG_ROAMING";
      if (_aidl_v == NOT_REG_MT_NOT_SEARCHING_OP_EM) return "NOT_REG_MT_NOT_SEARCHING_OP_EM";
      if (_aidl_v == NOT_REG_MT_SEARCHING_OP_EM) return "NOT_REG_MT_SEARCHING_OP_EM";
      if (_aidl_v == REG_DENIED_EM) return "REG_DENIED_EM";
      if (_aidl_v == UNKNOWN_EM) return "UNKNOWN_EM";
      if (_aidl_v == REG_EM) return "REG_EM";
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
