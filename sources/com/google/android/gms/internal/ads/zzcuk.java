package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcuk implements zzgwy {
    private final zzcuj zza;
    private final zzgxl zzb;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;

    public zzcuk(zzcuj zzcuj, zzgxl zzgxl, zzgxl zzgxl2, zzgxl zzgxl3, zzgxl zzgxl4) {
        this.zza = zzcuj;
        this.zzb = zzgxl;
        this.zzc = zzgxl2;
        this.zzd = zzgxl3;
        this.zze = zzgxl4;
    }

    public final /* synthetic */ Object zzb() {
        String str;
        Context context = (Context) this.zzb.zzb();
        zzbzg zza2 = ((zzcgu) this.zzc).zza();
        zzeyc zza3 = ((zzcrc) this.zzd).zza();
        zzbvx zzbvx = new zzbvx();
        if (zza3.zzB == null) {
            return null;
        }
        zzeyh zzeyh = zza3.zzt;
        if (zzeyh == null) {
            str = null;
        } else {
            str = zzeyh.zzb;
        }
        return new zzbvw(context, zza2, zza3.zzB, str, zzbvx, (byte[]) null);
    }
}
