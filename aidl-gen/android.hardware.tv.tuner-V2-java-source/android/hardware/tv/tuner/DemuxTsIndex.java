/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: aidl --lang=java --version=2 --hash=f8d74c149f04e76b6d622db2bd8e465dae24b08c --structured --stability=vintf --min_sdk_version=34 -o /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/aidl-gen/android.hardware.tv.tuner-V2-java-source -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/aidl/aidl_api/android.hardware.common/2 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/common/fmq/aidl/aidl_api/android.hardware.common.fmq/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/graphics/common/aidl/aidl_api/android.hardware.graphics.common/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/keymaster/aidl/aidl_api/android.hardware.keymaster/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/biometrics/common/aidl/aidl_api/android.hardware.biometrics.common/4 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/secureclock/aidl/aidl_api/android.hardware.security.secureclock/1 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/security/keymint/aidl/aidl_api/android.hardware.security.keymint/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/3 -I/home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/frameworks/native/aidl/gui /home/shadichy/Documents/bliss/los-21/prebuilts/target/framework/hardware/interfaces/tv/tuner/aidl/aidl_api/android.hardware.tv.tuner/2/android/hardware/tv/tuner/DemuxTsIndex.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.tv.tuner;
/** @hide */
public @interface DemuxTsIndex {
  public static final int FIRST_PACKET = 1;
  public static final int PAYLOAD_UNIT_START_INDICATOR = 2;
  public static final int CHANGE_TO_NOT_SCRAMBLED = 4;
  public static final int CHANGE_TO_EVEN_SCRAMBLED = 8;
  public static final int CHANGE_TO_ODD_SCRAMBLED = 16;
  public static final int DISCONTINUITY_INDICATOR = 32;
  public static final int RANDOM_ACCESS_INDICATOR = 64;
  public static final int PRIORITY_INDICATOR = 128;
  public static final int PCR_FLAG = 256;
  public static final int OPCR_FLAG = 512;
  public static final int SPLICING_POINT_FLAG = 1024;
  public static final int PRIVATE_DATA = 2048;
  public static final int ADAPTATION_EXTENSION_FLAG = 4096;
  public static final int MPT_INDEX_MPT = 65536;
  public static final int MPT_INDEX_VIDEO = 131072;
  public static final int MPT_INDEX_AUDIO = 262144;
  public static final int MPT_INDEX_TIMESTAMP_TARGET_VIDEO = 524288;
  public static final int MPT_INDEX_TIMESTAMP_TARGET_AUDIO = 1048576;
}
