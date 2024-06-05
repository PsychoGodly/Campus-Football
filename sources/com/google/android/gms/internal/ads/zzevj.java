package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzevj implements zzevt {
    private final zzevt zza;
    private zzctw zzb;

    public zzevj(zzevt zzevt) {
        this.zza = zzevt;
    }

    /* renamed from: zza */
    public final synchronized zzctw zzd() {
        return this.zzb;
    }

    public final synchronized zzfut zzb(zzevu zzevu, zzevs zzevs, zzctw zzctw) {
        this.zzb = zzctw;
        if (zzevu.zza != null) {
            zzcrt zzb2 = zzctw.zzb();
            return zzb2.zzi(zzb2.zzk(zzfuj.zzh(zzevu.zza)));
        }
        return ((zzevi) this.zza).zzb(zzevu, zzevs, zzctw);
    }

    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevu, zzevs zzevs, Object obj) {
        return zzb(zzevu, zzevs, (zzctw) null);
    }
}
