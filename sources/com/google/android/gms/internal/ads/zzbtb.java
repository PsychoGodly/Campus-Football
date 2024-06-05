package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbtb extends zzasv implements zzbtd {
    zzbtb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    public final void zze(zzbsv zzbsv, zzbtg zzbtg) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsv);
        zzasx.zzg(zza, zzbtg);
        zzbh(3, zza);
    }

    public final void zzf(zzbsr zzbsr, zzbtg zzbtg) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbsr);
        zzasx.zzg(zza, zzbtg);
        zzbh(1, zza);
    }
}
