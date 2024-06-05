package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbnf;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class l1 extends zzasw implements m1 {
    public l1() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static m1 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof m1 ? (m1) queryLocalInterface : new k1(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            q3 liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            zzasx.zzf(parcel2, liteSdkVersion);
        } else if (i10 != 2) {
            return false;
        } else {
            zzbnf adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            zzasx.zzg(parcel2, adapterCreator);
        }
        return true;
    }
}
