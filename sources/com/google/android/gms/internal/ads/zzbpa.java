package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbpa extends zzasv implements zzbpc {
    zzbpa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public final s2 zze() throws RemoteException {
        Parcel zzbg = zzbg(5, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbpq zzf() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        zzbpq zzbpq = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpq;
    }

    public final zzbpq zzg() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        zzbpq zzbpq = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpq;
    }

    public final void zzh(a aVar, String str, Bundle bundle, Bundle bundle2, z4 z4Var, zzbpf zzbpf) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeString(str);
        zzasx.zze(zza, bundle);
        zzasx.zze(zza, bundle2);
        zzasx.zze(zza, z4Var);
        zzasx.zzg(zza, zzbpf);
        zzbh(1, zza);
    }

    public final void zzi(String str, String str2, u4 u4Var, a aVar, zzbon zzbon, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbon);
        zzasx.zzg(zza, zzbnl);
        zzbh(23, zza);
    }

    public final void zzj(String str, String str2, u4 u4Var, a aVar, zzboq zzboq, zzbnl zzbnl, z4 z4Var) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzboq);
        zzasx.zzg(zza, zzbnl);
        zzasx.zze(zza, z4Var);
        zzbh(13, zza);
    }

    public final void zzk(String str, String str2, u4 u4Var, a aVar, zzboq zzboq, zzbnl zzbnl, z4 z4Var) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzboq);
        zzasx.zzg(zza, zzbnl);
        zzasx.zze(zza, z4Var);
        zzbh(21, zza);
    }

    public final void zzl(String str, String str2, u4 u4Var, a aVar, zzbot zzbot, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbot);
        zzasx.zzg(zza, zzbnl);
        zzbh(14, zza);
    }

    public final void zzm(String str, String str2, u4 u4Var, a aVar, zzbow zzbow, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbow);
        zzasx.zzg(zza, zzbnl);
        zzbh(18, zza);
    }

    public final void zzn(String str, String str2, u4 u4Var, a aVar, zzbow zzbow, zzbnl zzbnl, zzbdl zzbdl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbow);
        zzasx.zzg(zza, zzbnl);
        zzasx.zze(zza, zzbdl);
        zzbh(22, zza);
    }

    public final void zzo(String str, String str2, u4 u4Var, a aVar, zzboz zzboz, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzboz);
        zzasx.zzg(zza, zzbnl);
        zzbh(20, zza);
    }

    public final void zzp(String str, String str2, u4 u4Var, a aVar, zzboz zzboz, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzboz);
        zzasx.zzg(zza, zzbnl);
        zzbh(16, zza);
    }

    public final void zzq(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(19, zza);
    }

    public final boolean zzr(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(24, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzs(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(15, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzt(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(17, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
