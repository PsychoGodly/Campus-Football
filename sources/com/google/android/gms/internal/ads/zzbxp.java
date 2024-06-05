package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbxp extends zzasv implements zzbxr {
    zzbxp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public final void zze(a aVar, zzbxv zzbxv, zzbxo zzbxo) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, zzbxv);
        zzasx.zzg(zza, zzbxo);
        zzbh(1, zza);
    }

    public final void zzf(zzbsa zzbsa) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsa);
        zzbh(7, zza);
    }

    public final void zzg(List list, a aVar, zzbrr zzbrr) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbrr);
        zzbh(10, zza);
    }

    public final void zzh(List list, a aVar, zzbrr zzbrr) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbrr);
        zzbh(9, zza);
    }

    public final void zzi(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(8, zza);
    }

    public final void zzj(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(2, zza);
    }

    public final void zzk(List list, a aVar, zzbrr zzbrr) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbrr);
        zzbh(6, zza);
    }

    public final void zzl(List list, a aVar, zzbrr zzbrr) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbrr);
        zzbh(5, zza);
    }
}
