package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class h1 extends zzasv implements j1 {
    h1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    public final void zzb() throws RemoteException {
        zzbh(5, zza());
    }

    public final void zzc() throws RemoteException {
        zzbh(3, zza());
    }

    public final void zzd(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(1, zza);
    }

    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzf() throws RemoteException {
        zzbh(2, zza());
    }
}
