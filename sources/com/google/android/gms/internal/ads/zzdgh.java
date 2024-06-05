package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.v2;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdgh extends r2 {
    private final Object zza = new Object();
    private final s2 zzb;
    private final zzbnu zzc;

    public zzdgh(s2 s2Var, zzbnu zzbnu) {
        this.zzb = s2Var;
        this.zzc = zzbnu;
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        zzbnu zzbnu = this.zzc;
        if (zzbnu != null) {
            return zzbnu.zzg();
        }
        return 0.0f;
    }

    public final float zzg() throws RemoteException {
        zzbnu zzbnu = this.zzc;
        if (zzbnu != null) {
            return zzbnu.zzh();
        }
        return 0.0f;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final v2 zzi() throws RemoteException {
        synchronized (this.zza) {
            s2 s2Var = this.zzb;
            if (s2Var == null) {
                return null;
            }
            v2 zzi = s2Var.zzi();
            return zzi;
        }
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
            s2 s2Var = this.zzb;
            if (s2Var != null) {
                s2Var.zzm(v2Var);
            }
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
