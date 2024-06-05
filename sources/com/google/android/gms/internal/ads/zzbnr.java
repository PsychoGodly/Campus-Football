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
public final class zzbnr extends zzasv {
    zzbnr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
    }

    public final Bundle zze() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final s2 zzf() throws RemoteException {
        Parcel zzbg = zzbg(16, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbdp zzg() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        zzbdp zzj = zzbdo.zzj(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzj;
    }

    public final zzbdx zzh() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        zzbdx zzg = zzbdw.zzg(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzg;
    }

    public final a zzi() throws RemoteException {
        Parcel zzbg = zzbg(15, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzj() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzk() throws RemoteException {
        Parcel zzbg = zzbg(21, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzl() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
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

    public final List zzp() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzq(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(9, zza);
    }

    public final void zzr() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzs(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(10, zza);
    }

    public final void zzt(a aVar, a aVar2, a aVar3) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, aVar2);
        zzasx.zzg(zza, aVar3);
        zzbh(22, zza);
    }

    public final void zzu(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzw() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
