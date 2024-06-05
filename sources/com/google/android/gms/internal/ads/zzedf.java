package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.n1;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedf implements zzeba {
    private final Context zza;
    private final zzddw zzb;

    public zzedf(Context context, zzddw zzddw) {
        this.zza = context;
        this.zzb = zzddw;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzecz zzecz = new zzecz(zzeyc, (zzbpc) zzeaw.zzb, b.INTERSTITIAL);
        zzdcw zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdcz(zzecz, (zzcei) null));
        zzecz.zzb(zze.zzc());
        ((zzecq) zzeaw.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            ((zzbpc) zzeaw.zzb).zzq(zzeyc.zzaa);
            ((zzbpc) zzeaw.zzb).zzl(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, com.google.android.gms.dynamic.b.B1(this.zza), new zzede(this, zzeaw, (zzedd) null), (zzbnl) zzeaw.zzc);
        } catch (RemoteException e10) {
            n1.b("Remote exception loading a interstitial RTB ad", e10);
            throw new zzezc(e10);
        }
    }
}
