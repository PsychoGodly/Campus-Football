package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class b1 extends zzasw implements c1 {
    public b1() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    public static c1 zzd(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
        return queryLocalInterface instanceof c1 ? (c1) queryLocalInterface : new z0(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        zzasx.zzc(parcel);
        zzc(readString, readString2);
        parcel2.writeNoException();
        return true;
    }
}
