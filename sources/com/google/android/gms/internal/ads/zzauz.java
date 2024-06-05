package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzauz extends zzasv implements zzavb {
    zzauz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    public final void zzb(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(2, zza);
    }

    public final void zzc(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(3, zza);
    }

    public final void zzd(zzauy zzauy) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzauy);
        zzbh(1, zza);
    }
}
