package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzevp {
    private final zzfaj zza;
    private final zzctw zzb;
    private final Executor zzc;
    /* access modifiers changed from: private */
    public zzevo zzd;

    public zzevp(zzfaj zzfaj, zzctw zzctw, Executor executor) {
        this.zza = zzfaj;
        this.zzb = zzctw;
        this.zzc = executor;
    }

    /* access modifiers changed from: private */
    @Deprecated
    public final zzfat zze() {
        zzeyx zzg = this.zzb.zzg();
        return this.zza.zzc(zzg.zzd, zzg.zzf, zzg.zzj);
    }

    public final zzfut zzc() {
        zzfut zzfut;
        zzevo zzevo = this.zzd;
        if (zzevo != null) {
            return zzfuj.zzh(zzevo);
        }
        if (!((Boolean) zzbcr.zza.zze()).booleanValue()) {
            zzevo zzevo2 = new zzevo((zzbtn) null, zze(), (zzevn) null);
            this.zzd = zzevo2;
            zzfut = zzfuj.zzh(zzevo2);
        } else {
            zzfut = zzfuj.zze(zzfuj.zzl(zzfua.zzv(this.zzb.zzb().zze(this.zza.zza())), new zzevm(this), this.zzc), zzdvi.class, new zzevl(this), this.zzc);
        }
        return zzfuj.zzl(zzfut, zzevk.zza, this.zzc);
    }
}
