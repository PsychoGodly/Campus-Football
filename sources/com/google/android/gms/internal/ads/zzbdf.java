package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdf extends zzasv {
    zzbdf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(zzbsm zzbsm) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbsm);
        zzbh(1, zza);
    }
}
