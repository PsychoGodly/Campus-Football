package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.dynamic.b;
import v4.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzboi extends zzbnk {
    private final a zza;
    private final zzbuo zzb;

    zzboi(a aVar, zzbuo zzbuo) {
        this.zza = aVar;
        this.zzb = zzbuo;
    }

    public final void zze() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zze(b.B1(this.zza));
        }
    }

    public final void zzf() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzf(b.B1(this.zza));
        }
    }

    public final void zzg(int i10) throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzg(b.B1(this.zza), i10);
        }
    }

    public final void zzh(c3 c3Var) throws RemoteException {
    }

    public final void zzi(int i10, String str) throws RemoteException {
    }

    public final void zzj(int i10) throws RemoteException {
    }

    public final void zzk(c3 c3Var) {
    }

    public final void zzl(String str) {
    }

    public final void zzm() throws RemoteException {
    }

    public final void zzn() throws RemoteException {
    }

    public final void zzo() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzi(b.B1(this.zza));
        }
    }

    public final void zzp() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzj(b.B1(this.zza));
        }
    }

    public final void zzq(String str, String str2) throws RemoteException {
    }

    public final void zzr(zzber zzber, String str) throws RemoteException {
    }

    public final void zzs(zzbup zzbup) throws RemoteException {
    }

    public final void zzt(zzbut zzbut) throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzm(b.B1(this.zza), new zzbup(zzbut.zzf(), zzbut.zze()));
        }
    }

    public final void zzu() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzn(b.B1(this.zza));
        }
    }

    public final void zzv() throws RemoteException {
    }

    public final void zzw() throws RemoteException {
    }

    public final void zzx() throws RemoteException {
    }

    public final void zzy() throws RemoteException {
        zzbuo zzbuo = this.zzb;
        if (zzbuo != null) {
            zzbuo.zzo(b.B1(this.zza));
        }
    }
}
