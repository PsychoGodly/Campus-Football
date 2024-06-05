package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.n1;
import n4.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeev implements zzeba {
    private final Context zza;
    private final zzdlz zzb;

    public zzeev(Context context, zzdlz zzdlz) {
        this.zza = context;
        this.zzb = zzdlz;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        zzecz zzecz = new zzecz(zzeyc, (zzbpc) zzeaw.zzb, b.REWARDED);
        zzdlv zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdlw(zzecz));
        zzecz.zzb(zze.zzc());
        ((zzecq) zzeaw.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            ((zzbpc) zzeaw.zzb).zzq(zzeyc.zzaa);
            if (zzeyo.zza.zza.zzo.zza == 3) {
                ((zzbpc) zzeaw.zzb).zzo(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, com.google.android.gms.dynamic.b.B1(this.zza), new zzeeu(this, zzeaw, (zzeet) null), (zzbnl) zzeaw.zzc);
            } else {
                ((zzbpc) zzeaw.zzb).zzp(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, com.google.android.gms.dynamic.b.B1(this.zza), new zzeeu(this, zzeaw, (zzeet) null), (zzbnl) zzeaw.zzc);
            }
        } catch (RemoteException e10) {
            n1.b("Remote exception loading a rewarded RTB ad", e10);
        }
    }
}
