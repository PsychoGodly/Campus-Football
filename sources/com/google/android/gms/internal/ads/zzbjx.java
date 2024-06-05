package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbjx extends a {
    public static final Parcelable.Creator<zzbjx> CREATOR = new zzbjy();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzbjx(int i10, int i11, String str, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zzb);
        c.q(parcel, 2, this.zzc, false);
        c.k(parcel, 3, this.zzd);
        c.k(parcel, 1000, this.zza);
        c.b(parcel, a10);
    }
}
