package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfji extends a {
    public static final Parcelable.Creator<zzfji> CREATOR = new zzfjj();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    zzfji(int i10, byte[] bArr, int i11) {
        byte[] bArr2;
        this.zza = i10;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.zzb = bArr2;
        this.zzc = i11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.k(parcel, 1, this.zza);
        c.f(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc);
        c.b(parcel, a10);
    }

    public zzfji(byte[] bArr, int i10) {
        this(1, (byte[]) null, 1);
    }
}
