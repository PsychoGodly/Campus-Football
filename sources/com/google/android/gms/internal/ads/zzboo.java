package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzboo extends zzasv implements zzboq {
    zzboo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString("Adapter returned null.");
        zzbh(2, zza);
    }

    public final void zzf(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(3, zza);
    }

    public final void zzg(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(1, zza);
    }

    public final void zzh(zzbno zzbno) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbno);
        zzbh(4, zza);
    }
}
