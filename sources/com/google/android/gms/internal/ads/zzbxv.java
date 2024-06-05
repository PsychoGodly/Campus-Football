package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.u4;
import com.google.android.gms.ads.internal.client.z4;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbxv extends a {
    public static final Parcelable.Creator<zzbxv> CREATOR = new zzbxw();
    @Deprecated
    public final String zza;
    public final String zzb;
    @Deprecated
    public final z4 zzc;
    public final u4 zzd;

    public zzbxv(String str, String str2, z4 z4Var, u4 u4Var) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4Var;
        this.zzd = u4Var;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.q(parcel, 2, this.zzb, false);
        c.p(parcel, 3, this.zzc, i10, false);
        c.p(parcel, 4, this.zzd, i10, false);
        c.b(parcel, a10);
    }
}
