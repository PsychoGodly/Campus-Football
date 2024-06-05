package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzavb;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class s0 extends zzasv implements u0 {
    s0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final void zzB() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzC(e0 e0Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, e0Var);
        zzbh(20, zza);
    }

    public final void zzD(h0 h0Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, h0Var);
        zzbh(7, zza);
    }

    public final void zzF(z4 z4Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, z4Var);
        zzbh(13, zza);
    }

    public final void zzG(c1 c1Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, c1Var);
        zzbh(8, zza);
    }

    public final void zzH(zzavb zzavb) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzavb);
        zzbh(40, zza);
    }

    public final void zzI(f5 f5Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, f5Var);
        zzbh(39, zza);
    }

    public final void zzJ(j1 j1Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, j1Var);
        zzbh(45, zza);
    }

    public final void zzL(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(34, zza);
    }

    public final void zzN(boolean z10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzd(zza, z10);
        zzbh(22, zza);
    }

    public final void zzP(i2 i2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, i2Var);
        zzbh(42, zza);
    }

    public final void zzU(n4 n4Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, n4Var);
        zzbh(29, zza);
    }

    public final void zzW(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(44, zza);
    }

    public final boolean zzaa(u4 u4Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        Parcel zzbg = zzbg(4, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final z4 zzg() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        z4 z4Var = (z4) zzasx.zza(zzbg, z4.CREATOR);
        zzbg.recycle();
        return z4Var;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.h0 zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 33
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.h0
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.h0 r1 = (com.google.android.gms.ads.internal.client.h0) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.f0 r2 = new com.google.android.gms.ads.internal.client.f0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.s0.zzi():com.google.android.gms.ads.internal.client.h0");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.c1 zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 32
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAppEventListener"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.c1
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.c1 r1 = (com.google.android.gms.ads.internal.client.c1) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.z0 r2 = new com.google.android.gms.ads.internal.client.z0
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.s0.zzj():com.google.android.gms.ads.internal.client.c1");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.p2 zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 41
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IResponseInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.p2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.p2 r1 = (com.google.android.gms.ads.internal.client.p2) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.n2 r2 = new com.google.android.gms.ads.internal.client.n2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.s0.zzk():com.google.android.gms.ads.internal.client.p2");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.s2 zzl() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 26
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoController"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.s2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.s2 r1 = (com.google.android.gms.ads.internal.client.s2) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.q2 r2 = new com.google.android.gms.ads.internal.client.q2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.s0.zzl():com.google.android.gms.ads.internal.client.s2");
    }

    public final a zzn() throws RemoteException {
        Parcel zzbg = zzbg(1, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final void zzx() throws RemoteException {
        zzbh(2, zza());
    }

    public final void zzy(u4 u4Var, k0 k0Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, u4Var);
        zzasx.zzg(zza, k0Var);
        zzbh(43, zza);
    }

    public final void zzz() throws RemoteException {
        zzbh(5, zza());
    }
}
