package com.google.android.gms.ads.internal.client;

import com.google.android.gms.internal.ads.zzasw;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public abstract class o1 extends zzasw implements p1 {
    public o1() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [android.os.IInterface] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzbE(int r2, android.os.Parcel r3, android.os.Parcel r4, int r5) throws android.os.RemoteException {
        /*
            r1 = this;
            switch(r2) {
                case 1: goto L_0x011e;
                case 2: goto L_0x0110;
                case 3: goto L_0x0102;
                case 4: goto L_0x00f4;
                case 5: goto L_0x00de;
                case 6: goto L_0x00c8;
                case 7: goto L_0x00bd;
                case 8: goto L_0x00b2;
                case 9: goto L_0x00a6;
                case 10: goto L_0x0097;
                case 11: goto L_0x0084;
                case 12: goto L_0x0071;
                case 13: goto L_0x0065;
                case 14: goto L_0x0052;
                case 15: goto L_0x004a;
                case 16: goto L_0x0023;
                case 17: goto L_0x0014;
                case 18: goto L_0x0005;
                default: goto L_0x0003;
            }
        L_0x0003:
            r2 = 0
            return r2
        L_0x0005:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzt(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0014:
            boolean r2 = com.google.android.gms.internal.ads.zzasx.zzh(r3)
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzj(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0023:
            android.os.IBinder r2 = r3.readStrongBinder()
            if (r2 != 0) goto L_0x002b
            r2 = 0
            goto L_0x003f
        L_0x002b:
            java.lang.String r5 = "com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)
            boolean r0 = r5 instanceof com.google.android.gms.ads.internal.client.c2
            if (r0 == 0) goto L_0x0039
            r2 = r5
            com.google.android.gms.ads.internal.client.c2 r2 = (com.google.android.gms.ads.internal.client.c2) r2
            goto L_0x003f
        L_0x0039:
            com.google.android.gms.ads.internal.client.z1 r5 = new com.google.android.gms.ads.internal.client.z1
            r5.<init>(r2)
            r2 = r5
        L_0x003f:
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzm(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x004a:
            r1.zzi()
            r4.writeNoException()
            goto L_0x0124
        L_0x0052:
            android.os.Parcelable$Creator<com.google.android.gms.ads.internal.client.i4> r2 = com.google.android.gms.ads.internal.client.i4.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.internal.ads.zzasx.zza(r3, r2)
            com.google.android.gms.ads.internal.client.i4 r2 = (com.google.android.gms.ads.internal.client.i4) r2
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzu(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0065:
            java.util.List r2 = r1.zzg()
            r4.writeNoException()
            r4.writeTypedList(r2)
            goto L_0x0124
        L_0x0071:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbjs r2 = com.google.android.gms.internal.ads.zzbjr.zzc(r2)
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzs(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0084:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.internal.ads.zzbnf r2 = com.google.android.gms.internal.ads.zzbne.zzf(r2)
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzo(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0097:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzh(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x00a6:
            java.lang.String r2 = r1.zzf()
            r4.writeNoException()
            r4.writeString(r2)
            goto L_0x0124
        L_0x00b2:
            boolean r2 = r1.zzv()
            r4.writeNoException()
            com.google.android.gms.internal.ads.zzasx.zzd(r4, r2)
            goto L_0x0124
        L_0x00bd:
            float r2 = r1.zze()
            r4.writeNoException()
            r4.writeFloat(r2)
            goto L_0x0124
        L_0x00c8:
            java.lang.String r2 = r3.readString()
            android.os.IBinder r5 = r3.readStrongBinder()
            com.google.android.gms.dynamic.a r5 = com.google.android.gms.dynamic.a.C0158a.M0(r5)
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzl(r2, r5)
            r4.writeNoException()
            goto L_0x0124
        L_0x00de:
            android.os.IBinder r2 = r3.readStrongBinder()
            com.google.android.gms.dynamic.a r2 = com.google.android.gms.dynamic.a.C0158a.M0(r2)
            java.lang.String r5 = r3.readString()
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzn(r2, r5)
            r4.writeNoException()
            goto L_0x0124
        L_0x00f4:
            boolean r2 = com.google.android.gms.internal.ads.zzasx.zzh(r3)
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzp(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0102:
            java.lang.String r2 = r3.readString()
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzr(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x0110:
            float r2 = r3.readFloat()
            com.google.android.gms.internal.ads.zzasx.zzc(r3)
            r1.zzq(r2)
            r4.writeNoException()
            goto L_0x0124
        L_0x011e:
            r1.zzk()
            r4.writeNoException()
        L_0x0124:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.client.o1.zzbE(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
