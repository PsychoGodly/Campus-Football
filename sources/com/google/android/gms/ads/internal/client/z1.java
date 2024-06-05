package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class z1 extends zzasv implements c2 {
    z1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    public final void zze(c3 c3Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, c3Var);
        zzbh(1, zza);
    }
}
