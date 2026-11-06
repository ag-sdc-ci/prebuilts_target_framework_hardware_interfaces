/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=2 --hash=2f49c78011338b42b43d5d0e250d9b520850cc1f --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.thermal-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/thermal/aidl/aidl_api/android.hardware.thermal/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/thermal/aidl/aidl_api/android.hardware.thermal/2/android/hardware/thermal/TemperatureType.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.thermal;
/** @hide */
public @interface TemperatureType {
  public static final int UNKNOWN = -1;
  public static final int CPU = 0;
  public static final int GPU = 1;
  public static final int BATTERY = 2;
  public static final int SKIN = 3;
  public static final int USB_PORT = 4;
  public static final int POWER_AMPLIFIER = 5;
  public static final int BCL_VOLTAGE = 6;
  public static final int BCL_CURRENT = 7;
  public static final int BCL_PERCENTAGE = 8;
  public static final int NPU = 9;
  public static final int TPU = 10;
  public static final int DISPLAY = 11;
  public static final int MODEM = 12;
  public static final int SOC = 13;
  public static final int WIFI = 14;
  public static final int CAMERA = 15;
  public static final int FLASHLIGHT = 16;
  public static final int SPEAKER = 17;
  public static final int AMBIENT = 18;
  public static final int POGO = 19;
}
