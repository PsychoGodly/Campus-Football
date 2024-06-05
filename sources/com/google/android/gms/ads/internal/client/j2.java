package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class j2 extends zzasv implements l2 {
    j2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    public final void zze(String str, a aVar, a aVar2) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, aVar2);
        zzbh(1, zza);
    }
}
