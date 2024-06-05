package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcqe {
    private final zzcxd zza;
    private final zzczk zzb;

    public zzcqe(zzcxd zzcxd, zzczk zzczk) {
        this.zza = zzcxd;
        this.zzb = zzczk;
    }

    public final zzcxd zza() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final zzczk zzb() {
        return this.zzb;
    }

    /* access modifiers changed from: package-private */
    public final zzdbu zzc() {
        zzczk zzczk = this.zzb;
        if (zzczk != null) {
            return new zzdbu(zzczk, zzbzn.zzf);
        }
        return new zzdbu(new zzcqd(this), zzbzn.zzf);
    }
}
