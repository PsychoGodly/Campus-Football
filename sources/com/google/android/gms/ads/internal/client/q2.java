package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzasv;
import com.google.android.gms.internal.ads.zzasx;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class q2 extends zzasv implements s2 {
    q2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    public final float zze() throws RemoteException {
        throw null;
    }

    public final float zzf() throws RemoteException {
        throw null;
    }

    public final float zzg() throws RemoteException {
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.ads.internal.client.v2 zzi() throws android.os.RemoteException {
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
            java.lang.String r2 = "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)
            boolean r3 = r2 instanceof com.google.android.gms.ads.internal.client.v2
            if (r3 == 0) goto L_0x0020
            r1 = r2
            com.google.android.gms.ads.internal.client.v2 r1 = (com.google.android.gms.ads.internal.client.v2) r1
            goto L_0x0026
        L_0x0020:
            com.google.android.gms.ads.internal.client.t2 r2 = new com.google.android.gms.ads.internal.client.t2
            r2.<init>(r1)
            r1 = r2
        L_0x0026:
            r0.recycle()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.q2.zzi():com.google.android.gms.ads.internal.client.v2");
    }

    public final void zzm(v2 v2Var) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, v2Var);
        zzbh(8, zza);
    }
}
