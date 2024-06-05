package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcjq implements zzewi {
    private final zzchy zza;
    private final zzcjq zzb = this;
    private final zzgxl zzc;
    private final zzgxl zzd;
    private final zzgxl zze;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;

    /* synthetic */ zzcjq(zzchy zzchy, Context context, String str, z4 z4Var, zzcjp zzcjp) {
        this.zza = zzchy;
        zzgwy zza2 = zzgwz.zza(context);
        this.zzc = zza2;
        zzgwy zza3 = zzgwz.zza(z4Var);
        this.zzd = zza3;
        zzgwy zza4 = zzgwz.zza(str);
        this.zze = zza4;
        zzgxl zzc2 = zzgwx.zzc(new zzeic(zzchy.zzo));
        this.zzf = zzc2;
        zzgxl zzc3 = zzgwx.zzc(new zzexg(zzchy.zzaE));
        this.zzg = zzc3;
        zzgwy zzgwy = zza2;
        zzgxl zzc4 = zzgwx.zzc(new zzewg(zzgwy, zzchy.zzp, zzchy.zzU, zzc2, zzc3, zzeyz.zza()));
        this.zzh = zzc4;
        this.zzi = zzgwx.zzc(new zzeik(zzgwy, zza3, zza4, zzc4, zzc2, zzc3, zzchy.zzi, zzchy.zzV));
    }

    public final zzeij zza() {
        return (zzeij) this.zzi.zzb();
    }
}
