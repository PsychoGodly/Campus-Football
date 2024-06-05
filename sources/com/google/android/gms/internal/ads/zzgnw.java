package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgnw {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    /* JADX WARNING: type inference failed for: r32v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void zzb(long[] r32, long[] r33, long[] r34) {
        /*
            r0 = 0
            r1 = r33[r0]
            r3 = r34[r0]
            long r1 = r1 * r3
            r32[r0] = r1
            r1 = r33[r0]
            r3 = 1
            r4 = r34[r3]
            long r1 = r1 * r4
            r4 = r33[r3]
            r6 = r34[r0]
            long r4 = r4 * r6
            long r1 = r1 + r4
            r32[r3] = r1
            r1 = r33[r3]
            long r1 = r1 + r1
            r4 = r34[r3]
            long r1 = r1 * r4
            r4 = r33[r0]
            r6 = 2
            r7 = r34[r6]
            long r4 = r4 * r7
            r7 = r33[r6]
            r9 = r34[r0]
            long r7 = r7 * r9
            long r1 = r1 + r4
            long r1 = r1 + r7
            r32[r6] = r1
            r1 = r33[r3]
            r4 = r34[r6]
            long r1 = r1 * r4
            r4 = r33[r6]
            r7 = r34[r3]
            long r4 = r4 * r7
            r7 = r33[r0]
            r9 = 3
            r10 = r34[r9]
            long r7 = r7 * r10
            r10 = r33[r9]
            r12 = r34[r0]
            long r10 = r10 * r12
            long r1 = r1 + r4
            long r1 = r1 + r7
            long r1 = r1 + r10
            r32[r9] = r1
            r1 = r33[r6]
            r4 = r34[r6]
            long r1 = r1 * r4
            r4 = r33[r3]
            r7 = r34[r9]
            long r4 = r4 * r7
            r7 = r33[r9]
            r10 = r34[r3]
            long r7 = r7 * r10
            r10 = r33[r0]
            r12 = 4
            r13 = r34[r12]
            long r10 = r10 * r13
            r13 = r33[r12]
            r15 = r34[r0]
            long r13 = r13 * r15
            long r4 = r4 + r7
            long r4 = r4 + r4
            long r1 = r1 + r4
            long r1 = r1 + r10
            long r1 = r1 + r13
            r32[r12] = r1
            r1 = r33[r6]
            r4 = r34[r9]
            long r1 = r1 * r4
            r4 = r33[r9]
            r7 = r34[r6]
            long r4 = r4 * r7
            r7 = r33[r3]
            r10 = r34[r12]
            long r7 = r7 * r10
            r10 = r33[r12]
            r13 = r34[r3]
            long r10 = r10 * r13
            r13 = r33[r0]
            r15 = 5
            r16 = r34[r15]
            long r13 = r13 * r16
            r16 = r33[r15]
            r18 = r34[r0]
            long r16 = r16 * r18
            long r1 = r1 + r4
            long r1 = r1 + r7
            long r1 = r1 + r10
            long r1 = r1 + r13
            long r1 = r1 + r16
            r32[r15] = r1
            r1 = r33[r9]
            r4 = r34[r9]
            long r1 = r1 * r4
            r4 = r33[r3]
            r7 = r34[r15]
            long r4 = r4 * r7
            r7 = r33[r15]
            r10 = r34[r3]
            long r7 = r7 * r10
            r10 = r33[r6]
            r13 = r34[r12]
            long r10 = r10 * r13
            r13 = r33[r12]
            r16 = r34[r6]
            long r13 = r13 * r16
            r16 = r33[r0]
            r18 = 6
            r19 = r34[r18]
            long r16 = r16 * r19
            r19 = r33[r18]
            r21 = r34[r0]
            long r19 = r19 * r21
            long r1 = r1 + r4
            long r1 = r1 + r7
            long r1 = r1 + r1
            long r1 = r1 + r10
            long r1 = r1 + r13
            long r1 = r1 + r16
            long r1 = r1 + r19
            r32[r18] = r1
            r1 = r33[r9]
            r4 = r34[r12]
            long r1 = r1 * r4
            r4 = r33[r12]
            r7 = r34[r9]
            long r4 = r4 * r7
            r7 = r33[r6]
            r10 = r34[r15]
            long r7 = r7 * r10
            r10 = r33[r15]
            r13 = r34[r6]
            long r10 = r10 * r13
            r13 = r33[r3]
            r16 = r34[r18]
            long r13 = r13 * r16
            r16 = r33[r18]
            r19 = r34[r3]
            long r16 = r16 * r19
            r19 = r33[r0]
            r21 = 7
            r22 = r34[r21]
            long r19 = r19 * r22
            r22 = r33[r21]
            r24 = r34[r0]
            long r22 = r22 * r24
            long r1 = r1 + r4
            long r1 = r1 + r7
            long r1 = r1 + r10
            long r1 = r1 + r13
            long r1 = r1 + r16
            long r1 = r1 + r19
            long r1 = r1 + r22
            r32[r21] = r1
            r1 = r33[r12]
            r4 = r34[r12]
            long r1 = r1 * r4
            r4 = r33[r9]
            r7 = r34[r15]
            long r4 = r4 * r7
            r7 = r33[r15]
            r10 = r34[r9]
            long r7 = r7 * r10
            r10 = r33[r3]
            r13 = r34[r21]
            long r10 = r10 * r13
            r13 = r33[r21]
            r16 = r34[r3]
            long r13 = r13 * r16
            r16 = r33[r6]
            r19 = r34[r18]
            long r16 = r16 * r19
            r19 = r33[r18]
            r22 = r34[r6]
            long r19 = r19 * r22
            r22 = r33[r0]
            r24 = 8
            r25 = r34[r24]
            long r22 = r22 * r25
            r25 = r33[r24]
            r27 = r34[r0]
            long r25 = r25 * r27
            long r4 = r4 + r7
            long r4 = r4 + r10
            long r4 = r4 + r13
            long r4 = r4 + r4
            long r1 = r1 + r4
            long r1 = r1 + r16
            long r1 = r1 + r19
            long r1 = r1 + r22
            long r1 = r1 + r25
            r32[r24] = r1
            r1 = r33[r12]
            r4 = r34[r15]
            long r1 = r1 * r4
            r4 = r33[r15]
            r7 = r34[r12]
            long r4 = r4 * r7
            r7 = r33[r9]
            r10 = r34[r18]
            long r7 = r7 * r10
            r10 = r33[r18]
            r13 = r34[r9]
            long r10 = r10 * r13
            r13 = r33[r6]
            r16 = r34[r21]
            long r13 = r13 * r16
            r16 = r33[r21]
            r19 = r34[r6]
            long r16 = r16 * r19
            r19 = r33[r3]
            r22 = r34[r24]
            long r19 = r19 * r22
            r22 = r33[r24]
            r25 = r34[r3]
            long r22 = r22 * r25
            r25 = r33[r0]
            r27 = 9
            r28 = r34[r27]
            long r25 = r25 * r28
            r28 = r33[r27]
            r30 = r34[r0]
            long r28 = r28 * r30
            long r1 = r1 + r4
            long r1 = r1 + r7
            long r1 = r1 + r10
            long r1 = r1 + r13
            long r1 = r1 + r16
            long r1 = r1 + r19
            long r1 = r1 + r22
            long r1 = r1 + r25
            long r1 = r1 + r28
            r32[r27] = r1
            r0 = r33[r15]
            r4 = r34[r15]
            long r0 = r0 * r4
            r4 = r33[r9]
            r7 = r34[r21]
            long r4 = r4 * r7
            r7 = r33[r21]
            r10 = r34[r9]
            long r7 = r7 * r10
            r10 = r33[r3]
            r13 = r34[r27]
            long r10 = r10 * r13
            r13 = r33[r27]
            r2 = r34[r3]
            long r13 = r13 * r2
            r2 = r33[r12]
            r16 = r34[r18]
            long r2 = r2 * r16
            r16 = r33[r18]
            r19 = r34[r12]
            long r16 = r16 * r19
            r19 = r33[r6]
            r22 = r34[r24]
            long r19 = r19 * r22
            r22 = r33[r24]
            r25 = r34[r6]
            long r22 = r22 * r25
            long r0 = r0 + r4
            long r0 = r0 + r7
            long r0 = r0 + r10
            long r0 = r0 + r13
            long r0 = r0 + r0
            long r0 = r0 + r2
            long r0 = r0 + r16
            long r0 = r0 + r19
            long r0 = r0 + r22
            r2 = 10
            r32[r2] = r0
            r0 = r33[r15]
            r2 = r34[r18]
            long r0 = r0 * r2
            r2 = r33[r18]
            r4 = r34[r15]
            long r2 = r2 * r4
            r4 = r33[r12]
            r7 = r34[r21]
            long r4 = r4 * r7
            r7 = r33[r21]
            r10 = r34[r12]
            long r7 = r7 * r10
            r10 = r33[r9]
            r13 = r34[r24]
            long r10 = r10 * r13
            r13 = r33[r24]
            r16 = r34[r9]
            long r13 = r13 * r16
            r16 = r33[r6]
            r19 = r34[r27]
            long r16 = r16 * r19
            r19 = r33[r27]
            r22 = r34[r6]
            long r19 = r19 * r22
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r7
            long r0 = r0 + r10
            long r0 = r0 + r13
            long r0 = r0 + r16
            long r0 = r0 + r19
            r2 = 11
            r32[r2] = r0
            r0 = r33[r18]
            r2 = r34[r18]
            long r0 = r0 * r2
            r2 = r33[r15]
            r4 = r34[r21]
            long r2 = r2 * r4
            r4 = r33[r21]
            r6 = r34[r15]
            long r4 = r4 * r6
            r6 = r33[r9]
            r10 = r34[r27]
            long r6 = r6 * r10
            r10 = r33[r27]
            r8 = r34[r9]
            long r10 = r10 * r8
            r8 = r33[r12]
            r13 = r34[r24]
            long r8 = r8 * r13
            r13 = r33[r24]
            r16 = r34[r12]
            long r13 = r13 * r16
            long r2 = r2 + r4
            long r2 = r2 + r6
            long r2 = r2 + r10
            long r2 = r2 + r2
            long r0 = r0 + r2
            long r0 = r0 + r8
            long r0 = r0 + r13
            r2 = 12
            r32[r2] = r0
            r0 = r33[r18]
            r2 = r34[r21]
            long r0 = r0 * r2
            r2 = r33[r21]
            r4 = r34[r18]
            long r2 = r2 * r4
            r4 = r33[r15]
            r6 = r34[r24]
            long r4 = r4 * r6
            r6 = r33[r24]
            r8 = r34[r15]
            long r6 = r6 * r8
            r8 = r33[r12]
            r10 = r34[r27]
            long r8 = r8 * r10
            r10 = r33[r27]
            r12 = r34[r12]
            long r10 = r10 * r12
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r6
            long r0 = r0 + r8
            long r0 = r0 + r10
            r2 = 13
            r32[r2] = r0
            r0 = r33[r21]
            r2 = r34[r21]
            long r0 = r0 * r2
            r2 = r33[r15]
            r4 = r34[r27]
            long r2 = r2 * r4
            r4 = r33[r27]
            r6 = r34[r15]
            long r4 = r4 * r6
            r6 = r33[r18]
            r8 = r34[r24]
            long r6 = r6 * r8
            r8 = r33[r24]
            r10 = r34[r18]
            long r8 = r8 * r10
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r0
            long r0 = r0 + r6
            long r0 = r0 + r8
            r2 = 14
            r32[r2] = r0
            r0 = r33[r21]
            r2 = r34[r24]
            long r0 = r0 * r2
            r2 = r33[r24]
            r4 = r34[r21]
            long r2 = r2 * r4
            r4 = r33[r18]
            r6 = r34[r27]
            long r4 = r4 * r6
            r6 = r33[r27]
            r8 = r34[r18]
            long r6 = r6 * r8
            long r0 = r0 + r2
            long r0 = r0 + r4
            long r0 = r0 + r6
            r2 = 15
            r32[r2] = r0
            r0 = r33[r24]
            r2 = r34[r24]
            long r0 = r0 * r2
            r2 = r33[r21]
            r4 = r34[r27]
            long r2 = r2 * r4
            r4 = r33[r27]
            r6 = r34[r21]
            long r4 = r4 * r6
            long r2 = r2 + r4
            long r2 = r2 + r2
            long r0 = r0 + r2
            r2 = 16
            r32[r2] = r0
            r0 = r33[r24]
            r2 = r34[r27]
            long r0 = r0 * r2
            r2 = r33[r27]
            r4 = r34[r24]
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = 17
            r32[r2] = r0
            r0 = r33[r27]
            long r0 = r0 + r0
            r2 = r34[r27]
            long r0 = r0 * r2
            r2 = 18
            r32[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgnw.zzb(long[], long[], long[]):void");
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / 67108864;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / 33554432;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j14;
        long j15 = jArr[10];
        long j16 = j14 + j15 + j15;
        jArr[0] = j16;
        jArr[0] = j16 + jArr[10];
        jArr[10] = 0;
        long j17 = jArr[0];
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    static void zze(long[] jArr) {
        long j10 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j10;
        long j11 = jArr[18];
        long j12 = j10 + j11 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + jArr[18];
        long j13 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j13;
        long j14 = jArr[17];
        long j15 = j13 + j14 + j14;
        jArr[7] = j15;
        jArr[7] = j15 + jArr[17];
        long j16 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j16;
        long j17 = jArr[16];
        long j18 = j16 + j17 + j17;
        jArr[6] = j18;
        jArr[6] = j18 + jArr[16];
        long j19 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j19;
        long j20 = jArr[15];
        long j21 = j19 + j20 + j20;
        jArr[5] = j21;
        jArr[5] = j21 + jArr[15];
        long j22 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j22;
        long j23 = jArr[14];
        long j24 = j22 + j23 + j23;
        jArr[4] = j24;
        jArr[4] = j24 + jArr[14];
        long j25 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j25;
        long j26 = jArr[13];
        long j27 = j25 + j26 + j26;
        jArr[3] = j27;
        jArr[3] = j27 + jArr[13];
        long j28 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j28;
        long j29 = jArr[12];
        long j30 = j28 + j29 + j29;
        jArr[2] = j30;
        jArr[2] = j30 + jArr[12];
        long j31 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j31;
        long j32 = jArr[11];
        long j33 = j31 + j32 + j32;
        jArr[1] = j33;
        jArr[1] = j33 + jArr[11];
        long j34 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j34;
        long j35 = jArr[10];
        long j36 = j34 + j35 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + jArr[10];
    }

    static void zzf(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    static void zzg(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = jArr2[1];
        long j13 = (j12 * j12) + (jArr2[0] * jArr2[2]);
        long j14 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j15 = jArr2[2];
        long j16 = jArr2[1] * 4 * jArr2[3];
        long j17 = jArr2[0];
        long j18 = (j15 * j15) + j16;
        long j19 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j20 = jArr2[3];
        long j21 = jArr2[2] * jArr2[4];
        long j22 = jArr2[0] * jArr2[6];
        long j23 = jArr2[1];
        long j24 = (j20 * j20) + j21 + j22 + ((j23 + j23) * jArr2[5]);
        long j25 = jArr2[3] * jArr2[4];
        long j26 = jArr2[2] * jArr2[5];
        long j27 = j25 + j26 + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j28 = jArr2[4];
        long j29 = jArr2[2] * jArr2[6];
        long j30 = jArr2[0] * jArr2[8];
        long j31 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j32 = j29 + j30 + j31 + j31;
        long j33 = jArr2[4] * jArr2[5];
        long j34 = jArr2[3] * jArr2[6];
        long j35 = jArr2[2] * jArr2[7];
        long j36 = j33 + j34 + j35 + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j37 = jArr2[5];
        long j38 = jArr2[4] * jArr2[6];
        long j39 = jArr2[2] * jArr2[8];
        long j40 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j41 = (j37 * j37) + j38 + j39 + j40 + j40;
        long j42 = jArr2[5] * jArr2[6];
        long j43 = jArr2[4] * jArr2[7];
        long j44 = j42 + j43 + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j45 = jArr2[6];
        long j46 = jArr2[4] * jArr2[8];
        long j47 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j48 = j46 + j47 + j47;
        long j49 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j50 = jArr2[7];
        long j51 = jArr2[6] * jArr2[8];
        long j52 = jArr2[5];
        long j53 = (j50 * j50) + j51 + ((j52 + j52) * jArr2[9]);
        long j54 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j55 = jArr2[8];
        long j56 = jArr2[8];
        long j57 = jArr2[9];
        zzc(new long[]{j10 * j10, (j11 + j11) * jArr2[1], j13 + j13, j14 + j14, j18 + ((j17 + j17) * jArr2[4]), j19 + j19, j24 + j24, j27 + j27, (j28 * j28) + j32 + j32, j36 + j36, j41 + j41, j44 + j44, (j45 * j45) + j48 + j48, j49 + j49, j53 + j53, j54 + j54, (j55 * j55) + (jArr2[7] * 4 * jArr2[9]), (j56 + j56) * jArr2[9], (j57 + j57) * j57}, jArr);
    }

    static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    static byte[] zzj(long[] jArr) {
        int i10;
        long[] copyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = copyOf[i12];
                int i13 = zzd[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                copyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                copyOf[i12] = copyOf[i12] - ((long) i14);
            }
            long j11 = copyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            copyOf[9] = j11 + ((long) (i15 << 25));
            copyOf[0] = copyOf[0] - ((long) (i15 * 19));
            i11++;
        }
        long j12 = copyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        copyOf[0] = j12 + ((long) (i16 << 26));
        copyOf[1] = copyOf[1] - ((long) i16);
        int i17 = 0;
        for (i10 = 2; i17 < i10; i10 = 2) {
            int i18 = 0;
            while (i18 < 9) {
                long j13 = copyOf[i18];
                int i19 = i18 & 1;
                copyOf[i18] = ((long) zzc[i19]) & j13;
                i18++;
                copyOf[i18] = copyOf[i18] + ((long) ((int) (j13 >> zzd[i19])));
            }
            i17++;
        }
        long j14 = copyOf[9];
        copyOf[9] = j14 & 33554431;
        long j15 = copyOf[0] + ((long) (((int) (j14 >> 25)) * 19));
        copyOf[0] = j15;
        int i20 = ~((((int) j15) - 67108845) >> 31);
        for (int i21 = 1; i21 < 10; i21++) {
            int i22 = ~(((int) copyOf[i21]) ^ zzc[i21 & 1]);
            int i23 = i22 & (i22 << 16);
            int i24 = i23 & (i23 << 8);
            int i25 = i24 & (i24 << 4);
            int i26 = i25 & (i25 << 2);
            i20 &= (i26 & (i26 + i26)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i20));
        long j16 = (long) (33554431 & i20);
        copyOf[1] = copyOf[1] - j16;
        for (int i27 = 2; i27 < 10; i27 += 2) {
            copyOf[i27] = copyOf[i27] - ((long) (67108863 & i20));
            int i28 = i27 + 1;
            copyOf[i28] = copyOf[i28] - j16;
        }
        for (int i29 = 0; i29 < 10; i29++) {
            copyOf[i29] = copyOf[i29] << zzb[i29];
        }
        byte[] bArr = new byte[32];
        for (int i30 = 0; i30 < 10; i30++) {
            int[] iArr = zza;
            int i31 = iArr[i30];
            long j17 = copyOf[i30];
            bArr[i31] = (byte) ((int) (((long) bArr[i31]) | (j17 & 255)));
            int i32 = iArr[i30] + 1;
            bArr[i32] = (byte) ((int) (((long) bArr[i32]) | ((j17 >> 8) & 255)));
            int i33 = iArr[i30] + 2;
            bArr[i33] = (byte) ((int) (((long) bArr[i33]) | ((j17 >> 16) & 255)));
            int i34 = iArr[i30] + 3;
            bArr[i34] = (byte) ((int) (((j17 >> 24) & 255) | ((long) bArr[i34])));
        }
        return bArr;
    }

    static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = zza[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> zzb[i10]) & ((long) zzc[i10 & 1]);
        }
        return jArr;
    }
}
