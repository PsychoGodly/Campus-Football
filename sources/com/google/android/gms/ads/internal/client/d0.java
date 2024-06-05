package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class d0 extends zzasw implements e0 {
    public d0() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
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
