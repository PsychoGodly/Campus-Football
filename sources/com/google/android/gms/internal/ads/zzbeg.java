package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbeg extends zzasw implements zzbeh {
    public zzbeg() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    public static zzbeh zze(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
        return queryLocalInterface instanceof zzbeh ? (zzbeh) queryLocalInterface : new zzbef(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a M0 = a.C0158a.M0(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzc(M0);
        } else if (i10 == 2) {
            zzd();
        } else if (i10 != 3) {
            return false;
        } else {
            a M02 = a.C0158a.M0(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zzb(M02);
        }
        parcel2.writeNoException();
        return true;
    }
}
