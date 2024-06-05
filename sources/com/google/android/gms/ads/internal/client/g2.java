package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class g2 extends zzasv implements i2 {
    g2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public final void N0(b5 b5Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, b5Var);
        zzbh(1, zza);
    }
}
