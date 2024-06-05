package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcii implements zzetd {
    private final zzchy zza;
    private final zzcii zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;

    /* synthetic */ zzcii(zzchy zzchy, Context context, String str, zzcih zzcih) {
        this.zza = zzchy;
        zzgwy zza2 = zzgwz.zza(context);
        this.zzc = zza2;
        zzgwy zza3 = zzgwz.zza(str);
        this.zzd = zza3;
        zzevv zzevv = new zzevv(zza2, zzchy.zzaE, zzchy.zzaF);
        this.zze = zzevv;
        zzgxl zzc2 = zzgwx.zzc(new zzeub(zzchy.zzaE));
        this.zzf = zzc2;
        zzgxl zzgxl = zzc2;
        zzgxl zzc3 = zzgwx.zzc(new zzeud(zza2, zzchy.zzp, zzchy.zzU, zzevv, zzgxl, zzeyz.zza(), zzchy.zzi));
        this.zzg = zzc3;
        this.zzh = zzgwx.zzc(new zzeuj(zzchy.zzU, zza2, zza3, zzc3, zzgxl, zzchy.zzi));
    }

    public final zzeui zza() {
        return (zzeui) this.zzh.zzb();
    }
}
