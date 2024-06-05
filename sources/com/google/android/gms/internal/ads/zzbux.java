package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbux extends zzasv implements zzbuz {
    zzbux(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    public final void zze() throws RemoteException {
        zzbh(7, zza());
    }

    public final void zzf() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzg() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzh(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(4, zza);
    }

    public final void zzi(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(5, zza);
    }

    public final void zzj() throws RemoteException {
        zzbh(1, zza());
    }

    public final void zzk(zzbut zzbut) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbut);
        zzbh(3, zza);
    }
}
