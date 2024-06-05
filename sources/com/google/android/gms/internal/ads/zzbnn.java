package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbnn extends zzasw implements zzbno {
    public zzbnn() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static zzbno zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return queryLocalInterface instanceof zzbno ? (zzbno) queryLocalInterface : new zzbnm(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a zze = zze();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, zze);
        } else if (i10 != 2) {
            return false;
        } else {
            boolean zzf = zzf();
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zzf);
        }
        return true;
    }
}
