package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.a;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbea;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbim;
import com.google.android.gms.internal.ads.zzbio;
import com.google.android.gms.internal.ads.zzbip;
import com.google.android.gms.internal.ads.zzbnf;
import com.google.android.gms.internal.ads.zzbqu;
import com.google.android.gms.internal.ads.zzbqv;
import com.google.android.gms.internal.ads.zzbrb;
import com.google.android.gms.internal.ads.zzbrc;
import com.google.android.gms.internal.ads.zzbuv;
import com.google.android.gms.internal.ads.zzbuw;
import com.google.android.gms.internal.ads.zzbxq;
import com.google.android.gms.internal.ads.zzbxr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class d1 extends zzasv implements f1 {
    d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    public final zzbqv D0(a aVar, zzbnf zzbnf, int i10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbnf);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(15, zza);
        zzbqv zzb = zzbqu.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    public final zzbeb I0(a aVar, a aVar2) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, aVar2);
        Parcel zzbg = zzbg(5, zza);
        zzbeb zzbx = zzbea.zzbx(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzbx;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.u0 S(com.google.android.gms.dynamic.a r1, com.google.android.gms.ads.internal.client.z4 r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbnf r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r1)
            com.google.android.gms.internal.ads.zzasx.zze(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r4)
            r1 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r5.writeInt(r1)
            r1 = 2
            android.os.Parcel r1 = r0.zzbg(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.u0
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.ads.internal.client.u0 r2 = (com.google.android.gms.ads.internal.client.u0) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.ads.internal.client.s0 r3 = new com.google.android.gms.ads.internal.client.s0
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.S(com.google.android.gms.dynamic.a, com.google.android.gms.ads.internal.client.z4, java.lang.String, com.google.android.gms.internal.ads.zzbnf, int):com.google.android.gms.ads.internal.client.u0");
    }

    public final zzbip T(a aVar, zzbnf zzbnf, int i10, zzbim zzbim) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbnf);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzasx.zzg(zza, zzbim);
        Parcel zzbg = zzbg(16, zza);
        zzbip zzb = zzbio.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.q0 n1(com.google.android.gms.dynamic.a r1, java.lang.String r2, com.google.android.gms.internal.ads.zzbnf r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r1)
            r4.writeString(r2)
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r3)
            r1 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r4.writeInt(r1)
            r1 = 3
            android.os.Parcel r1 = r0.zzbg(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0020
            r2 = 0
            goto L_0x0034
        L_0x0020:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdLoaderBuilder"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.q0
            if (r4 == 0) goto L_0x002e
            r2 = r3
            com.google.android.gms.ads.internal.client.q0 r2 = (com.google.android.gms.ads.internal.client.q0) r2
            goto L_0x0034
        L_0x002e:
            com.google.android.gms.ads.internal.client.o0 r3 = new com.google.android.gms.ads.internal.client.o0
            r3.<init>(r2)
            r2 = r3
        L_0x0034:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.n1(com.google.android.gms.dynamic.a, java.lang.String, com.google.android.gms.internal.ads.zzbnf, int):com.google.android.gms.ads.internal.client.q0");
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.l2 o(com.google.android.gms.dynamic.a r2, com.google.android.gms.internal.ads.zzbnf r3, int r4) throws android.os.RemoteException {
        /*
            r1 = this;
            android.os.Parcel r4 = r1.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r2)
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r3)
            r2 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r4.writeInt(r2)
            r2 = 17
            android.os.Parcel r2 = r1.zzbg(r2, r4)
            android.os.IBinder r3 = r2.readStrongBinder()
            if (r3 != 0) goto L_0x001e
            r3 = 0
            goto L_0x0032
        L_0x001e:
            java.lang.String r4 = "com.google.android.gms.ads.internal.client.IOutOfContextTester"
            android.os.IInterface r4 = r3.queryLocalInterface(r4)
            boolean r0 = r4 instanceof com.google.android.gms.ads.internal.client.l2
            if (r0 == 0) goto L_0x002c
            r3 = r4
            com.google.android.gms.ads.internal.client.l2 r3 = (com.google.android.gms.ads.internal.client.l2) r3
            goto L_0x0032
        L_0x002c:
            com.google.android.gms.ads.internal.client.j2 r4 = new com.google.android.gms.ads.internal.client.j2
            r4.<init>(r3)
            r3 = r4
        L_0x0032:
            r2.recycle()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.o(com.google.android.gms.dynamic.a, com.google.android.gms.internal.ads.zzbnf, int):com.google.android.gms.ads.internal.client.l2");
    }

    public final zzbuw s0(a aVar, String str, zzbnf zzbnf, int i10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zza.writeString(str);
        zzasx.zzg(zza, zzbnf);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(12, zza);
        zzbuw zzq = zzbuv.zzq(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzq;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.u0 t0(com.google.android.gms.dynamic.a r1, com.google.android.gms.ads.internal.client.z4 r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbnf r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r1)
            com.google.android.gms.internal.ads.zzasx.zze(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r4)
            r1 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r5.writeInt(r1)
            r1 = 13
            android.os.Parcel r1 = r0.zzbg(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0024
            r2 = 0
            goto L_0x0038
        L_0x0024:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.u0
            if (r4 == 0) goto L_0x0032
            r2 = r3
            com.google.android.gms.ads.internal.client.u0 r2 = (com.google.android.gms.ads.internal.client.u0) r2
            goto L_0x0038
        L_0x0032:
            com.google.android.gms.ads.internal.client.s0 r3 = new com.google.android.gms.ads.internal.client.s0
            r3.<init>(r2)
            r2 = r3
        L_0x0038:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.t0(com.google.android.gms.dynamic.a, com.google.android.gms.ads.internal.client.z4, java.lang.String, com.google.android.gms.internal.ads.zzbnf, int):com.google.android.gms.ads.internal.client.u0");
    }

    public final zzbxr u(a aVar, zzbnf zzbnf, int i10) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzasx.zzg(zza, zzbnf);
        zza.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel zzbg = zzbg(14, zza);
        zzbxr zzb = zzbxq.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.u0 y(com.google.android.gms.dynamic.a r1, com.google.android.gms.ads.internal.client.z4 r2, java.lang.String r3, com.google.android.gms.internal.ads.zzbnf r4, int r5) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r5 = r0.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r1)
            com.google.android.gms.internal.ads.zzasx.zze(r5, r2)
            r5.writeString(r3)
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r4)
            r1 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r5.writeInt(r1)
            r1 = 1
            android.os.Parcel r1 = r0.zzbg(r1, r5)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0023
            r2 = 0
            goto L_0x0037
        L_0x0023:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.u0
            if (r4 == 0) goto L_0x0031
            r2 = r3
            com.google.android.gms.ads.internal.client.u0 r2 = (com.google.android.gms.ads.internal.client.u0) r2
            goto L_0x0037
        L_0x0031:
            com.google.android.gms.ads.internal.client.s0 r3 = new com.google.android.gms.ads.internal.client.s0
            r3.<init>(r2)
            r2 = r3
        L_0x0037:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.y(com.google.android.gms.dynamic.a, com.google.android.gms.ads.internal.client.z4, java.lang.String, com.google.android.gms.internal.ads.zzbnf, int):com.google.android.gms.ads.internal.client.u0");
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.u0 z0(com.google.android.gms.dynamic.a r1, com.google.android.gms.ads.internal.client.z4 r2, java.lang.String r3, int r4) throws android.os.RemoteException {
        /*
            r0 = this;
            android.os.Parcel r4 = r0.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r1)
            com.google.android.gms.internal.ads.zzasx.zze(r4, r2)
            r4.writeString(r3)
            r1 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r4.writeInt(r1)
            r1 = 10
            android.os.Parcel r1 = r0.zzbg(r1, r4)
            android.os.IBinder r2 = r1.readStrongBinder()
            if (r2 != 0) goto L_0x0021
            r2 = 0
            goto L_0x0035
        L_0x0021:
            java.lang.String r3 = "com.google.android.gms.ads.internal.client.IAdManager"
            android.os.IInterface r3 = r2.queryLocalInterface(r3)
            boolean r4 = r3 instanceof com.google.android.gms.ads.internal.client.u0
            if (r4 == 0) goto L_0x002f
            r2 = r3
            com.google.android.gms.ads.internal.client.u0 r2 = (com.google.android.gms.ads.internal.client.u0) r2
            goto L_0x0035
        L_0x002f:
            com.google.android.gms.ads.internal.client.s0 r3 = new com.google.android.gms.ads.internal.client.s0
            r3.<init>(r2)
            r2 = r3
        L_0x0035:
            r1.recycle()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.z0(com.google.android.gms.dynamic.a, com.google.android.gms.ads.internal.client.z4, java.lang.String, int):com.google.android.gms.ads.internal.client.u0");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.p1 zzg(com.google.android.gms.dynamic.a r3, int r4) throws android.os.RemoteException {
        /*
            r2 = this;
            android.os.Parcel r4 = r2.zza()
            com.google.android.gms.internal.ads.zzasx.zzg(r4, r3)
            r3 = 230500000(0xdbd26a0, float:1.1657323E-30)
            r4.writeInt(r3)
            r3 = 9
            android.os.Parcel r3 = r2.zzbg(r3, r4)
            android.os.IBinder r4 = r3.readStrongBinder()
            if (r4 != 0) goto L_0x001b
            r4 = 0
            goto L_0x002f
        L_0x001b:
            java.lang.String r0 = "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"
            android.os.IInterface r0 = r4.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.ads.internal.client.p1
            if (r1 == 0) goto L_0x0029
            r4 = r0
            com.google.android.gms.ads.internal.client.p1 r4 = (com.google.android.gms.ads.internal.client.p1) r4
            goto L_0x002f
        L_0x0029:
            com.google.android.gms.ads.internal.client.n1 r0 = new com.google.android.gms.ads.internal.client.n1
            r0.<init>(r4)
            r4 = r0
        L_0x002f:
            r3.recycle()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.d1.zzg(com.google.android.gms.dynamic.a, int):com.google.android.gms.ads.internal.client.p1");
    }

    public final zzbrc zzm(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(8, zza);
        zzbrc zzF = zzbrb.zzF(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzF;
    }
}
