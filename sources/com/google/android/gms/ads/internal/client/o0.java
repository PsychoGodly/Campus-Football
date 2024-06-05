package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfl;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class o0 extends zzasv implements q0 {
    o0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.n0 zze() throws android.os.RemoteException {
        /*
            r4 = this;
            android.os.Parcel r0 = r4.zza()
            r1 = 1
            android.os.Parcel r0 = r4.zzbg(r1, r0)
            android.os.IBinder r1 = r0.readStrongBinder()
            if (r1 != 0) goto L_0x0011
            r1 = 0
            goto L_0x0025
        L_0x0011:
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IAdLoader"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.n0
            if (r3 == 0) goto L_0x001f
            r1 = r2
            com.google.android.gms.ads.internal.client.n0 r1 = (com.google.android.gms.ads.internal.client.n0) r1
            goto L_0x0025
        L_0x001f:
            com.google.android.gms.ads.internal.client.l0 r2 = new com.google.android.gms.ads.internal.client.l0
            r2.<init>(r1)
            r1 = r2
        L_0x0025:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.o0.zze():com.google.android.gms.ads.internal.client.n0");
    }

    public final void zzh(String str, zzbfe zzbfe, zzbfb zzbfb) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzasx.zzg(zza, zzbfe);
        zzasx.zzg(zza, zzbfb);
        zzbh(5, zza);
    }

    public final void zzk(zzbfl zzbfl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, zzbfl);
        zzbh(10, zza);
    }

    public final void zzl(h0 h0Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, h0Var);
        zzbh(2, zza);
    }

    public final void zzo(zzbdl zzbdl) throws RemoteException {
        Parcel zza = zza();
        zzasx.zze(zza, zzbdl);
        zzbh(6, zza);
    }
}
