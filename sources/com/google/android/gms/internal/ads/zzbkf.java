package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbkf extends zzasw implements zzbkg {
    public static zzbkg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
        return queryLocalInterface instanceof zzbkg ? (zzbkg) queryLocalInterface : new zzbke(iBinder);
    }
}
