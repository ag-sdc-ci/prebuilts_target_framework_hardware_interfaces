/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.graphics.common-V3-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3/android/hardware/graphics/common/BufferUsage.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.graphics.common;
/** @hide */
public @interface BufferUsage {
  public static final long CPU_READ_MASK = 15L;
  public static final long CPU_READ_NEVER = 0L;
  public static final long CPU_READ_RARELY = 2L;
  public static final long CPU_READ_OFTEN = 3L;
  public static final long CPU_WRITE_MASK = 240L;
  public static final long CPU_WRITE_NEVER = 0L;
  public static final long CPU_WRITE_RARELY = 32L;
  public static final long CPU_WRITE_OFTEN = 48L;
  public static final long GPU_TEXTURE = 256L;
  public static final long GPU_RENDER_TARGET = 512L;
  public static final long COMPOSER_OVERLAY = 2048L;
  public static final long COMPOSER_CLIENT_TARGET = 4096L;
  public static final long PROTECTED = 16384L;
  public static final long COMPOSER_CURSOR = 32768L;
  public static final long VIDEO_ENCODER = 65536L;
  public static final long CAMERA_OUTPUT = 131072L;
  public static final long CAMERA_INPUT = 262144L;
  public static final long RENDERSCRIPT = 1048576L;
  public static final long VIDEO_DECODER = 4194304L;
  public static final long SENSOR_DIRECT_DATA = 8388608L;
  public static final long GPU_DATA_BUFFER = 16777216L;
  public static final long GPU_CUBE_MAP = 33554432L;
  public static final long GPU_MIPMAP_COMPLETE = 67108864L;
  public static final long HW_IMAGE_ENCODER = 134217728L;
  public static final long FRONT_BUFFER = 4294967296L;
  public static final long VENDOR_MASK = 4026531840L;
  public static final long VENDOR_MASK_HI = -281474976710656L;
}
