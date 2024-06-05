package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbez extends zzasv implements zzbfb {
    zzbez(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public final void zze(zzber zzber, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzber);
        zza.writeString(str);
        zzbh(1, zza);
    }
}
