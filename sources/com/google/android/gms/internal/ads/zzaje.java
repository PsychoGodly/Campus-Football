package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaje implements zzajf {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzzx zzc;
    private final zzabb zzd;
    private final zzaji zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzen zzh;
    private final int zzi;
    private final zzaf zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzaje(zzzx zzzx, zzabb zzabb, zzaji zzaji) throws zzbu {
        this.zzc = zzzx;
        this.zzd = zzabb;
        this.zze = zzaji;
        int max = Math.max(1, zzaji.zzc / 10);
        this.zzi = max;
        zzen zzen = new zzen(zzaji.zzf);
        zzen.zzi();
        int zzi2 = zzen.zzi();
        this.zzf = zzi2;
        int i10 = zzaji.zzb;
        int i11 = (((zzaji.zzd - (i10 * 4)) * 8) / (zzaji.zze * i10)) + 1;
        if (zzi2 == i11) {
            int zze2 = zzew.zze(max, zzi2);
            this.zzg = new byte[(zzaji.zzd * zze2)];
            this.zzh = new zzen(zze2 * (zzi2 + zzi2) * i10);
            int i12 = ((zzaji.zzc * zzaji.zzd) * 8) / zzi2;
            zzad zzad = new zzad();
            zzad.zzS("audio/raw");
            zzad.zzv(i12);
            zzad.zzO(i12);
            zzad.zzL((max + max) * i10);
            zzad.zzw(zzaji.zzb);
            zzad.zzT(zzaji.zzc);
            zzad.zzN(2);
            this.zzj = zzad.zzY();
            return;
        }
        throw zzbu.zza("Expected frames per block: " + i11 + "; got: " + zzi2, (Throwable) null);
    }

    private final int zzd(int i10) {
        int i11 = this.zze.zzb;
        return i10 / (i11 + i11);
    }

    private final int zze(int i10) {
        return (i10 + i10) * this.zze.zzb;
    }

    private final void zzf(int i10) {
        long zzw = this.zzl + zzew.zzw(this.zzn, 1000000, (long) this.zze.zzc);
        int zze2 = zze(i10);
        this.zzd.zzs(zzw, 1, zze2, this.zzm - zze2, (zzaba) null);
        this.zzn += (long) i10;
        this.zzm -= zze2;
    }

    public final void zza(int i10, long j10) {
        this.zzc.zzN(new zzajl(this.zze, this.zzf, (long) i10, j10));
        this.zzd.zzk(this.zzj);
    }

    public final void zzb(long j10) {
        this.zzk = 0;
        this.zzl = j10;
        this.zzm = 0;
        this.zzn = 0;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0044 A[EDGE_INSN: B:38:0x0044->B:10:0x0044 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    public final boolean zzc(com.google.android.gms.internal.ads.zzzv r21, long r22) throws java.io.IOException {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            int r3 = r0.zzi
            int r4 = r0.zzm
            int r4 = r0.zzd(r4)
            int r3 = r3 - r4
            int r4 = r0.zzf
            int r3 = com.google.android.gms.internal.ads.zzew.zze(r3, r4)
            com.google.android.gms.internal.ads.zzaji r4 = r0.zze
            int r4 = r4.zzd
            int r3 = r3 * r4
            r6 = 0
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0021
        L_0x001f:
            r6 = 1
            goto L_0x0022
        L_0x0021:
            r6 = 0
        L_0x0022:
            if (r6 != 0) goto L_0x0044
            int r7 = r0.zzk
            if (r7 >= r3) goto L_0x0044
            int r7 = r3 - r7
            long r7 = (long) r7
            long r7 = java.lang.Math.min(r7, r1)
            int r8 = (int) r7
            byte[] r7 = r0.zzg
            int r9 = r0.zzk
            r10 = r21
            int r7 = r10.zza(r7, r9, r8)
            r8 = -1
            if (r7 != r8) goto L_0x003e
            goto L_0x001f
        L_0x003e:
            int r8 = r0.zzk
            int r8 = r8 + r7
            r0.zzk = r8
            goto L_0x0022
        L_0x0044:
            int r1 = r0.zzk
            com.google.android.gms.internal.ads.zzaji r2 = r0.zze
            int r2 = r2.zzd
            int r1 = r1 / r2
            if (r1 <= 0) goto L_0x0147
            byte[] r2 = r0.zzg
            com.google.android.gms.internal.ads.zzen r3 = r0.zzh
            r7 = 0
        L_0x0052:
            if (r7 >= r1) goto L_0x0112
            r8 = 0
        L_0x0055:
            com.google.android.gms.internal.ads.zzaji r9 = r0.zze
            int r10 = r9.zzb
            if (r8 >= r10) goto L_0x010a
            byte[] r11 = r3.zzH()
            int r9 = r9.zzd
            int r12 = r7 * r9
            int r9 = r9 / r10
            int r9 = r9 + -4
            int r13 = r8 * 4
            int r12 = r12 + r13
            int r13 = r12 + 1
            byte r13 = r2[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            byte r14 = r2[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r15 = r12 + 2
            byte r15 = r2[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r4 = 88
            int r15 = java.lang.Math.min(r15, r4)
            int[] r16 = zzb
            r16 = r16[r15]
            int r4 = r0.zzf
            int r4 = r4 * r7
            int r4 = r4 * r10
            int r4 = r4 + r8
            int r13 = r13 << 8
            r13 = r13 | r14
            short r13 = (short) r13
            r14 = r13 & 255(0xff, float:3.57E-43)
            int r4 = r4 + r4
            byte r14 = (byte) r14
            r11[r4] = r14
            int r14 = r13 >> 8
            int r17 = r4 + 1
            byte r14 = (byte) r14
            r11[r17] = r14
            r14 = 0
        L_0x009c:
            int r5 = r9 + r9
            if (r14 >= r5) goto L_0x0102
            int r5 = r10 * 4
            int r5 = r5 + r12
            int r18 = r14 / 8
            int r19 = r14 / 2
            int r19 = r19 % 4
            int r18 = r18 * r10
            int r18 = r18 * 4
            int r5 = r5 + r18
            int r5 = r5 + r19
            byte r5 = r2[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r18 = r14 % 2
            if (r18 != 0) goto L_0x00bc
            r5 = r5 & 15
            goto L_0x00be
        L_0x00bc:
            int r5 = r5 >> 4
        L_0x00be:
            r18 = r5 & 7
            int r18 = r18 + r18
            r17 = 1
            int r18 = r18 + 1
            int r18 = r18 * r16
            r16 = r5 & 8
            r19 = r2
            int r2 = r18 >> 3
            if (r16 == 0) goto L_0x00d1
            int r2 = -r2
        L_0x00d1:
            int r13 = r13 + r2
            int r2 = r10 + r10
            int r4 = r4 + r2
            r2 = -32768(0xffffffffffff8000, float:NaN)
            r22 = r9
            r9 = 32767(0x7fff, float:4.5916E-41)
            int r13 = com.google.android.gms.internal.ads.zzew.zzf(r13, r2, r9)
            r2 = r13 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r11[r4] = r2
            int r2 = r4 + 1
            int r9 = r13 >> 8
            byte r9 = (byte) r9
            r11[r2] = r9
            int[] r2 = zza
            r2 = r2[r5]
            int r15 = r15 + r2
            r2 = 88
            r5 = 0
            int r15 = com.google.android.gms.internal.ads.zzew.zzf(r15, r5, r2)
            int[] r5 = zzb
            r16 = r5[r15]
            int r14 = r14 + 1
            r9 = r22
            r2 = r19
            goto L_0x009c
        L_0x0102:
            r19 = r2
            r17 = 1
            int r8 = r8 + 1
            goto L_0x0055
        L_0x010a:
            r19 = r2
            r17 = 1
            int r7 = r7 + 1
            goto L_0x0052
        L_0x0112:
            int r2 = r0.zzf
            int r2 = r2 * r1
            int r2 = r0.zze(r2)
            r4 = 0
            r3.zzF(r4)
            r3.zzE(r2)
            int r2 = r0.zzk
            com.google.android.gms.internal.ads.zzaji r3 = r0.zze
            int r3 = r3.zzd
            int r1 = r1 * r3
            int r2 = r2 - r1
            r0.zzk = r2
            com.google.android.gms.internal.ads.zzen r1 = r0.zzh
            int r2 = r1.zzd()
            com.google.android.gms.internal.ads.zzabb r3 = r0.zzd
            com.google.android.gms.internal.ads.zzaaz.zzb(r3, r1, r2)
            int r1 = r0.zzm
            int r1 = r1 + r2
            r0.zzm = r1
            int r1 = r0.zzd(r1)
            int r2 = r0.zzi
            if (r1 < r2) goto L_0x0147
            r0.zzf(r2)
        L_0x0147:
            if (r6 == 0) goto L_0x0154
            int r1 = r0.zzm
            int r1 = r0.zzd(r1)
            if (r1 <= 0) goto L_0x0154
            r0.zzf(r1)
        L_0x0154:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaje.zzc(com.google.android.gms.internal.ads.zzzv, long):boolean");
    }
}
