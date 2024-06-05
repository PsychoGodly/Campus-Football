package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbet extends zzasv implements zzbev {
    zzbet(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    public final void zze(zzbem zzbem) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbem);
        zzbh(1, zza);
    }
}
