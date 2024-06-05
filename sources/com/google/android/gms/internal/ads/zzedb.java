package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.util.w0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedb implements zzeba {
    private final Context zza;
    private final zzddw zzb;
    private final zzbzg zzc;
    private final Executor zzd;

    public zzedb(Context context, zzbzg zzbzg, zzddw zzddw, Executor executor) {
        this.zza = context;
        this.zzc = zzbzg;
        this.zzb = zzddw;
        this.zzd = executor;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzdcw zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdcz(new zzeda(this, zzeaw), (zzcei) null));
        zze.zzd().zzm(new zzcmm((zzezs) zzeaw.zzb), this.zzd);
        ((zzecq) zzeaw.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        ((zzezs) zzeaw.zzb).zzo(this.zza, zzeyo.zza.zza.zzd, zzeyc.zzw.toString(), w0.l(zzeyc.zzt), (zzbnl) zzeaw.zzc);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzeaw zzeaw, boolean z10, Context context, zzcvb zzcvb) throws zzded {
        try {
            ((zzezs) zzeaw.zzb).zzv(z10);
            if (this.zzc.zzc < ((Integer) a0.c().zzb(zzbar.zzaB)).intValue()) {
                ((zzezs) zzeaw.zzb).zzx();
            } else {
                ((zzezs) zzeaw.zzb).zzy(context);
            }
        } catch (zzezc e10) {
            zzbza.zzi("Cannot show interstitial.");
            throw new zzded(e10.getCause());
        }
    }
}
