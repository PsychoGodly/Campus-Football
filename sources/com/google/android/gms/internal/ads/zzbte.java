package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbte extends zzasv implements zzbtg {
    zzbte(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    public final void zze(a0 a0Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, a0Var);
        zzbh(2, zza);
    }

    public final void zzf(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, parcelFileDescriptor);
        zzbh(1, zza);
    }
}
