package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.unity3d.services.core.device.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzrp {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzrj {
        int i10;
        int i11 = zzd;
        if (i11 == -1) {
            zzqx zzc2 = zzc(MimeTypes.VIDEO_H264, false, false);
            if (zzc2 != null) {
                int i12 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i13 = codecProfileLevel.level;
                    if (i13 != 1 && i13 != 2) {
                        switch (i13) {
                            case 8:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    i12 = Math.max(i10, i12);
                }
                i11 = Math.max(i12, zzew.zza >= 21 ? 345600 : 172800);
            } else {
                i11 = 0;
            }
            zzd = i11;
        }
        return i11;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02c5 A[Catch:{ NumberFormatException -> 0x02d5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzaf r17) {
        /*
            r0 = r17
            java.lang.String r1 = r0.zzj
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            java.lang.String r3 = "\\."
            java.lang.String[] r1 = r1.split(r3)
            java.lang.String r3 = r0.zzm
            java.lang.String r4 = "video/dolby-vision"
            boolean r3 = r4.equals(r3)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r11 = 64
            r12 = 32
            r14 = 4096(0x1000, float:5.74E-42)
            r15 = 8
            r5 = 16
            r2 = 3
            r10 = 4
            r13 = 2
            java.lang.String r4 = "MediaCodecUtil"
            r6 = 1
            if (r3 == 0) goto L_0x01f9
            java.lang.String r0 = r0.zzj
            int r3 = r1.length
            if (r3 >= r2) goto L_0x0043
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x0040:
            r2 = 0
            goto L_0x01f8
        L_0x0043:
            java.util.regex.Pattern r3 = zzb
            r2 = r1[r6]
            java.util.regex.Matcher r2 = r3.matcher(r2)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L_0x005f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed Dolby Vision codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0040
        L_0x005f:
            java.lang.String r0 = r2.group(r6)
            if (r0 != 0) goto L_0x0068
        L_0x0065:
            r2 = 0
            goto L_0x010d
        L_0x0068:
            int r2 = r0.hashCode()
            switch(r2) {
                case 1536: goto L_0x00cd;
                case 1537: goto L_0x00c3;
                case 1538: goto L_0x00b9;
                case 1539: goto L_0x00af;
                case 1540: goto L_0x00a5;
                case 1541: goto L_0x009b;
                case 1542: goto L_0x0091;
                case 1543: goto L_0x0087;
                case 1544: goto L_0x007c;
                case 1545: goto L_0x0071;
                default: goto L_0x006f;
            }
        L_0x006f:
            goto L_0x00d7
        L_0x0071:
            java.lang.String r2 = "09"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 9
            goto L_0x00d8
        L_0x007c:
            java.lang.String r2 = "08"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 8
            goto L_0x00d8
        L_0x0087:
            java.lang.String r2 = "07"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 7
            goto L_0x00d8
        L_0x0091:
            java.lang.String r2 = "06"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 6
            goto L_0x00d8
        L_0x009b:
            java.lang.String r2 = "05"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 5
            goto L_0x00d8
        L_0x00a5:
            java.lang.String r2 = "04"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 4
            goto L_0x00d8
        L_0x00af:
            java.lang.String r2 = "03"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 3
            goto L_0x00d8
        L_0x00b9:
            java.lang.String r2 = "02"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 2
            goto L_0x00d8
        L_0x00c3:
            java.lang.String r2 = "01"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 1
            goto L_0x00d8
        L_0x00cd:
            java.lang.String r2 = "00"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x00d7
            r2 = 0
            goto L_0x00d8
        L_0x00d7:
            r2 = -1
        L_0x00d8:
            switch(r2) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0104;
                case 2: goto L_0x00ff;
                case 3: goto L_0x00fa;
                case 4: goto L_0x00f5;
                case 5: goto L_0x00f0;
                case 6: goto L_0x00eb;
                case 7: goto L_0x00e6;
                case 8: goto L_0x00e1;
                case 9: goto L_0x00dc;
                default: goto L_0x00db;
            }
        L_0x00db:
            goto L_0x0065
        L_0x00dc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x010d
        L_0x00e1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x010d
        L_0x00e6:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x010d
        L_0x00eb:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            goto L_0x010d
        L_0x00f0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x010d
        L_0x00f5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x010d
        L_0x00fa:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x010d
        L_0x00ff:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x010d
        L_0x0104:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x010d
        L_0x0109:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x010d:
            if (r2 != 0) goto L_0x011e
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0040
        L_0x011e:
            r0 = r1[r13]
            if (r0 != 0) goto L_0x0125
        L_0x0122:
            r1 = 0
            goto L_0x01e1
        L_0x0125:
            int r1 = r0.hashCode()
            switch(r1) {
                case 1537: goto L_0x01d5;
                case 1538: goto L_0x01c8;
                case 1539: goto L_0x01bb;
                case 1540: goto L_0x01ae;
                case 1541: goto L_0x01a1;
                case 1542: goto L_0x0194;
                case 1543: goto L_0x0187;
                case 1544: goto L_0x017a;
                case 1545: goto L_0x016c;
                default: goto L_0x012c;
            }
        L_0x012c:
            switch(r1) {
                case 1567: goto L_0x015e;
                case 1568: goto L_0x014e;
                case 1569: goto L_0x013e;
                case 1570: goto L_0x0130;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x0122
        L_0x0130:
            java.lang.String r1 = "13"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            goto L_0x01e1
        L_0x013e:
            java.lang.String r1 = "12"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            r1 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01e1
        L_0x014e:
            java.lang.String r1 = "11"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            r1 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L_0x01e1
        L_0x015e:
            java.lang.String r1 = "10"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            goto L_0x01e1
        L_0x016c:
            java.lang.String r1 = "09"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            goto L_0x01e1
        L_0x017a:
            java.lang.String r1 = "08"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            goto L_0x01e1
        L_0x0187:
            java.lang.String r1 = "07"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            goto L_0x01e1
        L_0x0194:
            java.lang.String r1 = "06"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            goto L_0x01e1
        L_0x01a1:
            java.lang.String r1 = "05"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            goto L_0x01e1
        L_0x01ae:
            java.lang.String r1 = "04"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            goto L_0x01e1
        L_0x01bb:
            java.lang.String r1 = "03"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            goto L_0x01e1
        L_0x01c8:
            java.lang.String r1 = "02"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)
            goto L_0x01e1
        L_0x01d5:
            java.lang.String r1 = "01"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x0122
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
        L_0x01e1:
            if (r1 != 0) goto L_0x01f2
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown Dolby Vision level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0040
        L_0x01f2:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            r2 = r0
        L_0x01f8:
            return r2
        L_0x01f9:
            r2 = 0
            r3 = r1[r2]
            int r2 = r3.hashCode()
            switch(r2) {
                case 3004662: goto L_0x0240;
                case 3006243: goto L_0x0236;
                case 3006244: goto L_0x022c;
                case 3199032: goto L_0x0222;
                case 3214780: goto L_0x0218;
                case 3356560: goto L_0x020e;
                case 3624515: goto L_0x0204;
                default: goto L_0x0203;
            }
        L_0x0203:
            goto L_0x024a
        L_0x0204:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 2
            goto L_0x024b
        L_0x020e:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 6
            goto L_0x024b
        L_0x0218:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 4
            goto L_0x024b
        L_0x0222:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 3
            goto L_0x024b
        L_0x022c:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 1
            goto L_0x024b
        L_0x0236:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 0
            goto L_0x024b
        L_0x0240:
            java.lang.String r2 = "av01"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x024a
            r2 = 5
            goto L_0x024b
        L_0x024a:
            r2 = -1
        L_0x024b:
            r3 = 8192(0x2000, float:1.14794E-41)
            r11 = 20
            switch(r2) {
                case 0: goto L_0x071c;
                case 1: goto L_0x071c;
                case 2: goto L_0x063a;
                case 3: goto L_0x03da;
                case 4: goto L_0x03da;
                case 5: goto L_0x02e4;
                case 6: goto L_0x0254;
                default: goto L_0x0252;
            }
        L_0x0252:
            r0 = 0
            return r0
        L_0x0254:
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            r3 = 3
            if (r2 == r3) goto L_0x026a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x0267:
            r2 = 0
            goto L_0x02e3
        L_0x026a:
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x02d5 }
            int r2 = java.lang.Integer.parseInt(r2, r5)     // Catch:{ NumberFormatException -> 0x02d5 }
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbt.zzd(r2)     // Catch:{ NumberFormatException -> 0x02d5 }
            java.lang.String r3 = "audio/mp4a-latm"
            boolean r2 = r3.equals(r2)     // Catch:{ NumberFormatException -> 0x02d5 }
            if (r2 == 0) goto L_0x0267
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x02d5 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x02d5 }
            r2 = 17
            if (r1 == r2) goto L_0x02c0
            if (r1 == r11) goto L_0x02bc
            r2 = 23
            if (r1 == r2) goto L_0x02b9
            r2 = 29
            if (r1 == r2) goto L_0x02b6
            r2 = 39
            if (r1 == r2) goto L_0x02b3
            r2 = 42
            if (r1 == r2) goto L_0x02b0
            switch(r1) {
                case 1: goto L_0x02ad;
                case 2: goto L_0x02aa;
                case 3: goto L_0x02a7;
                case 4: goto L_0x02a4;
                case 5: goto L_0x02a1;
                case 6: goto L_0x029e;
                default: goto L_0x029b;
            }     // Catch:{ NumberFormatException -> 0x02d5 }
        L_0x029b:
            r1 = -1
            r5 = -1
            goto L_0x02c3
        L_0x029e:
            r1 = -1
            r5 = 6
            goto L_0x02c3
        L_0x02a1:
            r1 = -1
            r5 = 5
            goto L_0x02c3
        L_0x02a4:
            r1 = -1
            r5 = 4
            goto L_0x02c3
        L_0x02a7:
            r1 = -1
            r5 = 3
            goto L_0x02c3
        L_0x02aa:
            r1 = -1
            r5 = 2
            goto L_0x02c3
        L_0x02ad:
            r1 = -1
            r5 = 1
            goto L_0x02c3
        L_0x02b0:
            r5 = 42
            goto L_0x02c2
        L_0x02b3:
            r5 = 39
            goto L_0x02c2
        L_0x02b6:
            r5 = 29
            goto L_0x02c2
        L_0x02b9:
            r5 = 23
            goto L_0x02c2
        L_0x02bc:
            r1 = -1
            r5 = 20
            goto L_0x02c3
        L_0x02c0:
            r5 = 17
        L_0x02c2:
            r1 = -1
        L_0x02c3:
            if (r5 == r1) goto L_0x0267
            android.util.Pair r1 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x02d5 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02d5 }
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x02d5 }
            r1.<init>(r2, r3)     // Catch:{ NumberFormatException -> 0x02d5 }
            r2 = r1
            goto L_0x02e3
        L_0x02d5:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed MP4A codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0267
        L_0x02e3:
            return r2
        L_0x02e4:
            java.lang.String r2 = r0.zzj
            com.google.android.gms.internal.ads.zzq r0 = r0.zzy
            int r11 = r1.length
            if (r11 >= r10) goto L_0x02fb
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x02f8:
            r2 = 0
            goto L_0x03d9
        L_0x02fb:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x03ca }
            int r11 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x03ca }
            r5 = r1[r13]     // Catch:{ NumberFormatException -> 0x03ca }
            r8 = 0
            java.lang.String r5 = r5.substring(r8, r13)     // Catch:{ NumberFormatException -> 0x03ca }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x03ca }
            r8 = 3
            r1 = r1[r8]     // Catch:{ NumberFormatException -> 0x03ca }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x03ca }
            if (r11 == 0) goto L_0x032a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 profile: "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x02f8
        L_0x032a:
            if (r1 == r15) goto L_0x0358
            r2 = 10
            if (r1 == r2) goto L_0x0345
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Unknown AV1 bit depth: "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x02f8
        L_0x0345:
            if (r0 == 0) goto L_0x0356
            byte[] r1 = r0.zzf
            if (r1 != 0) goto L_0x0353
            int r0 = r0.zze
            r1 = 7
            if (r0 == r1) goto L_0x0353
            r1 = 6
            if (r0 != r1) goto L_0x0356
        L_0x0353:
            r0 = 4096(0x1000, float:5.74E-42)
            goto L_0x0359
        L_0x0356:
            r0 = 2
            goto L_0x0359
        L_0x0358:
            r0 = 1
        L_0x0359:
            switch(r5) {
                case 0: goto L_0x03a2;
                case 1: goto L_0x03a0;
                case 2: goto L_0x039e;
                case 3: goto L_0x039b;
                case 4: goto L_0x0398;
                case 5: goto L_0x0395;
                case 6: goto L_0x0392;
                case 7: goto L_0x038f;
                case 8: goto L_0x038c;
                case 9: goto L_0x0389;
                case 10: goto L_0x0386;
                case 11: goto L_0x0383;
                case 12: goto L_0x0380;
                case 13: goto L_0x037d;
                case 14: goto L_0x037a;
                case 15: goto L_0x0376;
                case 16: goto L_0x0373;
                case 17: goto L_0x0370;
                case 18: goto L_0x036d;
                case 19: goto L_0x036a;
                case 20: goto L_0x0367;
                case 21: goto L_0x0364;
                case 22: goto L_0x0361;
                case 23: goto L_0x035e;
                default: goto L_0x035c;
            }
        L_0x035c:
            r1 = -1
            goto L_0x03a3
        L_0x035e:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x03a3
        L_0x0361:
            r1 = 4194304(0x400000, float:5.877472E-39)
            goto L_0x03a3
        L_0x0364:
            r1 = 2097152(0x200000, float:2.938736E-39)
            goto L_0x03a3
        L_0x0367:
            r1 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x03a3
        L_0x036a:
            r1 = 524288(0x80000, float:7.34684E-40)
            goto L_0x03a3
        L_0x036d:
            r1 = 262144(0x40000, float:3.67342E-40)
            goto L_0x03a3
        L_0x0370:
            r1 = 131072(0x20000, float:1.83671E-40)
            goto L_0x03a3
        L_0x0373:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x03a3
        L_0x0376:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x03a3
        L_0x037a:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x03a3
        L_0x037d:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x03a3
        L_0x0380:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x03a3
        L_0x0383:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x03a3
        L_0x0386:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x03a3
        L_0x0389:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x03a3
        L_0x038c:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x03a3
        L_0x038f:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x03a3
        L_0x0392:
            r1 = 64
            goto L_0x03a3
        L_0x0395:
            r1 = 32
            goto L_0x03a3
        L_0x0398:
            r1 = 16
            goto L_0x03a3
        L_0x039b:
            r1 = 8
            goto L_0x03a3
        L_0x039e:
            r1 = 4
            goto L_0x03a3
        L_0x03a0:
            r1 = 2
            goto L_0x03a3
        L_0x03a2:
            r1 = 1
        L_0x03a3:
            r2 = -1
            if (r1 != r2) goto L_0x03bc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AV1 level: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x02f8
        L_0x03bc:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x03d9
        L_0x03ca:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.String r1 = "Ignoring malformed AV1 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x02f8
        L_0x03d9:
            return r2
        L_0x03da:
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            if (r2 >= r10) goto L_0x03ef
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x03ec:
            r2 = 0
            goto L_0x0639
        L_0x03ef:
            java.util.regex.Pattern r2 = zzb
            r5 = r1[r6]
            java.util.regex.Matcher r2 = r2.matcher(r5)
            boolean r5 = r2.matches()
            if (r5 != 0) goto L_0x040b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed HEVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x03ec
        L_0x040b:
            java.lang.String r0 = r2.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x041a
            r0 = 1
        L_0x0418:
            r2 = 3
            goto L_0x0424
        L_0x041a:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L_0x062a
            r0 = 2
            goto L_0x0418
        L_0x0424:
            r1 = r1[r2]
            if (r1 != 0) goto L_0x042b
        L_0x0428:
            r2 = 0
            goto L_0x060e
        L_0x042b:
            int r2 = r1.hashCode()
            switch(r2) {
                case 70821: goto L_0x054f;
                case 70914: goto L_0x0544;
                case 70917: goto L_0x0539;
                case 71007: goto L_0x052e;
                case 71010: goto L_0x0523;
                case 74665: goto L_0x0519;
                case 74758: goto L_0x050f;
                case 74761: goto L_0x0505;
                case 74851: goto L_0x04fb;
                case 74854: goto L_0x04f1;
                case 2193639: goto L_0x04e5;
                case 2193642: goto L_0x04d9;
                case 2193732: goto L_0x04cd;
                case 2193735: goto L_0x04c1;
                case 2193738: goto L_0x04b5;
                case 2193825: goto L_0x04a9;
                case 2193828: goto L_0x049d;
                case 2193831: goto L_0x0491;
                case 2312803: goto L_0x0486;
                case 2312806: goto L_0x047b;
                case 2312896: goto L_0x0470;
                case 2312899: goto L_0x0464;
                case 2312902: goto L_0x0458;
                case 2312989: goto L_0x044c;
                case 2312992: goto L_0x0440;
                case 2312995: goto L_0x0434;
                default: goto L_0x0432;
            }
        L_0x0432:
            goto L_0x055a
        L_0x0434:
            java.lang.String r2 = "L186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 12
            goto L_0x055b
        L_0x0440:
            java.lang.String r2 = "L183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 11
            goto L_0x055b
        L_0x044c:
            java.lang.String r2 = "L180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 10
            goto L_0x055b
        L_0x0458:
            java.lang.String r2 = "L156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 9
            goto L_0x055b
        L_0x0464:
            java.lang.String r2 = "L153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 8
            goto L_0x055b
        L_0x0470:
            java.lang.String r2 = "L150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 7
            goto L_0x055b
        L_0x047b:
            java.lang.String r2 = "L123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 6
            goto L_0x055b
        L_0x0486:
            java.lang.String r2 = "L120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 5
            goto L_0x055b
        L_0x0491:
            java.lang.String r2 = "H186"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 25
            goto L_0x055b
        L_0x049d:
            java.lang.String r2 = "H183"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 24
            goto L_0x055b
        L_0x04a9:
            java.lang.String r2 = "H180"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 23
            goto L_0x055b
        L_0x04b5:
            java.lang.String r2 = "H156"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 22
            goto L_0x055b
        L_0x04c1:
            java.lang.String r2 = "H153"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 21
            goto L_0x055b
        L_0x04cd:
            java.lang.String r2 = "H150"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 20
            goto L_0x055b
        L_0x04d9:
            java.lang.String r2 = "H123"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 19
            goto L_0x055b
        L_0x04e5:
            java.lang.String r2 = "H120"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 18
            goto L_0x055b
        L_0x04f1:
            java.lang.String r2 = "L93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 4
            goto L_0x055b
        L_0x04fb:
            java.lang.String r2 = "L90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 3
            goto L_0x055b
        L_0x0505:
            java.lang.String r2 = "L63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 2
            goto L_0x055b
        L_0x050f:
            java.lang.String r2 = "L60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 1
            goto L_0x055b
        L_0x0519:
            java.lang.String r2 = "L30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 0
            goto L_0x055b
        L_0x0523:
            java.lang.String r2 = "H93"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 17
            goto L_0x055b
        L_0x052e:
            java.lang.String r2 = "H90"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 16
            goto L_0x055b
        L_0x0539:
            java.lang.String r2 = "H63"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 15
            goto L_0x055b
        L_0x0544:
            java.lang.String r2 = "H60"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 14
            goto L_0x055b
        L_0x054f:
            java.lang.String r2 = "H30"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x055a
            r5 = 13
            goto L_0x055b
        L_0x055a:
            r5 = -1
        L_0x055b:
            switch(r5) {
                case 0: goto L_0x060a;
                case 1: goto L_0x0605;
                case 2: goto L_0x05fe;
                case 3: goto L_0x05f7;
                case 4: goto L_0x05f0;
                case 5: goto L_0x05e9;
                case 6: goto L_0x05e4;
                case 7: goto L_0x05dd;
                case 8: goto L_0x05d6;
                case 9: goto L_0x05cf;
                case 10: goto L_0x05c8;
                case 11: goto L_0x05c1;
                case 12: goto L_0x05ba;
                case 13: goto L_0x05b5;
                case 14: goto L_0x05b0;
                case 15: goto L_0x05ab;
                case 16: goto L_0x05a5;
                case 17: goto L_0x059f;
                case 18: goto L_0x0597;
                case 19: goto L_0x0591;
                case 20: goto L_0x0588;
                case 21: goto L_0x0580;
                case 22: goto L_0x0578;
                case 23: goto L_0x0570;
                case 24: goto L_0x0568;
                case 25: goto L_0x0560;
                default: goto L_0x055e;
            }
        L_0x055e:
            goto L_0x0428
        L_0x0560:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0568:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0570:
            r2 = 2097152(0x200000, float:2.938736E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0578:
            r2 = 524288(0x80000, float:7.34684E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0580:
            r2 = 131072(0x20000, float:1.83671E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0588:
            r2 = 32768(0x8000, float:4.5918E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0591:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L_0x060e
        L_0x0597:
            r2 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x059f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x060e
        L_0x05a5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L_0x060e
        L_0x05ab:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            goto L_0x060e
        L_0x05b0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            goto L_0x060e
        L_0x05b5:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            goto L_0x060e
        L_0x05ba:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05c1:
            r2 = 4194304(0x400000, float:5.877472E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05c8:
            r2 = 1048576(0x100000, float:1.469368E-39)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05cf:
            r2 = 262144(0x40000, float:3.67342E-40)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05d6:
            r2 = 65536(0x10000, float:9.18355E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05dd:
            r2 = 16384(0x4000, float:2.2959E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x05e4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            goto L_0x060e
        L_0x05e9:
            r5 = 1024(0x400, float:1.435E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x060e
        L_0x05f0:
            r8 = 256(0x100, float:3.59E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            goto L_0x060e
        L_0x05f7:
            r16 = 64
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            goto L_0x060e
        L_0x05fe:
            r2 = 16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x060e
        L_0x0605:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            goto L_0x060e
        L_0x060a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
        L_0x060e:
            if (r2 != 0) goto L_0x061f
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "Unknown HEVC level string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x03ec
        L_0x061f:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.<init>(r0, r2)
            r2 = r1
            goto L_0x0639
        L_0x062a:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x03ec
        L_0x0639:
            return r2
        L_0x063a:
            r2 = 2048(0x800, float:2.87E-42)
            r16 = 64
            java.lang.String r0 = r0.zzj
            int r5 = r1.length
            r2 = 3
            if (r5 >= r2) goto L_0x0654
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x0651:
            r2 = 0
            goto L_0x071b
        L_0x0654:
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x070c }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x070c }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x070c }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x070c }
            if (r2 == 0) goto L_0x0672
            if (r2 == r6) goto L_0x0670
            if (r2 == r13) goto L_0x066e
            r1 = 3
            if (r2 == r1) goto L_0x066b
            r1 = -1
            goto L_0x0673
        L_0x066b:
            r1 = 8
            goto L_0x0673
        L_0x066e:
            r1 = 4
            goto L_0x0673
        L_0x0670:
            r1 = 2
            goto L_0x0673
        L_0x0672:
            r1 = 1
        L_0x0673:
            r5 = -1
            if (r1 != r5) goto L_0x068b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown VP9 profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0651
        L_0x068b:
            r2 = 10
            if (r0 == r2) goto L_0x06e5
            r2 = 11
            if (r0 == r2) goto L_0x06e2
            if (r0 == r11) goto L_0x06df
            r2 = 21
            if (r0 == r2) goto L_0x06db
            r2 = 30
            if (r0 == r2) goto L_0x06d7
            r2 = 31
            if (r0 == r2) goto L_0x06d3
            r2 = 40
            if (r0 == r2) goto L_0x06cf
            r2 = 41
            if (r0 == r2) goto L_0x06cb
            r2 = 50
            if (r0 == r2) goto L_0x06c7
            r2 = 51
            if (r0 == r2) goto L_0x06c3
            switch(r0) {
                case 60: goto L_0x06bf;
                case 61: goto L_0x06bb;
                case 62: goto L_0x06b7;
                default: goto L_0x06b4;
            }
        L_0x06b4:
            r2 = -1
            r6 = -1
            goto L_0x06e6
        L_0x06b7:
            r2 = -1
            r6 = 8192(0x2000, float:1.14794E-41)
            goto L_0x06e6
        L_0x06bb:
            r2 = -1
            r6 = 4096(0x1000, float:5.74E-42)
            goto L_0x06e6
        L_0x06bf:
            r2 = -1
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x06e6
        L_0x06c3:
            r2 = -1
            r6 = 512(0x200, float:7.175E-43)
            goto L_0x06e6
        L_0x06c7:
            r2 = -1
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x06e6
        L_0x06cb:
            r2 = -1
            r6 = 128(0x80, float:1.794E-43)
            goto L_0x06e6
        L_0x06cf:
            r2 = -1
            r6 = 64
            goto L_0x06e6
        L_0x06d3:
            r2 = -1
            r6 = 32
            goto L_0x06e6
        L_0x06d7:
            r2 = -1
            r6 = 16
            goto L_0x06e6
        L_0x06db:
            r2 = -1
            r6 = 8
            goto L_0x06e6
        L_0x06df:
            r2 = -1
            r6 = 4
            goto L_0x06e6
        L_0x06e2:
            r2 = -1
            r6 = 2
            goto L_0x06e6
        L_0x06e5:
            r2 = -1
        L_0x06e6:
            if (r6 != r2) goto L_0x06fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown VP9 level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0651
        L_0x06fe:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r2.<init>(r0, r1)
            goto L_0x071b
        L_0x070c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed VP9 codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0651
        L_0x071b:
            return r2
        L_0x071c:
            r5 = 1024(0x400, float:1.435E-42)
            r16 = 64
            java.lang.String r0 = r0.zzj
            int r2 = r1.length
            if (r2 >= r13) goto L_0x0735
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
        L_0x0732:
            r2 = 0
            goto L_0x0840
        L_0x0735:
            r11 = r1[r6]     // Catch:{ NumberFormatException -> 0x0831 }
            int r11 = r11.length()     // Catch:{ NumberFormatException -> 0x0831 }
            r3 = 6
            if (r11 != r3) goto L_0x0756
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x0831 }
            r3 = 0
            java.lang.String r2 = r2.substring(r3, r13)     // Catch:{ NumberFormatException -> 0x0831 }
            r3 = 16
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch:{ NumberFormatException -> 0x0831 }
            r1 = r1[r6]     // Catch:{ NumberFormatException -> 0x0831 }
            java.lang.String r1 = r1.substring(r10)     // Catch:{ NumberFormatException -> 0x0831 }
            int r0 = java.lang.Integer.parseInt(r1, r3)     // Catch:{ NumberFormatException -> 0x0831 }
            goto L_0x0767
        L_0x0756:
            r3 = 16
            r11 = 3
            if (r2 < r11) goto L_0x081b
            r2 = r1[r6]     // Catch:{ NumberFormatException -> 0x0831 }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0831 }
            r1 = r1[r13]     // Catch:{ NumberFormatException -> 0x0831 }
            int r0 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0831 }
        L_0x0767:
            r1 = 66
            if (r2 == r1) goto L_0x079b
            r1 = 77
            if (r2 == r1) goto L_0x0799
            r1 = 88
            if (r2 == r1) goto L_0x0796
            r1 = 100
            if (r2 == r1) goto L_0x0792
            r1 = 110(0x6e, float:1.54E-43)
            if (r2 == r1) goto L_0x078e
            r1 = 122(0x7a, float:1.71E-43)
            if (r2 == r1) goto L_0x078a
            r1 = 244(0xf4, float:3.42E-43)
            if (r2 == r1) goto L_0x0786
            r1 = -1
            r13 = -1
            goto L_0x079d
        L_0x0786:
            r1 = -1
            r13 = 64
            goto L_0x079d
        L_0x078a:
            r1 = -1
            r13 = 32
            goto L_0x079d
        L_0x078e:
            r1 = -1
            r13 = 16
            goto L_0x079d
        L_0x0792:
            r1 = -1
            r13 = 8
            goto L_0x079d
        L_0x0796:
            r1 = -1
            r13 = 4
            goto L_0x079d
        L_0x0799:
            r1 = -1
            goto L_0x079d
        L_0x079b:
            r1 = -1
            r13 = 1
        L_0x079d:
            if (r13 != r1) goto L_0x07b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown AVC profile: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0732
        L_0x07b5:
            switch(r0) {
                case 10: goto L_0x07f3;
                case 11: goto L_0x07f1;
                case 12: goto L_0x07ee;
                case 13: goto L_0x07eb;
                default: goto L_0x07b8;
            }
        L_0x07b8:
            switch(r0) {
                case 20: goto L_0x07e8;
                case 21: goto L_0x07e5;
                case 22: goto L_0x07e2;
                default: goto L_0x07bb;
            }
        L_0x07bb:
            switch(r0) {
                case 30: goto L_0x07df;
                case 31: goto L_0x07dc;
                case 32: goto L_0x07d9;
                default: goto L_0x07be;
            }
        L_0x07be:
            switch(r0) {
                case 40: goto L_0x07d6;
                case 41: goto L_0x07d3;
                case 42: goto L_0x07d0;
                default: goto L_0x07c1;
            }
        L_0x07c1:
            switch(r0) {
                case 50: goto L_0x07cd;
                case 51: goto L_0x07c9;
                case 52: goto L_0x07c6;
                default: goto L_0x07c4;
            }
        L_0x07c4:
            r1 = -1
            goto L_0x07f4
        L_0x07c6:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x07f4
        L_0x07c9:
            r1 = 32768(0x8000, float:4.5918E-41)
            goto L_0x07f4
        L_0x07cd:
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x07f4
        L_0x07d0:
            r1 = 8192(0x2000, float:1.14794E-41)
            goto L_0x07f4
        L_0x07d3:
            r1 = 4096(0x1000, float:5.74E-42)
            goto L_0x07f4
        L_0x07d6:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x07f4
        L_0x07d9:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x07f4
        L_0x07dc:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x07f4
        L_0x07df:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x07f4
        L_0x07e2:
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x07f4
        L_0x07e5:
            r1 = 64
            goto L_0x07f4
        L_0x07e8:
            r1 = 32
            goto L_0x07f4
        L_0x07eb:
            r1 = 16
            goto L_0x07f4
        L_0x07ee:
            r1 = 8
            goto L_0x07f4
        L_0x07f1:
            r1 = 4
            goto L_0x07f4
        L_0x07f3:
            r1 = 1
        L_0x07f4:
            r2 = -1
            if (r1 != r2) goto L_0x080d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown AVC level: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0732
        L_0x080d:
            android.util.Pair r2 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.<init>(r0, r1)
            goto L_0x0840
        L_0x081b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0831 }
            r1.<init>()     // Catch:{ NumberFormatException -> 0x0831 }
            java.lang.String r2 = "Ignoring malformed AVC codec string: "
            r1.append(r2)     // Catch:{ NumberFormatException -> 0x0831 }
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x0831 }
            java.lang.String r1 = r1.toString()     // Catch:{ NumberFormatException -> 0x0831 }
            com.google.android.gms.internal.ads.zzee.zze(r4, r1)     // Catch:{ NumberFormatException -> 0x0831 }
            goto L_0x0732
        L_0x0831:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "Ignoring malformed AVC codec string: "
            java.lang.String r0 = r1.concat(r0)
            com.google.android.gms.internal.ads.zzee.zze(r4, r0)
            goto L_0x0732
        L_0x0840:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzb(com.google.android.gms.internal.ads.zzaf):android.util.Pair");
    }

    public static zzqx zzc(String str, boolean z10, boolean z11) throws zzrj {
        List zzf = zzf(str, false, false);
        if (zzf.isEmpty()) {
            return null;
        }
        return (zzqx) zzf.get(0);
    }

    public static zzqx zzd() throws zzrj {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzaf zzaf) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzaf.zzm)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(zzaf.zzm) || (zzb2 = zzb(zzaf)) == null) {
            return null;
        }
        int intValue = ((Integer) zzb2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return MimeTypes.VIDEO_H265;
        }
        if (intValue == 512) {
            return MimeTypes.VIDEO_H264;
        }
        return null;
    }

    public static synchronized List zzf(String str, boolean z10, boolean z11) throws zzrj {
        zzrk zzrk;
        String str2 = str;
        boolean z12 = z10;
        boolean z13 = z11;
        synchronized (zzrp.class) {
            zzrh zzrh = new zzrh(str2, z12, z13);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzrh);
            if (list != null) {
                return list;
            }
            int i10 = zzew.zza;
            if (i10 >= 21) {
                zzrk = new zzrn(z12, z13);
            } else {
                zzrk = new zzrm((zzrl) null);
            }
            ArrayList zzh = zzh(zzrh, zzrk);
            if (z12 && zzh.isEmpty() && i10 >= 21 && i10 <= 23) {
                zzh = zzh(zzrh, new zzrm((zzrl) null));
                if (!zzh.isEmpty()) {
                    String str3 = ((zzqx) zzh.get(0)).zza;
                    zzee.zze("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str2 + ". Assuming: " + str3);
                }
            }
            if ("audio/raw".equals(str2)) {
                if (i10 < 26 && zzew.zzb.equals("R9") && zzh.size() == 1 && ((zzqx) zzh.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzh.add(zzqx.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", (MediaCodecInfo.CodecCapabilities) null, false, true, false, false, false));
                }
                zzi(zzh, zzrf.zza);
            }
            if (i10 < 21 && zzh.size() > 1) {
                String str4 = ((zzqx) zzh.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str4) || "OMX.SEC.MP3.Decoder".equals(str4) || "OMX.brcm.audio.mp3.decoder".equals(str4)) {
                    zzi(zzh, zzrg.zza);
                }
            }
            if (i10 < 32 && zzh.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzqx) zzh.get(0)).zza)) {
                zzh.add((zzqx) zzh.remove(0));
            }
            zzfqk zzm = zzfqk.zzm(zzh);
            hashMap.put(zzrh, zzm);
            return zzm;
        }
    }

    public static List zzg(List list, zzaf zzaf) {
        ArrayList arrayList = new ArrayList(list);
        zzi(arrayList, new zzrd(zzaf));
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r20v2 */
    /* JADX WARNING: type inference failed for: r20v3 */
    /* JADX WARNING: type inference failed for: r20v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0233, code lost:
        if (r1.zzb == false) goto L_0x0235;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
        if (r12.endsWith(".secure") == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        if ("SCV31".equals(r10) == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0118, code lost:
        if (r8.startsWith("t0") == false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x02b0 A[SYNTHETIC, Splitter:B:183:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x02d0 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList zzh(com.google.android.gms.internal.ads.zzrh r27, com.google.android.gms.internal.ads.zzrk r28) throws com.google.android.gms.internal.ads.zzrj {
        /*
            r1 = r27
            r2 = r28
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x02ff }
            r6.<init>()     // Catch:{ Exception -> 0x02ff }
            java.lang.String r15 = r1.zza     // Catch:{ Exception -> 0x02ff }
            int r14 = r28.zza()     // Catch:{ Exception -> 0x02ff }
            boolean r16 = r28.zze()     // Catch:{ Exception -> 0x02ff }
            r17 = 0
            r13 = 0
        L_0x001a:
            if (r13 >= r14) goto L_0x02fe
            android.media.MediaCodecInfo r0 = r2.zzb(r13)     // Catch:{ Exception -> 0x02ff }
            int r7 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ Exception -> 0x02ff }
            r8 = 29
            if (r7 < r8) goto L_0x0034
            boolean r9 = r0.isAlias()     // Catch:{ Exception -> 0x02ff }
            if (r9 == 0) goto L_0x0034
        L_0x002c:
            r24 = r13
            r25 = r14
            r26 = r15
            goto L_0x02f4
        L_0x0034:
            java.lang.String r12 = r0.getName()     // Catch:{ Exception -> 0x02ff }
            boolean r9 = r0.isEncoder()     // Catch:{ Exception -> 0x02ff }
            if (r9 != 0) goto L_0x002c
            java.lang.String r9 = ".secure"
            if (r16 != 0) goto L_0x0048
            boolean r10 = r12.endsWith(r9)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
        L_0x0048:
            r10 = 21
            if (r7 >= r10) goto L_0x007c
            java.lang.String r10 = "CIPAACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPMP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPVorbisDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "CIPAMRNBDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "AACDecoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
            java.lang.String r10 = "MP3Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x002c
        L_0x007c:
            r10 = 24
            java.lang.String r11 = "samsung"
            if (r7 >= r10) goto L_0x00dc
            java.lang.String r10 = "OMX.SEC.aac.dec"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 != 0) goto L_0x0092
            java.lang.String r10 = "OMX.Exynos.AAC.Decoder"
            boolean r10 = r10.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r10 == 0) goto L_0x00dc
        L_0x0092:
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzc     // Catch:{ Exception -> 0x02ff }
            boolean r10 = r11.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r10 == 0) goto L_0x00dc
            java.lang.String r10 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ Exception -> 0x02ff }
            java.lang.String r5 = "zeroflte"
            boolean r5 = r10.startsWith(r5)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "zerolte"
            boolean r5 = r10.startsWith(r5)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "zenlte"
            boolean r5 = r10.startsWith(r5)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SC-05G"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "marinelteatt"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "404SC"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SC-04G"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
            java.lang.String r5 = "SCV31"
            boolean r5 = r5.equals(r10)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
        L_0x00dc:
            java.lang.String r5 = "jflte"
            r10 = 19
            if (r7 > r10) goto L_0x011a
            java.lang.String r8 = "OMX.SEC.vp8.dec"
            boolean r8 = r8.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r8 == 0) goto L_0x011a
            java.lang.String r8 = com.google.android.gms.internal.ads.zzew.zzc     // Catch:{ Exception -> 0x02ff }
            boolean r8 = r11.equals(r8)     // Catch:{ Exception -> 0x02ff }
            if (r8 == 0) goto L_0x011a
            java.lang.String r8 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ Exception -> 0x02ff }
            java.lang.String r11 = "d2"
            boolean r11 = r8.startsWith(r11)     // Catch:{ Exception -> 0x02ff }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "serrano"
            boolean r11 = r8.startsWith(r11)     // Catch:{ Exception -> 0x02ff }
            if (r11 != 0) goto L_0x002c
            boolean r11 = r8.startsWith(r5)     // Catch:{ Exception -> 0x02ff }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "santos"
            boolean r11 = r8.startsWith(r11)     // Catch:{ Exception -> 0x02ff }
            if (r11 != 0) goto L_0x002c
            java.lang.String r11 = "t0"
            boolean r8 = r8.startsWith(r11)     // Catch:{ Exception -> 0x02ff }
            if (r8 != 0) goto L_0x002c
        L_0x011a:
            if (r7 > r10) goto L_0x012c
            java.lang.String r8 = com.google.android.gms.internal.ads.zzew.zzb     // Catch:{ Exception -> 0x02ff }
            boolean r5 = r8.startsWith(r5)     // Catch:{ Exception -> 0x02ff }
            if (r5 == 0) goto L_0x012c
            java.lang.String r5 = "OMX.qcom.video.decoder.vp8"
            boolean r5 = r5.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x002c
        L_0x012c:
            r5 = 23
            if (r7 > r5) goto L_0x0140
            java.lang.String r7 = "audio/eac3-joc"
            boolean r7 = r7.equals(r15)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x0140
            java.lang.String r7 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 != 0) goto L_0x002c
        L_0x0140:
            java.lang.String[] r7 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x02ff }
            int r8 = r7.length     // Catch:{ Exception -> 0x02ff }
            r10 = 0
        L_0x0146:
            if (r10 >= r8) goto L_0x0154
            r11 = r7[r10]     // Catch:{ Exception -> 0x02ff }
            boolean r19 = r11.equalsIgnoreCase(r15)     // Catch:{ Exception -> 0x02ff }
            if (r19 == 0) goto L_0x0151
            goto L_0x01b4
        L_0x0151:
            int r10 = r10 + 1
            goto L_0x0146
        L_0x0154:
            java.lang.String r7 = "video/dolby-vision"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x017a
            java.lang.String r7 = "OMX.MS.HEVCDV.Decoder"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x0167
            java.lang.String r11 = "video/hevcdv"
            goto L_0x01b4
        L_0x0167:
            java.lang.String r7 = "OMX.RTK.video.decoder"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 != 0) goto L_0x0177
            java.lang.String r7 = "OMX.realtek.video.decoder.tunneled"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x01b3
        L_0x0177:
            java.lang.String r11 = "video/dv_hevc"
            goto L_0x01b4
        L_0x017a:
            java.lang.String r7 = "audio/alac"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x018d
            java.lang.String r7 = "OMX.lge.alac.decoder"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x018d
            java.lang.String r11 = "audio/x-lg-alac"
            goto L_0x01b4
        L_0x018d:
            java.lang.String r7 = "audio/flac"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x01a0
            java.lang.String r7 = "OMX.lge.flac.decoder"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x01a0
            java.lang.String r11 = "audio/x-lg-flac"
            goto L_0x01b4
        L_0x01a0:
            java.lang.String r7 = "audio/ac3"
            boolean r7 = r15.equals(r7)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x01b3
            java.lang.String r7 = "OMX.lge.ac3.decoder"
            boolean r7 = r7.equals(r12)     // Catch:{ Exception -> 0x02ff }
            if (r7 == 0) goto L_0x01b3
            java.lang.String r11 = "audio/lg-ac3"
            goto L_0x01b4
        L_0x01b3:
            r11 = 0
        L_0x01b4:
            if (r11 == 0) goto L_0x002c
            android.media.MediaCodecInfo$CodecCapabilities r10 = r0.getCapabilitiesForType(r11)     // Catch:{ Exception -> 0x029e }
            boolean r7 = r2.zzd(r4, r11, r10)     // Catch:{ Exception -> 0x029e }
            boolean r8 = r2.zzc(r4, r11, r10)     // Catch:{ Exception -> 0x029e }
            boolean r5 = r1.zzc     // Catch:{ Exception -> 0x029e }
            if (r5 != 0) goto L_0x01c9
            if (r8 != 0) goto L_0x002c
            goto L_0x01cd
        L_0x01c9:
            if (r7 != 0) goto L_0x01cd
            goto L_0x002c
        L_0x01cd:
            boolean r5 = r2.zzd(r3, r11, r10)     // Catch:{ Exception -> 0x029e }
            boolean r7 = r2.zzc(r3, r11, r10)     // Catch:{ Exception -> 0x029e }
            boolean r8 = r1.zzb     // Catch:{ Exception -> 0x029e }
            r20 = 1
            if (r8 != 0) goto L_0x01de
            if (r7 != 0) goto L_0x002c
            goto L_0x01e1
        L_0x01de:
            if (r5 == 0) goto L_0x002c
            r5 = 1
        L_0x01e1:
            int r7 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ Exception -> 0x029e }
            r8 = 29
            if (r7 < r8) goto L_0x01ee
            boolean r8 = r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x029e }
            r21 = r8
            goto L_0x01f9
        L_0x01ee:
            boolean r8 = zzj(r0, r15)     // Catch:{ Exception -> 0x029e }
            if (r8 != 0) goto L_0x01f7
            r21 = 1
            goto L_0x01f9
        L_0x01f7:
            r21 = 0
        L_0x01f9:
            boolean r22 = zzj(r0, r15)     // Catch:{ Exception -> 0x029e }
            r8 = 29
            if (r7 < r8) goto L_0x0206
            boolean r0 = r0.isVendor()     // Catch:{ Exception -> 0x029e }
            goto L_0x0229
        L_0x0206:
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x029e }
            java.lang.String r0 = com.google.android.gms.internal.ads.zzfnb.zza(r0)     // Catch:{ Exception -> 0x029e }
            java.lang.String r7 = "omx.google."
            boolean r7 = r0.startsWith(r7)     // Catch:{ Exception -> 0x029e }
            if (r7 != 0) goto L_0x0228
            java.lang.String r7 = "c2.android."
            boolean r7 = r0.startsWith(r7)     // Catch:{ Exception -> 0x029e }
            if (r7 != 0) goto L_0x0228
            java.lang.String r7 = "c2.google."
            boolean r0 = r0.startsWith(r7)     // Catch:{ Exception -> 0x029e }
            if (r0 != 0) goto L_0x0228
            r0 = 1
            goto L_0x0229
        L_0x0228:
            r0 = 0
        L_0x0229:
            if (r16 == 0) goto L_0x022f
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x029e }
            if (r7 == r5) goto L_0x0235
        L_0x022f:
            if (r16 != 0) goto L_0x0265
            boolean r7 = r1.zzb     // Catch:{ Exception -> 0x025a }
            if (r7 != 0) goto L_0x0265
        L_0x0235:
            r5 = 0
            r18 = 0
            r7 = r12
            r8 = r15
            r9 = r11
            r20 = r11
            r11 = r21
            r23 = r12
            r12 = r22
            r24 = r13
            r13 = r0
            r25 = r14
            r14 = r5
            r26 = r15
            r15 = r18
            com.google.android.gms.internal.ads.zzqx r0 = com.google.android.gms.internal.ads.zzqx.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0256 }
            r6.add(r0)     // Catch:{ Exception -> 0x0256 }
            goto L_0x02f4
        L_0x0256:
            r0 = move-exception
            r1 = r23
            goto L_0x02a8
        L_0x025a:
            r0 = move-exception
            r20 = r11
            r24 = r13
            r25 = r14
            r26 = r15
            r1 = r12
            goto L_0x02a8
        L_0x0265:
            r20 = r11
            r23 = r12
            r24 = r13
            r25 = r14
            r26 = r15
            if (r16 != 0) goto L_0x02f4
            if (r5 == 0) goto L_0x02f4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0256 }
            r5.<init>()     // Catch:{ Exception -> 0x0256 }
            r15 = r23
            r5.append(r15)     // Catch:{ Exception -> 0x029b }
            r5.append(r9)     // Catch:{ Exception -> 0x029b }
            java.lang.String r7 = r5.toString()     // Catch:{ Exception -> 0x029b }
            r14 = 0
            r5 = 1
            r8 = r26
            r9 = r20
            r11 = r21
            r12 = r22
            r13 = r0
            r1 = r15
            r15 = r5
            com.google.android.gms.internal.ads.zzqx r0 = com.google.android.gms.internal.ads.zzqx.zzc(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x0299 }
            r6.add(r0)     // Catch:{ Exception -> 0x0299 }
            return r6
        L_0x0299:
            r0 = move-exception
            goto L_0x02a8
        L_0x029b:
            r0 = move-exception
            r1 = r15
            goto L_0x02a8
        L_0x029e:
            r0 = move-exception
            r20 = r11
            r1 = r12
            r24 = r13
            r25 = r14
            r26 = r15
        L_0x02a8:
            int r5 = com.google.android.gms.internal.ads.zzew.zza     // Catch:{ Exception -> 0x02ff }
            java.lang.String r7 = "MediaCodecUtil"
            r8 = 23
            if (r5 > r8) goto L_0x02d0
            boolean r5 = r6.isEmpty()     // Catch:{ Exception -> 0x02ff }
            if (r5 != 0) goto L_0x02d0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ff }
            r0.<init>()     // Catch:{ Exception -> 0x02ff }
            java.lang.String r5 = "Skipping codec "
            r0.append(r5)     // Catch:{ Exception -> 0x02ff }
            r0.append(r1)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r1 = " (failed to query capabilities)"
            r0.append(r1)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02ff }
            com.google.android.gms.internal.ads.zzee.zzb(r7, r0)     // Catch:{ Exception -> 0x02ff }
            goto L_0x02f4
        L_0x02d0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02ff }
            r2.<init>()     // Catch:{ Exception -> 0x02ff }
            java.lang.String r3 = "Failed to query codec "
            r2.append(r3)     // Catch:{ Exception -> 0x02ff }
            r2.append(r1)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x02ff }
            r11 = r20
            r2.append(r11)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x02ff }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x02ff }
            com.google.android.gms.internal.ads.zzee.zzb(r7, r1)     // Catch:{ Exception -> 0x02ff }
            throw r0     // Catch:{ Exception -> 0x02ff }
        L_0x02f4:
            int r13 = r24 + 1
            r1 = r27
            r14 = r25
            r15 = r26
            goto L_0x001a
        L_0x02fe:
            return r6
        L_0x02ff:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzrj r1 = new com.google.android.gms.internal.ads.zzrj
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrp.zzh(com.google.android.gms.internal.ads.zzrh, com.google.android.gms.internal.ads.zzrk):java.util.ArrayList");
    }

    private static void zzi(List list, zzro zzro) {
        Collections.sort(list, new zzre(zzro));
    }

    private static boolean zzj(MediaCodecInfo mediaCodecInfo, String str) {
        if (zzew.zza >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzbt.zzg(str)) {
            return true;
        }
        String zza2 = zzfnb.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (zza2.startsWith("omx.") || zza2.startsWith("c2.")) {
            return false;
        }
        return true;
    }
}
