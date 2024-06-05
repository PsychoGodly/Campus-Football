package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfj extends zzasv implements zzbfl {
    zzbfj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    public final void zze(zzbfu zzbfu) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfu);
        zzbh(1, zza);
    }
}
