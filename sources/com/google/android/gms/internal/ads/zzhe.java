package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzhe {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzi = 1.03f;
    private float zzj = 0.97f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    /* synthetic */ zzhe(float f10, float f11, long j10, float f12, long j11, long j12, float f13, zzhd zzhd) {
        this.zza = j11;
        this.zzb = j12;
    }

    private static long zzf(long j10, long j11, float f10) {
        return (long) ((((float) j10) * 0.999f) + (((float) j11) * 9.999871E-4f));
    }

    private final void zzg() {
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            long j11 = this.zzd;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.zzf;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.zzg;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.zze != j10) {
            this.zze = j10;
            this.zzh = j10;
            this.zzm = -9223372036854775807L;
            this.zzn = -9223372036854775807L;
            this.zzl = -9223372036854775807L;
        }
    }

    public final float zza(long j10, long j11) {
        long j12;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j13 = j10 - j11;
        long j14 = this.zzm;
        if (j14 == -9223372036854775807L) {
            this.zzm = j13;
            this.zzn = 0;
        } else {
            long max = Math.max(j13, zzf(j14, j13, 0.999f));
            this.zzm = max;
            this.zzn = zzf(this.zzn, Math.abs(j13 - max), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j15 = this.zzm + (this.zzn * 3);
        if (this.zzh > j15) {
            float zzv = (float) zzew.zzv(1000);
            long[] jArr = {j15, this.zze, this.zzh - (((long) ((this.zzk - 4.0f) * zzv)) + ((long) ((this.zzi - 4.0f) * zzv)))};
            j12 = jArr[0];
            for (int i10 = 1; i10 < 3; i10++) {
                long j16 = jArr[i10];
                if (j16 > j12) {
                    j12 = j16;
                }
            }
            this.zzh = j12;
        } else {
            j12 = zzew.zzr(j10 - ((long) (Math.max(0.0f, this.zzk - 4.0f) / 1.0E-7f)), this.zzh, j15);
            this.zzh = j12;
            long j17 = this.zzg;
            if (j17 != -9223372036854775807L && j12 > j17) {
                this.zzh = j17;
                j12 = j17;
            }
        }
        long j18 = j10 - j12;
        if (Math.abs(j18) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float zza2 = zzew.zza((((float) j18) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
        this.zzk = zza2;
        return zza2;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j10 = this.zzh;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.zzb;
            this.zzh = j11;
            long j12 = this.zzg;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.zzh = j12;
            }
            this.zzl = -9223372036854775807L;
        }
    }

    public final void zzd(zzaw zzaw) {
        long j10 = zzaw.zzc;
        this.zzc = zzew.zzv(-9223372036854775807L);
        this.zzf = zzew.zzv(-9223372036854775807L);
        this.zzg = zzew.zzv(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j10) {
        this.zzd = j10;
        zzg();
    }
}
