package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdz extends zzasv implements zzbeb {
    zzbdz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final a zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(2, zza);
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final void zzbs(String str, a aVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, aVar);
        zzbh(1, zza);
    }

    public final void zzbt(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(6, zza);
    }

    public final void zzbu(zzbdu zzbdu) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbdu);
        zzbh(8, zza);
    }

    public final void zzbv(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(9, zza);
    }

    public final void zzbw(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(3, zza);
    }

    public final void zzc() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzd(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(7, zza);
    }

    public final void zze(a aVar, int i10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeInt(i10);
        zzbh(5, zza);
    }
}
