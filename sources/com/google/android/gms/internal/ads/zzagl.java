package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagl implements zzaax {
    final /* synthetic */ zzagm zza;

    /* synthetic */ zzagl(zzagm zzagm, zzagk zzagk) {
        this.zza = zzagm;
    }

    public final long zze() {
        zzagm zzagm = this.zza;
        return zzagm.zzd.zzf(zzagm.zzf);
    }

    public final zzaav zzg(long j10) {
        zzagm zzagm = this.zza;
        zzaay zzaay = new zzaay(j10, zzew.zzr((zzagm.zzb + ((zzagm.zzd.zzg(j10) * (zzagm.zzc - zzagm.zzb)) / zzagm.zzf)) - 30000, zzagm.zzb, zzagm.zzc - 1));
        return new zzaav(zzaay, zzaay);
    }

    public final boolean zzh() {
        return true;
    }
}
