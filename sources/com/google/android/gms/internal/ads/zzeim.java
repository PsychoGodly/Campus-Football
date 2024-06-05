package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeim {
    private final zzeir zza;
    private final String zzb;
    /* access modifiers changed from: private */
    public p2 zzc;

    public zzeim(zzeir zzeir, String str) {
        this.zza = zzeir;
        this.zzb = str;
    }

    public final synchronized String zza() {
        String str;
        str = null;
        try {
            p2 p2Var = this.zzc;
            if (p2Var != null) {
                str = p2Var.zzg();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized String zzb() {
        String str;
        str = null;
        try {
            p2 p2Var = this.zzc;
            if (p2Var != null) {
                str = p2Var.zzg();
            }
        } catch (RemoteException e10) {
            zzbza.zzl("#007 Could not call remote method.", e10);
            return null;
        }
        return str;
    }

    public final synchronized void zzd(u4 u4Var, int i10) throws RemoteException {
        this.zzc = null;
        this.zza.zzb(u4Var, this.zzb, new zzeis(i10), new zzeil(this));
    }

    public final synchronized boolean zze() throws RemoteException {
        return this.zza.zza();
    }
}
