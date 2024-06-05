package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbds extends zzasv implements zzbdu {
    zzbds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final s2 zzh() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final a zzi() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final void zzj(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(3, zza);
    }

    public final boolean zzk() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final void zzl(zzbff zzbff) throws RemoteException {
        throw null;
    }
}
