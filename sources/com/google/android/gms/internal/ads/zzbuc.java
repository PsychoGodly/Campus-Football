package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbuc extends zzasw implements zzbud {
    public zzbuc() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i10 != 2) {
            return false;
        } else {
            int zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeInt(zzb);
        }
        return true;
    }
}
