package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbrp extends zzasv implements zzbrr {
    zzbrp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public final void zze(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(2, zza);
    }

    public final void zzf(List list) throws RemoteException {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzbh(1, zza);
    }
}
