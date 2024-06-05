package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeer implements zzeba {
    private final Context zza;
    private final Executor zzb;
    private final zzdlz zzc;

    public zzeer(Context context, Executor executor, zzdlz zzdlz) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdlz;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzdlv zze = this.zzc.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdlw(new zzeeq(zzeaw)));
        zze.zzd().zzm(new zzcmm((zzezs) zzeaw.zzb), this.zzb);
        ((zzecq) zzeaw.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            zzeyx zzeyx = zzeyo.zza.zza;
            if (zzeyx.zzo.zza == 3) {
                ((zzezs) zzeaw.zzb).zzr(this.zza, zzeyx.zzd, zzeyc.zzw.toString(), (zzbnl) zzeaw.zzc);
            } else {
                ((zzezs) zzeaw.zzb).zzq(this.zza, zzeyx.zzd, zzeyc.zzw.toString(), (zzbnl) zzeaw.zzc);
            }
        } catch (Exception e10) {
            zzbza.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeaw.zza)), e10);
        }
    }
}
