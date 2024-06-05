package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsx extends zzasv implements zzbsz {
    zzbsx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    public final void zze(zzbtn zzbtn, zzbtj zzbtj) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtn);
        zzasx.zzg(zza, zzbtj);
        zzbh(6, zza);
    }

    public final void zzf(zzbtn zzbtn, zzbtj zzbtj) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtn);
        zzasx.zzg(zza, zzbtj);
        zzbh(5, zza);
    }

    public final void zzg(zzbtn zzbtn, zzbtj zzbtj) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbtn);
        zzasx.zzg(zza, zzbtj);
        zzbh(4, zza);
    }

    public final void zzh(String str, zzbtj zzbtj) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, zzbtj);
        zzbh(7, zza);
    }
}
