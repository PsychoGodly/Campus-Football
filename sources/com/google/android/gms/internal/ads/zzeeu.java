package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzeeu extends zzboy {
    private final zzeaw zza;

    /* synthetic */ zzeeu(zzeev zzeev, zzeaw zzeaw, zzeet zzeet) {
        this.zza = zzeaw;
    }

    public final void zze(String str) throws RemoteException {
        ((zzecq) this.zza.zzc).zzi(0, str);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        ((zzecq) this.zza.zzc).zzh(c3Var);
    }

    public final void zzg() throws RemoteException {
        ((zzecq) this.zza.zzc).zzo();
    }
}
