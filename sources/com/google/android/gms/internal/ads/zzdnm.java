package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdnm implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzdnm(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4, zzgxl zzgxl5) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
        this.zzd = zzgxl4;
        this.zze = zzgxl5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcgj) this.zza).zza();
        String zza3 = ((zzdtx) this.zzb).zzb();
        zzbzg zza4 = ((zzcgu) this.zzc).zza();
        zzawo zzawo = (zzawo) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzawe zzawe = new zzawe(new zzawk(zza2));
        zzazd zza5 = zzaze.zza();
        zza5.zza(zza4.zzb);
        zza5.zzc(zza4.zzc);
        zza5.zzb(true != zza4.zzd ? 2 : 0);
        zzawe.zzb(new zzdnl(zzawo, zza3, (zzaze) zza5.zzal(), str));
        return zzawe;
    }
}
