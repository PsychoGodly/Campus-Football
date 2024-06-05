package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbsl extends zzasw implements zzbsm {
    public zzbsl() {
        super("com.google.android.gms.ads.internal.report.IDynamiteErrorEventListener");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
