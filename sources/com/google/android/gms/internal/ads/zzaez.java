package com.google.android.gms.internal.ads;

import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaez implements zzafe {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzaez(long[] jArr, long[] jArr2, long j10) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j10 == -9223372036854775807L ? zzew.zzv(jArr2[jArr2.length - 1]) : j10;
    }

    public static zzaez zza(long j10, zzadt zzadt, long j11) {
        int length = zzadt.zzd.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzadt.zzb + zzadt.zzd[i12]);
            j12 += (long) (zzadt.zzc + zzadt.zze[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new zzaez(jArr, jArr2, j11);
    }

    private static Pair zzd(long j10, long[] jArr, long[] jArr2) {
        int zzd = zzew.zzd(jArr, j10, true, true);
        long j11 = jArr[zzd];
        long j12 = jArr2[zzd];
        int i10 = zzd + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (((double) j10) - ((double) j11)) / ((double) (j13 - j11))) * ((double) (jArr2[i10] - j12)))) + j12));
    }

    public final long zzb() {
        return -1;
    }

    public final long zzc(long j10) {
        return zzew.zzv(((Long) zzd(j10, this.zza, this.zzb).second).longValue());
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzaav zzg(long j10) {
        Pair zzd = zzd(zzew.zzz(zzew.zzr(j10, 0, this.zzc)), this.zzb, this.zza);
        zzaay zzaay = new zzaay(zzew.zzv(((Long) zzd.first).longValue()), ((Long) zzd.second).longValue());
        return new zzaav(zzaay, zzaay);
    }

    public final boolean zzh() {
        return true;
    }
}
