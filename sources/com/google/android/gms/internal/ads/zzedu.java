package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzedu implements zzeba {
    private final Context zza;
    private final zzdes zzb;
    /* access modifiers changed from: private */
    public zzbnu zzc;
    private final zzbzg zzd;

    public zzedu(Context context, zzdes zzdes, zzbzg zzbzg) {
        this.zza = context;
        this.zzb = zzdes;
        this.zzd = zzbzg;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        if (zzeyo.zza.zza.zzg.contains(Integer.toString(6))) {
            zzdgi zzs = zzdgi.zzs(this.zzc);
            if (zzeyo.zza.zza.zzg.contains(Integer.toString(zzs.zzc()))) {
                zzdgk zze = this.zzb.zze(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzdgu(zzs), new zzdij((zzbnr) null, (zzbnq) null, this.zzc, (byte[]) null));
                ((zzecq) zzeaw.zzc).zzc(zze.zzi());
                return zze.zza();
            }
            throw new zzeek(1, "No corresponding native ad listener");
        }
        throw new zzeek(2, "Unified must be used for RTB.");
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            ((zzbpc) zzeaw.zzb).zzq(zzeyc.zzaa);
            if (this.zzd.zzc < ((Integer) a0.c().zzb(zzbar.zzby)).intValue()) {
                ((zzbpc) zzeaw.zzb).zzm(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, b.B1(this.zza), new zzedt(this, zzeaw, (zzeds) null), (zzbnl) zzeaw.zzc);
            } else {
                ((zzbpc) zzeaw.zzb).zzn(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, b.B1(this.zza), new zzedt(this, zzeaw, (zzeds) null), (zzbnl) zzeaw.zzc, zzeyo.zza.zza.zzi);
            }
        } catch (RemoteException e10) {
            throw new zzezc(e10);
        }
    }
}
