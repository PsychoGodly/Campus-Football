package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbst extends a {
    public static final Parcelable.Creator<zzbst> CREATOR = new zzbsu();
    public final boolean zza;
    public final List zzb;

    public zzbst() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 2, this.zza);
        c.s(parcel, 3, this.zzb, false);
        c.b(parcel, a10);
    }

    public zzbst(boolean z10, List list) {
        this.zza = z10;
        this.zzb = list;
    }
}
