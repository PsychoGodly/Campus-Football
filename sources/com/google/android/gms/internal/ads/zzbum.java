package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbum extends zzasv implements zzbuo {
    zzbum(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    public final void zze(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(8, zza);
    }

    public final void zzf(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(6, zza);
    }

    public final void zzg(a aVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeInt(i10);
        zzbh(9, zza);
    }

    public final void zzh(a aVar) throws RemoteException {
        throw null;
    }

    public final void zzi(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(3, zza);
    }

    public final void zzj(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(4, zza);
    }

    public final void zzk(a aVar, int i10) throws RemoteException {
        throw null;
    }

    public final void zzl(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(1, zza);
    }

    public final void zzm(a aVar, zzbup zzbup) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, zzbup);
        zzbh(7, zza);
    }

    public final void zzn(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(11, zza);
    }

    public final void zzo(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(5, zza);
    }
}
