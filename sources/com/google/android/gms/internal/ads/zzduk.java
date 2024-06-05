package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzduk implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;

    public zzduk(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5, zzgxl zzgxl6, zzgxl zzgxl7) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
        this.zzf = zzgxl6;
        this.zzg = zzgxl7;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcgj) this.zza).zza();
        zzeyx zza3 = ((zzcuf) this.zzb).zza();
        zzdtj zza4 = ((zzdtk) this.zzc).zzb();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return new zzduj(zza2, zza3, zza4, zzfuu, (ScheduledExecutorService) this.zze.zzb(), (zzdzf) this.zzf.zzb(), (zzfen) this.zzg.zzb());
    }
}
