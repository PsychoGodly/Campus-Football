package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class m extends zza {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int A1(a aVar, String str, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zzc.zzc(zza, z10);
        Parcel zzB = zzB(5, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final a B1(a aVar, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(2, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }

    public final a C1(a aVar, String str, int i10, a aVar2) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        zzc.zzf(zza, aVar2);
        Parcel zzB = zzB(8, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }

    public final a D1(a aVar, String str, int i10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zza.writeInt(i10);
        Parcel zzB = zzB(4, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }

    public final a E1(a aVar, String str, boolean z10, long j10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zzc.zzc(zza, z10);
        zza.writeLong(j10);
        Parcel zzB = zzB(7, zza);
        a M0 = a.C0158a.M0(zzB.readStrongBinder());
        zzB.recycle();
        return M0;
    }

    public final int M0(a aVar, String str, boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzc.zzf(zza, aVar);
        zza.writeString(str);
        zzc.zzc(zza, z10);
        Parcel zzB = zzB(3, zza);
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }

    public final int zze() throws RemoteException {
        Parcel zzB = zzB(6, zza());
        int readInt = zzB.readInt();
        zzB.recycle();
        return readInt;
    }
}
