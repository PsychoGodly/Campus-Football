package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbve extends zzasv {
    zzbve(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(zzbut zzbut, String str, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbut);
        zza.writeString(str);
        zza.writeString(str2);
        zzbh(2, zza);
    }
}
