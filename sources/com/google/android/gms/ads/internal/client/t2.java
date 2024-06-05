package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class t2 extends zzasv implements v2 {
    t2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void zze() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzf(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(5, zza);
    }

    public final void zzg() throws RemoteException {
        zzbh(3, zza());
    }

    public final void zzh() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzi() throws RemoteException {
        zzbh(1, zza());
    }
}
