package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkk extends zzben {
    private final String zza;
    private final zzdgd zzb;
    private final zzdgi zzc;

    public zzdkk(String str, zzdgd zzdgd, zzdgi zzdgi) {
        this.zza = str;
        this.zzb = zzdgd;
        this.zzc = zzdgi;
    }

    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    public final s2 zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbdp zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbdx zze() throws RemoteException {
        return this.zzc.zzo();
    }

    public final a zzf() throws RemoteException {
        return this.zzc.zzt();
    }

    public final a zzg() throws RemoteException {
        return b.B1(this.zzb);
    }

    public final String zzh() throws RemoteException {
        return this.zzc.zzw();
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

    public final List zzm() throws RemoteException {
        return this.zzc.zzF();
    }

    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
