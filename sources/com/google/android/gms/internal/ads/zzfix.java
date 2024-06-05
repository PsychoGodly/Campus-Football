package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfix extends a {
    public static final Parcelable.Creator<zzfix> CREATOR = new zzfiy();
    public final int zza;
    public final String zzb;
    public final String zzc;

    zzfix(int i10, String str, String str2) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        c.q(parcel, 2, this.zzb, false);
        c.q(parcel, 3, this.zzc, false);
        c.b(parcel, a10);
    }

    public zzfix(String str, String str2) {
        this(1, str, str2);
    }
}
