package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasw;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class s0 extends zzasw implements t0 {
    public s0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    public final boolean zzbE(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a M0 = a.C0158a.M0(parcel.readStrongBinder());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzasx.zzc(parcel);
            boolean zzf = zzf(M0, readString, readString2);
            parcel2.writeNoException();
            zzasx.zzd(parcel2, zzf);
        } else if (i10 != 2) {
            return false;
        } else {
            a M02 = a.C0158a.M0(parcel.readStrongBinder());
            zzasx.zzc(parcel);
            zze(M02);
            parcel2.writeNoException();
        }
        return true;
    }
}
