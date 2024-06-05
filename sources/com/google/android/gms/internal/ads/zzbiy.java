package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbiy extends a {
    public static final Parcelable.Creator<zzbiy> CREATOR = new zzbiz();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    zzbiy(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.r(parcel, 2, this.zzb, false);
        c.r(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }
}
