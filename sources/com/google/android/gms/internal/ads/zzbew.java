package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbew extends zzasv implements zzbey {
    zzbew(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    public final void zze(zzbeo zzbeo) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbeo);
        zzbh(1, zza);
    }
}
