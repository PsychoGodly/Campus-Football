package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbqu extends zzasw implements zzbqv {
    public zzbqu() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static zzbqv zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return queryLocalInterface instanceof zzbqv ? (zzbqv) queryLocalInterface : new zzbqt(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            zzasx.zzc(parcel);
            zze((Intent) zzasx.zza(parcel, Intent.CREATOR));
        } else if (i10 == 2) {
            a M0 = a.C0158a.M0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasx.zzc(parcel);
            zzg(M0, readString, readString2);
        } else if (i10 != 3) {
            return false;
        } else {
            zzf();
        }
        parcel2.writeNoException();
        return true;
    }
}
