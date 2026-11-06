/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=4 --hash=c43fbb9be4a662cc9ace640dba21cccdb84c6c21 --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.biometrics.face-V4-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/face/aidl/aidl_api/android.hardware.biometrics.face/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/face/aidl/aidl_api/android.hardware.biometrics.face/4/android/hardware/biometrics/face/AcquiredInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.biometrics.face;
/** @hide */
public @interface AcquiredInfo {
  public static final byte UNKNOWN = 0;
  public static final byte GOOD = 1;
  public static final byte INSUFFICIENT = 2;
  public static final byte TOO_BRIGHT = 3;
  public static final byte TOO_DARK = 4;
  public static final byte TOO_CLOSE = 5;
  public static final byte TOO_FAR = 6;
  public static final byte FACE_TOO_HIGH = 7;
  public static final byte FACE_TOO_LOW = 8;
  public static final byte FACE_TOO_RIGHT = 9;
  public static final byte FACE_TOO_LEFT = 10;
  public static final byte POOR_GAZE = 11;
  public static final byte NOT_DETECTED = 12;
  public static final byte TOO_MUCH_MOTION = 13;
  public static final byte RECALIBRATE = 14;
  public static final byte TOO_DIFFERENT = 15;
  public static final byte TOO_SIMILAR = 16;
  public static final byte PAN_TOO_EXTREME = 17;
  public static final byte TILT_TOO_EXTREME = 18;
  public static final byte ROLL_TOO_EXTREME = 19;
  public static final byte FACE_OBSCURED = 20;
  public static final byte START = 21;
  public static final byte SENSOR_DIRTY = 22;
  public static final byte VENDOR = 23;
  public static final byte FIRST_FRAME_RECEIVED = 24;
  public static final byte DARK_GLASSES_DETECTED = 25;
  public static final byte MOUTH_COVERING_DETECTED = 26;
}
