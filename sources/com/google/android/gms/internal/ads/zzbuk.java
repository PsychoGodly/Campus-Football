package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbuk extends a {
    public static final Parcelable.Creator<zzbuk> CREATOR = new zzbul();
    public final u4 zza;
    public final String zzb;

    public zzbuk(u4 u4Var, String str) {
        this.zza = u4Var;
        this.zzb = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 2, this.zza, i10, false);
        c.q(parcel, 3, this.zzb, false);
        c.b(parcel, a10);
    }
}
