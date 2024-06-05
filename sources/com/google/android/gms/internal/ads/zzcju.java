package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcju implements zzexw {
    private final zzchy zza;
    private final zzcju zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;

    /* synthetic */ zzcju(zzchy zzchy, Context context, String str, zzcjt zzcjt) {
        this.zza = zzchy;
        zzgwy zza2 = zzgwz.zza(context);
        this.zzc = zza2;
        zzevw zzevw = new zzevw(zza2, zzchy.zzaE, zzchy.zzaF);
        this.zzd = zzevw;
        zzgxl zzc2 = zzgwx.zzc(new zzexg(zzchy.zzaE));
        this.zze = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzeyu.zza());
        this.zzf = zzc3;
        zzgxl zzc4 = zzgwx.zzc(new zzexq(zza2, zzchy.zzp, zzchy.zzU, zzevw, zzc2, zzeyz.zza(), zzc3));
        this.zzg = zzc4;
        this.zzh = zzgwx.zzc(new zzeya(zzc4, zzc2, zzc3));
        zzgwy zzc5 = zzgwz.zzc(str);
        this.zzi = zzc5;
        this.zzj = zzgwx.zzc(new zzexu(zzc5, zzc4, zza2, zzc2, zzc3, zzchy.zzi, zzchy.zzV));
    }

    public final zzext zza() {
        return (zzext) this.zzj.zzb();
    }

    public final zzexz zzb() {
        return (zzexz) this.zzh.zzb();
    }
}
