package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeuu implements zzevt {
    private zzctw zza;
    private final Executor zzb = zzfva.zzb();

    public final zzctw zza() {
        return this.zza;
    }

    public final zzfut zzb(zzevu zzevu, zzevs zzevs, zzctw zzctw) {
        zzctv zza2 = zzevs.zza(zzevu.zzb);
        zza2.zzb(new zzevx(true));
        zzctw zzctw2 = (zzctw) zza2.zzh();
        this.zza = zzctw2;
        zzcrt zzb2 = zzctw2.zzb();
        zzfas zzfas = new zzfas();
        return zzfuj.zzl(zzfuj.zzm(zzfua.zzv(zzb2.zzj()), new zzeus(this, zzfas, zzb2), this.zzb), new zzeut(zzfas), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzfut zzc(zzevu zzevu, zzevs zzevs, Object obj) {
        return zzb(zzevu, zzevs, (zzctw) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
