package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class zzbuv extends zzasw implements zzbuw {
    public zzbuv() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    public static zzbuw zzq(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
        return queryLocalInterface instanceof zzbuw ? (zzbuw) queryLocalInterface : new zzbuu(iBinder);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.android.gms.internal.ads.zzbve} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [com.google.android.gms.internal.ads.zzbvd] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.ads.zzbuz] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.google.android.gms.internal.ads.zzbvd] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r0v26 */
    /* JADX WARNING: type inference failed for: r0v27 */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzbE(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
        /*
            r2 = this;
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback"
            r0 = 0
            switch(r3) {
                case 1: goto L_0x0127;
                case 2: goto L_0x0103;
                case 3: goto L_0x00f8;
                case 4: goto L_0x00ed;
                case 5: goto L_0x00db;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00a3;
                case 8: goto L_0x0090;
                case 9: goto L_0x0084;
                case 10: goto L_0x006d;
                case 11: goto L_0x0061;
                case 12: goto L_0x0055;
                case 13: goto L_0x0042;
                case 14: goto L_0x0017;
                case 15: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            r3 = 0
            return r3
        L_0x0008:
            boolean r3 = com.google.android.gms.internal.ads.zzasx.zzh(r4)
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzh(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x0017:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.u4> r3 = com.google.android.gms.ads.internal.client.u4.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzasx.zza(r4, r3)
            com.google.android.gms.ads.internal.client.u4 r3 = (com.google.android.gms.ads.internal.client.u4) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x0026
            goto L_0x0037
        L_0x0026:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbvd
            if (r0 == 0) goto L_0x0032
            r0 = r6
            com.google.android.gms.internal.ads.zzbvd r0 = (com.google.android.gms.internal.ads.zzbvd) r0
            goto L_0x0037
        L_0x0032:
            com.google.android.gms.internal.ads.zzbvb r0 = new com.google.android.gms.internal.ads.zzbvb
            r0.<init>(r1)
        L_0x0037:
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzg(r3, r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x0042:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.i2 r3 = com.google.android.gms.ads.internal.client.h2.M0(r3)
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzj(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x0055:
            com.google.android.gms.ads.internal.client.p2 r3 = r2.zzc()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r3)
            goto L_0x0150
        L_0x0061:
            com.google.android.gms.internal.ads.zzbut r3 = r2.zzd()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzasx.zzg(r5, r3)
            goto L_0x0150
        L_0x006d:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.a r3 = com.google.android.gms.dynamic.a.C0158a.M0(r3)
            boolean r6 = com.google.android.gms.internal.ads.zzasx.zzh(r4)
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzn(r3, r6)
            r5.writeNoException()
            goto L_0x0150
        L_0x0084:
            android.os.Bundle r3 = r2.zzb()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzasx.zzf(r5, r3)
            goto L_0x0150
        L_0x0090:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.ads.internal.client.f2 r3 = com.google.android.gms.ads.internal.client.e2.M0(r3)
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzi(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00a3:
            android.os.Parcelable$Creator<com.google.android.gms.internal.ads.zzbvk> r3 = com.google.android.gms.internal.ads.zzbvk.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzasx.zza(r4, r3)
            com.google.android.gms.internal.ads.zzbvk r3 = (com.google.android.gms.internal.ads.zzbvk) r3
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzl(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00b6:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbve
            if (r0 == 0) goto L_0x00cb
            r0 = r6
            com.google.android.gms.internal.ads.zzbve r0 = (com.google.android.gms.internal.ads.zzbve) r0
            goto L_0x00d0
        L_0x00cb:
            com.google.android.gms.internal.ads.zzbve r0 = new com.google.android.gms.internal.ads.zzbve
            r0.<init>(r3)
        L_0x00d0:
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzp(r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x00db:
            android.os.IBinder r3 = r4.readStrongBinder()
            com.google.android.gms.dynamic.a r3 = com.google.android.gms.dynamic.a.C0158a.M0(r3)
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzm(r3)
            r5.writeNoException()
            goto L_0x0150
        L_0x00ed:
            java.lang.String r3 = r2.zze()
            r5.writeNoException()
            r5.writeString(r3)
            goto L_0x0150
        L_0x00f8:
            boolean r3 = r2.zzo()
            r5.writeNoException()
            com.google.android.gms.internal.ads.zzasx.zzd(r5, r3)
            goto L_0x0150
        L_0x0103:
            android.os.IBinder r3 = r4.readStrongBinder()
            if (r3 != 0) goto L_0x010a
            goto L_0x011d
        L_0x010a:
            java.lang.String r6 = "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback"
            android.os.IInterface r6 = r3.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbuz
            if (r0 == 0) goto L_0x0118
            r0 = r6
            com.google.android.gms.internal.ads.zzbuz r0 = (com.google.android.gms.internal.ads.zzbuz) r0
            goto L_0x011d
        L_0x0118:
            com.google.android.gms.internal.ads.zzbux r0 = new com.google.android.gms.internal.ads.zzbux
            r0.<init>(r3)
        L_0x011d:
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzk(r0)
            r5.writeNoException()
            goto L_0x0150
        L_0x0127:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.u4> r3 = com.google.android.gms.ads.internal.client.u4.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.ads.zzasx.zza(r4, r3)
            com.google.android.gms.ads.internal.client.u4 r3 = (com.google.android.gms.ads.internal.client.u4) r3
            android.os.IBinder r1 = r4.readStrongBinder()
            if (r1 != 0) goto L_0x0136
            goto L_0x0147
        L_0x0136:
            android.os.IInterface r6 = r1.queryLocalInterface(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.ads.zzbvd
            if (r0 == 0) goto L_0x0142
            r0 = r6
            com.google.android.gms.internal.ads.zzbvd r0 = (com.google.android.gms.internal.ads.zzbvd) r0
            goto L_0x0147
        L_0x0142:
            com.google.android.gms.internal.ads.zzbvb r0 = new com.google.android.gms.internal.ads.zzbvb
            r0.<init>(r1)
        L_0x0147:
            com.google.android.gms.internal.ads.zzasx.zzc(r4)
            r2.zzf(r3, r0)
            r5.writeNoException()
        L_0x0150:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuv.zzbE(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
