package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzasy extends zzasv implements zzata {
    zzasy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void zze(a aVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeString("GMA_SDK");
        zzbh(2, zza);
    }

    public final void zzf() throws RemoteException {
        zzbh(3, zza());
    }

    public final void zzg(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i10);
        zzbh(7, zza);
    }

    public final void zzh(int[] iArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeIntArray((int[]) null);
        zzbh(4, zza);
    }

    public final void zzi(int i10) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(0);
        zzbh(6, zza);
    }

    public final void zzj(byte[] bArr) throws RemoteException {
        Parcel zza = zza();
        zza.writeByteArray(bArr);
        zzbh(5, zza);
    }
}
