package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaak {
    public final List zza;
    public final int zzb;
    public final float zzc;
    public final String zzd;

    private zzaak(List list, int i10, int i11, int i12, float f10, String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = f10;
        this.zzd = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x0379 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0382 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0397 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03a6 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011f A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0121 A[Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaak zza(com.google.android.gms.internal.ads.zzen r40) throws com.google.android.gms.internal.ads.zzbu {
        /*
            r0 = r40
            r1 = 21
            r0.zzG(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r1 = r40.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r2 = 3
            r1 = r1 & r2
            int r3 = r40.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r4 = r40.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0018:
            r8 = 1
            if (r6 >= r3) goto L_0x0035
            r0.zzG(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r8 = r40.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9 = 0
        L_0x0023:
            if (r9 >= r8) goto L_0x0032
            int r10 = r40.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r11 = r10 + 4
            int r7 = r7 + r11
            r0.zzG(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r9 = r9 + 1
            goto L_0x0023
        L_0x0032:
            int r6 = r6 + 1
            goto L_0x0018
        L_0x0035:
            r0.zzF(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            byte[] r4 = new byte[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r6 = 0
            r17 = r6
            r6 = 0
            r11 = 0
            r14 = -1
            r15 = -1
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0043:
            if (r6 >= r3) goto L_0x03f3
            int r12 = r40.zzk()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r12 = r12 & 63
            int r13 = r40.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9 = 0
        L_0x0050:
            if (r9 >= r13) goto L_0x03e2
            int r10 = r40.zzo()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            byte[] r8 = com.google.android.gms.internal.ads.zzaar.zza     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r2 = 4
            java.lang.System.arraycopy(r8, r5, r4, r11, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r11 = r11 + 4
            byte[] r8 = r40.zzH()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r5 = r40.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            java.lang.System.arraycopy(r8, r5, r4, r11, r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 33
            if (r12 != r5) goto L_0x03b9
            if (r9 != 0) goto L_0x03b9
            int r5 = r11 + r10
            int r8 = r11 + 2
            com.google.android.gms.internal.ads.zzaat r9 = new com.google.android.gms.internal.ads.zzaat     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.<init>(r4, r8, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 3
            int r8 = r9.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 2
            int r19 = r9.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r20 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r14 = 5
            int r21 = r9.zza(r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r15 = 0
            r22 = 0
        L_0x0094:
            r14 = 32
            if (r15 >= r14) goto L_0x00a6
            boolean r14 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r14 == 0) goto L_0x00a3
            r14 = 1
            int r17 = r14 << r15
            r22 = r22 | r17
        L_0x00a3:
            int r15 = r15 + 1
            goto L_0x0094
        L_0x00a6:
            r14 = 6
            int[] r15 = new int[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r2 = 0
        L_0x00aa:
            r5 = 8
            if (r2 >= r14) goto L_0x00b7
            int r5 = r9.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r15[r2] = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r2 = r2 + 1
            goto L_0x00aa
        L_0x00b7:
            int r24 = r9.zza(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r2 = 0
            r5 = 0
        L_0x00bd:
            if (r2 >= r8) goto L_0x00d2
            boolean r25 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r25 == 0) goto L_0x00c7
            int r5 = r5 + 89
        L_0x00c7:
            boolean r25 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r25 == 0) goto L_0x00cf
            int r5 = r5 + 8
        L_0x00cf:
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00d2:
            r9.zze(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r8 <= 0) goto L_0x00dd
            int r2 = 8 - r8
            int r2 = r2 + r2
            r9.zze(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x00dd:
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r5 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r2 = 3
            if (r5 != r2) goto L_0x00eb
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 3
        L_0x00eb:
            int r2 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r25 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r26 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r26 == 0) goto L_0x012e
            int r26 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r27 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r28 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r29 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r14 = 1
            if (r5 == r14) goto L_0x0119
            r14 = 2
            if (r5 != r14) goto L_0x0114
            r31 = r3
            r3 = 1
            r5 = 2
            goto L_0x011c
        L_0x0114:
            r31 = r3
            r3 = 1
            r14 = 1
            goto L_0x011d
        L_0x0119:
            r31 = r3
            r3 = 1
        L_0x011c:
            r14 = 2
        L_0x011d:
            if (r5 != r3) goto L_0x0121
            r3 = 2
            goto L_0x0122
        L_0x0121:
            r3 = 1
        L_0x0122:
            int r26 = r26 + r27
            int r14 = r14 * r26
            int r2 = r2 - r14
            int r28 = r28 + r29
            int r3 = r3 * r28
            int r25 = r25 - r3
            goto L_0x0130
        L_0x012e:
            r31 = r3
        L_0x0130:
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r3 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r5 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r14 = 1
            if (r14 == r5) goto L_0x0143
            r5 = r8
            goto L_0x0144
        L_0x0143:
            r5 = 0
        L_0x0144:
            if (r5 > r8) goto L_0x0152
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r5 = r5 + 1
            goto L_0x0144
        L_0x0152:
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r5 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r5 == 0) goto L_0x01bd
            boolean r5 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r5 == 0) goto L_0x01bd
            r5 = 0
        L_0x0171:
            r8 = 4
            if (r5 >= r8) goto L_0x01bd
            r8 = 0
        L_0x0175:
            r14 = 6
            if (r8 >= r14) goto L_0x01b3
            boolean r26 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r26 != 0) goto L_0x0187
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r27 = r2
            r28 = r12
        L_0x0185:
            r2 = 3
            goto L_0x01a8
        L_0x0187:
            r14 = 64
            int r26 = r5 + r5
            r23 = 4
            int r26 = r26 + 4
            r27 = r2
            r28 = r12
            r2 = 1
            int r12 = r2 << r26
            int r12 = java.lang.Math.min(r14, r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r5 <= r2) goto L_0x019f
            r9.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x019f:
            r2 = 0
        L_0x01a0:
            if (r2 >= r12) goto L_0x0185
            r9.zzb()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r2 = r2 + 1
            goto L_0x01a0
        L_0x01a8:
            if (r5 != r2) goto L_0x01ac
            r12 = 3
            goto L_0x01ad
        L_0x01ac:
            r12 = 1
        L_0x01ad:
            int r8 = r8 + r12
            r2 = r27
            r12 = r28
            goto L_0x0175
        L_0x01b3:
            r27 = r2
            r28 = r12
            r2 = 3
            int r5 = r5 + 1
            r2 = r27
            goto L_0x0171
        L_0x01bd:
            r27 = r2
            r28 = r12
            r2 = 3
            r5 = 2
            r9.zze(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r5 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r5 == 0) goto L_0x01da
            r5 = 8
            r9.zze(r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x01da:
            int r5 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r8 = 0
            int[] r12 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int[] r14 = new int[r8]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r26 = r13
            r2 = 0
            r8 = -1
            r13 = -1
        L_0x01e8:
            if (r2 >= r5) goto L_0x0308
            if (r2 == 0) goto L_0x02bc
            boolean r29 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r29 == 0) goto L_0x02bc
            r29 = r5
            int r5 = r8 + r13
            boolean r30 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r32 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r18 = 1
            int r32 = r32 + 1
            int r30 = r30 + r30
            int r30 = 1 - r30
            r33 = r1
            int r1 = r5 + 1
            r34 = r4
            boolean[] r4 = new boolean[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r35 = r7
            r7 = 0
        L_0x0211:
            if (r7 > r5) goto L_0x0227
            boolean r36 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r36 != 0) goto L_0x0220
            boolean r36 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r4[r7] = r36     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            goto L_0x0224
        L_0x0220:
            r18 = 1
            r4[r7] = r18     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x0224:
            int r7 = r7 + 1
            goto L_0x0211
        L_0x0227:
            int r7 = r13 + -1
            r36 = r7
            int[] r7 = new int[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int[] r1 = new int[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r37 = 0
        L_0x0231:
            int r38 = r30 * r32
            if (r36 < 0) goto L_0x024a
            r39 = r14[r36]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r39 = r39 + r38
            if (r39 >= 0) goto L_0x0247
            int r38 = r8 + r36
            boolean r38 = r4[r38]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r38 == 0) goto L_0x0247
            int r38 = r37 + 1
            r7[r37] = r39     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r37 = r38
        L_0x0247:
            int r36 = r36 + -1
            goto L_0x0231
        L_0x024a:
            if (r38 >= 0) goto L_0x0256
            boolean r30 = r4[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r30 == 0) goto L_0x0256
            int r30 = r37 + 1
            r7[r37] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r37 = r30
        L_0x0256:
            r30 = r6
            r6 = r37
            r0 = 0
        L_0x025b:
            if (r0 >= r8) goto L_0x0270
            r32 = r12[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r32 = r32 + r38
            if (r32 >= 0) goto L_0x026d
            boolean r36 = r4[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r36 == 0) goto L_0x026d
            int r36 = r6 + 1
            r7[r6] = r32     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r6 = r36
        L_0x026d:
            int r0 = r0 + 1
            goto L_0x025b
        L_0x0270:
            int[] r0 = java.util.Arrays.copyOf(r7, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r7 = r8 + -1
            r32 = 0
        L_0x0278:
            if (r7 < 0) goto L_0x028d
            r36 = r12[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r36 = r36 + r38
            if (r36 <= 0) goto L_0x028a
            boolean r37 = r4[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r37 == 0) goto L_0x028a
            int r37 = r32 + 1
            r1[r32] = r36     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r32 = r37
        L_0x028a:
            int r7 = r7 + -1
            goto L_0x0278
        L_0x028d:
            if (r38 <= 0) goto L_0x0299
            boolean r5 = r4[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r5 == 0) goto L_0x0299
            int r5 = r32 + 1
            r1[r32] = r38     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r32 = r5
        L_0x0299:
            r5 = r32
            r7 = 0
        L_0x029c:
            if (r7 >= r13) goto L_0x02b3
            r12 = r14[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r12 = r12 + r38
            if (r12 <= 0) goto L_0x02b0
            int r32 = r8 + r7
            boolean r32 = r4[r32]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r32 == 0) goto L_0x02b0
            int r32 = r5 + 1
            r1[r5] = r12     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = r32
        L_0x02b0:
            int r7 = r7 + 1
            goto L_0x029c
        L_0x02b3:
            int[] r1 = java.util.Arrays.copyOf(r1, r5)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r12 = r0
            r14 = r1
            r13 = r5
            r8 = r6
            goto L_0x02f8
        L_0x02bc:
            r33 = r1
            r34 = r4
            r29 = r5
            r30 = r6
            r35 = r7
            int r0 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r1 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int[] r4 = new int[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r5 = 0
        L_0x02d1:
            if (r5 >= r0) goto L_0x02e1
            int r6 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r7 = 1
            int r6 = r6 + r7
            r4[r5] = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r5 = r5 + 1
            goto L_0x02d1
        L_0x02e1:
            int[] r5 = new int[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r6 = 0
        L_0x02e4:
            if (r6 >= r1) goto L_0x02f4
            int r7 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r8 = 1
            int r7 = r7 + r8
            r5[r6] = r7     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r6 = r6 + 1
            goto L_0x02e4
        L_0x02f4:
            r8 = r0
            r13 = r1
            r12 = r4
            r14 = r5
        L_0x02f8:
            int r2 = r2 + 1
            r0 = r40
            r5 = r29
            r6 = r30
            r1 = r33
            r4 = r34
            r7 = r35
            goto L_0x01e8
        L_0x0308:
            r33 = r1
            r34 = r4
            r30 = r6
            r35 = r7
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x0326
            r0 = 0
        L_0x0317:
            int r1 = r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 >= r1) goto L_0x0326
            r1 = 5
            int r14 = r3 + 5
            r9.zze(r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r0 = r0 + 1
            goto L_0x0317
        L_0x0326:
            r0 = 2
            r9.zze(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x03a9
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x0371
            r0 = 8
            int r0 = r9.zza(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1 = 255(0xff, float:3.57E-43)
            if (r0 != r1) goto L_0x0352
            r0 = 16
            int r1 = r9.zza(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            int r0 = r9.zza(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r1 == 0) goto L_0x0371
            if (r0 == 0) goto L_0x0371
            float r1 = (float) r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            float r0 = (float) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            float r1 = r1 / r0
            goto L_0x0373
        L_0x0352:
            r1 = 17
            if (r0 >= r1) goto L_0x035b
            float[] r1 = com.google.android.gms.internal.ads.zzaar.zzb     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1 = r1[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            goto L_0x0373
        L_0x035b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1.<init>()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            java.lang.String r2 = "Unexpected aspect_ratio_idc value: "
            r1.append(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1.append(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            java.lang.String r0 = r1.toString()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            java.lang.String r1 = "NalUnitUtil"
            com.google.android.gms.internal.ads.zzee.zze(r1, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x0371:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0373:
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x037c
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x037c:
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x0391
            r0 = 4
            r9.zze(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x0391
            r0 = 24
            r9.zze(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x0391:
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x039d
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r9.zzc()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x039d:
            r9.zzd()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            boolean r0 = r9.zzf()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            if (r0 == 0) goto L_0x03ab
            int r25 = r25 + r25
            goto L_0x03ab
        L_0x03a9:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x03ab:
            r23 = r15
            java.lang.String r17 = com.google.android.gms.internal.ads.zzdn.zzb(r19, r20, r21, r22, r23, r24)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r16 = r1
            r15 = r25
            r14 = r27
            r9 = 0
            goto L_0x03c7
        L_0x03b9:
            r33 = r1
            r31 = r3
            r34 = r4
            r30 = r6
            r35 = r7
            r28 = r12
            r26 = r13
        L_0x03c7:
            int r11 = r11 + r10
            r0 = r40
            r0.zzG(r10)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1 = 1
            int r9 = r9 + r1
            r13 = r26
            r12 = r28
            r6 = r30
            r3 = r31
            r1 = r33
            r4 = r34
            r7 = r35
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0050
        L_0x03e2:
            r33 = r1
            r31 = r3
            r34 = r4
            r30 = r6
            r35 = r7
            int r6 = r30 + 1
            r2 = 3
            r5 = 0
            r8 = 1
            goto L_0x0043
        L_0x03f3:
            r33 = r1
            r34 = r4
            r35 = r7
            if (r35 != 0) goto L_0x0400
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            goto L_0x0404
        L_0x0400:
            java.util.List r0 = java.util.Collections.singletonList(r34)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
        L_0x0404:
            r12 = r0
            com.google.android.gms.internal.ads.zzaak r0 = new com.google.android.gms.internal.ads.zzaak     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            r1 = 1
            int r13 = r33 + 1
            r11 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x040f }
            return r0
        L_0x040f:
            r0 = move-exception
            java.lang.String r1 = "Error parsing HEVC config"
            com.google.android.gms.internal.ads.zzbu r0 = com.google.android.gms.internal.ads.zzbu.zza(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaak.zza(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzaak");
    }
}
