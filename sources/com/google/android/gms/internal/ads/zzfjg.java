package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfjg extends a {
    public static final Parcelable.Creator<zzfjg> CREATOR = new zzfjh();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    zzfjg(int i10, int i11, int i12, String str, String str2) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i12;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        c.k(parcel, 2, this.zzb);
        c.q(parcel, 3, this.zzc, false);
        c.q(parcel, 4, this.zzd, false);
        c.k(parcel, 5, this.zze);
        c.b(parcel, a10);
    }

    public zzfjg(int i10, int i11, String str, String str2) {
        this(1, 1, i11 - 1, str, str2);
    }
}
