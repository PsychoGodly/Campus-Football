package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class n extends zza {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final a A1(a aVar, String str, int i10, a aVar2) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zzf(zza, aVar2);
        Parcel zzB = zzB(3, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }

    public final a M0(a aVar, String str, int i10, a aVar2) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zzf(zza, aVar2);
        Parcel zzB = zzB(2, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }
}
