package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzafr {
    private static final byte[] zza = zzew.zzab("OpusHead");

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        if (r3 != 13) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r3 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair zza(com.google.android.gms.internal.ads.zzafi r13) {
        /*
            com.google.android.gms.internal.ads.zzen r13 = r13.zza
            r0 = 8
            r13.zzF(r0)
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000a:
            int r4 = r13.zza()
            if (r4 < r0) goto L_0x00df
            int r4 = r13.zzc()
            int r5 = r13.zze()
            int r6 = r13.zze()
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r6 != r7) goto L_0x0075
            r13.zzF(r4)
            int r2 = r4 + r5
            r13.zzG(r0)
            zzd(r13)
        L_0x002c:
            int r6 = r13.zzc()
            if (r6 >= r2) goto L_0x0073
            int r6 = r13.zzc()
            int r7 = r13.zze()
            int r8 = r13.zze()
            r9 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r8 != r9) goto L_0x006e
            r13.zzF(r6)
            int r6 = r6 + r7
            r13.zzG(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x004f:
            int r7 = r13.zzc()
            if (r7 >= r6) goto L_0x005f
            com.google.android.gms.internal.ads.zzbp r7 = com.google.android.gms.internal.ads.zzafy.zza(r13)
            if (r7 == 0) goto L_0x004f
            r2.add(r7)
            goto L_0x004f
        L_0x005f:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L_0x0066
            goto L_0x0073
        L_0x0066:
            com.google.android.gms.internal.ads.zzbq r6 = new com.google.android.gms.internal.ads.zzbq
            r6.<init>((java.util.List) r2)
            r2 = r6
            goto L_0x00d9
        L_0x006e:
            int r6 = r6 + r7
            r13.zzF(r6)
            goto L_0x002c
        L_0x0073:
            r2 = r1
            goto L_0x00d9
        L_0x0075:
            r7 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r6 != r7) goto L_0x00d9
            r13.zzF(r4)
            int r3 = r4 + r5
            r6 = 12
            r13.zzG(r6)
        L_0x0084:
            int r7 = r13.zzc()
            if (r7 >= r3) goto L_0x00d8
            int r7 = r13.zzc()
            int r8 = r13.zze()
            int r9 = r13.zze()
            r10 = 1935766900(0x73617574, float:1.7862687E31)
            if (r9 != r10) goto L_0x00d3
            r3 = 14
            if (r8 >= r3) goto L_0x00a0
            goto L_0x00d8
        L_0x00a0:
            r3 = 5
            r13.zzG(r3)
            int r3 = r13.zzk()
            r7 = 1123024896(0x42f00000, float:120.0)
            if (r3 == r6) goto L_0x00b1
            r6 = 13
            if (r3 == r6) goto L_0x00b5
            goto L_0x00d8
        L_0x00b1:
            if (r3 != r6) goto L_0x00b5
            r7 = 1131413504(0x43700000, float:240.0)
        L_0x00b5:
            r3 = 1
            r13.zzG(r3)
            int r6 = r13.zzk()
            com.google.android.gms.internal.ads.zzbq r8 = new com.google.android.gms.internal.ads.zzbq
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            com.google.android.gms.internal.ads.zzbp[] r3 = new com.google.android.gms.internal.ads.zzbp[r3]
            r11 = 0
            com.google.android.gms.internal.ads.zzaei r12 = new com.google.android.gms.internal.ads.zzaei
            r12.<init>((float) r7, (int) r6)
            r3[r11] = r12
            r8.<init>(r9, r3)
            r3 = r8
            goto L_0x00d9
        L_0x00d3:
            int r7 = r7 + r8
            r13.zzF(r7)
            goto L_0x0084
        L_0x00d8:
            r3 = r1
        L_0x00d9:
            int r4 = r4 + r5
            r13.zzF(r4)
            goto L_0x000a
        L_0x00df:
            android.util.Pair r13 = android.util.Pair.create(r2, r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zza(com.google.android.gms.internal.ads.zzafi):android.util.Pair");
    }

    public static zzbq zzb(zzafh zzafh) {
        zzaec zzaec;
        zzafi zzb = zzafh.zzb(1751411826);
        zzafi zzb2 = zzafh.zzb(1801812339);
        zzafi zzb3 = zzafh.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzen zzen = zzb2.zza;
        zzen.zzF(12);
        int zze = zzen.zze();
        String[] strArr = new String[zze];
        for (int i10 = 0; i10 < zze; i10++) {
            int zze2 = zzen.zze();
            zzen.zzG(4);
            strArr[i10] = zzen.zzx(zze2 - 8, zzfnh.zzc);
        }
        zzen zzen2 = zzb3.zza;
        zzen2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzen2.zza() > 8) {
            int zzc = zzen2.zzc();
            int zze3 = zzen2.zze();
            int zze4 = zzen2.zze() - 1;
            if (zze4 < 0 || zze4 >= zze) {
                zzee.zze("AtomParsers", "Skipped metadata with unknown key index: " + zze4);
            } else {
                String str = strArr[zze4];
                int i11 = zzc + zze3;
                int i12 = zzafy.zzb;
                while (true) {
                    int zzc2 = zzen2.zzc();
                    if (zzc2 >= i11) {
                        zzaec = null;
                        break;
                    }
                    int zze5 = zzen2.zze();
                    if (zzen2.zze() == 1684108385) {
                        int zze6 = zzen2.zze();
                        int zze7 = zzen2.zze();
                        int i13 = zze5 - 16;
                        byte[] bArr = new byte[i13];
                        zzen2.zzB(bArr, 0, i13);
                        zzaec = new zzaec(str, bArr, zze7, zze6);
                        break;
                    }
                    zzen2.zzF(zzc2 + zze5);
                }
                if (zzaec != null) {
                    arrayList.add(zzaec);
                }
            }
            zzen2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbq((List) arrayList);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b8, code lost:
        if (r7 == 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0782, code lost:
        if (r25 == null) goto L_0x0799;
     */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x084a  */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0a04  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0ad4 A[LOOP:12: B:476:0x0ad4->B:480:0x0ade, LOOP_START, PHI: r23 
      PHI: (r23v4 int) = (r23v3 int), (r23v5 int) binds: [B:475:0x0ad2, B:480:0x0ade] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0ae7  */
    /* JADX WARNING: Removed duplicated region for block: B:496:0x0b32  */
    /* JADX WARNING: Removed duplicated region for block: B:500:0x0b7d  */
    /* JADX WARNING: Removed duplicated region for block: B:501:0x0b80  */
    /* JADX WARNING: Removed duplicated region for block: B:506:0x0ba4  */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0bc1  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:599:0x0e2e  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0e3b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:635:0x0acb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0180  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List zzc(com.google.android.gms.internal.ads.zzafh r56, com.google.android.gms.internal.ads.zzaaj r57, long r58, com.google.android.gms.internal.ads.zzx r60, boolean r61, boolean r62, com.google.android.gms.internal.ads.zzfnj r63) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r56
            r1 = r57
            r12 = r60
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r15 = 0
        L_0x000c:
            java.util.List r2 = r0.zzc
            int r2 = r2.size()
            if (r15 >= r2) goto L_0x0e43
            java.util.List r2 = r0.zzc
            java.lang.Object r2 = r2.get(r15)
            r11 = r2
            com.google.android.gms.internal.ads.zzafh r11 = (com.google.android.gms.internal.ads.zzafh) r11
            int r2 = r11.zzd
            r3 = 1953653099(0x7472616b, float:7.681346E31)
            if (r2 == r3) goto L_0x0029
            r0 = r13
            r31 = r15
            goto L_0x0e30
        L_0x0029:
            r2 = 1836476516(0x6d766864, float:4.7662196E27)
            com.google.android.gms.internal.ads.zzafi r2 = r0.zzb(r2)
            java.util.Objects.requireNonNull(r2)
            r10 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzafh r3 = r11.zza(r10)
            java.util.Objects.requireNonNull(r3)
            r4 = 1751411826(0x68646c72, float:4.3148E24)
            com.google.android.gms.internal.ads.zzafi r4 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzen r4 = r4.zza
            int r4 = zzg(r4)
            int r9 = zze(r4)
            java.lang.String r6 = "AtomParsers"
            r31 = r15
            r14 = 0
            r5 = -1
            if (r9 != r5) goto L_0x0064
            r0 = r63
            r14 = r6
            r2 = r11
            r32 = r13
            r4 = 2
        L_0x0061:
            r8 = 0
            goto L_0x0842
        L_0x0064:
            r4 = 1953196132(0x746b6864, float:7.46037E31)
            com.google.android.gms.internal.ads.zzafi r4 = r11.zzb(r4)
            java.util.Objects.requireNonNull(r4)
            com.google.android.gms.internal.ads.zzen r4 = r4.zza
            r8 = 8
            r4.zzF(r8)
            int r21 = r4.zze()
            int r21 = com.google.android.gms.internal.ads.zzafj.zze(r21)
            if (r21 != 0) goto L_0x0082
            r10 = 8
            goto L_0x0084
        L_0x0082:
            r10 = 16
        L_0x0084:
            r4.zzG(r10)
            int r10 = r4.zze()
            r8 = 4
            r4.zzG(r8)
            int r25 = r4.zzc()
            r8 = 0
        L_0x0094:
            if (r21 != 0) goto L_0x0098
            r7 = 4
            goto L_0x009a
        L_0x0098:
            r7 = 8
        L_0x009a:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r7) goto L_0x00be
            byte[] r7 = r4.zzH()
            int r30 = r25 + r8
            byte r7 = r7[r30]
            if (r7 == r5) goto L_0x00bb
            if (r21 != 0) goto L_0x00b2
            long r7 = r4.zzs()
            goto L_0x00b6
        L_0x00b2:
            long r7 = r4.zzt()
        L_0x00b6:
            int r21 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r21 != 0) goto L_0x00c3
            goto L_0x00c1
        L_0x00bb:
            int r8 = r8 + 1
            goto L_0x0094
        L_0x00be:
            r4.zzG(r7)
        L_0x00c1:
            r7 = r28
        L_0x00c3:
            r14 = 16
            r4.zzG(r14)
            int r15 = r4.zze()
            int r5 = r4.zze()
            r14 = 4
            r4.zzG(r14)
            int r14 = r4.zze()
            int r4 = r4.zze()
            r0 = 65536(0x10000, float:9.18355E-41)
            r25 = r6
            r6 = -65536(0xffffffffffff0000, float:NaN)
            if (r15 != 0) goto L_0x00f5
            if (r5 != r0) goto L_0x00f4
            if (r14 != r6) goto L_0x00f2
            if (r4 != 0) goto L_0x00ed
            r0 = 90
            goto L_0x0114
        L_0x00ed:
            r5 = 65536(0x10000, float:9.18355E-41)
            r14 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x00f4
        L_0x00f2:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00f4:
            r15 = 0
        L_0x00f5:
            if (r15 != 0) goto L_0x0107
            if (r5 != r6) goto L_0x0104
            if (r14 != r0) goto L_0x0100
            if (r4 != 0) goto L_0x0101
            r0 = 270(0x10e, float:3.78E-43)
            goto L_0x0114
        L_0x0100:
            r0 = r14
        L_0x0101:
            r5 = -65536(0xffffffffffff0000, float:NaN)
            goto L_0x0105
        L_0x0104:
            r0 = r14
        L_0x0105:
            r15 = 0
            goto L_0x0108
        L_0x0107:
            r0 = r14
        L_0x0108:
            if (r15 != r6) goto L_0x0113
            if (r5 != 0) goto L_0x0113
            if (r0 != 0) goto L_0x0113
            if (r4 != r6) goto L_0x0113
            r0 = 180(0xb4, float:2.52E-43)
            goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            com.google.android.gms.internal.ads.zzafq r14 = new com.google.android.gms.internal.ads.zzafq
            r14.<init>(r10, r7, r0)
            int r0 = (r58 > r28 ? 1 : (r58 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0124
            long r4 = r14.zzb
            r32 = r4
            goto L_0x0126
        L_0x0124:
            r32 = r58
        L_0x0126:
            com.google.android.gms.internal.ads.zzen r0 = r2.zza
            r2 = 8
            r0.zzF(r2)
            int r4 = r0.zze()
            int r4 = com.google.android.gms.internal.ads.zzafj.zze(r4)
            if (r4 != 0) goto L_0x013a
            r8 = 8
            goto L_0x013c
        L_0x013a:
            r8 = 16
        L_0x013c:
            r0.zzG(r8)
            long r38 = r0.zzs()
            int r0 = (r32 > r28 ? 1 : (r32 == r28 ? 0 : -1))
            if (r0 != 0) goto L_0x0148
            goto L_0x0153
        L_0x0148:
            r34 = 1000000(0xf4240, double:4.940656E-318)
            r36 = r38
            long r4 = com.google.android.gms.internal.ads.zzew.zzw(r32, r34, r36)
            r28 = r4
        L_0x0153:
            r0 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzafh r2 = r3.zza(r0)
            java.util.Objects.requireNonNull(r2)
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzafh r2 = r2.zza(r8)
            java.util.Objects.requireNonNull(r2)
            r4 = 1835296868(0x6d646864, float:4.418049E27)
            com.google.android.gms.internal.ads.zzafi r3 = r3.zzb(r4)
            java.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.ads.zzen r3 = r3.zza
            android.util.Pair r15 = zzi(r3)
            r3 = 1937011556(0x73747364, float:1.9367383E31)
            com.google.android.gms.internal.ads.zzafi r2 = r2.zzb(r3)
            if (r2 == 0) goto L_0x0e3b
            com.google.android.gms.internal.ads.zzen r10 = r2.zza
            int r7 = r14.zza
            int r6 = r14.zzc
            java.lang.Object r2 = r15.second
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
            r4 = 12
            r10.zzF(r4)
            int r3 = r10.zze()
            com.google.android.gms.internal.ads.zzafn r2 = new com.google.android.gms.internal.ads.zzafn
            r2.<init>(r3)
            r0 = 0
        L_0x019e:
            if (r0 >= r3) goto L_0x07df
            r32 = r13
            int r13 = r10.zzc()
            int r1 = r10.zze()
            if (r1 <= 0) goto L_0x01ae
            r4 = 1
            goto L_0x01af
        L_0x01ae:
            r4 = 0
        L_0x01af:
            java.lang.String r8 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzy.zzb(r4, r8)
            int r4 = r10.zze()
            r8 = 1635148593(0x61766331, float:2.840654E20)
            r24 = r3
            r3 = 1701733238(0x656e6376, float:7.035987E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1635148595(0x61766333, float:2.8406544E20)
            if (r4 == r8) goto L_0x03a9
            if (r4 == r3) goto L_0x03a9
            r8 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 == r8) goto L_0x03a9
            r8 = 1836070006(0x6d703476, float:4.646239E27)
            if (r4 == r8) goto L_0x03a9
            r8 = 1752589105(0x68766331, float:4.6541277E24)
            if (r4 == r8) goto L_0x03a9
            r8 = 1751479857(0x68657631, float:4.3344087E24)
            if (r4 == r8) goto L_0x03a9
            r8 = 1932670515(0x73323633, float:1.4119387E31)
            if (r4 == r8) goto L_0x03a9
            r8 = 1211250227(0x48323633, float:182488.8)
            if (r4 == r8) goto L_0x03a9
            r8 = 1987063864(0x76703038, float:1.21789965E33)
            if (r4 == r8) goto L_0x03a9
            r8 = 1987063865(0x76703039, float:1.2178997E33)
            if (r4 == r8) goto L_0x03a9
            r8 = 1635135537(0x61763031, float:2.8383572E20)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685479798(0x64766176, float:1.8179687E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685479729(0x64766131, float:1.817961E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685481573(0x64766865, float:1.8181686E22)
            if (r4 == r8) goto L_0x03a9
            r8 = 1685481521(0x64766831, float:1.8181627E22)
            if (r4 != r8) goto L_0x020c
            goto L_0x03a9
        L_0x020c:
            r3 = 1836069985(0x6d703461, float:4.6462328E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1701733217(0x656e6361, float:7.0359778E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1633889587(0x61632d33, float:2.6191674E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353315(0x64747363, float:1.803728E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353317(0x64747365, float:1.8037282E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353320(0x64747368, float:1.8037286E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353324(0x6474736c, float:1.803729E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1685353336(0x64747378, float:1.8037304E22)
            if (r4 == r3) goto L_0x036a
            r3 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1935767394(0x73617762, float:1.7863284E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1936684916(0x736f7774, float:1.89725E31)
            if (r4 == r3) goto L_0x036a
            r3 = 1953984371(0x74776f73, float:7.841539E31)
            if (r4 == r3) goto L_0x036a
            r3 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r4 == r3) goto L_0x036a
            r3 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r4 == r3) goto L_0x036a
            r3 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r4 == r3) goto L_0x036a
            r3 = 1634492771(0x616c6163, float:2.7252807E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r4 == r3) goto L_0x036a
            r3 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r4 == r3) goto L_0x036a
            r3 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r4 == r3) goto L_0x036a
            r3 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r4 != r3) goto L_0x028b
            goto L_0x036a
        L_0x028b:
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            if (r4 == r3) goto L_0x02e0
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 == r3) goto L_0x02e0
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 == r3) goto L_0x02e0
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 == r3) goto L_0x02e0
            r3 = 1664495672(0x63363038, float:3.360782E21)
            if (r4 != r3) goto L_0x02a5
            goto L_0x02e0
        L_0x02a5:
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            if (r4 != r3) goto L_0x02b1
            r3 = 1835365492(0x6d657474, float:4.4383032E27)
            zzn(r10, r3, r13, r7, r2)
            goto L_0x02c9
        L_0x02b1:
            r3 = 1667329389(0x63616d6d, float:4.1584024E21)
            if (r4 != r3) goto L_0x02c9
            com.google.android.gms.internal.ads.zzad r3 = new com.google.android.gms.internal.ads.zzad
            r3.<init>()
            r3.zzG(r7)
            java.lang.String r4 = "application/x-camera-motion"
            r3.zzS(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r3.zzY()
            r2.zzb = r3
        L_0x02c9:
            r17 = r0
            r36 = r1
            r3 = r2
            r16 = r5
            r2 = r6
            r1 = r7
            r18 = r9
            r41 = r11
            r42 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            goto L_0x0365
        L_0x02e0:
            int r3 = r13 + 16
            r10.zzF(r3)
            r3 = 1414810956(0x54544d4c, float:3.64731957E12)
            r33 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r4 != r3) goto L_0x02f9
            java.lang.String r3 = "application/ttml+xml"
        L_0x02f1:
            r30 = r6
            r22 = r9
            r8 = r33
            r4 = 0
            goto L_0x0335
        L_0x02f9:
            r3 = 1954034535(0x74783367, float:7.865797E31)
            if (r4 != r3) goto L_0x0318
            int r3 = r1 + -16
            byte[] r4 = new byte[r3]
            r8 = 0
            r10.zzB(r4, r8, r3)
            com.google.android.gms.internal.ads.zzfqk r3 = com.google.android.gms.internal.ads.zzfqk.zzp(r4)
            java.lang.String r4 = "application/x-quicktime-tx3g"
            r30 = r6
            r22 = r9
            r8 = r33
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x0335
        L_0x0318:
            r3 = 2004251764(0x77767474, float:4.998699E33)
            if (r4 != r3) goto L_0x0320
            java.lang.String r3 = "application/x-mp4-vtt"
            goto L_0x02f1
        L_0x0320:
            r3 = 1937010800(0x73747070, float:1.9366469E31)
            if (r4 != r3) goto L_0x032f
            java.lang.String r3 = "application/ttml+xml"
            r30 = r6
            r22 = r9
            r4 = 0
            r8 = 0
            goto L_0x0335
        L_0x032f:
            r8 = 1
            r2.zzd = r8
            java.lang.String r3 = "application/x-mp4-cea-608"
            goto L_0x02f1
        L_0x0335:
            com.google.android.gms.internal.ads.zzad r6 = new com.google.android.gms.internal.ads.zzad
            r6.<init>()
            r6.zzG(r7)
            r6.zzS(r3)
            r6.zzK(r5)
            r6.zzW(r8)
            r6.zzI(r4)
            com.google.android.gms.internal.ads.zzaf r3 = r6.zzY()
            r2.zzb = r3
            r17 = r0
            r36 = r1
            r3 = r2
            r16 = r5
            r1 = r7
            r41 = r11
            r42 = r13
            r21 = r14
            r19 = r15
            r18 = r22
            r14 = r25
            r2 = r30
        L_0x0365:
            r4 = 2
            r5 = -1
            r15 = r10
            goto L_0x07b9
        L_0x036a:
            r30 = r6
            r22 = r9
            r9 = r2
            r2 = r10
            r3 = r4
            r6 = 12
            r8 = 2
            r4 = r13
            r16 = r5
            r6 = -1
            r5 = r1
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r30
            r6 = r7
            r40 = r7
            r15 = 16
            r7 = r16
            r8 = r62
            r17 = r9
            r18 = r22
            r9 = r60
            r15 = r10
            r10 = r17
            r41 = r11
            r11 = r0
            zzm(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r36 = r1
            r42 = r13
            r3 = r17
            r2 = r30
            r1 = r40
            r4 = 2
            r5 = -1
            r17 = r0
            goto L_0x07b9
        L_0x03a9:
            r17 = r2
            r16 = r5
            r30 = r6
            r40 = r7
            r18 = r9
            r41 = r11
            r21 = r14
            r19 = r15
            r14 = r25
            r15 = r10
            int r2 = r13 + 16
            r15.zzF(r2)
            r2 = 16
            r15.zzG(r2)
            int r5 = r15.zzo()
            int r6 = r15.zzo()
            r7 = 50
            r15.zzG(r7)
            int r7 = r15.zzc()
            if (r4 != r3) goto L_0x040d
            android.util.Pair r4 = zzj(r15, r13, r1)
            if (r4 == 0) goto L_0x0403
            java.lang.Object r3 = r4.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r12 != 0) goto L_0x03ed
            r9 = r17
            r8 = 0
            goto L_0x03f9
        L_0x03ed:
            java.lang.Object r8 = r4.second
            com.google.android.gms.internal.ads.zzagh r8 = (com.google.android.gms.internal.ads.zzagh) r8
            java.lang.String r8 = r8.zzb
            com.google.android.gms.internal.ads.zzx r8 = r12.zzb(r8)
            r9 = r17
        L_0x03f9:
            com.google.android.gms.internal.ads.zzagh[] r10 = r9.zza
            java.lang.Object r4 = r4.second
            com.google.android.gms.internal.ads.zzagh r4 = (com.google.android.gms.internal.ads.zzagh) r4
            r10[r0] = r4
            r4 = r3
            goto L_0x0409
        L_0x0403:
            r9 = r17
            r8 = r12
            r4 = 1701733238(0x656e6376, float:7.035987E22)
        L_0x0409:
            r15.zzF(r7)
            goto L_0x0410
        L_0x040d:
            r9 = r17
            r8 = r12
        L_0x0410:
            r3 = 1831958048(0x6d317620, float:3.4326032E27)
            if (r4 != r3) goto L_0x041d
            java.lang.String r3 = "video/mpeg"
            r54 = r4
            r4 = r3
            r3 = r54
            goto L_0x0427
        L_0x041d:
            r3 = 1211250227(0x48323633, float:182488.8)
            if (r4 != r3) goto L_0x0425
            java.lang.String r4 = "video/3gpp"
            goto L_0x0427
        L_0x0425:
            r3 = r4
            r4 = 0
        L_0x0427:
            r10 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            r0 = r7
            r34 = r8
            r2 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r10 = -1
            r11 = 0
            r20 = -1
            r22 = -1
            r23 = -1
            r25 = 0
            r26 = 0
            r35 = 0
            r7 = r4
            r4 = 0
        L_0x0441:
            int r12 = r0 - r13
            if (r12 >= r1) goto L_0x0721
            r15.zzF(r0)
            int r12 = r15.zzc()
            int r36 = r15.zze()
            if (r36 != 0) goto L_0x046a
            int r36 = r15.zzc()
            r37 = r10
            int r10 = r36 - r13
            if (r10 != r1) goto L_0x0468
            r36 = r1
            r53 = r5
            r48 = r6
            r47 = r8
            r46 = r9
            goto L_0x072d
        L_0x0468:
            r10 = 0
            goto L_0x046e
        L_0x046a:
            r37 = r10
            r10 = r36
        L_0x046e:
            if (r10 <= 0) goto L_0x0476
            r36 = r1
            r42 = r13
            r1 = 1
            goto L_0x047b
        L_0x0476:
            r36 = r1
            r42 = r13
            r1 = 0
        L_0x047b:
            java.lang.String r13 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r13)
            int r1 = r15.zze()
            r13 = 1635148611(0x61766343, float:2.8406573E20)
            r43 = r11
            if (r1 != r13) goto L_0x04bc
            if (r7 != 0) goto L_0x048f
            r1 = 1
            goto L_0x0490
        L_0x048f:
            r1 = 0
        L_0x0490:
            r13 = 0
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r13)
            int r12 = r12 + 8
            r15.zzF(r12)
            com.google.android.gms.internal.ads.zzyz r1 = com.google.android.gms.internal.ads.zzyz.zza(r15)
            java.util.List r2 = r1.zza
            int r7 = r1.zzb
            r9.zzc = r7
            if (r4 != 0) goto L_0x04a7
            float r8 = r1.zze
        L_0x04a7:
            java.lang.String r1 = r1.zzf
            java.lang.String r7 = "video/avc"
        L_0x04ab:
            r35 = r2
            r44 = r3
            r45 = r4
            r53 = r5
            r48 = r6
            r46 = r9
            r11 = r43
            r4 = 2
            goto L_0x0708
        L_0x04bc:
            r13 = 0
            r11 = 1752589123(0x68766343, float:4.6541328E24)
            if (r1 != r11) goto L_0x04e2
            if (r7 != 0) goto L_0x04c6
            r1 = 1
            goto L_0x04c7
        L_0x04c6:
            r1 = 0
        L_0x04c7:
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r13)
            int r12 = r12 + 8
            r15.zzF(r12)
            com.google.android.gms.internal.ads.zzaak r1 = com.google.android.gms.internal.ads.zzaak.zza(r15)
            java.util.List r2 = r1.zza
            int r7 = r1.zzb
            r9.zzc = r7
            if (r4 != 0) goto L_0x04dd
            float r8 = r1.zzc
        L_0x04dd:
            java.lang.String r1 = r1.zzd
            java.lang.String r7 = "video/hevc"
            goto L_0x04ab
        L_0x04e2:
            r11 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 == r11) goto L_0x06ec
            r11 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 != r11) goto L_0x04ee
            goto L_0x06ec
        L_0x04ee:
            r11 = 1987076931(0x76706343, float:1.21891066E33)
            if (r1 != r11) goto L_0x0506
            if (r7 != 0) goto L_0x04f7
            r1 = 1
            goto L_0x04f8
        L_0x04f7:
            r1 = 0
        L_0x04f8:
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r13)
            r1 = 1987063864(0x76703038, float:1.21789965E33)
            if (r3 != r1) goto L_0x0503
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x0515
        L_0x0503:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x0515
        L_0x0506:
            r11 = 1635135811(0x61763143, float:2.8384055E20)
            if (r1 != r11) goto L_0x0517
            if (r7 != 0) goto L_0x050f
            r1 = 1
            goto L_0x0510
        L_0x050f:
            r1 = 0
        L_0x0510:
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r13)
            java.lang.String r1 = "video/av01"
        L_0x0515:
            r7 = r1
            goto L_0x0539
        L_0x0517:
            r11 = 1668050025(0x636c6c69, float:4.3612434E21)
            if (r1 != r11) goto L_0x0548
            if (r25 != 0) goto L_0x0522
            java.nio.ByteBuffer r25 = zzl()
        L_0x0522:
            r1 = r25
            r11 = 21
            r1.position(r11)
            short r11 = r15.zzy()
            r1.putShort(r11)
            short r11 = r15.zzy()
            r1.putShort(r11)
            r25 = r1
        L_0x0539:
            r44 = r3
            r45 = r4
            r53 = r5
            r48 = r6
            r46 = r9
            r11 = r43
        L_0x0545:
            r4 = 2
            goto L_0x070e
        L_0x0548:
            r11 = 1835295606(0x6d646376, float:4.4176764E27)
            if (r1 != r11) goto L_0x05be
            if (r25 != 0) goto L_0x0553
            java.nio.ByteBuffer r25 = zzl()
        L_0x0553:
            r1 = r25
            short r11 = r15.zzy()
            short r12 = r15.zzy()
            short r13 = r15.zzy()
            r44 = r3
            short r3 = r15.zzy()
            r45 = r4
            short r4 = r15.zzy()
            r46 = r9
            short r9 = r15.zzy()
            r47 = r8
            short r8 = r15.zzy()
            r48 = r6
            short r6 = r15.zzy()
            long r49 = r15.zzs()
            long r51 = r15.zzs()
            r53 = r5
            r5 = 1
            r1.position(r5)
            r1.putShort(r4)
            r1.putShort(r9)
            r1.putShort(r11)
            r1.putShort(r12)
            r1.putShort(r13)
            r1.putShort(r3)
            r1.putShort(r8)
            r1.putShort(r6)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r49 / r3
            int r4 = (int) r3
            short r3 = (short) r4
            r1.putShort(r3)
            r3 = 10000(0x2710, double:4.9407E-320)
            long r3 = r51 / r3
            int r4 = (int) r3
            short r3 = (short) r4
            r1.putShort(r3)
            r25 = r1
        L_0x05b9:
            r11 = r43
        L_0x05bb:
            r8 = r47
            goto L_0x0545
        L_0x05be:
            r44 = r3
            r45 = r4
            r53 = r5
            r48 = r6
            r47 = r8
            r46 = r9
            r3 = 1681012275(0x64323633, float:1.3149704E22)
            if (r1 != r3) goto L_0x05dc
            if (r7 != 0) goto L_0x05d3
            r1 = 1
            goto L_0x05d4
        L_0x05d3:
            r1 = 0
        L_0x05d4:
            r3 = 0
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r3)
            java.lang.String r1 = "video/3gpp"
            r7 = r1
            goto L_0x05b9
        L_0x05dc:
            r3 = 0
            r4 = 1702061171(0x65736473, float:7.183675E22)
            if (r1 != r4) goto L_0x0606
            if (r7 != 0) goto L_0x05e6
            r1 = 1
            goto L_0x05e7
        L_0x05e6:
            r1 = 0
        L_0x05e7:
            com.google.android.gms.internal.ads.zzzy.zzb(r1, r3)
            com.google.android.gms.internal.ads.zzafl r1 = zzk(r15, r12)
            java.lang.String r3 = r1.zza
            byte[] r4 = r1.zzb
            if (r4 == 0) goto L_0x0602
            com.google.android.gms.internal.ads.zzfqk r4 = com.google.android.gms.internal.ads.zzfqk.zzp(r4)
            r26 = r1
            r7 = r3
            r35 = r4
            goto L_0x05b9
        L_0x0602:
            r26 = r1
            r7 = r3
            goto L_0x05b9
        L_0x0606:
            r3 = 1885434736(0x70617370, float:2.7909473E29)
            if (r1 != r3) goto L_0x0623
            int r12 = r12 + 8
            r15.zzF(r12)
            int r1 = r15.zzn()
            int r3 = r15.zzn()
            float r1 = (float) r1
            float r3 = (float) r3
            float r1 = r1 / r3
            r8 = r1
            r11 = r43
            r4 = 2
            r45 = 1
            goto L_0x070e
        L_0x0623:
            r3 = 1937126244(0x73763364, float:1.9506033E31)
            if (r1 != r3) goto L_0x0652
            int r1 = r12 + 8
        L_0x062a:
            int r3 = r1 - r12
            if (r3 >= r10) goto L_0x064c
            r15.zzF(r1)
            int r3 = r15.zze()
            int r4 = r15.zze()
            r5 = 1886547818(0x70726f6a, float:3.0012025E29)
            if (r4 != r5) goto L_0x064a
            byte[] r4 = r15.zzH()
            int r3 = r3 + r1
            byte[] r1 = java.util.Arrays.copyOfRange(r4, r1, r3)
            r11 = r1
            goto L_0x05bb
        L_0x064a:
            int r1 = r1 + r3
            goto L_0x062a
        L_0x064c:
            r8 = r47
            r4 = 2
            r11 = 0
            goto L_0x070e
        L_0x0652:
            r3 = 1936995172(0x73743364, float:1.9347576E31)
            if (r1 != r3) goto L_0x0696
            int r1 = r15.zzk()
            r3 = 3
            r15.zzG(r3)
            if (r1 != 0) goto L_0x0693
            int r1 = r15.zzk()
            if (r1 == 0) goto L_0x068a
            r4 = 1
            if (r1 == r4) goto L_0x0681
            r4 = 2
            if (r1 == r4) goto L_0x0679
            if (r1 == r3) goto L_0x0671
            goto L_0x070a
        L_0x0671:
            r11 = r43
            r8 = r47
            r37 = 3
            goto L_0x070e
        L_0x0679:
            r11 = r43
            r8 = r47
            r37 = 2
            goto L_0x070e
        L_0x0681:
            r4 = 2
            r11 = r43
            r8 = r47
            r37 = 1
            goto L_0x070e
        L_0x068a:
            r4 = 2
            r11 = r43
            r8 = r47
            r37 = 0
            goto L_0x070e
        L_0x0693:
            r4 = 2
            goto L_0x070a
        L_0x0696:
            r4 = 2
            r3 = 1668246642(0x636f6c72, float:4.4165861E21)
            if (r1 != r3) goto L_0x070a
            int r1 = r15.zze()
            r3 = 1852009592(0x6e636c78, float:1.7596057E28)
            if (r1 == r3) goto L_0x06b9
            r3 = 1852009571(0x6e636c63, float:1.7596032E28)
            if (r1 != r3) goto L_0x06ab
            goto L_0x06b9
        L_0x06ab:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzafj.zzf(r1)
            java.lang.String r3 = "Unsupported color type: "
            java.lang.String r1 = r3.concat(r1)
            com.google.android.gms.internal.ads.zzee.zze(r14, r1)
            goto L_0x070a
        L_0x06b9:
            int r1 = r15.zzo()
            int r3 = r15.zzo()
            r15.zzG(r4)
            r5 = 19
            if (r10 != r5) goto L_0x06d6
            int r6 = r15.zzk()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x06d2
            r5 = 1
            goto L_0x06d3
        L_0x06d2:
            r5 = 0
        L_0x06d3:
            r10 = 19
            goto L_0x06d7
        L_0x06d6:
            r5 = 0
        L_0x06d7:
            int r1 = com.google.android.gms.internal.ads.zzq.zza(r1)
            r6 = 1
            if (r6 == r5) goto L_0x06e0
            r5 = 2
            goto L_0x06e1
        L_0x06e0:
            r5 = 1
        L_0x06e1:
            int r3 = com.google.android.gms.internal.ads.zzq.zzb(r3)
            r23 = r1
            r20 = r3
            r22 = r5
            goto L_0x070a
        L_0x06ec:
            r44 = r3
            r45 = r4
            r53 = r5
            r48 = r6
            r47 = r8
            r46 = r9
            r4 = 2
            com.google.android.gms.internal.ads.zzzq r1 = com.google.android.gms.internal.ads.zzzq.zza(r15)
            if (r1 == 0) goto L_0x070a
            java.lang.String r1 = r1.zza
            java.lang.String r2 = "video/dolby-vision"
            r7 = r2
            r11 = r43
            r8 = r47
        L_0x0708:
            r2 = r1
            goto L_0x070e
        L_0x070a:
            r11 = r43
            r8 = r47
        L_0x070e:
            int r0 = r0 + r10
            r1 = r36
            r10 = r37
            r13 = r42
            r3 = r44
            r4 = r45
            r9 = r46
            r6 = r48
            r5 = r53
            goto L_0x0441
        L_0x0721:
            r36 = r1
            r53 = r5
            r48 = r6
            r47 = r8
            r46 = r9
            r37 = r10
        L_0x072d:
            r43 = r11
            r42 = r13
            r4 = 2
            if (r7 != 0) goto L_0x073d
            r2 = r30
            r1 = r40
            r3 = r46
            r5 = -1
            goto L_0x07b9
        L_0x073d:
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r1 = r40
            r0.zzG(r1)
            r0.zzS(r7)
            r0.zzx(r2)
            r2 = r53
            r0.zzX(r2)
            r2 = r48
            r0.zzF(r2)
            r8 = r47
            r0.zzP(r8)
            r2 = r30
            r0.zzR(r2)
            r11 = r43
            r0.zzQ(r11)
            r3 = r37
            r0.zzV(r3)
            r3 = r35
            r0.zzI(r3)
            r8 = r34
            r0.zzB(r8)
            r3 = r23
            r5 = -1
            if (r3 != r5) goto L_0x0785
            r6 = r22
            r7 = r20
            if (r6 != r5) goto L_0x0789
            if (r7 != r5) goto L_0x0789
            if (r25 == 0) goto L_0x0799
            goto L_0x0789
        L_0x0785:
            r7 = r20
            r6 = r22
        L_0x0789:
            com.google.android.gms.internal.ads.zzq r8 = new com.google.android.gms.internal.ads.zzq
            if (r25 == 0) goto L_0x0792
            byte[] r9 = r25.array()
            goto L_0x0793
        L_0x0792:
            r9 = 0
        L_0x0793:
            r8.<init>(r3, r6, r7, r9)
            r0.zzy(r8)
        L_0x0799:
            if (r26 == 0) goto L_0x07b1
            long r6 = r26.zzc
            int r3 = com.google.android.gms.internal.ads.zzfsr.zzc(r6)
            r0.zzv(r3)
            long r6 = r26.zzd
            int r3 = com.google.android.gms.internal.ads.zzfsr.zzc(r6)
            r0.zzO(r3)
        L_0x07b1:
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzY()
            r3 = r46
            r3.zzb = r0
        L_0x07b9:
            int r13 = r42 + r36
            r15.zzF(r13)
            int r0 = r17 + 1
            r12 = r60
            r7 = r1
            r6 = r2
            r2 = r3
            r25 = r14
            r10 = r15
            r5 = r16
            r9 = r18
            r15 = r19
            r14 = r21
            r3 = r24
            r13 = r32
            r11 = r41
            r4 = 12
            r8 = 1937007212(0x7374626c, float:1.9362132E31)
            r1 = r57
            goto L_0x019e
        L_0x07df:
            r3 = r2
            r18 = r9
            r41 = r11
            r32 = r13
            r21 = r14
            r19 = r15
            r14 = r25
            r4 = 2
            r5 = -1
            r0 = 1701082227(0x65647473, float:6.742798E22)
            r2 = r41
            com.google.android.gms.internal.ads.zzafh r0 = r2.zza(r0)
            if (r0 == 0) goto L_0x080a
            android.util.Pair r0 = zzh(r0)
            if (r0 == 0) goto L_0x080a
            java.lang.Object r1 = r0.first
            long[] r1 = (long[]) r1
            java.lang.Object r0 = r0.second
            long[] r0 = (long[]) r0
            r30 = r0
            goto L_0x080d
        L_0x080a:
            r1 = 0
            r30 = 0
        L_0x080d:
            com.google.android.gms.internal.ads.zzaf r0 = r3.zzb
            if (r0 != 0) goto L_0x0815
            r0 = r63
            goto L_0x0061
        L_0x0815:
            com.google.android.gms.internal.ads.zzagg r8 = new com.google.android.gms.internal.ads.zzagg
            int r17 = r21.zza
            r0 = r19
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r19 = r0.longValue()
            com.google.android.gms.internal.ads.zzaf r0 = r3.zzb
            int r6 = r3.zzd
            com.google.android.gms.internal.ads.zzagh[] r7 = r3.zza
            int r3 = r3.zzc
            r16 = r8
            r21 = r38
            r23 = r28
            r25 = r0
            r26 = r6
            r27 = r7
            r28 = r3
            r29 = r1
            r16.<init>(r17, r18, r19, r21, r23, r25, r26, r27, r28, r29, r30)
            r0 = r63
        L_0x0842:
            java.lang.Object r1 = r0.apply(r8)
            com.google.android.gms.internal.ads.zzagg r1 = (com.google.android.gms.internal.ads.zzagg) r1
            if (r1 == 0) goto L_0x0e2e
            r3 = 1835297121(0x6d646961, float:4.4181236E27)
            com.google.android.gms.internal.ads.zzafh r2 = r2.zza(r3)
            java.util.Objects.requireNonNull(r2)
            r3 = 1835626086(0x6d696e66, float:4.515217E27)
            com.google.android.gms.internal.ads.zzafh r2 = r2.zza(r3)
            java.util.Objects.requireNonNull(r2)
            r3 = 1937007212(0x7374626c, float:1.9362132E31)
            com.google.android.gms.internal.ads.zzafh r2 = r2.zza(r3)
            java.util.Objects.requireNonNull(r2)
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            com.google.android.gms.internal.ads.zzafi r3 = r2.zzb(r3)
            if (r3 == 0) goto L_0x0879
            com.google.android.gms.internal.ads.zzafo r6 = new com.google.android.gms.internal.ads.zzafo
            com.google.android.gms.internal.ads.zzaf r7 = r1.zzf
            r6.<init>(r3, r7)
            goto L_0x0887
        L_0x0879:
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            com.google.android.gms.internal.ads.zzafi r3 = r2.zzb(r3)
            if (r3 == 0) goto L_0x0e26
            com.google.android.gms.internal.ads.zzafp r6 = new com.google.android.gms.internal.ads.zzafp
            r6.<init>(r3)
        L_0x0887:
            int r3 = r6.zzb()
            if (r3 != 0) goto L_0x08ae
            com.google.android.gms.internal.ads.zzagj r2 = new com.google.android.gms.internal.ads.zzagj
            r3 = 0
            long[] r4 = new long[r3]
            int[] r5 = new int[r3]
            r19 = 0
            long[] r6 = new long[r3]
            int[] r7 = new int[r3]
            r22 = 0
            r15 = r2
            r16 = r1
            r17 = r4
            r18 = r5
            r20 = r6
            r21 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x08aa:
            r0 = r32
            goto L_0x0e22
        L_0x08ae:
            r7 = 1937007471(0x7374636f, float:1.9362445E31)
            com.google.android.gms.internal.ads.zzafi r7 = r2.zzb(r7)
            if (r7 != 0) goto L_0x08c4
            r7 = 1668232756(0x636f3634, float:4.4126776E21)
            com.google.android.gms.internal.ads.zzafi r7 = r2.zzb(r7)
            java.util.Objects.requireNonNull(r7)
            r8 = r7
            r7 = 1
            goto L_0x08c6
        L_0x08c4:
            r8 = r7
            r7 = 0
        L_0x08c6:
            com.google.android.gms.internal.ads.zzen r8 = r8.zza
            r9 = 1937011555(0x73747363, float:1.9367382E31)
            com.google.android.gms.internal.ads.zzafi r9 = r2.zzb(r9)
            java.util.Objects.requireNonNull(r9)
            com.google.android.gms.internal.ads.zzen r9 = r9.zza
            r10 = 1937011827(0x73747473, float:1.9367711E31)
            com.google.android.gms.internal.ads.zzafi r10 = r2.zzb(r10)
            java.util.Objects.requireNonNull(r10)
            com.google.android.gms.internal.ads.zzen r10 = r10.zza
            r11 = 1937011571(0x73747373, float:1.9367401E31)
            com.google.android.gms.internal.ads.zzafi r11 = r2.zzb(r11)
            if (r11 == 0) goto L_0x08ec
            com.google.android.gms.internal.ads.zzen r11 = r11.zza
            goto L_0x08ed
        L_0x08ec:
            r11 = 0
        L_0x08ed:
            r12 = 1668576371(0x63747473, float:4.5093966E21)
            com.google.android.gms.internal.ads.zzafi r2 = r2.zzb(r12)
            if (r2 == 0) goto L_0x08f9
            com.google.android.gms.internal.ads.zzen r2 = r2.zza
            goto L_0x08fa
        L_0x08f9:
            r2 = 0
        L_0x08fa:
            com.google.android.gms.internal.ads.zzafk r12 = new com.google.android.gms.internal.ads.zzafk
            r12.<init>(r9, r8, r7)
            r7 = 12
            r10.zzF(r7)
            int r8 = r10.zzn()
            int r8 = r8 + r5
            int r9 = r10.zzn()
            int r13 = r10.zzn()
            if (r2 == 0) goto L_0x091b
            r2.zzF(r7)
            int r15 = r2.zzn()
            goto L_0x091c
        L_0x091b:
            r15 = 0
        L_0x091c:
            if (r11 == 0) goto L_0x0930
            r11.zzF(r7)
            int r7 = r11.zzn()
            if (r7 <= 0) goto L_0x092e
            int r16 = r11.zzn()
            int r16 = r16 + -1
            goto L_0x0933
        L_0x092e:
            r11 = 0
            goto L_0x0931
        L_0x0930:
            r7 = 0
        L_0x0931:
            r16 = -1
        L_0x0933:
            int r4 = r6.zza()
            com.google.android.gms.internal.ads.zzaf r0 = r1.zzf
            java.lang.String r0 = r0.zzm
            if (r4 == r5) goto L_0x09e2
            java.lang.String r5 = "audio/raw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0955
            java.lang.String r5 = "audio/g711-mlaw"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0955
            java.lang.String r5 = "audio/g711-alaw"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x09e2
        L_0x0955:
            if (r8 != 0) goto L_0x09e2
            if (r15 != 0) goto L_0x09e1
            if (r7 != 0) goto L_0x09e1
            int r0 = r12.zza
            long[] r2 = new long[r0]
            int[] r5 = new int[r0]
        L_0x0961:
            boolean r6 = r12.zza()
            if (r6 == 0) goto L_0x0972
            int r6 = r12.zzb
            long r7 = r12.zzd
            r2[r6] = r7
            int r7 = r12.zzc
            r5[r6] = r7
            goto L_0x0961
        L_0x0972:
            long r6 = (long) r13
            r8 = 8192(0x2000, float:1.14794E-41)
            int r8 = r8 / r4
            r9 = 0
            r10 = 0
        L_0x0978:
            if (r9 >= r0) goto L_0x0984
            r11 = r5[r9]
            int r11 = com.google.android.gms.internal.ads.zzew.zze(r11, r8)
            int r10 = r10 + r11
            int r9 = r9 + 1
            goto L_0x0978
        L_0x0984:
            long[] r9 = new long[r10]
            int[] r11 = new int[r10]
            long[] r12 = new long[r10]
            int[] r10 = new int[r10]
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0991:
            if (r13 >= r0) goto L_0x09d7
            r17 = r5[r13]
            r20 = r2[r13]
            r54 = r17
            r17 = r0
            r0 = r54
        L_0x099d:
            if (r0 <= 0) goto L_0x09cb
            int r18 = java.lang.Math.min(r8, r0)
            r9[r16] = r20
            r22 = r2
            int r2 = r4 * r18
            r11[r16] = r2
            int r15 = java.lang.Math.max(r15, r2)
            r23 = r4
            r2 = r5
            long r4 = (long) r14
            long r4 = r4 * r6
            r12[r16] = r4
            r4 = 1
            r10[r16] = r4
            r4 = r11[r16]
            long r4 = (long) r4
            long r20 = r20 + r4
            int r14 = r14 + r18
            int r0 = r0 - r18
            int r16 = r16 + 1
            r5 = r2
            r2 = r22
            r4 = r23
            goto L_0x099d
        L_0x09cb:
            r22 = r2
            r23 = r4
            r2 = r5
            int r13 = r13 + 1
            r0 = r17
            r2 = r22
            goto L_0x0991
        L_0x09d7:
            long r4 = (long) r14
            long r6 = r6 * r4
            r13 = r1
            r0 = r6
            r2 = r9
            r14 = r12
            r12 = r15
            goto L_0x0b96
        L_0x09e1:
            r8 = 0
        L_0x09e2:
            long[] r0 = new long[r3]
            int[] r4 = new int[r3]
            long[] r5 = new long[r3]
            r17 = r7
            int[] r7 = new int[r3]
            r22 = r1
            r1 = r13
            r23 = r15
            r13 = r16
            r18 = 0
            r20 = 0
            r24 = 0
            r25 = 0
            r27 = 0
            r16 = r8
            r15 = r9
            r8 = 0
            r9 = 0
        L_0x0a02:
            if (r8 >= r3) goto L_0x0acb
            r29 = r25
            r25 = 1
        L_0x0a08:
            if (r18 != 0) goto L_0x0a2d
            boolean r25 = r12.zza()
            if (r25 == 0) goto L_0x0a25
            r26 = r10
            r34 = r11
            long r10 = r12.zzd
            r35 = r3
            int r3 = r12.zzc
            r18 = r3
            r29 = r10
            r10 = r26
            r11 = r34
            r3 = r35
            goto L_0x0a08
        L_0x0a25:
            r35 = r3
            r26 = r10
            r34 = r11
            r3 = 0
            goto L_0x0a35
        L_0x0a2d:
            r35 = r3
            r26 = r10
            r34 = r11
            r3 = r18
        L_0x0a35:
            if (r25 != 0) goto L_0x0a4f
            java.lang.String r1 = "Unexpected end of chunk data"
            com.google.android.gms.internal.ads.zzee.zze(r14, r1)
            long[] r0 = java.util.Arrays.copyOf(r0, r8)
            int[] r4 = java.util.Arrays.copyOf(r4, r8)
            long[] r5 = java.util.Arrays.copyOf(r5, r8)
            int[] r7 = java.util.Arrays.copyOf(r7, r8)
            r3 = r8
            goto L_0x0acd
        L_0x0a4f:
            if (r2 != 0) goto L_0x0a54
        L_0x0a51:
            r10 = r24
            goto L_0x0a6b
        L_0x0a54:
            if (r20 != 0) goto L_0x0a67
            if (r23 <= 0) goto L_0x0a63
            int r23 = r23 + -1
            int r20 = r2.zzn()
            int r24 = r2.zze()
            goto L_0x0a54
        L_0x0a63:
            r10 = -1
            r20 = 0
            goto L_0x0a68
        L_0x0a67:
            r10 = -1
        L_0x0a68:
            int r20 = r20 + -1
            goto L_0x0a51
        L_0x0a6b:
            r0[r8] = r29
            int r11 = r6.zzc()
            r4[r8] = r11
            if (r11 <= r9) goto L_0x0a76
            r9 = r11
        L_0x0a76:
            r25 = r12
            long r11 = (long) r10
            long r11 = r27 + r11
            r5[r8] = r11
            if (r34 != 0) goto L_0x0a81
            r11 = 1
            goto L_0x0a82
        L_0x0a81:
            r11 = 0
        L_0x0a82:
            r7[r8] = r11
            if (r8 != r13) goto L_0x0a97
            r11 = 1
            r7[r8] = r11
            int r17 = r17 + -1
            if (r17 <= 0) goto L_0x0a97
            java.util.Objects.requireNonNull(r34)
            int r11 = r34.zzn()
            r12 = -1
            int r11 = r11 + r12
            r13 = r11
        L_0x0a97:
            long r11 = (long) r1
            long r27 = r27 + r11
            int r11 = r15 + -1
            if (r11 != 0) goto L_0x0aaf
            if (r16 <= 0) goto L_0x0aad
            int r1 = r26.zzn()
            int r11 = r26.zze()
            int r16 = r16 + -1
            r15 = r1
            r1 = r11
            goto L_0x0ab0
        L_0x0aad:
            r15 = 0
            goto L_0x0ab0
        L_0x0aaf:
            r15 = r11
        L_0x0ab0:
            r11 = r4[r8]
            long r11 = (long) r11
            long r11 = r29 + r11
            r21 = -1
            int r18 = r3 + -1
            int r8 = r8 + 1
            r24 = r10
            r10 = r26
            r3 = r35
            r54 = r11
            r12 = r25
            r25 = r54
            r11 = r34
            goto L_0x0a02
        L_0x0acb:
            r35 = r3
        L_0x0acd:
            r10 = r24
            long r10 = (long) r10
            long r10 = r27 + r10
            if (r2 == 0) goto L_0x0ae4
        L_0x0ad4:
            if (r23 <= 0) goto L_0x0ae4
            int r1 = r2.zzn()
            if (r1 == 0) goto L_0x0ade
            r1 = 0
            goto L_0x0ae5
        L_0x0ade:
            r2.zze()
            int r23 = r23 + -1
            goto L_0x0ad4
        L_0x0ae4:
            r1 = 1
        L_0x0ae5:
            if (r17 != 0) goto L_0x0b32
            if (r15 != 0) goto L_0x0b27
            if (r18 != 0) goto L_0x0b1b
            if (r16 != 0) goto L_0x0b11
            if (r20 != 0) goto L_0x0b05
            if (r1 != 0) goto L_0x0afb
            r16 = r0
            r13 = r22
            r1 = 0
            r2 = 0
            r6 = 0
            r8 = 0
            r12 = 0
            goto L_0x0b0f
        L_0x0afb:
            r16 = r0
            r17 = r3
            r18 = r4
            r13 = r22
            goto L_0x0b8c
        L_0x0b05:
            r16 = r0
            r12 = r1
            r8 = r20
            r13 = r22
            r1 = 0
            r2 = 0
            r6 = 0
        L_0x0b0f:
            r15 = 0
            goto L_0x0b3f
        L_0x0b11:
            r12 = r1
            r6 = r16
            r8 = r20
            r13 = r22
            r1 = 0
            r2 = 0
            goto L_0x0b25
        L_0x0b1b:
            r12 = r1
            r6 = r16
            r2 = r18
            r8 = r20
            r13 = r22
            r1 = 0
        L_0x0b25:
            r15 = 0
            goto L_0x0b3d
        L_0x0b27:
            r12 = r1
            r6 = r16
            r2 = r18
            r8 = r20
            r13 = r22
            r1 = 0
            goto L_0x0b3d
        L_0x0b32:
            r12 = r1
            r6 = r16
            r1 = r17
            r2 = r18
            r8 = r20
            r13 = r22
        L_0x0b3d:
            r16 = r0
        L_0x0b3f:
            int r0 = r13.zza
            r17 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r18 = r4
            java.lang.String r4 = "Inconsistent stbl box for track "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ": remainingSynchronizationSamples "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = ", remainingSamplesAtTimestampDelta "
            r3.append(r0)
            r3.append(r15)
            java.lang.String r0 = ", remainingSamplesInChunk "
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", remainingTimestampDeltaChanges "
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = ", remainingSamplesAtTimestampOffset "
            r3.append(r0)
            r3.append(r8)
            r0 = 1
            if (r0 == r12) goto L_0x0b80
            java.lang.String r0 = ", ctts invalid"
            goto L_0x0b82
        L_0x0b80:
            java.lang.String r0 = ""
        L_0x0b82:
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.google.android.gms.internal.ads.zzee.zze(r14, r0)
        L_0x0b8c:
            r14 = r5
            r12 = r9
            r0 = r10
            r2 = r16
            r3 = r17
            r11 = r18
            r10 = r7
        L_0x0b96:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r13.zzc
            r4 = r0
            long r22 = com.google.android.gms.internal.ads.zzew.zzw(r4, r6, r8)
            long[] r4 = r13.zzh
            if (r4 != 0) goto L_0x0bc1
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r13.zzc
            com.google.android.gms.internal.ads.zzew.zzS(r14, r0, r3)
            com.google.android.gms.internal.ads.zzagj r0 = new com.google.android.gms.internal.ads.zzagj
            r15 = r0
            r16 = r13
            r17 = r2
            r18 = r11
            r19 = r12
            r20 = r14
            r21 = r10
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
        L_0x0bbe:
            r2 = r0
            goto L_0x08aa
        L_0x0bc1:
            int r5 = r4.length
            r6 = 1
            if (r5 != r6) goto L_0x0c64
            int r5 = r13.zzb
            if (r5 != r6) goto L_0x0c64
            int r5 = r14.length
            r6 = 2
            if (r5 < r6) goto L_0x0c64
            long[] r5 = r13.zzi
            java.util.Objects.requireNonNull(r5)
            r6 = 0
            r15 = r5[r6]
            r17 = r4[r6]
            long r4 = r13.zzc
            long r6 = r13.zzd
            r19 = r4
            r21 = r6
            long r4 = com.google.android.gms.internal.ads.zzew.zzw(r17, r19, r21)
            long r17 = r15 + r4
            r4 = r14
            r5 = r0
            r7 = r15
            r21 = r10
            r9 = r17
            boolean r4 = zzo(r4, r5, r7, r9)
            if (r4 == 0) goto L_0x0c61
            long r5 = r0 - r17
            r4 = 0
            r7 = r14[r4]
            long r22 = r15 - r7
            com.google.android.gms.internal.ads.zzaf r4 = r13.zzf
            int r4 = r4.zzA
            long r7 = (long) r4
            long r9 = r13.zzc
            r24 = r7
            r26 = r9
            long r15 = com.google.android.gms.internal.ads.zzew.zzw(r22, r24, r26)
            com.google.android.gms.internal.ads.zzaf r4 = r13.zzf
            int r4 = r4.zzA
            long r7 = (long) r4
            long r9 = r13.zzc
            long r4 = com.google.android.gms.internal.ads.zzew.zzw(r5, r7, r9)
            r6 = 0
            int r8 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0c20
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0c61
            r6 = 0
            goto L_0x0c21
        L_0x0c20:
            r6 = r15
        L_0x0c21:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0c61
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 > 0) goto L_0x0c61
            int r0 = (int) r6
            r6 = r57
            r6.zza = r0
            int r0 = (int) r4
            r6.zzb = r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r13.zzc
            com.google.android.gms.internal.ads.zzew.zzS(r14, r0, r3)
            long[] r0 = r13.zzh
            r1 = 0
            r15 = r0[r1]
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r13.zzd
            r19 = r0
            long r22 = com.google.android.gms.internal.ads.zzew.zzw(r15, r17, r19)
            com.google.android.gms.internal.ads.zzagj r0 = new com.google.android.gms.internal.ads.zzagj
            r15 = r0
            r16 = r13
            r17 = r2
            r18 = r11
            r19 = r12
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0bbe
        L_0x0c61:
            r6 = r57
            goto L_0x0c68
        L_0x0c64:
            r6 = r57
            r21 = r10
        L_0x0c68:
            long[] r4 = r13.zzh
            int r7 = r4.length
            r5 = 1
            if (r7 != r5) goto L_0x0cb6
            r5 = 0
            r7 = r4[r5]
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0cb5
            long[] r3 = r13.zzi
            java.util.Objects.requireNonNull(r3)
            r7 = r3[r5]
            r3 = 0
        L_0x0c7f:
            int r4 = r14.length
            if (r3 >= r4) goto L_0x0c96
            r4 = r14[r3]
            long r15 = r4 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r13.zzc
            r19 = r4
            long r4 = com.google.android.gms.internal.ads.zzew.zzw(r15, r17, r19)
            r14[r3] = r4
            int r3 = r3 + 1
            goto L_0x0c7f
        L_0x0c96:
            long r15 = r0 - r7
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r13.zzc
            r19 = r0
            long r22 = com.google.android.gms.internal.ads.zzew.zzw(r15, r17, r19)
            com.google.android.gms.internal.ads.zzagj r0 = new com.google.android.gms.internal.ads.zzagj
            r15 = r0
            r16 = r13
            r17 = r2
            r18 = r11
            r19 = r12
            r20 = r14
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0bbe
        L_0x0cb5:
            r7 = 1
        L_0x0cb6:
            int r0 = r13.zzb
            r1 = 1
            if (r0 != r1) goto L_0x0cbd
            r0 = 1
            goto L_0x0cbe
        L_0x0cbd:
            r0 = 0
        L_0x0cbe:
            int[] r1 = new int[r7]
            int[] r4 = new int[r7]
            long[] r5 = r13.zzi
            java.util.Objects.requireNonNull(r5)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L_0x0ccb:
            long[] r15 = r13.zzh
            int r6 = r15.length
            if (r8 >= r6) goto L_0x0d3a
            r6 = r11
            r16 = r12
            r11 = r5[r8]
            r17 = -1
            int r19 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r19 == 0) goto L_0x0d20
            r22 = r15[r8]
            r15 = r5
            r17 = r6
            long r5 = r13.zzc
            r18 = r2
            r19 = r3
            long r2 = r13.zzd
            r24 = r5
            r26 = r2
            long r2 = com.google.android.gms.internal.ads.zzew.zzw(r22, r24, r26)
            r5 = 1
            int r6 = com.google.android.gms.internal.ads.zzew.zzd(r14, r11, r5, r5)
            r1[r8] = r6
            long r11 = r11 + r2
            r2 = 0
            int r3 = com.google.android.gms.internal.ads.zzew.zzb(r14, r11, r0, r2)
            r4[r8] = r3
        L_0x0cff:
            r3 = r1[r8]
            r6 = r4[r8]
            r11 = r21
            if (r3 >= r6) goto L_0x0d14
            r12 = r11[r3]
            r12 = r12 & r5
            if (r12 != 0) goto L_0x0d14
            int r3 = r3 + 1
            r1[r8] = r3
            r21 = r11
            r5 = 1
            goto L_0x0cff
        L_0x0d14:
            int r5 = r6 - r3
            int r7 = r7 + r5
            if (r10 == r3) goto L_0x0d1b
            r3 = 1
            goto L_0x0d1c
        L_0x0d1b:
            r3 = 0
        L_0x0d1c:
            r3 = r3 | r9
            r9 = r3
            r10 = r6
            goto L_0x0d2a
        L_0x0d20:
            r18 = r2
            r19 = r3
            r15 = r5
            r17 = r6
            r11 = r21
            r2 = 0
        L_0x0d2a:
            int r8 = r8 + 1
            r6 = r57
            r21 = r11
            r5 = r15
            r12 = r16
            r11 = r17
            r2 = r18
            r3 = r19
            goto L_0x0ccb
        L_0x0d3a:
            r18 = r2
            r17 = r11
            r16 = r12
            r11 = r21
            r2 = 0
            if (r7 == r3) goto L_0x0d47
            r0 = 1
            goto L_0x0d48
        L_0x0d47:
            r0 = 0
        L_0x0d48:
            r0 = r0 | r9
            if (r0 == 0) goto L_0x0d4e
            long[] r3 = new long[r7]
            goto L_0x0d50
        L_0x0d4e:
            r3 = r18
        L_0x0d50:
            if (r0 == 0) goto L_0x0d55
            int[] r5 = new int[r7]
            goto L_0x0d57
        L_0x0d55:
            r5 = r17
        L_0x0d57:
            r6 = 1
            if (r6 != r0) goto L_0x0d5c
            r8 = 0
            goto L_0x0d5e
        L_0x0d5c:
            r8 = r16
        L_0x0d5e:
            if (r0 == 0) goto L_0x0d63
            int[] r6 = new int[r7]
            goto L_0x0d64
        L_0x0d63:
            r6 = r11
        L_0x0d64:
            long[] r7 = new long[r7]
            r25 = r8
            r8 = 0
            r10 = 0
            r12 = 0
        L_0x0d6c:
            long[] r15 = r13.zzh
            int r15 = r15.length
            if (r10 >= r15) goto L_0x0dfd
            long[] r15 = r13.zzi
            r26 = r15[r10]
            r15 = r1[r10]
            r2 = r4[r10]
            r16 = r1
            if (r0 == 0) goto L_0x0d8f
            int r1 = r2 - r15
            r28 = r4
            r4 = r18
            java.lang.System.arraycopy(r4, r15, r3, r12, r1)
            r4 = r17
            java.lang.System.arraycopy(r4, r15, r5, r12, r1)
            java.lang.System.arraycopy(r11, r15, r6, r12, r1)
            goto L_0x0d93
        L_0x0d8f:
            r28 = r4
            r4 = r17
        L_0x0d93:
            r1 = r25
        L_0x0d95:
            if (r15 >= r2) goto L_0x0ddd
            r21 = 1000000(0xf4240, double:4.940656E-318)
            r29 = r2
            r17 = r3
            long r2 = r13.zzd
            r19 = r8
            r23 = r2
            long r2 = com.google.android.gms.internal.ads.zzew.zzw(r19, r21, r23)
            r19 = r14[r15]
            r21 = r8
            long r8 = r19 - r26
            r20 = r10
            r19 = r11
            r10 = 0
            long r33 = java.lang.Math.max(r10, r8)
            r35 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r13.zzc
            r37 = r8
            long r8 = com.google.android.gms.internal.ads.zzew.zzw(r33, r35, r37)
            long r2 = r2 + r8
            r7[r12] = r2
            if (r0 == 0) goto L_0x0dce
            r2 = r5[r12]
            if (r2 <= r1) goto L_0x0dce
            r1 = r4[r15]
        L_0x0dce:
            int r12 = r12 + 1
            int r15 = r15 + 1
            r3 = r17
            r11 = r19
            r10 = r20
            r8 = r21
            r2 = r29
            goto L_0x0d95
        L_0x0ddd:
            r17 = r3
            r21 = r8
            r20 = r10
            r19 = r11
            r10 = 0
            long[] r2 = r13.zzh
            r8 = r2[r20]
            long r8 = r21 + r8
            int r2 = r20 + 1
            r25 = r1
            r10 = r2
            r1 = r16
            r11 = r19
            r2 = 0
            r17 = r4
            r4 = r28
            goto L_0x0d6c
        L_0x0dfd:
            r17 = r3
            r21 = r8
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r13.zzd
            r19 = r21
            r21 = r0
            r23 = r2
            long r22 = com.google.android.gms.internal.ads.zzew.zzw(r19, r21, r23)
            com.google.android.gms.internal.ads.zzagj r2 = new com.google.android.gms.internal.ads.zzagj
            r15 = r2
            r16 = r13
            r18 = r5
            r19 = r25
            r20 = r7
            r21 = r6
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08aa
        L_0x0e22:
            r0.add(r2)
            goto L_0x0e30
        L_0x0e26:
            java.lang.String r0 = "Track has no sample table size information"
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x0e2e:
            r0 = r32
        L_0x0e30:
            int r15 = r31 + 1
            r1 = r57
            r12 = r60
            r13 = r0
            r0 = r56
            goto L_0x000c
        L_0x0e3b:
            r1 = 0
            java.lang.String r0 = "Malformed sample table (stbl) missing sample description (stsd)"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x0e43:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzc(com.google.android.gms.internal.ads.zzafh, com.google.android.gms.internal.ads.zzaaj, long, com.google.android.gms.internal.ads.zzx, boolean, boolean, com.google.android.gms.internal.ads.zzfnj):java.util.List");
    }

    public static void zzd(zzen zzen) {
        int zzc = zzen.zzc();
        zzen.zzG(4);
        if (zzen.zze() != 1751411826) {
            zzc += 4;
        }
        zzen.zzF(zzc);
    }

    private static int zze(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzen zzen) {
        int zzk = zzen.zzk();
        int i10 = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzen.zzk();
            i10 = (i10 << 7) | (zzk & 127);
        }
        return i10;
    }

    private static int zzg(zzen zzen) {
        zzen.zzF(16);
        return zzen.zze();
    }

    private static Pair zzh(zzafh zzafh) {
        zzafi zzb = zzafh.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzen zzen = zzb.zza;
        zzen.zzF(8);
        int zze = zzafj.zze(zzen.zze());
        int zzn = zzen.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        int i10 = 0;
        while (i10 < zzn) {
            jArr[i10] = zze == 1 ? zzen.zzt() : zzen.zzs();
            jArr2[i10] = zze == 1 ? zzen.zzr() : (long) zzen.zze();
            if (zzen.zzy() == 1) {
                zzen.zzG(2);
                i10++;
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzen zzen) {
        int i10 = 8;
        zzen.zzF(8);
        int zze = zzafj.zze(zzen.zze());
        zzen.zzG(zze == 0 ? 8 : 16);
        long zzs = zzen.zzs();
        if (zze == 0) {
            i10 = 4;
        }
        zzen.zzG(i10);
        int zzo = zzen.zzo();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) (((zzo >> 10) & 31) + 96));
        sb2.append((char) (((zzo >> 5) & 31) + 96));
        sb2.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb2.toString());
    }

    private static Pair zzj(zzen zzen, int i10, int i11) throws zzbu {
        Pair pair;
        Integer num;
        zzagh zzagh;
        int i12;
        int i13;
        byte[] bArr;
        zzen zzen2 = zzen;
        int zzc = zzen.zzc();
        while (zzc - i10 < i11) {
            zzen2.zzF(zzc);
            int zze = zzen.zze();
            boolean z10 = true;
            zzzy.zzb(zze > 0, "childAtomSize must be positive");
            if (zzen.zze() == 1936289382) {
                int i14 = zzc + 8;
                int i15 = -1;
                int i16 = 0;
                String str = null;
                Integer num2 = null;
                while (i14 - zzc < zze) {
                    zzen2.zzF(i14);
                    int zze2 = zzen.zze();
                    int zze3 = zzen.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzen.zze());
                    } else if (zze3 == 1935894637) {
                        zzen2.zzG(4);
                        str = zzen2.zzx(4, zzfnh.zzc);
                    } else if (zze3 == 1935894633) {
                        i15 = i14;
                        i16 = zze2;
                    }
                    i14 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzzy.zzb(num2 != null, "frma atom is mandatory");
                    zzzy.zzb(i15 != -1, "schi atom is mandatory");
                    int i17 = i15 + 8;
                    while (true) {
                        if (i17 - i15 >= i16) {
                            num = num2;
                            zzagh = null;
                            break;
                        }
                        zzen2.zzF(i17);
                        int zze4 = zzen.zze();
                        if (zzen.zze() == 1952804451) {
                            int zze5 = zzafj.zze(zzen.zze());
                            zzen2.zzG(1);
                            if (zze5 == 0) {
                                zzen2.zzG(1);
                                i13 = 0;
                                i12 = 0;
                            } else {
                                int zzk = zzen.zzk();
                                int i18 = zzk & 240;
                                i13 = zzk & 15;
                                i12 = i18 >> 4;
                            }
                            boolean z11 = zzen.zzk() == 1;
                            int zzk2 = zzen.zzk();
                            byte[] bArr2 = new byte[16];
                            zzen2.zzB(bArr2, 0, 16);
                            if (!z11 || zzk2 != 0) {
                                bArr = null;
                            } else {
                                int zzk3 = zzen.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzen2.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            }
                            num = num2;
                            zzagh = new zzagh(z11, str, zzk2, bArr2, i12, i13, bArr);
                        } else {
                            Integer num3 = num2;
                            i17 += zze4;
                        }
                    }
                    if (zzagh == null) {
                        z10 = false;
                    }
                    zzzy.zzb(z10, "tenc atom is mandatory");
                    int i19 = zzew.zza;
                    pair = Pair.create(num, zzagh);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzafl zzk(zzen zzen, int i10) {
        zzen.zzF(i10 + 12);
        zzen.zzG(1);
        zzf(zzen);
        zzen.zzG(2);
        int zzk = zzen.zzk();
        if ((zzk & 128) != 0) {
            zzen.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzen.zzG(zzen.zzk());
        }
        if ((zzk & 32) != 0) {
            zzen.zzG(2);
        }
        zzen.zzG(1);
        zzf(zzen);
        String zzd = zzbt.zzd(zzen.zzk());
        if ("audio/mpeg".equals(zzd) || "audio/vnd.dts".equals(zzd) || "audio/vnd.dts.hd".equals(zzd)) {
            return new zzafl(zzd, (byte[]) null, -1, -1);
        }
        zzen.zzG(4);
        long zzs = zzen.zzs();
        long zzs2 = zzen.zzs();
        zzen.zzG(1);
        int zzf = zzf(zzen);
        byte[] bArr = new byte[zzf];
        zzen.zzB(bArr, 0, zzf);
        return new zzafl(zzd, bArr, zzs2 <= 0 ? -1 : zzs2, zzs > 0 ? zzs : -1);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0399 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:183:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x016b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzm(com.google.android.gms.internal.ads.zzen r23, int r24, int r25, int r26, int r27, java.lang.String r28, boolean r29, com.google.android.gms.internal.ads.zzx r30, com.google.android.gms.internal.ads.zzafn r31, int r32) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r4 = r28
            r5 = r30
            r6 = r31
            int r7 = r1 + 16
            r0.zzF(r7)
            r7 = 6
            if (r29 == 0) goto L_0x001e
            int r9 = r23.zzo()
            r0.zzG(r7)
            goto L_0x0024
        L_0x001e:
            r9 = 8
            r0.zzG(r9)
            r9 = 0
        L_0x0024:
            r10 = 20
            r11 = 16
            r12 = 2
            r13 = 1
            if (r9 == 0) goto L_0x004b
            if (r9 != r13) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            if (r9 != r12) goto L_0x004a
            r0.zzG(r11)
            long r14 = r23.zzr()
            double r14 = java.lang.Double.longBitsToDouble(r14)
            long r14 = java.lang.Math.round(r14)
            int r7 = (int) r14
            int r9 = r23.zzn()
            r0.zzG(r10)
            r15 = 0
            goto L_0x0069
        L_0x004a:
            return
        L_0x004b:
            int r14 = r23.zzo()
            r0.zzG(r7)
            int r7 = r23.zzl()
            int r15 = r23.zzc()
            int r15 = r15 + -4
            r0.zzF(r15)
            int r15 = r23.zze()
            if (r9 != r13) goto L_0x0068
            r0.zzG(r11)
        L_0x0068:
            r9 = r14
        L_0x0069:
            int r11 = r23.zzc()
            r14 = 1701733217(0x656e6361, float:7.0359778E22)
            r12 = r24
            if (r12 != r14) goto L_0x009c
            android.util.Pair r12 = zzj(r0, r1, r2)
            if (r12 == 0) goto L_0x0098
            java.lang.Object r14 = r12.first
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            if (r5 != 0) goto L_0x0086
            r5 = 0
            goto L_0x0090
        L_0x0086:
            java.lang.Object r13 = r12.second
            com.google.android.gms.internal.ads.zzagh r13 = (com.google.android.gms.internal.ads.zzagh) r13
            java.lang.String r13 = r13.zzb
            com.google.android.gms.internal.ads.zzx r5 = r5.zzb(r13)
        L_0x0090:
            com.google.android.gms.internal.ads.zzagh[] r13 = r6.zza
            java.lang.Object r12 = r12.second
            com.google.android.gms.internal.ads.zzagh r12 = (com.google.android.gms.internal.ads.zzagh) r12
            r13[r32] = r12
        L_0x0098:
            r0.zzF(r11)
            r12 = r14
        L_0x009c:
            r13 = 1633889587(0x61632d33, float:2.6191674E20)
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            java.lang.String r18 = "audio/raw"
            java.lang.String r10 = "audio/ac4"
            if (r12 != r13) goto L_0x00ad
            java.lang.String r18 = "audio/ac3"
        L_0x00aa:
            r12 = -1
            goto L_0x015f
        L_0x00ad:
            r13 = 1700998451(0x65632d33, float:6.7050686E22)
            if (r12 != r13) goto L_0x00b5
            java.lang.String r18 = "audio/eac3"
            goto L_0x00aa
        L_0x00b5:
            r13 = 1633889588(0x61632d34, float:2.6191676E20)
            if (r12 != r13) goto L_0x00bd
            r18 = r10
            goto L_0x00aa
        L_0x00bd:
            r13 = 1685353315(0x64747363, float:1.803728E22)
            if (r12 != r13) goto L_0x00c5
            java.lang.String r18 = "audio/vnd.dts"
            goto L_0x00aa
        L_0x00c5:
            r13 = 1685353320(0x64747368, float:1.8037286E22)
            if (r12 == r13) goto L_0x015b
            r13 = 1685353324(0x6474736c, float:1.803729E22)
            if (r12 != r13) goto L_0x00d1
            goto L_0x015b
        L_0x00d1:
            r13 = 1685353317(0x64747365, float:1.8037282E22)
            if (r12 != r13) goto L_0x00d9
            java.lang.String r18 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x00aa
        L_0x00d9:
            r13 = 1685353336(0x64747378, float:1.8037304E22)
            if (r12 != r13) goto L_0x00e1
            java.lang.String r18 = "audio/vnd.dts.uhd;profile=p2"
            goto L_0x00aa
        L_0x00e1:
            r13 = 1935764850(0x73616d72, float:1.7860208E31)
            if (r12 != r13) goto L_0x00e9
            java.lang.String r18 = "audio/3gpp"
            goto L_0x00aa
        L_0x00e9:
            r13 = 1935767394(0x73617762, float:1.7863284E31)
            if (r12 != r13) goto L_0x00f1
            java.lang.String r18 = "audio/amr-wb"
            goto L_0x00aa
        L_0x00f1:
            r13 = 1819304813(0x6c70636d, float:1.1624469E27)
            if (r12 == r13) goto L_0x0159
            r13 = 1936684916(0x736f7774, float:1.89725E31)
            if (r12 != r13) goto L_0x00fc
            goto L_0x0159
        L_0x00fc:
            r13 = 1953984371(0x74776f73, float:7.841539E31)
            if (r12 != r13) goto L_0x0104
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x015f
        L_0x0104:
            r13 = 778924082(0x2e6d7032, float:5.398721E-11)
            if (r12 == r13) goto L_0x0155
            r13 = 778924083(0x2e6d7033, float:5.3987214E-11)
            if (r12 != r13) goto L_0x010f
            goto L_0x0155
        L_0x010f:
            r13 = 1835557169(0x6d686131, float:4.4948762E27)
            if (r12 != r13) goto L_0x0117
            java.lang.String r18 = "audio/mha1"
            goto L_0x00aa
        L_0x0117:
            r13 = 1835560241(0x6d686d31, float:4.495783E27)
            if (r12 != r13) goto L_0x011f
            java.lang.String r18 = "audio/mhm1"
            goto L_0x00aa
        L_0x011f:
            if (r12 != r14) goto L_0x0124
            java.lang.String r18 = "audio/alac"
            goto L_0x00aa
        L_0x0124:
            r13 = 1634492791(0x616c6177, float:2.7252842E20)
            if (r12 != r13) goto L_0x012d
            java.lang.String r18 = "audio/g711-alaw"
            goto L_0x00aa
        L_0x012d:
            r13 = 1970037111(0x756c6177, float:2.9964816E32)
            if (r12 != r13) goto L_0x0136
            java.lang.String r18 = "audio/g711-mlaw"
            goto L_0x00aa
        L_0x0136:
            r13 = 1332770163(0x4f707573, float:4.03422899E9)
            if (r12 != r13) goto L_0x013f
            java.lang.String r18 = "audio/opus"
            goto L_0x00aa
        L_0x013f:
            r13 = 1716281667(0x664c6143, float:2.4128923E23)
            if (r12 != r13) goto L_0x0148
            java.lang.String r18 = "audio/flac"
            goto L_0x00aa
        L_0x0148:
            r13 = 1835823201(0x6d6c7061, float:4.573395E27)
            if (r12 != r13) goto L_0x0151
            java.lang.String r18 = "audio/true-hd"
            goto L_0x00aa
        L_0x0151:
            r12 = -1
            r18 = 0
            goto L_0x015f
        L_0x0155:
            java.lang.String r18 = "audio/mpeg"
            goto L_0x00aa
        L_0x0159:
            r12 = 2
            goto L_0x015f
        L_0x015b:
            java.lang.String r18 = "audio/vnd.dts.hd"
            goto L_0x00aa
        L_0x015f:
            r13 = r18
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x0167:
            int r8 = r11 - r1
            if (r8 >= r2) goto L_0x0393
            r0.zzF(r11)
            int r8 = r23.zze()
            if (r8 <= 0) goto L_0x0176
            r14 = 1
            goto L_0x0177
        L_0x0176:
            r14 = 0
        L_0x0177:
            java.lang.String r1 = "childAtomSize must be positive"
            com.google.android.gms.internal.ads.zzzy.zzb(r14, r1)
            int r14 = r23.zze()
            r2 = 1835557187(0x6d686143, float:4.4948815E27)
            if (r14 != r2) goto L_0x01a1
            int r1 = r8 + -13
            int r2 = r11 + 13
            byte[] r14 = new byte[r1]
            r0.zzF(r2)
            r2 = 0
            r0.zzB(r14, r2, r1)
            com.google.android.gms.internal.ads.zzfqk r20 = com.google.android.gms.internal.ads.zzfqk.zzp(r14)
            r21 = r12
        L_0x0198:
            r12 = 0
            r14 = 20
            r16 = 2
            r17 = 1
            goto L_0x0387
        L_0x01a1:
            r2 = 1702061171(0x65736473, float:7.183675E22)
            if (r14 == r2) goto L_0x0353
            if (r29 == 0) goto L_0x01f8
            r2 = 2002876005(0x77617665, float:4.5729223E33)
            if (r14 != r2) goto L_0x01f8
            int r2 = r23.zzc()
            if (r2 < r11) goto L_0x01b8
            r21 = r2
            r2 = 0
            r14 = 1
            goto L_0x01bc
        L_0x01b8:
            r21 = r2
            r2 = 0
            r14 = 0
        L_0x01bc:
            com.google.android.gms.internal.ads.zzzy.zzb(r14, r2)
            r2 = r21
        L_0x01c1:
            int r14 = r2 - r11
            if (r14 >= r8) goto L_0x01eb
            r0.zzF(r2)
            int r14 = r23.zze()
            if (r14 <= 0) goto L_0x01d2
            r21 = r12
            r12 = 1
            goto L_0x01d5
        L_0x01d2:
            r21 = r12
            r12 = 0
        L_0x01d5:
            com.google.android.gms.internal.ads.zzzy.zzb(r12, r1)
            int r12 = r23.zze()
            r22 = r1
            r1 = 1702061171(0x65736473, float:7.183675E22)
            if (r12 == r1) goto L_0x01e9
            int r2 = r2 + r14
            r12 = r21
            r1 = r22
            goto L_0x01c1
        L_0x01e9:
            r1 = -1
            goto L_0x01ef
        L_0x01eb:
            r21 = r12
            r1 = -1
            r2 = -1
        L_0x01ef:
            r12 = 0
            r14 = 20
            r16 = 2
            r17 = 1
            goto L_0x035e
        L_0x01f8:
            r21 = r12
            r1 = 1684103987(0x64616333, float:1.6630662E22)
            if (r14 != r1) goto L_0x020f
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r27)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyv.zzc(r0, r1, r4, r5)
            r6.zzb = r1
            goto L_0x0198
        L_0x020f:
            r1 = 1684366131(0x64656333, float:1.692581E22)
            if (r14 != r1) goto L_0x0225
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r27)
            com.google.android.gms.internal.ads.zzaf r1 = com.google.android.gms.internal.ads.zzyv.zzd(r0, r1, r4, r5)
            r6.zzb = r1
            goto L_0x0198
        L_0x0225:
            r1 = 1684103988(0x64616334, float:1.6630663E22)
            if (r14 != r1) goto L_0x026a
            int r1 = r11 + 8
            r0.zzF(r1)
            java.lang.String r1 = java.lang.Integer.toString(r27)
            int r2 = com.google.android.gms.internal.ads.zzyy.zza
            r2 = 1
            r0.zzG(r2)
            int r12 = r23.zzk()
            r12 = r12 & 32
            com.google.android.gms.internal.ads.zzad r14 = new com.google.android.gms.internal.ads.zzad
            r14.<init>()
            r14.zzH(r1)
            r14.zzS(r10)
            r1 = 2
            r14.zzw(r1)
            int r1 = r12 >> 5
            if (r2 == r1) goto L_0x0256
            r1 = 44100(0xac44, float:6.1797E-41)
            goto L_0x0259
        L_0x0256:
            r1 = 48000(0xbb80, float:6.7262E-41)
        L_0x0259:
            r14.zzT(r1)
            r14.zzB(r5)
            r14.zzK(r4)
            com.google.android.gms.internal.ads.zzaf r1 = r14.zzY()
            r6.zzb = r1
            goto L_0x0198
        L_0x026a:
            r1 = 1684892784(0x646d6c70, float:1.7518768E22)
            if (r14 != r1) goto L_0x028c
            if (r15 <= 0) goto L_0x0275
            r7 = r15
            r9 = 2
            goto L_0x0198
        L_0x0275:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid sample rate for Dolby TrueHD MLP stream: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            r1 = 0
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r0, r1)
            throw r0
        L_0x028c:
            r1 = 0
            r2 = 1684305011(0x64647473, float:1.6856995E22)
            if (r14 != r2) goto L_0x02b1
            com.google.android.gms.internal.ads.zzad r2 = new com.google.android.gms.internal.ads.zzad
            r2.<init>()
            r2.zzG(r3)
            r2.zzS(r13)
            r2.zzw(r9)
            r2.zzT(r7)
            r2.zzB(r5)
            r2.zzK(r4)
            com.google.android.gms.internal.ads.zzaf r2 = r2.zzY()
            r6.zzb = r2
            goto L_0x0198
        L_0x02b1:
            r2 = 1682927731(0x644f7073, float:1.5306315E22)
            if (r14 != r2) goto L_0x02cf
            int r2 = r8 + -8
            byte[] r12 = zza
            int r14 = r12.length
            int r14 = r14 + r2
            byte[] r14 = java.util.Arrays.copyOf(r12, r14)
            int r1 = r11 + 8
            r0.zzF(r1)
            int r1 = r12.length
            r0.zzB(r14, r1, r2)
            java.util.List r20 = com.google.android.gms.internal.ads.zzaas.zzc(r14)
            goto L_0x0198
        L_0x02cf:
            r1 = 1684425825(0x64664c61, float:1.6993019E22)
            if (r14 != r1) goto L_0x0302
            int r1 = r8 + -12
            int r2 = r1 + 4
            byte[] r2 = new byte[r2]
            r12 = 102(0x66, float:1.43E-43)
            r14 = 0
            r2[r14] = r12
            r12 = 76
            r17 = 1
            r2[r17] = r12
            r12 = 97
            r16 = 2
            r2[r16] = r12
            r12 = 3
            r14 = 67
            r2[r12] = r14
            int r12 = r11 + 12
            r0.zzF(r12)
            r12 = 4
            r0.zzB(r2, r12, r1)
            com.google.android.gms.internal.ads.zzfqk r20 = com.google.android.gms.internal.ads.zzfqk.zzp(r2)
        L_0x02fd:
            r12 = 0
            r14 = 20
            goto L_0x0387
        L_0x0302:
            r1 = 1634492771(0x616c6163, float:2.7252807E20)
            r16 = 2
            r17 = 1
            if (r14 != r1) goto L_0x02fd
            int r2 = r8 + -12
            int r7 = r11 + 12
            byte[] r9 = new byte[r2]
            r0.zzF(r7)
            r12 = 0
            r0.zzB(r9, r12, r2)
            int r2 = com.google.android.gms.internal.ads.zzdn.zza
            com.google.android.gms.internal.ads.zzen r2 = new com.google.android.gms.internal.ads.zzen
            r2.<init>((byte[]) r9)
            r7 = 9
            r2.zzF(r7)
            int r7 = r2.zzk()
            r14 = 20
            r2.zzF(r14)
            int r2 = r2.zzn()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            android.util.Pair r2 = android.util.Pair.create(r2, r7)
            java.lang.Object r7 = r2.first
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.google.android.gms.internal.ads.zzfqk r20 = com.google.android.gms.internal.ads.zzfqk.zzp(r9)
            r9 = r2
            goto L_0x0387
        L_0x0353:
            r21 = r12
            r12 = 0
            r14 = 20
            r16 = 2
            r17 = 1
            r2 = r11
            r1 = -1
        L_0x035e:
            if (r2 == r1) goto L_0x0387
            com.google.android.gms.internal.ads.zzafl r18 = zzk(r0, r2)
            java.lang.String r2 = r18.zza
            byte[] r13 = r18.zzb
            if (r13 == 0) goto L_0x0386
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0382
            com.google.android.gms.internal.ads.zzyr r1 = com.google.android.gms.internal.ads.zzys.zza(r13)
            int r7 = r1.zza
            int r9 = r1.zzb
            java.lang.String r1 = r1.zzc
            r19 = r1
        L_0x0382:
            com.google.android.gms.internal.ads.zzfqk r20 = com.google.android.gms.internal.ads.zzfqk.zzp(r13)
        L_0x0386:
            r13 = r2
        L_0x0387:
            int r11 = r11 + r8
            r1 = r25
            r2 = r26
            r12 = r21
            r14 = 1634492771(0x616c6163, float:2.7252807E20)
            goto L_0x0167
        L_0x0393:
            r21 = r12
            com.google.android.gms.internal.ads.zzaf r0 = r6.zzb
            if (r0 != 0) goto L_0x03df
            if (r13 == 0) goto L_0x03df
            com.google.android.gms.internal.ads.zzad r0 = new com.google.android.gms.internal.ads.zzad
            r0.<init>()
            r0.zzG(r3)
            r0.zzS(r13)
            r1 = r19
            r0.zzx(r1)
            r0.zzw(r9)
            r0.zzT(r7)
            r8 = r21
            r0.zzN(r8)
            r1 = r20
            r0.zzI(r1)
            r0.zzB(r5)
            r0.zzK(r4)
            if (r18 == 0) goto L_0x03d9
            long r1 = r18.zzc
            int r1 = com.google.android.gms.internal.ads.zzfsr.zzc(r1)
            r0.zzv(r1)
            long r1 = r18.zzd
            int r1 = com.google.android.gms.internal.ads.zzfsr.zzc(r1)
            r0.zzO(r1)
        L_0x03d9:
            com.google.android.gms.internal.ads.zzaf r0 = r0.zzY()
            r6.zzb = r0
        L_0x03df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafr.zzm(com.google.android.gms.internal.ads.zzen, int, int, int, int, java.lang.String, boolean, com.google.android.gms.internal.ads.zzx, com.google.android.gms.internal.ads.zzafn, int):void");
    }

    private static void zzn(zzen zzen, int i10, int i11, int i12, zzafn zzafn) {
        zzen.zzF(i11 + 16);
        zzen.zzv(0);
        String zzv = zzen.zzv(0);
        if (zzv != null) {
            zzad zzad = new zzad();
            zzad.zzG(i12);
            zzad.zzS(zzv);
            zzafn.zzb = zzad.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length;
        int i10 = length - 1;
        int zzf = zzew.zzf(4, 0, i10);
        int zzf2 = zzew.zzf(length - 4, 0, i10);
        if (jArr[0] > j11 || j11 >= jArr[zzf] || jArr[zzf2] >= j12 || j12 > j10) {
            return false;
        }
        return true;
    }
}
