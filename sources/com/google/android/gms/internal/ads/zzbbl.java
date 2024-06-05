package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbbl extends zzasw implements zzbbm {
    public zzbbl() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            String zzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(zzb);
        } else if (i10 == 2) {
            String zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(zzc);
        } else if (i10 == 3) {
            a M0 = a.C0158a.M0(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzd(M0);
            parcel2.writeNoException();
        } else if (i10 == 4) {
            zze();
            parcel2.writeNoException();
        } else if (i10 != 5) {
            return false;
        } else {
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
