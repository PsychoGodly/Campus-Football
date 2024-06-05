package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbdv extends zzasv implements zzbdx {
    zzbdv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public final double zzb() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final int zzc() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    public final int zzd() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        int readInt = zzbg.readInt();
        zzbg.recycle();
        return readInt;
    }

    public final Uri zze() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        Uri uri = (Uri) zzasx.zza(zzbg, Uri.CREATOR);
        zzbg.recycle();
        return uri;
    }

    public final a zzf() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }
}
