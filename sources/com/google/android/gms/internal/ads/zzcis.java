package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.z4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcis implements zzeur {
    private final Context zza;
    private final z4 zzb;
    private final String zzc;
    private final zzchy zzd;
    private final zzcis zze = this;
    private final zzgxl zzf;
    private final zzgxl zzg;
    private final zzgxl zzh;
    private final zzgxl zzi;
    private final zzgxl zzj;
    private final zzgxl zzk;

    /* synthetic */ zzcis(zzchy zzchy, Context context, String str, z4 z4Var, zzcir zzcir) {
        this.zzd = zzchy;
        this.zza = context;
        this.zzb = z4Var;
        this.zzc = str;
        zzgwy zza2 = zzgwz.zza(context);
        this.zzf = zza2;
        zzgwy zza3 = zzgwz.zza(z4Var);
        this.zzg = zza3;
        zzgxl zzc2 = zzgwx.zzc(new zzeic(zzchy.zzo));
        this.zzh = zzc2;
        zzgxl zzc3 = zzgwx.zzc(zzeih.zza());
        this.zzi = zzc3;
        zzgxl zzc4 = zzgwx.zzc(zzczm.zza());
        this.zzj = zzc4;
        this.zzk = zzgwx.zzc(new zzeup(zza2, zzchy.zzp, zza3, zzchy.zzU, zzc2, zzc3, zzeyz.zza(), zzc4));
    }

    public final zzehh zza() {
        zzbzg zzd2 = this.zzd.zza.zzd();
        zzgxg.zzb(zzd2);
        return new zzehh(this.zza, this.zzb, this.zzc, (zzeuo) this.zzk.zzb(), (zzeib) this.zzh.zzb(), zzd2);
    }
}
