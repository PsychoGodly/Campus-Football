package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbio extends zzasw implements zzbip {
    public zzbio() {
        super("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    public static zzbip zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
        return queryLocalInterface instanceof zzbip ? (zzbip) queryLocalInterface : new zzbin(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zzf(readString);
        } else if (i10 != 2) {
            return false;
        } else {
            zze();
        }
        parcel2.writeNoException();
        return true;
    }
}
