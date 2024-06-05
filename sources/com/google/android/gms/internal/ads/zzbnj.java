package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbnj extends zzasv implements zzbnl {
    zzbnj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void zze() throws RemoteException {
        zzbh(1, zza());
    }

    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(3, zza);
    }

    public final void zzh(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(23, zza);
    }

    public final void zzi(int i10, String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zza.writeString(str);
        zzbh(22, zza);
    }

    public final void zzj(int i10) throws RemoteException {
        throw null;
    }

    public final void zzk(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(24, zza);
    }

    public final void zzl(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(21, zza);
    }

    public final void zzm() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzn() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzo() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzp() throws RemoteException {
        zzbh(5, zza());
    }

    public final void zzq(String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(9, zza);
    }

    public final void zzr(zzber zzber, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzber);
        zza.writeString(str);
        zzbh(10, zza);
    }

    public final void zzs(zzbup zzbup) throws RemoteException {
        throw null;
    }

    public final void zzt(zzbut zzbut) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbut);
        zzbh(16, zza);
    }

    public final void zzu() throws RemoteException {
        zzbh(18, zza());
    }

    public final void zzv() throws RemoteException {
        zzbh(11, zza());
    }

    public final void zzw() throws RemoteException {
        zzbh(15, zza());
    }

    public final void zzx() throws RemoteException {
        zzbh(20, zza());
    }

    public final void zzy() throws RemoteException {
        zzbh(13, zza());
    }
}
