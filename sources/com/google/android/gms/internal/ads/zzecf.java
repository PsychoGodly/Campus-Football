package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.dynamic.b;
import java.util.concurrent.ExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzecf implements zzeba {
    private final Context zza;
    private final zzcph zzb;
    /* access modifiers changed from: private */
    public View zzc;
    /* access modifiers changed from: private */
    public zzbno zzd;

    public zzecf(Context context, zzcph zzcph) {
        this.zza = context;
        this.zzb = zzcph;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc, zzeek {
        View view;
        if (!((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() || !zzeyc.zzah) {
            view = this.zzc;
        } else {
            try {
                view = (View) b.A1(this.zzd.zze());
                boolean zzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzezc(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                } else if (zzf) {
                    try {
                        view = (View) zzfuj.zzm(zzfuj.zzh((Object) null), new zzecb(this, view, zzeyc), zzbzn.zze).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzezc(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzezc(e11);
            }
        }
        zzcol zza2 = this.zzb.zza(new zzcrb(zzeyo, zzeyc, zzeaw.zza), new zzcor(view, (zzcei) null, new zzecc(zzeaw), (zzeyd) zzeyc.zzv.get(0)));
        zza2.zzg().zza(view);
        ((zzecq) zzeaw.zzc).zzc(zza2.zzi());
        return zza2.zza();
    }

    public final void zzb(zzeyo zzeyo, zzeyc zzeyc, zzeaw zzeaw) throws zzezc {
        try {
            ((zzbpc) zzeaw.zzb).zzq(zzeyc.zzaa);
            if (!((Boolean) a0.c().zzb(zzbar.zzhh)).booleanValue() || !zzeyc.zzah) {
                ((zzbpc) zzeaw.zzb).zzj(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, b.B1(this.zza), new zzece(this, zzeaw, (zzecd) null), (zzbnl) zzeaw.zzc, zzeyo.zza.zza.zze);
            } else {
                ((zzbpc) zzeaw.zzb).zzk(zzeyc.zzV, zzeyc.zzw.toString(), zzeyo.zza.zza.zzd, b.B1(this.zza), new zzece(this, zzeaw, (zzecd) null), (zzbnl) zzeaw.zzc, zzeyo.zza.zza.zze);
            }
        } catch (RemoteException e10) {
            throw new zzezc(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfut zzc(View view, zzeyc zzeyc, Object obj) throws Exception {
        return zzfuj.zzh(zzcpy.zza(this.zza, view, zzeyc));
    }
}
