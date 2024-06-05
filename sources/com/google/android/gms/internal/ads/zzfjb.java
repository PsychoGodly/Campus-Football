package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjb extends zzasv {
    zzfjb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final zzfiz zze(zzfix zzfix) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfix);
        Parcel zzbg = zzbg(1, zza);
        zzfiz zzfiz = (zzfiz) zzasx.zza(zzbg, zzfiz.CREATOR);
        zzbg.recycle();
        return zzfiz;
    }

    public final zzfji zzf(zzfjg zzfjg) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfjg);
        Parcel zzbg = zzbg(3, zza);
        zzfji zzfji = (zzfji) zzasx.zza(zzbg, zzfji.CREATOR);
        zzbg.recycle();
        return zzfji;
    }

    public final void zzg(zzfiu zzfiu) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzfiu);
        zzbh(2, zza);
    }
}
