package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.c3;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbop extends zzasw implements zzboq {
    public zzbop() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a M0 = a.C0158a.M0(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzg(M0);
        } else if (i10 == 2) {
            String readString = parcel.readString();
            zzasx.zzc(parcel);
            zze(readString);
        } else if (i10 == 3) {
            zzasx.zzc(parcel);
            zzf((c3) zzasx.zza(parcel, c3.CREATOR));
        } else if (i10 != 4) {
            return false;
        } else {
            zzbno zzb = zzbnn.zzb(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzh(zzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
