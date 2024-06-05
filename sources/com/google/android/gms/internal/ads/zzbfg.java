package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.u0;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfg extends zzasv implements zzbfi {
    zzbfg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    public final void zze(u0 u0Var, a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, u0Var);
        zzasx.zzg(zza, aVar);
        zzbh(1, zza);
    }
}
