package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbjl extends a {
    public static final Parcelable.Creator<zzbjl> CREATOR = new zzbjm();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbjl(String str, boolean z10, int i10, String str2) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = i10;
        this.zzd = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.c(parcel, 2, this.zzb);
        c.k(parcel, 3, this.zzc);
        c.q(parcel, 4, this.zzd, false);
        c.b(parcel, a10);
    }
}
