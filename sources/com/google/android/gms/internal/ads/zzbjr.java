package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbjr extends zzasw implements zzbjs {
    public zzbjr() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static zzbjs zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return queryLocalInterface instanceof zzbjs ? (zzbjs) queryLocalInterface : new zzbjq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        ArrayList<zzbjl> createTypedArrayList = parcel.createTypedArrayList(zzbjl.CREATOR);
        zzasx.zzc(parcel);
        zzb(createTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
