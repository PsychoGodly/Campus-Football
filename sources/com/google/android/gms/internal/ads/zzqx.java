package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzqx {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    zzqx(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        Objects.requireNonNull(str);
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z10;
        this.zze = z13;
        this.zzf = z15;
        this.zzh = zzbt.zzh(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if ("Nexus 10".equals(r3) == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzqx zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzqx r11 = new com.google.android.gms.internal.ads.zzqx
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L_0x003b
            int r3 = com.google.android.gms.internal.ads.zzew.zza
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x003b
            r5 = 22
            if (r3 > r5) goto L_0x0039
            java.lang.String r3 = com.google.android.gms.internal.ads.zzew.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0039
        L_0x0028:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x003b
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x0039
            goto L_0x003b
        L_0x0039:
            r8 = 1
            goto L_0x003c
        L_0x003b:
            r8 = 0
        L_0x003c:
            r3 = 21
            if (r4 == 0) goto L_0x004e
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L_0x004e
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L_0x004e
            r9 = 1
            goto L_0x004f
        L_0x004e:
            r9 = 0
        L_0x004f:
            if (r20 != 0) goto L_0x0062
            if (r4 == 0) goto L_0x0060
            int r5 = com.google.android.gms.internal.ads.zzew.zza
            if (r5 < r3) goto L_0x0060
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r10 = 0
            goto L_0x0063
        L_0x0062:
            r10 = 1
        L_0x0063:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzqx");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(zzew.zze(i10, widthAlignment) * widthAlignment, zzew.zze(i11, heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = this.zza;
        String str3 = this.zzb;
        String str4 = zzew.zze;
        zzee.zza("MediaCodecInfo", "NoSupport [" + str + "] [" + str2 + ", " + str3 + "] [" + str4 + "]");
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point zzi = zzi(videoCapabilities, i10, i11);
        int i12 = zzi.x;
        int i13 = zzi.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        return videoCapabilities.areSizeAndRateSupported(i12, i13, Math.floor(d10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzl(com.google.android.gms.internal.ads.zzaf r12, boolean r13) {
        /*
            r11 = this;
            android.util.Pair r0 = com.google.android.gms.internal.ads.zzrp.zzb(r12)
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r3 = r12.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r4 = 8
            java.lang.String r5 = "video/hevc"
            r6 = 2
            r7 = 0
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = r11.zzb
            java.lang.String r8 = "video/avc"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0036
            r0 = 0
            r2 = 8
            goto L_0x0040
        L_0x0036:
            java.lang.String r3 = r11.zzb
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0040
            r0 = 0
            r2 = 2
        L_0x0040:
            boolean r3 = r11.zzh
            if (r3 != 0) goto L_0x004a
            r3 = 42
            if (r2 != r3) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            return r1
        L_0x004a:
            android.media.MediaCodecInfo$CodecProfileLevel[] r3 = r11.zzh()
            int r8 = com.google.android.gms.internal.ads.zzew.zza
            r9 = 23
            if (r8 > r9) goto L_0x00d6
            java.lang.String r8 = r11.zzb
            java.lang.String r9 = "video/x-vnd.on2.vp9"
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00d6
            int r8 = r3.length
            if (r8 != 0) goto L_0x00d6
            android.media.MediaCodecInfo$CodecCapabilities r3 = r11.zzd
            if (r3 == 0) goto L_0x007a
            android.media.MediaCodecInfo$VideoCapabilities r3 = r3.getVideoCapabilities()
            if (r3 == 0) goto L_0x007a
            android.util.Range r3 = r3.getBitrateRange()
            java.lang.Comparable r3 = r3.getUpper()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L_0x007b
        L_0x007a:
            r3 = 0
        L_0x007b:
            r8 = 180000000(0xaba9500, float:1.7967196E-32)
            if (r3 < r8) goto L_0x0083
            r4 = 1024(0x400, float:1.435E-42)
            goto L_0x00c8
        L_0x0083:
            r8 = 120000000(0x7270e00, float:1.2567798E-34)
            if (r3 < r8) goto L_0x008b
            r4 = 512(0x200, float:7.175E-43)
            goto L_0x00c8
        L_0x008b:
            r8 = 60000000(0x3938700, float:8.670878E-37)
            if (r3 < r8) goto L_0x0093
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x00c8
        L_0x0093:
            r8 = 30000000(0x1c9c380, float:7.411627E-38)
            if (r3 < r8) goto L_0x009b
            r4 = 128(0x80, float:1.794E-43)
            goto L_0x00c8
        L_0x009b:
            r8 = 18000000(0x112a880, float:2.6936858E-38)
            if (r3 < r8) goto L_0x00a3
            r4 = 64
            goto L_0x00c8
        L_0x00a3:
            r8 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r3 < r8) goto L_0x00ab
            r4 = 32
            goto L_0x00c8
        L_0x00ab:
            r8 = 7200000(0x6ddd00, float:1.0089349E-38)
            if (r3 < r8) goto L_0x00b3
            r4 = 16
            goto L_0x00c8
        L_0x00b3:
            r8 = 3600000(0x36ee80, float:5.044674E-39)
            if (r3 < r8) goto L_0x00b9
            goto L_0x00c8
        L_0x00b9:
            r4 = 1800000(0x1b7740, float:2.522337E-39)
            if (r3 < r4) goto L_0x00c0
            r4 = 4
            goto L_0x00c8
        L_0x00c0:
            r4 = 800000(0xc3500, float:1.121039E-39)
            if (r3 < r4) goto L_0x00c7
            r4 = 2
            goto L_0x00c8
        L_0x00c7:
            r4 = 1
        L_0x00c8:
            android.media.MediaCodecInfo$CodecProfileLevel r3 = new android.media.MediaCodecInfo$CodecProfileLevel
            r3.<init>()
            r3.profile = r1
            r3.level = r4
            android.media.MediaCodecInfo$CodecProfileLevel[] r4 = new android.media.MediaCodecInfo.CodecProfileLevel[r1]
            r4[r7] = r3
            r3 = r4
        L_0x00d6:
            int r4 = r3.length
            r8 = 0
        L_0x00d8:
            if (r8 >= r4) goto L_0x0107
            r9 = r3[r8]
            int r10 = r9.profile
            if (r10 != r2) goto L_0x0104
            int r9 = r9.level
            if (r9 >= r0) goto L_0x00e6
            if (r13 != 0) goto L_0x0104
        L_0x00e6:
            java.lang.String r9 = r11.zzb
            boolean r9 = r5.equals(r9)
            if (r9 == 0) goto L_0x0103
            if (r2 != r6) goto L_0x0103
            java.lang.String r9 = com.google.android.gms.internal.ads.zzew.zzb
            java.lang.String r10 = "sailfish"
            boolean r10 = r10.equals(r9)
            if (r10 != 0) goto L_0x0104
            java.lang.String r10 = "marlin"
            boolean r9 = r10.equals(r9)
            if (r9 == 0) goto L_0x0103
            goto L_0x0104
        L_0x0103:
            return r1
        L_0x0104:
            int r8 = r8 + 1
            goto L_0x00d8
        L_0x0107:
            java.lang.String r12 = r12.zzj
            java.lang.String r13 = r11.zzc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "codec.profileLevel, "
            r0.append(r1)
            r0.append(r12)
            java.lang.String r12 = ", "
            r0.append(r12)
            r0.append(r13)
            java.lang.String r12 = r0.toString()
            r11.zzj(r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzl(com.google.android.gms.internal.ads.zzaf, boolean):boolean");
    }

    private final boolean zzm(zzaf zzaf) {
        return this.zzb.equals(zzaf.zzm) || this.zzb.equals(zzrp.zze(zzaf));
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i10, i11);
    }

    public final zzhc zzb(zzaf zzaf, zzaf zzaf2) {
        int i10 = true != zzew.zzU(zzaf.zzm, zzaf2.zzm) ? 8 : 0;
        if (this.zzh) {
            if (zzaf.zzu != zzaf2.zzu) {
                i10 |= 1024;
            }
            if (!this.zze && !(zzaf.zzr == zzaf2.zzr && zzaf.zzs == zzaf2.zzs)) {
                i10 |= 512;
            }
            if (!zzew.zzU(zzaf.zzy, zzaf2.zzy)) {
                i10 |= 2048;
            }
            String str = this.zza;
            if (zzew.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzaf.zze(zzaf2)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzhc(this.zza, zzaf, zzaf2, true != zzaf.zze(zzaf2) ? 2 : 3, 0);
            }
        } else {
            if (zzaf.zzz != zzaf2.zzz) {
                i10 |= 4096;
            }
            if (zzaf.zzA != zzaf2.zzA) {
                i10 |= 8192;
            }
            if (zzaf.zzB != zzaf2.zzB) {
                i10 |= 16384;
            }
            if (i10 == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb2 = zzrp.zzb(zzaf);
                Pair zzb3 = zzrp.zzb(zzaf2);
                if (!(zzb2 == null || zzb3 == null)) {
                    int intValue = ((Integer) zzb2.first).intValue();
                    int intValue2 = ((Integer) zzb3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzhc(this.zza, zzaf, zzaf2, 3, 0);
                    }
                }
            }
            if (!zzaf.zze(zzaf2)) {
                i10 |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i10 |= 2;
            }
            if (i10 == 0) {
                return new zzhc(this.zza, zzaf, zzaf2, 1, 0);
            }
        }
        return new zzhc(this.zza, zzaf, zzaf2, 0, i10);
    }

    public final boolean zzd(zzaf zzaf) {
        if (!zzm(zzaf) || !zzl(zzaf, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzaf zzaf) throws zzrj {
        int i10;
        int i11;
        boolean z10 = false;
        if (!zzm(zzaf) || !zzl(zzaf, true)) {
            return false;
        }
        if (this.zzh) {
            int i12 = zzaf.zzr;
            if (i12 <= 0 || (i11 = zzaf.zzs) <= 0) {
                return true;
            }
            if (zzew.zza >= 21) {
                return zzg(i12, i11, (double) zzaf.zzt);
            }
            if (i12 * i11 <= zzrp.zza()) {
                z10 = true;
            }
            if (!z10) {
                int i13 = zzaf.zzr;
                int i14 = zzaf.zzs;
                zzj("legacyFrameSize, " + i13 + "x" + i14);
            }
            return z10;
        }
        int i15 = zzew.zza;
        if (i15 >= 21) {
            int i16 = zzaf.zzA;
            if (i16 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                } else if (!audioCapabilities.isSampleRateSupported(i16)) {
                    zzj("sampleRate.support, " + i16);
                    return false;
                }
            }
            int i17 = zzaf.zzz;
            if (i17 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzj("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i15 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i10 = 6;
                            } else {
                                i10 = "audio/eac3".equals(str2) ? 16 : 30;
                            }
                            zzee.zze("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i10 + "]");
                            maxInputChannelCount = i10;
                        }
                        if (maxInputChannelCount < i17) {
                            zzj("channelCount.support, " + i17);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzaf zzaf) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb2 = zzrp.zzb(zzaf);
        return zzb2 != null && ((Integer) zzb2.first).intValue() == 42;
    }

    public final boolean zzg(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzew.zza >= 29) {
            int zza2 = zzqw.zza(videoCapabilities, i10, i11, d10);
            if (zza2 == 2) {
                return true;
            }
            if (zza2 == 1) {
                zzj("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!zzk(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || (("OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) && "mcv5a".equals(zzew.zzb)) || !zzk(videoCapabilities, i11, i10, d10))) {
                zzj("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            zzee.zza("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10) + "] [" + this.zza + ", " + this.zzb + "] [" + zzew.zze + "]");
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.profileLevels;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaCodecInfo.CodecProfileLevel[] zzh() {
        /*
            r1 = this;
            android.media.MediaCodecInfo$CodecCapabilities r0 = r1.zzd
            if (r0 == 0) goto L_0x0008
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = r0.profileLevels
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            r0 = 0
            android.media.MediaCodecInfo$CodecProfileLevel[] r0 = new android.media.MediaCodecInfo.CodecProfileLevel[r0]
        L_0x000b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqx.zzh():android.media.MediaCodecInfo$CodecProfileLevel[]");
    }
}
