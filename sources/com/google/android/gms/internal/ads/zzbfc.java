package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfc extends zzasv implements zzbfe {
    zzbfc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    public final void zze(zzber zzber) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzber);
        zzbh(1, zza);
    }
}
