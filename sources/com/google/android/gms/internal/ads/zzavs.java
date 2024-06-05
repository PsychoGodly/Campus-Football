package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavs extends zzasv {
    zzavs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzavq zzavq) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavq);
        Parcel zzbg = zzbg(3, zza);
        long readLong = zzbg.readLong();
        zzbg.recycle();
        return readLong;
    }

    public final zzavn zzf(zzavq zzavq) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavq);
        Parcel zzbg = zzbg(1, zza);
        zzavn zzavn = (zzavn) zzasx.zza(zzbg, zzavn.CREATOR);
        zzbg.recycle();
        return zzavn;
    }

    public final zzavn zzg(zzavq zzavq) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzavq);
        Parcel zzbg = zzbg(2, zza);
        zzavn zzavn = (zzavn) zzasx.zza(zzbg, zzavn.CREATOR);
        zzbg.recycle();
        return zzavn;
    }
}
