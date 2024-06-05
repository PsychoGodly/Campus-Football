package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagf {
    private static final int[] zza = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean zza(zzzv zzzv) throws IOException {
        return zzc(zzzv, true, false);
    }

    public static boolean zzb(zzzv zzzv, boolean z10) throws IOException {
        return zzc(zzzv, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ce, code lost:
        r10 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean zzc(com.google.android.gms.internal.ads.zzzv r22, boolean r23, boolean r24) throws java.io.IOException {
        /*
            r0 = r22
            long r1 = r22.zzd()
            r3 = -1
            r5 = 4096(0x1000, double:2.0237E-320)
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0014
            int r8 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r5 = r1
        L_0x0014:
            com.google.android.gms.internal.ads.zzen r8 = new com.google.android.gms.internal.ads.zzen
            r9 = 64
            r8.<init>((int) r9)
            int r6 = (int) r5
            r5 = 0
            r9 = 0
            r10 = 0
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x00f8
            r12 = 8
            r8.zzC(r12)
            byte[] r13 = r8.zzH()
            boolean r13 = r0.zzm(r13, r5, r12, r11)
            if (r13 != 0) goto L_0x0033
            goto L_0x00f8
        L_0x0033:
            long r13 = r8.zzs()
            int r15 = r8.zze()
            r16 = 1
            r11 = 16
            int r18 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r18 != 0) goto L_0x0052
            byte[] r13 = r8.zzH()
            r0.zzh(r13, r12, r12)
            r8.zzE(r11)
            long r13 = r8.zzr()
            goto L_0x006c
        L_0x0052:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x006a
            long r16 = r22.zzd()
            int r11 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x006a
            long r13 = r22.zze()
            long r16 = r16 - r13
            r13 = 8
            long r13 = r16 + r13
        L_0x006a:
            r11 = 8
        L_0x006c:
            long r3 = (long) r11
            int r18 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r18 >= 0) goto L_0x0072
            return r5
        L_0x0072:
            int r9 = r9 + r11
            r11 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r11) goto L_0x0085
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r7 == 0) goto L_0x0082
            long r3 = (long) r6
            int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r11 <= 0) goto L_0x0082
            int r6 = (int) r1
        L_0x0082:
            r3 = -1
            goto L_0x001f
        L_0x0085:
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r11) goto L_0x00f6
            r11 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r11) goto L_0x0091
            goto L_0x00f6
        L_0x0091:
            r18 = r1
            long r1 = (long) r9
            long r1 = r1 + r13
            r20 = r13
            long r12 = (long) r6
            long r1 = r1 - r3
            int r14 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x009e
            goto L_0x00f8
        L_0x009e:
            long r13 = r20 - r3
            int r1 = (int) r13
            int r9 = r9 + r1
            r2 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r2) goto L_0x00ee
            r2 = 8
            if (r1 >= r2) goto L_0x00ac
            return r5
        L_0x00ac:
            r8.zzC(r1)
            byte[] r2 = r8.zzH()
            r0.zzh(r2, r5, r1)
            int r1 = r1 >> 2
            r2 = 0
        L_0x00b9:
            if (r2 >= r1) goto L_0x00ea
            r3 = 1
            if (r2 != r3) goto L_0x00c3
            r3 = 4
            r8.zzG(r3)
            goto L_0x00e7
        L_0x00c3:
            int r3 = r8.zze()
            int r4 = r3 >>> 8
            r11 = 3368816(0x336770, float:4.720717E-39)
            if (r4 != r11) goto L_0x00d0
        L_0x00ce:
            r10 = 1
            goto L_0x00ea
        L_0x00d0:
            r4 = 1751476579(0x68656963, float:4.333464E24)
            if (r3 != r4) goto L_0x00d8
            r3 = 1751476579(0x68656963, float:4.333464E24)
        L_0x00d8:
            int[] r4 = zza
            r11 = 0
        L_0x00db:
            r12 = 29
            if (r11 >= r12) goto L_0x00e7
            r12 = r4[r11]
            if (r12 != r3) goto L_0x00e4
            goto L_0x00ce
        L_0x00e4:
            int r11 = r11 + 1
            goto L_0x00db
        L_0x00e7:
            int r2 = r2 + 1
            goto L_0x00b9
        L_0x00ea:
            if (r10 == 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            return r5
        L_0x00ee:
            if (r1 == 0) goto L_0x00f3
            r0.zzg(r1)
        L_0x00f3:
            r1 = r18
            goto L_0x0082
        L_0x00f6:
            r3 = 1
            goto L_0x00f9
        L_0x00f8:
            r3 = 0
        L_0x00f9:
            if (r10 == 0) goto L_0x0101
            r0 = r23
            if (r0 != r3) goto L_0x0101
            r0 = 1
            return r0
        L_0x0101:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagf.zzc(com.google.android.gms.internal.ads.zzzv, boolean, boolean):boolean");
    }
}
