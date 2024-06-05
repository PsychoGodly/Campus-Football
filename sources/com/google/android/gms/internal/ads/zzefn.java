package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzefn implements zzeba {
    private final Context zza;
    /* access modifiers changed from: private */
    public final Executor zzb;
    private final zzdlz zzc;

    public zzefn(Context context, Executor executor, zzdlz zzdlz) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdlz;
    }

    /* access modifiers changed from: private */
    public static final void zze(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) {
        try {
            ((zzezs) zzeaw.zzb).zzk(zzeyo.zza.zza.zzd, zzeyc.zzw.toString());
        } catch (Exception e10) {
            zzbza.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeaw.zza)), e10);
        }
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzdlv zze = this.zzc.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdlw(new zzefj(zzeaw)));
        zze.zzd().zzm(new zzcmm((zzezs) zzeaw.zzb), this.zzb);
        zzcvv zze2 = zze.zze();
        zzcum zzb2 = zze.zzb();
        ((zzecr) zzeaw.zzc).zzc(new zzefm(this, zze.zza(), zzb2, zze2, zze.zzg()));
        return zze.zzk();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        if (!((zzezs) zzeaw.zzb).zzC()) {
            ((zzecr) zzeaw.zzc).zzd(new zzefl(this, zzeyo, zzeyc, zzeaw));
            ((zzezs) zzeaw.zzb).zzh(this.zza, zzeyo.zza.zza.zzd, (String) null, (zzbuo) zzeaw.zzc, zzeyc.zzw.toString());
            return;
        }
        zze(zzeyo, zzeyc, zzeaw);
    }
}
