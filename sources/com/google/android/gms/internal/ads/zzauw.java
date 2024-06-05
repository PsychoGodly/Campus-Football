package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzauw extends zzasv implements zzauy {
    zzauw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    public final u0 zze() throws RemoteException {
        throw null;
    }

    public final p2 zzf() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        p2 zzb = o2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final void zzg(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(6, zza);
    }

    public final void zzh(i2 i2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, i2Var);
        zzbh(7, zza);
    }

    public final void zzi(a aVar, zzavf zzavf) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzavf);
        zzbh(4, zza);
    }
}
