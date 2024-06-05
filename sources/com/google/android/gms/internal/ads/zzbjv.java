package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbjv extends a {
    public static final Parcelable.Creator<zzbjv> CREATOR = new zzbjw();
    public final String zza;
    public final Bundle zzb;

    public zzbjv(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.e(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }
}
