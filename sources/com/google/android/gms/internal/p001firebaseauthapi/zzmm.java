package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzmm {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    static void zza(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        zzb(jArr3, jArr2);
        zzb(jArr12, jArr3);
        zzb(jArr11, jArr12);
        zza(jArr4, jArr11, jArr2);
        zza(jArr5, jArr4, jArr3);
        zzb(jArr11, jArr5);
        zza(jArr6, jArr11, jArr4);
        zzb(jArr11, jArr6);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zza(jArr7, jArr11, jArr6);
        zzb(jArr11, jArr7);
        zzb(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr8, jArr12, jArr7);
        zzb(jArr11, jArr8);
        zzb(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr8);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr9, jArr11, jArr7);
        zzb(jArr11, jArr9);
        zzb(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr10, jArr12, jArr9);
        zzb(jArr12, jArr10);
        zzb(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            zzb(jArr12, jArr11);
            zzb(jArr11, jArr12);
        }
        zza(jArr12, jArr11, jArr10);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            zzb(jArr11, jArr12);
            zzb(jArr12, jArr11);
        }
        zza(jArr11, jArr12, jArr9);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zzb(jArr11, jArr12);
        zzb(jArr12, jArr11);
        zza(jArr, jArr12, jArr5);
    }

    /* JADX WARNING: type inference failed for: r18v0, types: [long[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void zzb(long[] r18, long[] r19, long[] r20) {
        /*
            r0 = 0
            r1 = r19[r0]
            r3 = r20[r0]
            long r1 = r1 * r3
            r18[r0] = r1
            r1 = r19[r0]
            r3 = 1
            r4 = r20[r3]
            long r1 = r1 * r4
            r4 = r19[r3]
            r6 = r20[r0]
            long r4 = r4 * r6
            long r1 = r1 + r4
            r18[r3] = r1
            r1 = r19[r3]
            r4 = 2
            long r1 = r1 * r4
            r6 = r20[r3]
            long r1 = r1 * r6
            r6 = r19[r0]
            r8 = 2
            r9 = r20[r8]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r6 = r19[r8]
            r9 = r20[r0]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r18[r8] = r1
            r1 = r19[r3]
            r6 = r20[r8]
            long r1 = r1 * r6
            r6 = r19[r8]
            r9 = r20[r3]
            long r6 = r6 * r9
            long r1 = r1 + r6
            r6 = r19[r0]
            r9 = 3
            r10 = r20[r9]
            long r6 = r6 * r10
            long r1 = r1 + r6
            r6 = r19[r9]
            r10 = r20[r0]
            long r6 = r6 * r10
            long r1 = r1 + r6
            r18[r9] = r1
            r1 = r19[r8]
            r6 = r20[r8]
            long r1 = r1 * r6
            r6 = r19[r3]
            r10 = r20[r9]
            long r6 = r6 * r10
            r10 = r19[r9]
            r12 = r20[r3]
            long r10 = r10 * r12
            long r6 = r6 + r10
            long r6 = r6 * r4
            long r1 = r1 + r6
            r6 = r19[r0]
            r10 = 4
            r11 = r20[r10]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r10]
            r11 = r20[r0]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r18[r10] = r1
            r1 = r19[r8]
            r6 = r20[r9]
            long r1 = r1 * r6
            r6 = r19[r9]
            r11 = r20[r8]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r3]
            r11 = r20[r10]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r10]
            r11 = r20[r3]
            long r6 = r6 * r11
            long r1 = r1 + r6
            r6 = r19[r0]
            r11 = 5
            r12 = r20[r11]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r11]
            r12 = r20[r0]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r18[r11] = r1
            r1 = r19[r9]
            r6 = r20[r9]
            long r1 = r1 * r6
            r6 = r19[r3]
            r12 = r20[r11]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r11]
            r12 = r20[r3]
            long r6 = r6 * r12
            long r1 = r1 + r6
            long r1 = r1 * r4
            r6 = r19[r8]
            r12 = r20[r10]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r10]
            r12 = r20[r8]
            long r6 = r6 * r12
            long r1 = r1 + r6
            r6 = r19[r0]
            r12 = 6
            r13 = r20[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r12]
            r13 = r20[r0]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r18[r12] = r1
            r1 = r19[r9]
            r6 = r20[r10]
            long r1 = r1 * r6
            r6 = r19[r10]
            r13 = r20[r9]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r8]
            r13 = r20[r11]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r11]
            r13 = r20[r8]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r3]
            r13 = r20[r12]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r12]
            r13 = r20[r3]
            long r6 = r6 * r13
            long r1 = r1 + r6
            r6 = r19[r0]
            r13 = 7
            r14 = r20[r13]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r13]
            r14 = r20[r0]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r18[r13] = r1
            r1 = r19[r10]
            r6 = r20[r10]
            long r1 = r1 * r6
            r6 = r19[r9]
            r14 = r20[r11]
            long r6 = r6 * r14
            r14 = r19[r11]
            r16 = r20[r9]
            long r14 = r14 * r16
            long r6 = r6 + r14
            r14 = r19[r3]
            r16 = r20[r13]
            long r14 = r14 * r16
            long r6 = r6 + r14
            r14 = r19[r13]
            r16 = r20[r3]
            long r14 = r14 * r16
            long r6 = r6 + r14
            long r6 = r6 * r4
            long r1 = r1 + r6
            r6 = r19[r8]
            r14 = r20[r12]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r12]
            r14 = r20[r8]
            long r6 = r6 * r14
            long r1 = r1 + r6
            r6 = r19[r0]
            r14 = 8
            r15 = r20[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r14]
            r15 = r20[r0]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r18[r14] = r1
            r1 = r19[r10]
            r6 = r20[r11]
            long r1 = r1 * r6
            r6 = r19[r11]
            r15 = r20[r10]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r9]
            r15 = r20[r12]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r12]
            r15 = r20[r9]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r8]
            r15 = r20[r13]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r13]
            r15 = r20[r8]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r3]
            r15 = r20[r14]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r14]
            r15 = r20[r3]
            long r6 = r6 * r15
            long r1 = r1 + r6
            r6 = r19[r0]
            r15 = 9
            r16 = r20[r15]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r6 = r19[r15]
            r16 = r20[r0]
            long r6 = r6 * r16
            long r1 = r1 + r6
            r18[r15] = r1
            r0 = r19[r11]
            r6 = r20[r11]
            long r0 = r0 * r6
            r6 = r19[r9]
            r16 = r20[r13]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r13]
            r16 = r20[r9]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r3]
            r16 = r20[r15]
            long r6 = r6 * r16
            long r0 = r0 + r6
            r6 = r19[r15]
            r2 = r20[r3]
            long r6 = r6 * r2
            long r0 = r0 + r6
            long r0 = r0 * r4
            r2 = r19[r10]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r12]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r8]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r8]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 10
            r18[r2] = r0
            r0 = r19[r11]
            r2 = r20[r12]
            long r0 = r0 * r2
            r2 = r19[r12]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r13]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r13]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r9]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r9]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r8]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r8]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 11
            r18[r2] = r0
            r0 = r19[r12]
            r2 = r20[r12]
            long r0 = r0 * r2
            r2 = r19[r11]
            r6 = r20[r13]
            long r2 = r2 * r6
            r6 = r19[r13]
            r16 = r20[r11]
            long r6 = r6 * r16
            long r2 = r2 + r6
            r6 = r19[r9]
            r16 = r20[r15]
            long r6 = r6 * r16
            long r2 = r2 + r6
            r6 = r19[r15]
            r8 = r20[r9]
            long r6 = r6 * r8
            long r2 = r2 + r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 12
            r18[r2] = r0
            r0 = r19[r12]
            r2 = r20[r13]
            long r0 = r0 * r2
            r2 = r19[r13]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r11]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r10]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r10]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 13
            r18[r2] = r0
            r0 = r19[r13]
            r2 = r20[r13]
            long r0 = r0 * r2
            r2 = r19[r11]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r11]
            long r2 = r2 * r6
            long r0 = r0 + r2
            long r0 = r0 * r4
            r2 = r19[r12]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r14]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 14
            r18[r2] = r0
            r0 = r19[r13]
            r2 = r20[r14]
            long r0 = r0 * r2
            r2 = r19[r14]
            r6 = r20[r13]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r12]
            r6 = r20[r15]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = r19[r15]
            r6 = r20[r12]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 15
            r18[r2] = r0
            r0 = r19[r14]
            r2 = r20[r14]
            long r0 = r0 * r2
            r2 = r19[r13]
            r6 = r20[r15]
            long r2 = r2 * r6
            r6 = r19[r15]
            r8 = r20[r13]
            long r6 = r6 * r8
            long r2 = r2 + r6
            long r2 = r2 * r4
            long r0 = r0 + r2
            r2 = 16
            r18[r2] = r0
            r0 = r19[r14]
            r2 = r20[r15]
            long r0 = r0 * r2
            r2 = r19[r15]
            r6 = r20[r14]
            long r2 = r2 * r6
            long r0 = r0 + r2
            r2 = 17
            r18[r2] = r0
            r0 = r19[r15]
            long r0 = r0 * r4
            r2 = r20[r15]
            long r0 = r0 * r2
            r2 = 18
            r18[r2] = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzmm.zzb(long[], long[], long[]):void");
    }

    static void zzc(long[] jArr, long[] jArr2) {
        zzc(jArr, jArr2, jArr);
    }

    static void zzd(long[] jArr, long[] jArr2) {
        zzd(jArr, jArr, jArr2);
    }

    private static void zze(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        zzb(jArr);
        zza(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void zzc(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    static void zzd(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }

    public static byte[] zzc(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int i10 = 0; i10 < 2; i10++) {
            int i11 = 0;
            while (i11 < 9) {
                long j10 = copyOf[i11] & (copyOf[i11] >> 31);
                int[] iArr = zzd;
                int i12 = i11 & 1;
                int i13 = -((int) (j10 >> iArr[i12]));
                copyOf[i11] = copyOf[i11] + ((long) (i13 << iArr[i12]));
                i11++;
                copyOf[i11] = copyOf[i11] - ((long) i13);
            }
            int i14 = -((int) (((copyOf[9] >> 31) & copyOf[9]) >> 25));
            copyOf[9] = copyOf[9] + ((long) (i14 << 25));
            copyOf[0] = copyOf[0] - (((long) i14) * 19);
        }
        int i15 = -((int) ((copyOf[0] & (copyOf[0] >> 31)) >> 26));
        copyOf[0] = copyOf[0] + ((long) (i15 << 26));
        copyOf[1] = copyOf[1] - ((long) i15);
        for (int i16 = 0; i16 < 2; i16++) {
            int i17 = 0;
            while (i17 < 9) {
                int i18 = i17 & 1;
                int i19 = (int) (copyOf[i17] >> zzd[i18]);
                copyOf[i17] = copyOf[i17] & ((long) zzc[i18]);
                i17++;
                copyOf[i17] = copyOf[i17] + ((long) i19);
            }
        }
        int i20 = (int) (copyOf[9] >> 25);
        copyOf[9] = copyOf[9] & 33554431;
        copyOf[0] = copyOf[0] + (((long) i20) * 19);
        int i21 = ~((((int) copyOf[0]) - 67108845) >> 31);
        for (int i22 = 1; i22 < 10; i22++) {
            int i23 = ~(((int) copyOf[i22]) ^ zzc[i22 & 1]);
            int i24 = i23 & (i23 << 16);
            int i25 = i24 & (i24 << 8);
            int i26 = i25 & (i25 << 4);
            int i27 = i26 & (i26 << 2);
            i21 &= (i27 & (i27 << 1)) >> 31;
        }
        copyOf[0] = copyOf[0] - ((long) (67108845 & i21));
        long j11 = (long) (33554431 & i21);
        copyOf[1] = copyOf[1] - j11;
        for (int i28 = 2; i28 < 10; i28 += 2) {
            copyOf[i28] = copyOf[i28] - ((long) (67108863 & i21));
            int i29 = i28 + 1;
            copyOf[i29] = copyOf[i29] - j11;
        }
        for (int i30 = 0; i30 < 10; i30++) {
            copyOf[i30] = copyOf[i30] << zzb[i30];
        }
        byte[] bArr = new byte[32];
        for (int i31 = 0; i31 < 10; i31++) {
            int[] iArr2 = zza;
            int i32 = iArr2[i31];
            bArr[i32] = (byte) ((int) (((long) bArr[i32]) | (copyOf[i31] & 255)));
            int i33 = iArr2[i31] + 1;
            bArr[i33] = (byte) ((int) (((long) bArr[i33]) | ((copyOf[i31] >> 8) & 255)));
            int i34 = iArr2[i31] + 2;
            bArr[i34] = (byte) ((int) (((long) bArr[i34]) | ((copyOf[i31] >> 16) & 255)));
            int i35 = iArr2[i31] + 3;
            bArr[i35] = (byte) ((int) (((long) bArr[i35]) | ((copyOf[i31] >> 24) & 255)));
        }
        return bArr;
    }

    static void zzb(long[] jArr) {
        jArr[8] = jArr[8] + (jArr[18] << 4);
        jArr[8] = jArr[8] + (jArr[18] << 1);
        jArr[8] = jArr[8] + jArr[18];
        jArr[7] = jArr[7] + (jArr[17] << 4);
        jArr[7] = jArr[7] + (jArr[17] << 1);
        jArr[7] = jArr[7] + jArr[17];
        jArr[6] = jArr[6] + (jArr[16] << 4);
        jArr[6] = jArr[6] + (jArr[16] << 1);
        jArr[6] = jArr[6] + jArr[16];
        jArr[5] = jArr[5] + (jArr[15] << 4);
        jArr[5] = jArr[5] + (jArr[15] << 1);
        jArr[5] = jArr[5] + jArr[15];
        jArr[4] = jArr[4] + (jArr[14] << 4);
        jArr[4] = jArr[4] + (jArr[14] << 1);
        jArr[4] = jArr[4] + jArr[14];
        jArr[3] = jArr[3] + (jArr[13] << 4);
        jArr[3] = jArr[3] + (jArr[13] << 1);
        jArr[3] = jArr[3] + jArr[13];
        jArr[2] = jArr[2] + (jArr[12] << 4);
        jArr[2] = jArr[2] + (jArr[12] << 1);
        jArr[2] = jArr[2] + jArr[12];
        jArr[1] = jArr[1] + (jArr[11] << 4);
        jArr[1] = jArr[1] + (jArr[11] << 1);
        jArr[1] = jArr[1] + jArr[11];
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
    }

    static void zzb(long[] jArr, long[] jArr2) {
        zze(new long[]{jArr2[0] * jArr2[0], jArr2[0] * 2 * jArr2[1], ((jArr2[1] * jArr2[1]) + (jArr2[0] * jArr2[2])) * 2, ((jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3])) * 2, (jArr2[2] * jArr2[2]) + (jArr2[1] * 4 * jArr2[3]) + (jArr2[0] * 2 * jArr2[4]), ((jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5])) * 2, ((jArr2[3] * jArr2[3]) + (jArr2[2] * jArr2[4]) + (jArr2[0] * jArr2[6]) + (jArr2[1] * 2 * jArr2[5])) * 2, ((jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7])) * 2, (jArr2[4] * jArr2[4]) + (((jArr2[2] * jArr2[6]) + (jArr2[0] * jArr2[8]) + (((jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5])) * 2)) * 2), ((jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9])) * 2, ((jArr2[5] * jArr2[5]) + (jArr2[4] * jArr2[6]) + (jArr2[2] * jArr2[8]) + (((jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9])) * 2)) * 2, ((jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9])) * 2, (jArr2[6] * jArr2[6]) + (((jArr2[4] * jArr2[8]) + (((jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9])) * 2)) * 2), ((jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9])) * 2, ((jArr2[7] * jArr2[7]) + (jArr2[6] * jArr2[8]) + (jArr2[5] * 2 * jArr2[9])) * 2, ((jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9])) * 2, (jArr2[8] * jArr2[8]) + (jArr2[7] * 4 * jArr2[9]), jArr2[8] * 2 * jArr2[9], jArr2[9] * 2 * jArr2[9]}, jArr);
    }

    static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zze(jArr4, jArr);
    }

    static void zza(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10] / 67108864;
            jArr[i10] = jArr[i10] - (j10 << 26);
            int i11 = i10 + 1;
            jArr[i11] = jArr[i11] + j10;
            long j11 = jArr[i11] / 33554432;
            jArr[i11] = jArr[i11] - (j11 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j11;
        }
        jArr[0] = jArr[0] + (jArr[10] << 4);
        jArr[0] = jArr[0] + (jArr[10] << 1);
        jArr[0] = jArr[0] + jArr[10];
        jArr[10] = 0;
        long j12 = jArr[0] / 67108864;
        jArr[0] = jArr[0] - (j12 << 26);
        jArr[1] = jArr[1] + j12;
    }

    static void zza(long[] jArr, long[] jArr2, long j10) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] * j10;
        }
    }

    static long[] zza(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int[] iArr = zza;
            jArr[i10] = ((((((long) (bArr[iArr[i10]] & 255)) | (((long) (bArr[iArr[i10] + 1] & 255)) << 8)) | (((long) (bArr[iArr[i10] + 2] & 255)) << 16)) | (((long) (bArr[iArr[i10] + 3] & 255)) << 24)) >> zzb[i10]) & ((long) zzc[i10 & 1]);
        }
        return jArr;
    }
}
