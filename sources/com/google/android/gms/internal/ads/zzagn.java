package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagn implements zzagt {
    private final zzaah zza;
    private final zzaag zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzagn(zzaah zzaah, zzaag zzaag) {
        this.zza = zzaah;
        this.zzb = zzaag;
    }

    public final void zza(long j10) {
        this.zzc = j10;
    }

    public final long zzd(zzzv zzzv) {
        long j10 = this.zzd;
        if (j10 < 0) {
            return -1;
        }
        this.zzd = -1;
        return -(j10 + 2);
    }

    public final zzaax zze() {
        zzdl.zzf(this.zzc != -1);
        return new zzaaf(this.zza, this.zzc);
    }

    public final void zzg(long j10) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzew.zzd(jArr, j10, true, true)];
    }
}
