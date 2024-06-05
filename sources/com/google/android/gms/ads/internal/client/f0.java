package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class f0 extends zzasv implements h0 {
    f0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    public final void zzc() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzd() throws RemoteException {
        zzbh(1, zza());
    }

    public final void zze(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(2, zza);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(8, zza);
    }

    public final void zzg() throws RemoteException {
        zzbh(7, zza());
    }

    public final void zzh() throws RemoteException {
        zzbh(3, zza());
    }

    public final void zzi() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzj() throws RemoteException {
        zzbh(5, zza());
    }

    public final void zzk() throws RemoteException {
        zzbh(9, zza());
    }
}
