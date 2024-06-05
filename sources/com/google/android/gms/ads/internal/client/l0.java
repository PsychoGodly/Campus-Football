package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class l0 extends zzasv implements n0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    public final void zzg(u4 u4Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        zzbh(1, zza);
    }
}
