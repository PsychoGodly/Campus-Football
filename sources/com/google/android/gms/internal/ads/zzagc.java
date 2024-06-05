package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzagc implements zzzu, zzaax {
    public static final zzaab zza = zzafz.zza;
    private final zzen zzb;
    private final zzen zzc;
    private final zzen zzd;
    private final zzen zze;
    private final ArrayDeque zzf;
    private final zzage zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    private zzen zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzzx zzr;
    private zzagb[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    private zzaef zzx;

    public zzagc() {
        this(0);
    }

    private static int zzf(int i10) {
        if (i10 != 1751476579) {
            return i10 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzagj zzagj, long j10) {
        int zza2 = zzagj.zza(j10);
        return zza2 == -1 ? zzagj.zzb(j10) : zza2;
    }

    private static long zzj(zzagj zzagj, long j10, long j11) {
        int zzi2 = zzi(zzagj, j10);
        if (zzi2 == -1) {
            return j11;
        }
        return Math.min(zzagj.zzc[zzi2], j11);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a A[LOOP:3: B:69:0x0187->B:71:0x018a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0199  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzl(long r27) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r26 = this;
            r0 = r26
        L_0x0002:
            java.util.ArrayDeque r1 = r0.zzf
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0266
            java.util.ArrayDeque r1 = r0.zzf
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzafh r1 = (com.google.android.gms.internal.ads.zzafh) r1
            long r3 = r1.zza
            int r1 = (r3 > r27 ? 1 : (r3 == r27 ? 0 : -1))
            if (r1 != 0) goto L_0x0266
            java.util.ArrayDeque r1 = r0.zzf
            java.lang.Object r1 = r1.pop()
            r3 = r1
            com.google.android.gms.internal.ads.zzafh r3 = (com.google.android.gms.internal.ads.zzafh) r3
            int r1 = r3.zzd
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r1 != r4) goto L_0x0251
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r0.zzw
            com.google.android.gms.internal.ads.zzaaj r11 = new com.google.android.gms.internal.ads.zzaaj
            r11.<init>()
            r5 = 1969517665(0x75647461, float:2.8960062E32)
            com.google.android.gms.internal.ads.zzafi r5 = r3.zzb(r5)
            if (r5 == 0) goto L_0x0051
            android.util.Pair r5 = com.google.android.gms.internal.ads.zzafr.zza(r5)
            java.lang.Object r6 = r5.first
            com.google.android.gms.internal.ads.zzbq r6 = (com.google.android.gms.internal.ads.zzbq) r6
            java.lang.Object r5 = r5.second
            com.google.android.gms.internal.ads.zzbq r5 = (com.google.android.gms.internal.ads.zzbq) r5
            if (r6 == 0) goto L_0x004e
            r11.zzb(r6)
        L_0x004e:
            r13 = r5
            r14 = r6
            goto L_0x0053
        L_0x0051:
            r13 = 0
            r14 = 0
        L_0x0053:
            r5 = 1835365473(0x6d657461, float:4.4382975E27)
            com.google.android.gms.internal.ads.zzafh r5 = r3.zza(r5)
            if (r5 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.zzbq r5 = com.google.android.gms.internal.ads.zzafr.zzb(r5)
            r15 = r5
            goto L_0x0063
        L_0x0062:
            r15 = 0
        L_0x0063:
            r10 = 0
            r9 = 1
            if (r4 != r9) goto L_0x006a
            r16 = 1
            goto L_0x006c
        L_0x006a:
            r16 = 0
        L_0x006c:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 0
            r8 = 0
            com.google.android.gms.internal.ads.zzaga r17 = com.google.android.gms.internal.ads.zzaga.zza
            r4 = r11
            r12 = 1
            r9 = r16
            r10 = r17
            java.util.List r3 = com.google.android.gms.internal.ads.zzafr.zzc(r3, r4, r5, r7, r8, r9, r10)
            int r4 = r3.size()
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = r13
            r8 = -1
            r10 = 0
            r12 = r6
        L_0x008c:
            r19 = 0
            if (r10 >= r4) goto L_0x01c4
            java.lang.Object r17 = r3.get(r10)
            r5 = r17
            com.google.android.gms.internal.ads.zzagj r5 = (com.google.android.gms.internal.ads.zzagj) r5
            int r2 = r5.zzb
            if (r2 != 0) goto L_0x00a6
            r21 = r3
            r22 = r4
            r4 = r6
            r18 = r9
            r2 = -1
            goto L_0x01b9
        L_0x00a6:
            com.google.android.gms.internal.ads.zzagg r2 = r5.zza
            r21 = r3
            r22 = r4
            long r3 = r2.zze
            int r23 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r23 == 0) goto L_0x00b3
            goto L_0x00b5
        L_0x00b3:
            long r3 = r5.zzh
        L_0x00b5:
            long r12 = java.lang.Math.max(r12, r3)
            com.google.android.gms.internal.ads.zzagb r6 = new com.google.android.gms.internal.ads.zzagb
            com.google.android.gms.internal.ads.zzzx r7 = r0.zzr
            r24 = r12
            int r12 = r2.zzb
            com.google.android.gms.internal.ads.zzabb r7 = r7.zzv(r10, r12)
            r6.<init>(r2, r5, r7)
            com.google.android.gms.internal.ads.zzaf r7 = r2.zzf
            java.lang.String r7 = r7.zzm
            java.lang.String r12 = "audio/true-hd"
            boolean r7 = r12.equals(r7)
            if (r7 == 0) goto L_0x00d9
            int r7 = r5.zze
            int r7 = r7 * 16
            goto L_0x00dd
        L_0x00d9:
            int r7 = r5.zze
            int r7 = r7 + 30
        L_0x00dd:
            com.google.android.gms.internal.ads.zzaf r12 = r2.zzf
            com.google.android.gms.internal.ads.zzad r12 = r12.zzb()
            r12.zzL(r7)
            int r7 = r2.zzb
            r13 = 2
            if (r7 != r13) goto L_0x00fe
            int r7 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r7 <= 0) goto L_0x00fe
            int r5 = r5.zzb
            r7 = 1
            if (r5 <= r7) goto L_0x00fe
            float r3 = (float) r3
            float r4 = (float) r5
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r3 = r3 / r5
            float r4 = r4 / r3
            r12.zzE(r4)
        L_0x00fe:
            int r3 = r2.zzb
            int r4 = com.google.android.gms.internal.ads.zzafy.zzb
            r4 = 1
            if (r3 != r4) goto L_0x0115
            boolean r3 = r11.zza()
            if (r3 == 0) goto L_0x0115
            int r3 = r11.zza
            r12.zzC(r3)
            int r3 = r11.zzb
            r12.zzD(r3)
        L_0x0115:
            int r3 = r2.zzb
            r4 = 2
            com.google.android.gms.internal.ads.zzbq[] r5 = new com.google.android.gms.internal.ads.zzbq[r4]
            r4 = 0
            r5[r4] = r9
            java.util.List r7 = r0.zzh
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x0127
            r7 = 0
            goto L_0x012e
        L_0x0127:
            com.google.android.gms.internal.ads.zzbq r7 = new com.google.android.gms.internal.ads.zzbq
            java.util.List r13 = r0.zzh
            r7.<init>((java.util.List) r13)
        L_0x012e:
            r13 = 1
            r5[r13] = r7
            com.google.android.gms.internal.ads.zzbq r7 = new com.google.android.gms.internal.ads.zzbq
            r18 = r9
            com.google.android.gms.internal.ads.zzbp[] r9 = new com.google.android.gms.internal.ads.zzbp[r4]
            r19 = r5
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r4, r9)
            if (r3 != r13) goto L_0x014c
            if (r14 == 0) goto L_0x0146
            r7 = r14
        L_0x0146:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0186
        L_0x014c:
            r4 = 2
            if (r3 != r4) goto L_0x0146
            if (r15 == 0) goto L_0x0146
            r3 = 0
        L_0x0152:
            int r4 = r15.zza()
            if (r3 >= r4) goto L_0x0146
            com.google.android.gms.internal.ads.zzbp r4 = r15.zzb(r3)
            boolean r5 = r4 instanceof com.google.android.gms.internal.ads.zzaec
            if (r5 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzaec r4 = (com.google.android.gms.internal.ads.zzaec) r4
            java.lang.String r5 = r4.zza
            java.lang.String r9 = "com.android.capture.fps"
            boolean r5 = r9.equals(r5)
            if (r5 == 0) goto L_0x017e
            com.google.android.gms.internal.ads.zzbq r7 = new com.google.android.gms.internal.ads.zzbq
            r3 = 1
            com.google.android.gms.internal.ads.zzbp[] r5 = new com.google.android.gms.internal.ads.zzbp[r3]
            r3 = 0
            r5[r3] = r4
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.<init>(r3, r5)
            r4 = r3
            goto L_0x0186
        L_0x017e:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = r3 + 1
            goto L_0x0152
        L_0x0186:
            r3 = 0
        L_0x0187:
            r9 = 2
            if (r3 >= r9) goto L_0x0193
            r9 = r19[r3]
            com.google.android.gms.internal.ads.zzbq r7 = r7.zzd(r9)
            int r3 = r3 + 1
            goto L_0x0187
        L_0x0193:
            int r3 = r7.zza()
            if (r3 <= 0) goto L_0x019c
            r12.zzM(r7)
        L_0x019c:
            com.google.android.gms.internal.ads.zzabb r3 = r6.zzc
            com.google.android.gms.internal.ads.zzaf r7 = r12.zzY()
            r3.zzk(r7)
            int r2 = r2.zzb
            r3 = 2
            if (r2 != r3) goto L_0x01b3
            r2 = -1
            if (r8 != r2) goto L_0x01b4
            int r3 = r1.size()
            r8 = r3
            goto L_0x01b4
        L_0x01b3:
            r2 = -1
        L_0x01b4:
            r1.add(r6)
            r12 = r24
        L_0x01b9:
            int r10 = r10 + 1
            r6 = r4
            r9 = r18
            r3 = r21
            r4 = r22
            goto L_0x008c
        L_0x01c4:
            r2 = -1
            r0.zzu = r8
            r0.zzv = r12
            r3 = 0
            com.google.android.gms.internal.ads.zzagb[] r4 = new com.google.android.gms.internal.ads.zzagb[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            com.google.android.gms.internal.ads.zzagb[] r1 = (com.google.android.gms.internal.ads.zzagb[]) r1
            r0.zzs = r1
            int r3 = r1.length
            long[][] r4 = new long[r3][]
            int[] r5 = new int[r3]
            long[] r6 = new long[r3]
            boolean[] r3 = new boolean[r3]
            r10 = 0
        L_0x01de:
            int r7 = r1.length
            if (r10 >= r7) goto L_0x01f9
            r7 = r1[r10]
            com.google.android.gms.internal.ads.zzagj r7 = r7.zzb
            int r7 = r7.zzb
            long[] r7 = new long[r7]
            r4[r10] = r7
            r7 = r1[r10]
            com.google.android.gms.internal.ads.zzagj r7 = r7.zzb
            long[] r7 = r7.zzf
            r8 = 0
            r11 = r7[r8]
            r6[r10] = r11
            int r10 = r10 + 1
            goto L_0x01de
        L_0x01f9:
            r8 = 0
            r10 = 0
        L_0x01fb:
            int r7 = r1.length
            if (r10 >= r7) goto L_0x023b
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
            r9 = -1
        L_0x0205:
            int r13 = r1.length
            if (r7 >= r13) goto L_0x0217
            boolean r13 = r3[r7]
            if (r13 != 0) goto L_0x0214
            r13 = r6[r7]
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 > 0) goto L_0x0214
            r9 = r7
            r11 = r13
        L_0x0214:
            int r7 = r7 + 1
            goto L_0x0205
        L_0x0217:
            r7 = r5[r9]
            r11 = r4[r9]
            r11[r7] = r19
            r12 = r1[r9]
            com.google.android.gms.internal.ads.zzagj r12 = r12.zzb
            int[] r13 = r12.zzd
            r13 = r13[r7]
            long r13 = (long) r13
            long r19 = r19 + r13
            r13 = 1
            int r7 = r7 + r13
            r5[r9] = r7
            int r11 = r11.length
            if (r7 >= r11) goto L_0x0236
            long[] r11 = r12.zzf
            r14 = r11[r7]
            r6[r9] = r14
            goto L_0x01fb
        L_0x0236:
            r3[r9] = r13
            int r10 = r10 + 1
            goto L_0x01fb
        L_0x023b:
            r0.zzt = r4
            com.google.android.gms.internal.ads.zzzx r1 = r0.zzr
            r1.zzC()
            com.google.android.gms.internal.ads.zzzx r1 = r0.zzr
            r1.zzN(r0)
            java.util.ArrayDeque r1 = r0.zzf
            r1.clear()
            r1 = 2
            r0.zzi = r1
            goto L_0x0002
        L_0x0251:
            java.util.ArrayDeque r1 = r0.zzf
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0002
            java.util.ArrayDeque r1 = r0.zzf
            java.lang.Object r1 = r1.peek()
            com.google.android.gms.internal.ads.zzafh r1 = (com.google.android.gms.internal.ads.zzafh) r1
            r1.zzc(r3)
            goto L_0x0002
        L_0x0266:
            int r1 = r0.zzi
            r2 = 2
            if (r1 == r2) goto L_0x026e
            r26.zzk()
        L_0x026e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzl(long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:211:0x0085 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int zza(com.google.android.gms.internal.ads.zzzv r33, com.google.android.gms.internal.ads.zzaau r34) throws java.io.IOException {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = r34
        L_0x0006:
            int r3 = r0.zzi
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r6 = 0
            r8 = -1
            r9 = 8
            r10 = 1
            if (r3 == 0) goto L_0x024f
            r13 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r10) goto L_0x01cf
            long r3 = r33.zzf()
            int r9 = r0.zzn
            if (r9 != r8) goto L_0x00a2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r18 = r16
            r21 = r18
            r23 = r21
            r9 = 0
            r20 = 1
            r25 = -1
            r26 = -1
            r27 = 1
        L_0x0034:
            com.google.android.gms.internal.ads.zzagb[] r5 = r0.zzs
            int r15 = r5.length
            if (r9 >= r15) goto L_0x0088
            r5 = r5[r9]
            int r15 = r5.zze
            com.google.android.gms.internal.ads.zzagj r5 = r5.zzb
            int r12 = r5.zzb
            if (r15 != r12) goto L_0x0044
            goto L_0x0085
        L_0x0044:
            long[] r5 = r5.zzc
            r28 = r5[r15]
            long[][] r5 = r0.zzt
            java.lang.Object r5 = com.google.android.gms.internal.ads.zzew.zzH(r5)
            long[][] r5 = (long[][]) r5
            r5 = r5[r9]
            r30 = r5[r15]
            long r28 = r28 - r3
            int r5 = (r28 > r6 ? 1 : (r28 == r6 ? 0 : -1))
            if (r5 < 0) goto L_0x0061
            int r5 = (r28 > r13 ? 1 : (r28 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r5 = 0
            goto L_0x0062
        L_0x0061:
            r5 = 1
        L_0x0062:
            if (r5 != 0) goto L_0x0068
            if (r27 != 0) goto L_0x0070
            r12 = 0
            goto L_0x006a
        L_0x0068:
            r12 = r27
        L_0x006a:
            if (r5 != r12) goto L_0x0079
            int r15 = (r28 > r23 ? 1 : (r28 == r23 ? 0 : -1))
            if (r15 >= 0) goto L_0x0079
        L_0x0070:
            r27 = r5
            r26 = r9
            r23 = r28
            r21 = r30
            goto L_0x007b
        L_0x0079:
            r27 = r12
        L_0x007b:
            int r12 = (r30 > r18 ? 1 : (r30 == r18 ? 0 : -1))
            if (r12 >= 0) goto L_0x0085
            r20 = r5
            r25 = r9
            r18 = r30
        L_0x0085:
            int r9 = r9 + 1
            goto L_0x0034
        L_0x0088:
            int r5 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r5 == 0) goto L_0x009a
            if (r20 == 0) goto L_0x009a
            r15 = 10485760(0xa00000, double:5.180654E-317)
            long r18 = r18 + r15
            int r5 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r5 < 0) goto L_0x009a
            r9 = r25
            goto L_0x009c
        L_0x009a:
            r9 = r26
        L_0x009c:
            r0.zzn = r9
            if (r9 != r8) goto L_0x00a2
            goto L_0x01ce
        L_0x00a2:
            com.google.android.gms.internal.ads.zzagb[] r5 = r0.zzs
            r5 = r5[r9]
            com.google.android.gms.internal.ads.zzabb r9 = r5.zzc
            int r12 = r5.zze
            com.google.android.gms.internal.ads.zzagj r15 = r5.zzb
            long[] r8 = r15.zzc
            r10 = r8[r12]
            int[] r8 = r15.zzd
            r8 = r8[r12]
            com.google.android.gms.internal.ads.zzabc r15 = r5.zzd
            long r3 = r10 - r3
            int r13 = r0.zzo
            long r13 = (long) r13
            long r3 = r3 + r13
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x01cb
            r6 = 262144(0x40000, double:1.295163E-318)
            int r13 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r13 < 0) goto L_0x00c9
            goto L_0x01cb
        L_0x00c9:
            com.google.android.gms.internal.ads.zzagg r2 = r5.zza
            int r2 = r2.zzg
            r6 = 1
            if (r2 != r6) goto L_0x00d5
            r6 = 8
            long r3 = r3 + r6
            int r8 = r8 + -8
        L_0x00d5:
            int r2 = (int) r3
            r1.zzk(r2)
            com.google.android.gms.internal.ads.zzagg r2 = r5.zza
            int r3 = r2.zzj
            if (r3 == 0) goto L_0x013f
            com.google.android.gms.internal.ads.zzen r2 = r0.zzc
            byte[] r2 = r2.zzH()
            r4 = 0
            r2[r4] = r4
            r6 = 1
            r2[r6] = r4
            r6 = 2
            r2[r6] = r4
            int r4 = 4 - r3
        L_0x00f0:
            int r6 = r0.zzp
            if (r6 >= r8) goto L_0x0182
            int r6 = r0.zzq
            if (r6 != 0) goto L_0x012a
            r1.zzi(r2, r4, r3)
            int r6 = r0.zzo
            int r6 = r6 + r3
            r0.zzo = r6
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            r7 = 0
            r6.zzF(r7)
            com.google.android.gms.internal.ads.zzen r6 = r0.zzc
            int r6 = r6.zze()
            if (r6 < 0) goto L_0x0122
            r0.zzq = r6
            com.google.android.gms.internal.ads.zzen r6 = r0.zzb
            r6.zzF(r7)
            com.google.android.gms.internal.ads.zzen r6 = r0.zzb
            r10 = 4
            r9.zzq(r6, r10)
            int r6 = r0.zzp
            int r6 = r6 + r10
            r0.zzp = r6
            int r8 = r8 + r4
            goto L_0x00f0
        L_0x0122:
            java.lang.String r1 = "Invalid NAL length"
            r2 = 0
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zza(r1, r2)
            throw r1
        L_0x012a:
            r7 = 0
            int r6 = r9.zze(r1, r6, r7)
            int r7 = r0.zzo
            int r7 = r7 + r6
            r0.zzo = r7
            int r7 = r0.zzp
            int r7 = r7 + r6
            r0.zzp = r7
            int r7 = r0.zzq
            int r7 = r7 - r6
            r0.zzq = r7
            goto L_0x00f0
        L_0x013f:
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzf
            java.lang.String r2 = r2.zzm
            java.lang.String r3 = "audio/ac4"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0162
            int r2 = r0.zzp
            if (r2 != 0) goto L_0x015f
            com.google.android.gms.internal.ads.zzen r2 = r0.zzd
            com.google.android.gms.internal.ads.zzyy.zzb(r8, r2)
            com.google.android.gms.internal.ads.zzen r2 = r0.zzd
            r3 = 7
            r9.zzq(r2, r3)
            int r2 = r0.zzp
            int r2 = r2 + r3
            r0.zzp = r2
        L_0x015f:
            int r8 = r8 + 7
            goto L_0x0167
        L_0x0162:
            if (r15 == 0) goto L_0x0167
            r15.zzd(r1)
        L_0x0167:
            int r2 = r0.zzp
            if (r2 >= r8) goto L_0x0182
            int r2 = r8 - r2
            r3 = 0
            int r2 = r9.zze(r1, r2, r3)
            int r3 = r0.zzo
            int r3 = r3 + r2
            r0.zzo = r3
            int r3 = r0.zzp
            int r3 = r3 + r2
            r0.zzp = r3
            int r3 = r0.zzq
            int r3 = r3 - r2
            r0.zzq = r3
            goto L_0x0167
        L_0x0182:
            com.google.android.gms.internal.ads.zzagj r1 = r5.zzb
            long[] r2 = r1.zzf
            r3 = r2[r12]
            int[] r1 = r1.zzg
            r1 = r1[r12]
            if (r15 == 0) goto L_0x01ab
            r21 = 0
            r22 = 0
            r2 = r15
            r16 = r9
            r17 = r3
            r19 = r1
            r20 = r8
            r15.zzc(r16, r17, r19, r20, r21, r22)
            r1 = 1
            int r12 = r12 + r1
            com.google.android.gms.internal.ads.zzagj r1 = r5.zzb
            int r1 = r1.zzb
            if (r12 != r1) goto L_0x01b9
            r1 = 0
            r2.zza(r9, r1)
            goto L_0x01b9
        L_0x01ab:
            r20 = 0
            r21 = 0
            r15 = r9
            r16 = r3
            r18 = r1
            r19 = r8
            r15.zzs(r16, r18, r19, r20, r21)
        L_0x01b9:
            int r1 = r5.zze
            r2 = 1
            int r1 = r1 + r2
            r5.zze = r1
            r1 = -1
            r0.zzn = r1
            r1 = 0
            r0.zzo = r1
            r0.zzp = r1
            r0.zzq = r1
            r8 = 0
            goto L_0x01ce
        L_0x01cb:
            r2.zza = r10
            r8 = 1
        L_0x01ce:
            return r8
        L_0x01cf:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 - r7
            long r7 = r33.zzf()
            long r7 = r7 + r5
            com.google.android.gms.internal.ads.zzen r3 = r0.zzm
            if (r3 == 0) goto L_0x022e
            byte[] r10 = r3.zzH()
            int r11 = r0.zzl
            int r6 = (int) r5
            r1.zzi(r10, r11, r6)
            int r5 = r0.zzj
            if (r5 != r4) goto L_0x0213
            r3.zzF(r9)
            int r4 = r3.zze()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01fa
            goto L_0x0210
        L_0x01fa:
            r4 = 4
            r3.zzG(r4)
        L_0x01fe:
            int r4 = r3.zza()
            if (r4 <= 0) goto L_0x020f
            int r4 = r3.zze()
            int r4 = zzf(r4)
            if (r4 == 0) goto L_0x01fe
            goto L_0x0210
        L_0x020f:
            r4 = 0
        L_0x0210:
            r0.zzw = r4
            goto L_0x0239
        L_0x0213:
            java.util.ArrayDeque r4 = r0.zzf
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0239
            java.util.ArrayDeque r4 = r0.zzf
            java.lang.Object r4 = r4.peek()
            com.google.android.gms.internal.ads.zzafh r4 = (com.google.android.gms.internal.ads.zzafh) r4
            com.google.android.gms.internal.ads.zzafi r5 = new com.google.android.gms.internal.ads.zzafi
            int r6 = r0.zzj
            r5.<init>(r6, r3)
            r4.zzd(r5)
            goto L_0x0239
        L_0x022e:
            r3 = 262144(0x40000, double:1.295163E-318)
            int r9 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r9 >= 0) goto L_0x023b
            int r3 = (int) r5
            r1.zzk(r3)
        L_0x0239:
            r11 = 0
            goto L_0x0243
        L_0x023b:
            long r3 = r33.zzf()
            long r3 = r3 + r5
            r2.zza = r3
            r11 = 1
        L_0x0243:
            r0.zzl(r7)
            if (r11 == 0) goto L_0x0006
            int r3 = r0.zzi
            r4 = 2
            if (r3 == r4) goto L_0x0006
            r3 = 1
            return r3
        L_0x024f:
            r3 = 1
            int r5 = r0.zzl
            if (r5 != 0) goto L_0x027a
            com.google.android.gms.internal.ads.zzen r5 = r0.zze
            byte[] r5 = r5.zzH()
            r8 = 0
            boolean r5 = r1.zzn(r5, r8, r9, r3)
            if (r5 != 0) goto L_0x0263
            r3 = -1
            return r3
        L_0x0263:
            r0.zzl = r9
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            r3.zzF(r8)
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            long r10 = r3.zzs()
            r0.zzk = r10
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            int r3 = r3.zze()
            r0.zzj = r3
        L_0x027a:
            long r10 = r0.zzk
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0299
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            byte[] r3 = r3.zzH()
            r1.zzi(r3, r9, r9)
            int r3 = r0.zzl
            int r3 = r3 + r9
            r0.zzl = r3
            com.google.android.gms.internal.ads.zzen r3 = r0.zze
            long r5 = r3.zzt()
            r0.zzk = r5
            goto L_0x02c4
        L_0x0299:
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x02c4
            long r5 = r33.zzd()
            r7 = -1
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x02b5
            java.util.ArrayDeque r3 = r0.zzf
            java.lang.Object r3 = r3.peek()
            com.google.android.gms.internal.ads.zzafh r3 = (com.google.android.gms.internal.ads.zzafh) r3
            if (r3 == 0) goto L_0x02b4
            long r5 = r3.zza
            goto L_0x02b5
        L_0x02b4:
            r5 = r7
        L_0x02b5:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x02c4
            long r7 = r33.zzf()
            long r5 = r5 - r7
            int r3 = r0.zzl
            long r7 = (long) r3
            long r5 = r5 + r7
            r0.zzk = r5
        L_0x02c4:
            long r5 = r0.zzk
            int r3 = r0.zzl
            long r7 = (long) r3
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 < 0) goto L_0x0401
            int r5 = r0.zzj
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x03af
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x03af
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x03af
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x03af
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x03af
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x03af
            if (r5 != r7) goto L_0x02f4
            goto L_0x03af
        L_0x02f4:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x037b
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x037b
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r6) goto L_0x037b
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x037b
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x037b
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x037b
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x037b
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x037b
            if (r5 == r4) goto L_0x037b
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x037b
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x037b
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x034c
            goto L_0x037b
        L_0x034c:
            long r3 = r33.zzf()
            int r5 = r0.zzl
            long r5 = (long) r5
            long r10 = r3 - r5
            int r3 = r0.zzj
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0373
            long r14 = r10 + r5
            com.google.android.gms.internal.ads.zzaef r3 = new com.google.android.gms.internal.ads.zzaef
            r8 = 0
            long r12 = r0.zzk
            long r4 = r12 - r5
            r7 = r3
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = r4
            r7.<init>(r8, r10, r12, r14, r16)
            r0.zzx = r3
        L_0x0373:
            r3 = 0
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x037b:
            if (r3 != r9) goto L_0x037f
            r3 = 1
            goto L_0x0380
        L_0x037f:
            r3 = 0
        L_0x0380:
            com.google.android.gms.internal.ads.zzdl.zzf(r3)
            long r3 = r0.zzk
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x038e
            r3 = 1
            goto L_0x038f
        L_0x038e:
            r3 = 0
        L_0x038f:
            com.google.android.gms.internal.ads.zzdl.zzf(r3)
            com.google.android.gms.internal.ads.zzen r3 = new com.google.android.gms.internal.ads.zzen
            long r4 = r0.zzk
            int r5 = (int) r4
            r3.<init>((int) r5)
            com.google.android.gms.internal.ads.zzen r4 = r0.zze
            byte[] r4 = r4.zzH()
            byte[] r5 = r3.zzH()
            r6 = 0
            java.lang.System.arraycopy(r4, r6, r5, r6, r9)
            r0.zzm = r3
            r3 = 1
            r0.zzi = r3
            goto L_0x0006
        L_0x03af:
            long r3 = r33.zzf()
            long r5 = r0.zzk
            long r3 = r3 + r5
            int r8 = r0.zzl
            long r10 = (long) r8
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x03e1
            int r5 = r0.zzj
            if (r5 != r7) goto L_0x03e1
            com.google.android.gms.internal.ads.zzen r5 = r0.zzd
            r5.zzC(r9)
            com.google.android.gms.internal.ads.zzen r5 = r0.zzd
            byte[] r5 = r5.zzH()
            r6 = 0
            r1.zzh(r5, r6, r9)
            com.google.android.gms.internal.ads.zzen r5 = r0.zzd
            com.google.android.gms.internal.ads.zzafr.zzd(r5)
            com.google.android.gms.internal.ads.zzen r5 = r0.zzd
            int r5 = r5.zzc()
            r1.zzk(r5)
            r33.zzj()
        L_0x03e1:
            long r3 = r3 - r10
            java.util.ArrayDeque r5 = r0.zzf
            com.google.android.gms.internal.ads.zzafh r6 = new com.google.android.gms.internal.ads.zzafh
            int r7 = r0.zzj
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r0.zzk
            int r7 = r0.zzl
            long r7 = (long) r7
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x03fc
            r0.zzl(r3)
            goto L_0x0006
        L_0x03fc:
            r32.zzk()
            goto L_0x0006
        L_0x0401:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
            com.google.android.gms.internal.ads.zzbu r1 = com.google.android.gms.internal.ads.zzbu.zzc(r1)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zza(com.google.android.gms.internal.ads.zzzv, com.google.android.gms.internal.ads.zzaau):int");
    }

    public final void zzb(zzzx zzzx) {
        this.zzr = zzzx;
    }

    public final void zzc(long j10, long j11) {
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j10 == 0) {
            zzk();
            return;
        }
        for (zzagb zzagb : this.zzs) {
            zzagj zzagj = zzagb.zzb;
            int zza2 = zzagj.zza(j11);
            if (zza2 == -1) {
                zza2 = zzagj.zzb(j11);
            }
            zzagb.zze = zza2;
            zzabc zzabc = zzagb.zzd;
            if (zzabc != null) {
                zzabc.zzb();
            }
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        return zzagf.zzb(zzzv, false);
    }

    public final long zze() {
        return this.zzv;
    }

    public final zzaav zzg(long j10) {
        long j11;
        long j12;
        int zzb2;
        zzagb[] zzagbArr = this.zzs;
        if (zzagbArr.length == 0) {
            zzaay zzaay = zzaay.zza;
            return new zzaav(zzaay, zzaay);
        }
        int i10 = this.zzu;
        long j13 = -1;
        if (i10 != -1) {
            zzagj zzagj = zzagbArr[i10].zzb;
            int zzi2 = zzi(zzagj, j10);
            if (zzi2 == -1) {
                zzaay zzaay2 = zzaay.zza;
                return new zzaav(zzaay2, zzaay2);
            }
            long j14 = zzagj.zzf[zzi2];
            j11 = zzagj.zzc[zzi2];
            if (j14 >= j10 || zzi2 >= zzagj.zzb - 1 || (zzb2 = zzagj.zzb(j10)) == -1 || zzb2 == zzi2) {
                j12 = -9223372036854775807L;
            } else {
                j12 = zzagj.zzf[zzb2];
                j13 = zzagj.zzc[zzb2];
            }
            j10 = j14;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
        }
        int i11 = 0;
        while (true) {
            zzagb[] zzagbArr2 = this.zzs;
            if (i11 >= zzagbArr2.length) {
                break;
            }
            if (i11 != this.zzu) {
                zzagj zzagj2 = zzagbArr2[i11].zzb;
                long zzj2 = zzj(zzagj2, j10, j11);
                if (j12 != -9223372036854775807L) {
                    j13 = zzj(zzagj2, j12, j13);
                }
                j11 = zzj2;
            }
            i11++;
        }
        zzaay zzaay3 = new zzaay(j10, j11);
        if (j12 == -9223372036854775807L) {
            return new zzaav(zzaay3, zzaay3);
        }
        return new zzaav(zzaay3, new zzaay(j12, j13));
    }

    public final boolean zzh() {
        return true;
    }

    public zzagc(int i10) {
        this.zzi = 0;
        this.zzg = new zzage();
        this.zzh = new ArrayList();
        this.zze = new zzen(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzen(zzaar.zza);
        this.zzc = new zzen(4);
        this.zzd = new zzen();
        this.zzn = -1;
        this.zzr = zzzx.zza;
        this.zzs = new zzagb[0];
    }
}
