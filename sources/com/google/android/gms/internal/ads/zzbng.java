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
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbng extends zzasv implements zzbni {
    zzbng(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    public final void zzA(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnl);
        zzbh(28, zza);
    }

    public final void zzB(u4 u4Var, String str, String str2) throws RemoteException {
        throw null;
    }

    public final void zzC(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnl);
        zzbh(32, zza);
    }

    public final void zzD(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(21, zza);
    }

    public final void zzE() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzF() throws RemoteException {
        zzbh(9, zza());
    }

    public final void zzG(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(25, zza);
    }

    public final void zzH(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(39, zza);
    }

    public final void zzI() throws RemoteException {
        zzbh(4, zza());
    }

    public final void zzJ(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(37, zza);
    }

    public final void zzK(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(30, zza);
    }

    public final void zzL() throws RemoteException {
        zzbh(12, zza());
    }

    public final boolean zzM() throws RemoteException {
        Parcel zzbg = zzbg(22, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzN() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbnq zzO() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 15
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbnq
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbnq r1 = (com.google.android.gms.internal.ads.zzbnq) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbnq r2 = new com.google.android.gms.internal.ads.zzbnq
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbng.zzO():com.google.android.gms.internal.ads.zzbnq");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbnr zzP() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 16
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbnr
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbnr r1 = (com.google.android.gms.internal.ads.zzbnr) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbnr r2 = new com.google.android.gms.internal.ads.zzbnr
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbng.zzP():com.google.android.gms.internal.ads.zzbnr");
    }

    public final Bundle zze() throws RemoteException {
        throw null;
    }

    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    public final s2 zzh() throws RemoteException {
        Parcel zzbg = zzbg(26, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzber zzi() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbno zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 36
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbno
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbno r1 = (com.google.android.gms.internal.ads.zzbno) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbnm r2 = new com.google.android.gms.internal.ads.zzbnm
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbng.zzj():com.google.android.gms.internal.ads.zzbno");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbnu zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 27
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbnu
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbnu r1 = (com.google.android.gms.internal.ads.zzbnu) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbns r2 = new com.google.android.gms.internal.ads.zzbns
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbng.zzk():com.google.android.gms.internal.ads.zzbnu");
    }

    public final zzbpq zzl() throws RemoteException {
        Parcel zzbg = zzbg(33, zza());
        zzbpq zzbpq = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpq;
    }

    public final zzbpq zzm() throws RemoteException {
        Parcel zzbg = zzbg(34, zza());
        zzbpq zzbpq = (zzbpq) zzasx.zza(zzbg, zzbpq.CREATOR);
        zzbg.recycle();
        return zzbpq;
    }

    public final a zzn() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final void zzo() throws RemoteException {
        zzbh(5, zza());
    }

    public final void zzp(a aVar, u4 u4Var, String str, zzbuo zzbuo, String str2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString((String) null);
        zzasx.zzg(zza, zzbuo);
        zza.writeString(str2);
        zzbh(10, zza);
    }

    public final void zzq(a aVar, zzbjp zzbjp, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbjp);
        zza.writeTypedList(list);
        zzbh(31, zza);
    }

    public final void zzr(a aVar, zzbuo zzbuo, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbuo);
        zza.writeStringList(list);
        zzbh(23, zza);
    }

    public final void zzs(u4 u4Var, String str) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zzbh(11, zza);
    }

    public final void zzt(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnl);
        zzbh(38, zza);
    }

    public final void zzu(a aVar, z4 z4Var, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        throw null;
    }

    public final void zzv(a aVar, z4 z4Var, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, z4Var);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnl);
        zzbh(6, zza);
    }

    public final void zzw(a aVar, z4 z4Var, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, z4Var);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnl);
        zzbh(35, zza);
    }

    public final void zzx(a aVar, u4 u4Var, String str, zzbnl zzbnl) throws RemoteException {
        throw null;
    }

    public final void zzy(a aVar, u4 u4Var, String str, String str2, zzbnl zzbnl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnl);
        zzbh(7, zza);
    }

    public final void zzz(a aVar, u4 u4Var, String str, String str2, zzbnl zzbnl, zzbdl zzbdl, List list) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zze(zza, u4Var);
        zza.writeString(str);
        zza.writeString(str2);
        zzasx.zzg(zza, zzbnl);
        zzasx.zze(zza, zzbdl);
        zza.writeStringList(list);
        zzbh(14, zza);
    }
}
