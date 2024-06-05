package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzedt extends zzbov {
    final /* synthetic */ zzedu zza;
    private final zzeaw zzb;

    /* synthetic */ zzedt(zzedu zzedu, zzeaw zzeaw, zzeds zzeds) {
        this.zza = zzedu;
        this.zzb = zzeaw;
    }

    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        ((zzecq) this.zzb.zzc).zzh(c3Var);
    }

    public final void zzg(zzbnu zzbnu) throws RemoteException {
        this.zza.zzc = zzbnu;
        ((zzecq) this.zzb.zzc).zzo();
    }
}
