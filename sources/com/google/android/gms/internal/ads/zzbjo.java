package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbjo extends zzasw implements zzbjp {
    public zzbjo() {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    public static zzbjp zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        return queryLocalInterface instanceof zzbjp ? (zzbjp) queryLocalInterface : new zzbjn(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzf();
        } else if (i10 != 3) {
            return false;
        } else {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        }
        parcel2.writeNoException();
        return true;
    }
}
