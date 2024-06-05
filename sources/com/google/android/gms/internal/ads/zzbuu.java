package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.f2;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.dynamic.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbuu extends zzasv implements zzbuw {
    zzbuu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public final Bundle zzb() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final p2 zzc() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        p2 zzb = o2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbut zzd() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 11
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.rewarded.client.IRewardItem"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbut
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbut r1 = (com.google.android.gms.internal.ads.zzbut) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbur r2 = new com.google.android.gms.internal.ads.zzbur
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuu.zzd():com.google.android.gms.internal.ads.zzbut");
    }

    public final String zze() throws RemoteException {
        throw null;
    }

    public final void zzf(u4 u4Var, zzbvd zzbvd) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, zzbvd);
        zzbh(1, zza);
    }

    public final void zzg(u4 u4Var, zzbvd zzbvd) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, zzbvd);
        zzbh(14, zza);
    }

    public final void zzh(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(15, zza);
    }

    public final void zzi(f2 f2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, f2Var);
        zzbh(8, zza);
    }

    public final void zzj(i2 i2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, i2Var);
        zzbh(13, zza);
    }

    public final void zzk(zzbuz zzbuz) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbuz);
        zzbh(2, zza);
    }

    public final void zzl(zzbvk zzbvk) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbvk);
        zzbh(7, zza);
    }

    public final void zzm(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(5, zza);
    }

    public final void zzn(a aVar, boolean z10) throws RemoteException {
        throw null;
    }

    public final boolean zzo() throws RemoteException {
        throw null;
    }

    public final void zzp(zzbve zzbve) throws RemoteException {
        throw null;
    }
}
