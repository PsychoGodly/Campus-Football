package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbje extends zzasv {
    zzbje(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbiy zzbiy, zzbjd zzbjd) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbiy);
        zzasx.zzg(zza, zzbjd);
        zzbi(2, zza);
    }
}
