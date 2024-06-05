package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbbn extends zzasv implements zzbbp {
    zzbbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    public final void zze(zzbbm zzbbm) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbbm);
        zzbh(1, zza);
    }
}
