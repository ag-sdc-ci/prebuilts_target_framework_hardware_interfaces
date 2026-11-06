/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=3 --hash=637371b53fb7faf9bd43aa51b72c23852d6e6d96 --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.biometrics.fingerprint-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/fingerprint/aidl/aidl_api/android.hardware.biometrics.fingerprint/3/android/hardware/biometrics/fingerprint/AcquiredInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.biometrics.fingerprint;
/** @hide */
public @interface AcquiredInfo {
  public static final byte UNKNOWN = 0;
  public static final byte GOOD = 1;
  public static final byte PARTIAL = 2;
  public static final byte INSUFFICIENT = 3;
  public static final byte SENSOR_DIRTY = 4;
  public static final byte TOO_SLOW = 5;
  public static final byte TOO_FAST = 6;
  public static final byte VENDOR = 7;
  public static final byte START = 8;
  public static final byte TOO_DARK = 9;
  public static final byte TOO_BRIGHT = 10;
  public static final byte IMMOBILE = 11;
  public static final byte RETRYING_CAPTURE = 12;
  public static final byte LIFT_TOO_SOON = 13;
  public static final byte POWER_PRESS = 14;
}
