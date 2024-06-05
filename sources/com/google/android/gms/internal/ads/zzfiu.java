package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfiu extends a {
    public static final Parcelable.Creator<zzfiu> CREATOR = new zzfiv();
    public final int zza;
    public final byte[] zzb;

    zzfiu(int i10, byte[] bArr) {
        this.zza = i10;
        this.zzb = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        c.f(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public zzfiu(byte[] bArr) {
        this(1, bArr);
    }
}
