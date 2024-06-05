package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzavd extends zzasv implements zzavf {
    zzavd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    public final void zzb() throws RemoteException {
        zzbh(5, zza());
    }

    public final void zzc() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzd(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(3, zza);
    }

    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzf() throws RemoteException {
        zzbh(1, zza());
    }
}
