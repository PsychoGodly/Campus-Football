package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbxn extends zzasw implements zzbxo {
    public zzbxn() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            parcel.readString();
            parcel.readString();
            zzasx.zzc(parcel);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zzb(readString);
        } else if (i10 != 3) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzc(parcel.readString(), parcel.readString(), (Bundle) zzasx.zza(parcel, Bundle.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
