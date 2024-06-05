package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzece extends zzbop {
    final /* synthetic */ zzecf zza;
    private final zzeaw zzb;

    /* synthetic */ zzece(zzecf zzecf, zzeaw zzeaw, zzecd zzecd) {
        this.zza = zzecf;
        this.zzb = zzeaw;
    }

    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzh(c3Var);
    }

    public final void zzg(a aVar) throws RemoteException {
        this.zza.zzc = (View) b.A1(aVar);
        ((zzecq) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbno zzbno) throws RemoteException {
        this.zza.zzd = zzbno;
        ((zzecq) this.zzb.zzc).zzo();
    }
}
