package com.google.android.gms.appset;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class zzc extends a {
    public static final Parcelable.Creator<zzc> CREATOR = new zzd();
    private final String zza;
    private final int zzb;

    public zzc(String str, int i10) {
        this.zza = str;
        this.zzb = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.k(parcel, 2, this.zzb);
        c.b(parcel, a10);
    }

    public final int zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
