package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamic.b;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdkp extends zzbft {
    private final String zza;
    private final zzdgd zzb;
    private final zzdgi zzc;

    public zzdkp(String str, zzdgd zzdgd, zzdgi zzdgi) {
        this.zza = str;
        this.zzb = zzdgd;
        this.zzc = zzdgi;
    }

    public final void zzA() {
        this.zzb.zzG();
    }

    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    public final void zzC() {
        this.zzb.zzM();
    }

    public final void zzD(t1 t1Var) throws RemoteException {
        this.zzb.zzN(t1Var);
    }

    public final void zzE(i2 i2Var) throws RemoteException {
        this.zzb.zzO(i2Var);
    }

    public final void zzF(zzbfr zzbfr) throws RemoteException {
        this.zzb.zzP(zzbfr);
    }

    public final boolean zzG() {
        return this.zzb.zzU();
    }

    public final boolean zzH() throws RemoteException {
        return !this.zzc.zzG().isEmpty() && this.zzc.zzk() != null;
    }

    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }

    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    public final p2 zzg() throws RemoteException {
        if (!((Boolean) a0.c().zzb(zzbar.zzgp)).booleanValue()) {
            return null;
        }
        return this.zzb.zzl();
    }

    public final s2 zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    public final zzbdp zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    public final zzbdu zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    public final zzbdx zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    public final a zzl() throws RemoteException {
        return this.zzc.zzt();
    }

    public final a zzm() throws RemoteException {
        return b.B1(this.zzb);
    }

    public final String zzn() throws RemoteException {
        return this.zzc.zzw();
    }

    public final String zzo() throws RemoteException {
        return this.zzc.zzx();
    }

    public final String zzp() throws RemoteException {
        return this.zzc.zzy();
    }

    public final String zzq() throws RemoteException {
        return this.zzc.zzA();
    }

    public final String zzr() throws RemoteException {
        return this.zza;
    }

    public final String zzs() throws RemoteException {
        return this.zzc.zzC();
    }

    public final String zzt() throws RemoteException {
        return this.zzc.zzD();
    }

    public final List zzu() throws RemoteException {
        return this.zzc.zzF();
    }

    public final List zzv() throws RemoteException {
        if (zzH()) {
            return this.zzc.zzG();
        }
        return Collections.emptyList();
    }

    public final void zzw() throws RemoteException {
        this.zzb.zzs();
    }

    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    public final void zzy(x1 x1Var) throws RemoteException {
        this.zzb.zzB(x1Var);
    }

    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }
}
