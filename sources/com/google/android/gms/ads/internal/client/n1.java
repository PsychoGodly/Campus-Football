package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbjl;
import com.google.android.gms.internal.ads.zzbjs;
import com.google.android.gms.internal.ads.zzbnf;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class n1 extends zzasv implements p1 {
    n1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    public final float zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        float readFloat = zzbg.readFloat();
        zzbg.recycle();
        return readFloat;
    }

    public final List zzg() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        ArrayList<zzbjl> createTypedArrayList = zzbg.createTypedArrayList(zzbjl.CREATOR);
        zzbg.recycle();
        return createTypedArrayList;
    }

    public final void zzh(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(10, zza);
    }

    public final void zzi() throws RemoteException {
        zzbh(15, zza());
    }

    public final void zzj(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(17, zza);
    }

    public final void zzk() throws RemoteException {
        zzbh(1, zza());
    }

    public final void zzl(String str, a aVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString((String) null);
        zzasx.zzg(zza, aVar);
        zzbh(6, zza);
    }

    public final void zzm(c2 c2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, c2Var);
        zzbh(16, zza);
    }

    public final void zzn(a aVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeString(str);
        zzbh(5, zza);
    }

    public final void zzo(zzbnf zzbnf) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbnf);
        zzbh(11, zza);
    }

    public final void zzp(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(4, zza);
    }

    public final void zzq(float f10) throws RemoteException {
        Parcel zza = zza();
        zza.writeFloat(f10);
        zzbh(2, zza);
    }

    public final void zzs(zzbjs zzbjs) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbjs);
        zzbh(12, zza);
    }

    public final void zzt(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(18, zza);
    }

    public final void zzu(i4 i4Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, i4Var);
        zzbh(14, zza);
    }

    public final boolean zzv() throws RemoteException {
        Parcel zzbg = zzbg(8, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
