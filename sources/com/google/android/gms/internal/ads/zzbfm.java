package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfm extends zzasv implements zzbfo {
    zzbfm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public final boolean zzb(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(2, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
