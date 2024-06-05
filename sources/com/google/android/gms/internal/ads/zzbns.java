package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbns extends zzasv implements zzbnu {
    zzbns(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public final boolean zzA() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzB() throws RemoteException {
        Parcel zzbg = zzbg(17, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final float zzf() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzbg = zzbg(25, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final float zzh() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final Bundle zzi() throws RemoteException {
        Parcel zzbg = zzbg(16, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final s2 zzj() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbdp zzk() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        zzbdp zzj = zzbdo.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbdx zzl() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbdx zzg = zzbdw.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final a zzm() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzn() throws RemoteException {
        Parcel zzbg = zzbg(14, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzo() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzu() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzw(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(20, zza);
    }

    public final void zzx() throws RemoteException {
        zzbh(19, zza());
    }

    public final void zzy(a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, aVar2);
        zzasx.zzg(zza, aVar3);
        zzbh(21, zza);
    }

    public final void zzz(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(22, zza);
    }
}
