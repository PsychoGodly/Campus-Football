package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.zza;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class s1 extends zza implements u1 {
    s1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final int zzc() throws RemoteException {
        Parcel zzB = zzB(2, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a zzd() throws RemoteException {
        Parcel zzB = zzB(1, zza());
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }
}
