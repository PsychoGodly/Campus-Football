package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbuh extends zzasv implements zzbuj {
    zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    public final void zze(zzbud zzbud) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbud);
        zzbh(5, zza);
    }

    public final void zzf() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(7, zza);
    }

    public final void zzh() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }

    public final void zzj() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzk() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzl() throws RemoteException {
        zzbh(3, zza());
    }
}
