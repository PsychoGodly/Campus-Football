package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.i2;
import com.google.android.gms.ads.internal.client.o2;
import com.google.android.gms.ads.internal.client.p2;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.ads.internal.client.t1;
import com.google.android.gms.ads.internal.client.x1;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbfs extends zzasv implements zzbfu {
    zzbfs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    public final void zzA() throws RemoteException {
        zzbh(28, zza());
    }

    public final void zzB(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzbh(17, zza);
    }

    public final void zzC() throws RemoteException {
        zzbh(27, zza());
    }

    public final void zzD(t1 t1Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, t1Var);
        zzbh(26, zza);
    }

    public final void zzE(i2 i2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, i2Var);
        zzbh(32, zza);
    }

    public final void zzF(zzbfr zzbfr) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfr);
        zzbh(21, zza);
    }

    public final boolean zzG() throws RemoteException {
        Parcel zzbg = zzbg(30, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzH() throws RemoteException {
        Parcel zzbg = zzbg(24, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzI(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        Parcel zzbg = zzbg(16, zza);
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

    public final Bundle zzf() throws RemoteException {
        Parcel zzbg = zzbg(20, zza());
        Bundle bundle = (Bundle) zzasx.zza(zzbg, Bundle.CREATOR);
        zzbg.recycle();
        return bundle;
    }

    public final p2 zzg() throws RemoteException {
        Parcel zzbg = zzbg(31, zza());
        p2 zzb = o2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final s2 zzh() throws RemoteException {
        Parcel zzbg = zzbg(11, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbdp zzi() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 14
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IAttributionInfo"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbdp
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbdp r1 = (com.google.android.gms.internal.ads.zzbdp) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbdn r2 = new com.google.android.gms.internal.ads.zzbdn
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfs.zzi():com.google.android.gms.internal.ads.zzbdp");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbdu zzj() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 29
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0012
            r1 = 0
            goto L_0x0026
        L_0x0012:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.IMediaContent"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbdu
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.internal.ads.zzbdu r1 = (com.google.android.gms.internal.ads.zzbdu) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.internal.ads.zzbds r2 = new com.google.android.gms.internal.ads.zzbds
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfs.zzj():com.google.android.gms.internal.ads.zzbdu");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbdx zzk() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 5
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.zzbdx
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.internal.ads.zzbdx r1 = (com.google.android.gms.internal.ads.zzbdx) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.internal.ads.zzbdv r2 = new com.google.android.gms.internal.ads.zzbdv
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbfs.zzk():com.google.android.gms.internal.ads.zzbdx");
    }

    public final a zzl() throws RemoteException {
        Parcel zzbg = zzbg(19, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final a zzm() throws RemoteException {
        Parcel zzbg = zzbg(18, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzn() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzo() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzp() throws RemoteException {
        Parcel zzbg = zzbg(6, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzq() throws RemoteException {
        Parcel zzbg = zzbg(2, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzr() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzs() throws RemoteException {
        Parcel zzbg = zzbg(10, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzt() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzu() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final List zzv() throws RemoteException {
        Parcel zzbg = zzbg(23, zza());
        ArrayList zzb = zzasx.zzb(zzbg);
        zzbg.recycle();
        return zzb;
    }

    public final void zzw() throws RemoteException {
        zzbh(22, zza());
    }

    public final void zzx() throws RemoteException {
        zzbh(13, zza());
    }

    public final void zzy(x1 x1Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, x1Var);
        zzbh(25, zza);
    }

    public final void zzz(Bundle bundle) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, bundle);
        zzbh(15, zza);
    }
}
