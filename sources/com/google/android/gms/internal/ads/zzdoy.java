package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdoy implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdoy(zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
        this.zzc = zzgxl3;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        zzdpl zzdpl = (zzdpl) this.zza.zzb();
        zzfuu zzfuu = zzbzn.zza;
        zzgxg.zzb(zzfuu);
        return ((Boolean) a0.c().zzb(zzbar.zzhS)).booleanValue() ? new zzdbu((zzdys) this.zzc.zzb(), zzfuu) : new zzdbu(zzdpl, zzfuu);
    }
}
