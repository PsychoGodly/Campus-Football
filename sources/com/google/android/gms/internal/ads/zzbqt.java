package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbqt extends zzasv implements zzbqv {
    zzbqt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public final void zze(Intent intent) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, intent);
        zzbh(1, zza);
    }

    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    public final void zzg(a aVar, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
