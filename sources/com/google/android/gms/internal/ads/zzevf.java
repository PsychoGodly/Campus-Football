package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzevf implements zzevt {
    private final zzfaj zza;
    private final Executor zzb;
    private final zzfuf zzc = new zzevd(this);

    public zzevf(zzfaj zzfaj, Executor executor) {
        this.zza = zzfaj;
        this.zzb = executor;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zza(zzctw zzctw, zzevo zzevo) throws Exception {
        zzfat zzfat = zzevo.zzb;
        zzbtn zzbtn = zzevo.zza;
        zzfas zzb2 = zzfat != null ? this.zza.zzb(zzfat) : null;
        if (zzfat == null) {
            return zzfuj.zzh((Object) null);
        }
        if (!(zzb2 == null || zzbtn == null)) {
            zzfuj.zzq(zzctw.zzb().zzh(zzbtn), this.zzc, this.zzb);
        }
        return zzfuj.zzh(new zzeve(zzfat, zzbtn, zzb2));
    }

    public final zzfut zzb(zzevu zzevu, zzevs zzevs, zzctw zzctw) {
        return zzfuj.zze(zzfuj.zzm(zzfua.zzv(new zzevp(this.zza, zzctw, this.zzb).zzc()), new zzevb(this, zzctw), this.zzb), Exception.class, new zzevc(this), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevu, zzevs zzevs, Object obj) {
        return zzb(zzevu, zzevs, (zzctw) null);
    }

    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}
