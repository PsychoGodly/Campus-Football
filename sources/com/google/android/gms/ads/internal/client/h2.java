package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class h2 extends zzasw implements i2 {
    public h2() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static i2 M0(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return queryLocalInterface instanceof i2 ? (i2) queryLocalInterface : new g2(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzasx.zzc(parcel);
        N0((b5) zzasx.zza(parcel, b5.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
