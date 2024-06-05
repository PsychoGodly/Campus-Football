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
public final class zzbnq extends zzasv {
    zzbnq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
    }

    public final double zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        double readDouble = zzbg.readDouble();
        zzbg.recycle();
        return readDouble;
    }

    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final s2 zzg() throws RemoteException {
        Parcel zzbg = zzbg(17, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbdp zzh() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        zzbdp zzj = zzbdo.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbdx zzi() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbdx zzg = zzbdw.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final a zzj() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzk() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzl() throws RemoteException {
        Parcel zzbg = zzbg(21, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzm() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzr() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzs(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(11, zza);
    }

    public final void zzt() throws RemoteException {
        zzbh(10, zza());
    }

    public final void zzu(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(12, zza);
    }

    public final void zzv(a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, aVar2);
        zzasx.zzg(zza, aVar3);
        zzbh(22, zza);
    }

    public final void zzw(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(16, zza);
    }

    public final boolean zzx() throws RemoteException {
        Parcel zzbg = zzbg(14, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzy() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
