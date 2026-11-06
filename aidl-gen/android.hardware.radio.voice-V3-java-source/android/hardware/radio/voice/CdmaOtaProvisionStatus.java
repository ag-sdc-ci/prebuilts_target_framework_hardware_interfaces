/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=3 --hash=78fb79bcb32590a868b3eb7affb39ab90e4ca782 --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.radio.voice-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/3/android/hardware/radio/voice/CdmaOtaProvisionStatus.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/** @hide */
public @interface CdmaOtaProvisionStatus {
  public static final int SPL_UNLOCKED = 0;
  public static final int SPC_RETRIES_EXCEEDED = 1;
  public static final int A_KEY_EXCHANGED = 2;
  public static final int SSD_UPDATED = 3;
  public static final int NAM_DOWNLOADED = 4;
  public static final int MDN_DOWNLOADED = 5;
  public static final int IMSI_DOWNLOADED = 6;
  public static final int PRL_DOWNLOADED = 7;
  public static final int COMMITTED = 8;
  public static final int OTAPA_STARTED = 9;
  public static final int OTAPA_STOPPED = 10;
  public static final int OTAPA_ABORTED = 11;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == SPL_UNLOCKED) return "SPL_UNLOCKED";
      if (_aidl_v == SPC_RETRIES_EXCEEDED) return "SPC_RETRIES_EXCEEDED";
      if (_aidl_v == A_KEY_EXCHANGED) return "A_KEY_EXCHANGED";
      if (_aidl_v == SSD_UPDATED) return "SSD_UPDATED";
      if (_aidl_v == NAM_DOWNLOADED) return "NAM_DOWNLOADED";
      if (_aidl_v == MDN_DOWNLOADED) return "MDN_DOWNLOADED";
      if (_aidl_v == IMSI_DOWNLOADED) return "IMSI_DOWNLOADED";
      if (_aidl_v == PRL_DOWNLOADED) return "PRL_DOWNLOADED";
      if (_aidl_v == COMMITTED) return "COMMITTED";
      if (_aidl_v == OTAPA_STARTED) return "OTAPA_STARTED";
      if (_aidl_v == OTAPA_STOPPED) return "OTAPA_STOPPED";
      if (_aidl_v == OTAPA_ABORTED) return "OTAPA_ABORTED";
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
