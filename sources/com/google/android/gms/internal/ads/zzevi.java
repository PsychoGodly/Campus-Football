package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzevi implements zzevt {
    private zzctw zza;

    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zza;
    }

    public final synchronized zzfut zzb(zzevu zzevu, zzevs zzevs, zzctw zzctw) {
        zzcrt zzb;
        if (zzctw != null) {
            this.zza = zzctw;
        } else {
            this.zza = (zzctw) zzevs.zza(zzevu.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevu, zzevs zzevs, Object obj) {
        return zzb(zzevu, zzevs, (zzctw) null);
    }
}
