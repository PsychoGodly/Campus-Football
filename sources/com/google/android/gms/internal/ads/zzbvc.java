package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbvc extends zzasw implements zzbvd {
    public zzbvc() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzg();
        } else if (i10 == 2) {
            int readInt = parcel.readInt();
            zzasx.zzc(parcel);
            zze(readInt);
        } else if (i10 != 3) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzf((c3) zzasx.zza(parcel, c3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
