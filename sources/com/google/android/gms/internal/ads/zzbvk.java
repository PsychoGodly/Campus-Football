package com.google.android.gms.internal.ads;

import a5.e;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbvk extends a {
    public static final Parcelable.Creator<zzbvk> CREATOR = new zzbvl();
    public final String zza;
    public final String zzb;

    public zzbvk(e eVar) {
        this(eVar.b(), eVar.a());
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.q(parcel, 2, this.zzb, false);
        c.b(parcel, a10);
    }

    public zzbvk(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
