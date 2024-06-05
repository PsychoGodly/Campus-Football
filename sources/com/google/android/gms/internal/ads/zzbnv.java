package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.v2;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbnv extends r2 {
    private final Object zza = new Object();
    private volatile v2 zzb;

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzg() throws RemoteException {
        throw new RemoteException();
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final v2 zzi() throws RemoteException {
        v2 v2Var;
        synchronized (this.zza) {
            v2Var = this.zzb;
        }
        return v2Var;
    }

    public final void zzj(boolean z10) throws RemoteException {
        throw new RemoteException();
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzm(v2 v2Var) throws RemoteException {
        synchronized (this.zza) {
            this.zzb = v2Var;
        }
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
