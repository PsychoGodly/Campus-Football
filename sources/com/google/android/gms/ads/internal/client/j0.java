package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class j0 extends zzasw implements k0 {
    public j0() {
        super("com.google.android.gms.ads.internal.client.IAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzc();
        } else if (i10 != 2) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzb((c3) zzasx.zza(parcel, c3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
