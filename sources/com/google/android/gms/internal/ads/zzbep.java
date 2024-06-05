package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.r2;
import com.google.android.gms.ads.internal.client.s2;
import com.google.android.gms.dynamic.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbep extends zzasv implements zzber {
    zzbep(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final s2 zze() throws RemoteException {
        Parcel zzbg = zzbg(7, zza());
        s2 zzb = r2.zzb(zzbg.readStrongBinder());
        zzbg.recycle();
        return zzb;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbdu zzf() throws android.os.RemoteException {
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbep.zzf():com.google.android.gms.internal.ads.zzbdu");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzbdx zzg(java.lang.String r4) throws android.os.RemoteException {
        /*
            r3 = this;
            android.os.Parcel r0 = r3.zza()
            r0.writeString(r4)
            r4 = 2
            android.os.Parcel r4 = r3.zzbg(r4, r0)
            android.os.IBinder r0 = r4.readStrongBinder()
            if (r0 != 0) goto L_0x0014
            r0 = 0
            goto L_0x0028
        L_0x0014:
            java.lang.String r1 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r1 = r0.queryLocalInterface(r1)
            boolean r2 = r1 instanceof com.google.android.gms.internal.ads.zzbdx
            if (r2 == 0) goto L_0x0022
            r0 = r1
            com.google.android.gms.internal.ads.zzbdx r0 = (com.google.android.gms.internal.ads.zzbdx) r0
            goto L_0x0028
        L_0x0022:
            com.google.android.gms.internal.ads.zzbdv r1 = new com.google.android.gms.internal.ads.zzbdv
            r1.<init>(r0)
            r0 = r1
        L_0x0028:
            r4.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbep.zzg(java.lang.String):com.google.android.gms.internal.ads.zzbdx");
    }

    public final a zzh() throws RemoteException {
        Parcel zzbg = zzbg(9, zza());
        a M0 = a.C0158a.M0(zzbg.readStrongBinder());
        zzbg.recycle();
        return M0;
    }

    public final String zzi() throws RemoteException {
        Parcel zzbg = zzbg(4, zza());
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final String zzj(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        Parcel zzbg = zzbg(1, zza);
        String readString = zzbg.readString();
        zzbg.recycle();
        return readString;
    }

    public final List zzk() throws RemoteException {
        Parcel zzbg = zzbg(3, zza());
        ArrayList<String> createStringArrayList = zzbg.createStringArrayList();
        zzbg.recycle();
        return createStringArrayList;
    }

    public final void zzl() throws RemoteException {
        zzbh(8, zza());
    }

    public final void zzm() throws RemoteException {
        zzbh(15, zza());
    }

    public final void zzn(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzbh(5, zza);
    }

    public final void zzo() throws RemoteException {
        zzbh(6, zza());
    }

    public final void zzp(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        zzbh(14, zza);
    }

    public final boolean zzq() throws RemoteException {
        Parcel zzbg = zzbg(12, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzr(a aVar) throws RemoteException {
        Parcel zza = zza();
        zzasx.zzg(zza, aVar);
        Parcel zzbg = zzbg(10, zza);
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }

    public final boolean zzs() throws RemoteException {
        Parcel zzbg = zzbg(13, zza());
        boolean zzh = zzasx.zzh(zzbg);
        zzbg.recycle();
        return zzh;
    }
}
