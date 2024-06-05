package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdki extends zzbel {
    private final String zza;
    private final zzdgd zzb;
    private final zzdgi zzc;

    public zzdki(String str, zzdgd zzdgd, zzdgi zzdgi) {
        this.zza = str;
        this.zzb = zzdgd;
        this.zzc = zzdgi;
    }

    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    public final s2 zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbdp zze() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbdx zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    public final a zzg() throws RemoteException {
        return this.zzc.zzt();
    }

    public final a zzh() throws RemoteException {
        return b.B1(this.zzb);
    }

    public final String zzi() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzj() throws RemoteException {
        return this.zzc.zzy();
    }

    public final String zzk() throws RemoteException {
        return this.zzc.zzA();
    }

    public final String zzl() throws RemoteException {
        return this.zza;
    }

    public final String zzm() throws RemoteException {
        return this.zzc.zzC();
    }

    public final String zzn() throws RemoteException {
        return this.zzc.zzD();
    }

    public final List zzo() throws RemoteException {
        return this.zzc.zzF();
    }

    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
