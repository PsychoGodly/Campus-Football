package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.n1;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzebn implements zzeba {
    private final Context zza;
    private final zzcny zzb;

    zzebn(Context context, zzcny zzcny) {
        this.zza = context;
        this.zzb = zzcny;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzecz zzecz = new zzecz(zzeyc, (zzbpc) zzeaw.zzb, b.APP_OPEN_AD);
        zzcnv zza2 = this.zzb.zza(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdcz(zzecz, (zzcei) null), new zzcnw(zzeyc.zzab));
        zzecz.zzb(zza2.zzc());
        ((zzecq) zzeaw.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            ((zzbpc) zzeaw.zzb).zzq(zzeyc.zzaa);
            ((zzbpc) zzeaw.zzb).zzi(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, com.google.android.gms.dynamic.b.B1(this.zza), new zzebm(zzeaw, (zzebl) null), (zzbnl) zzeaw.zzc);
        } catch (RemoteException e10) {
            n1.b("Remote exception loading an app open RTB ad", e10);
            throw new zzezc(e10);
        }
    }
}
