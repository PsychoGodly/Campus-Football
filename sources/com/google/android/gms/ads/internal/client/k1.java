package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbne;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class k1 extends zzasv implements m1 {
    k1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public final zzbnf getAdapterCreator() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbnf zzf = zzbne.zzf(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzf;
    }

    public final q3 getLiteSdkVersion() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        q3 q3Var = (q3) zzasx.zza(zzbg, q3.CREATOR);
        zzbg.recycle();
        return q3Var;
    }
}
