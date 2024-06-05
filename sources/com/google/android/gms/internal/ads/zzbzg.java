package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import h5.j;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbzg extends a {
    public static final Parcelable.Creator<zzbzg> CREATOR = new zzbzh();
    public String zza;
    public int zzb;
    public int zzc;
    public boolean zzd;
    public boolean zze;

    public zzbzg(int i10, int i11, boolean z10, boolean z11) {
        this((int) ModuleDescriptor.MODULE_VERSION, i11, true, false, z11);
    }

    public static zzbzg zza() {
        return new zzbzg((int) j.f18843a, (int) j.f18843a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zza, false);
        c.k(parcel, 3, this.zzb);
        c.k(parcel, 4, this.zzc);
        c.c(parcel, 5, this.zzd);
        c.c(parcel, 6, this.zze);
        c.b(parcel, a10);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzbzg(int r9, int r10, boolean r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            java.lang.String r12 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r12 = "1"
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "afma-sdk-a-v"
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            r0.append(r10)
            r0.append(r1)
            r0.append(r12)
            java.lang.String r3 = r0.toString()
            r2 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r13
            r2.<init>((java.lang.String) r3, (int) r4, (int) r5, (boolean) r6, (boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbzg.<init>(int, int, boolean, boolean, boolean):void");
    }

    zzbzg(String str, int i10, int i11, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = z10;
        this.zze = z11;
    }
}
