package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbov extends zzasw implements zzbow {
    public zzbov() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzbnu zzb = zzbnt.zzb(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzg(zzb);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
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
