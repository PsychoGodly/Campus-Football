package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzaaf implements zzaax {
    private final zzaah zza;
    private final long zzb;

    public zzaaf(zzaah zzaah, long j10) {
        this.zza = zzaah;
        this.zzb = j10;
    }

    private final zzaay zza(long j10, long j11) {
        return new zzaay((j10 * 1000000) / ((long) this.zza.zze), this.zzb + j11);
    }

    public final long zze() {
        return this.zza.zza();
    }

    public final zzaav zzg(long j10) {
        long j11;
        zzdl.zzb(this.zza.zzk);
        zzaah zzaah = this.zza;
        zzaag zzaag = zzaah.zzk;
        long[] jArr = zzaag.zza;
        long[] jArr2 = zzaag.zzb;
        int zzd = zzew.zzd(jArr, zzaah.zzb(j10), true, false);
        long j12 = 0;
        if (zzd == -1) {
            j11 = 0;
        } else {
            j11 = jArr[zzd];
        }
        if (zzd != -1) {
            j12 = jArr2[zzd];
        }
        zzaay zza2 = zza(j11, j12);
        if (zza2.zzb == j10 || zzd == jArr.length - 1) {
            return new zzaav(zza2, zza2);
        }
        int i10 = zzd + 1;
        return new zzaav(zza2, zza(jArr[i10], jArr2[i10]));
    }

    public final boolean zzh() {
        return true;
    }
}
