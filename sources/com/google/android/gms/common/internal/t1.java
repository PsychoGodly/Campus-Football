package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public abstract class t1 extends zzb implements u1 {
    public t1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static u1 M0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof u1 ? (u1) queryLocalInterface : new s1(iBinder);
    }

    /* access modifiers changed from: protected */
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            a zzd = zzd();
            parcel2.writeNoException();
            zzc.zzf(parcel2, zzd);
        } else if (i10 != 2) {
            return false;
        } else {
            int zzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(zzc);
        }
        return true;
    }
}
