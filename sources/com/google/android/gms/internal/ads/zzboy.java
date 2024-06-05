package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzboy extends zzasw implements zzboz {
    public zzboy() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 2) {
            zzg();
        } else if (i10 == 3) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        } else if (i10 != 4) {
            return false;
        } else {
            zzasx.zzc(parcel);
            zzf((c3) zzasx.zza(parcel, c3.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
