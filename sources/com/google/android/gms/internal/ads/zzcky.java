package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcky implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcky(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    public final /* synthetic */ Object zzb() {
        zzbmu zzbmu = new zzbmu();
        String str = (String) this.zzb.zzb();
        return ((Boolean) zzbcm.zza.zze()).booleanValue() ? new zzbmt(zzbmu, str) : new zzbzf(str);
    }
}
