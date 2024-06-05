package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import h5.c0;
import h5.e0;
import h5.g0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class t0 extends zza implements v0 {
    t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    public final e0 A(c0 c0Var) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, c0Var);
        Parcel zzB = zzB(8, zza);
        e0 e0Var = (e0) zzc.zza(zzB, e0.CREATOR);
        zzB.recycle();
        return e0Var;
    }

    public final e0 O(c0 c0Var) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, c0Var);
        Parcel zzB = zzB(6, zza);
        e0 e0Var = (e0) zzc.zza(zzB, e0.CREATOR);
        zzB.recycle();
        return e0Var;
    }

    public final boolean x1(g0 g0Var, a aVar) throws RemoteException {
        Parcel zza = zza();
        zzc.zzd(zza, g0Var);
        zzc.zzf(zza, aVar);
        Parcel zzB = zzB(5, zza);
        boolean zzg = zzc.zzg(zzB);
        zzB.recycle();
        return zzg;
    }

    public final boolean zzi() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean zzg = zzc.zzg(zzB);
        zzB.recycle();
        return zzg;
    }
}
