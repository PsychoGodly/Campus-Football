package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsv extends a {
    public static final Parcelable.Creator<zzbsv> CREATOR = new zzbsw();
    public final String zza;
    public final int zzb;
    public final Bundle zzc;
    public final byte[] zzd;
    public final boolean zze;
    public final String zzf;
    public final String zzg;

    public zzbsv(String str, int i10, Bundle bundle, byte[] bArr, boolean z10, String str2, String str3) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = bundle;
        this.zzd = bArr;
        this.zze = z10;
        this.zzf = str2;
        this.zzg = str3;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 1, this.zza, false);
        c.k(parcel, 2, this.zzb);
        c.e(parcel, 3, this.zzc, false);
        c.f(parcel, 4, this.zzd, false);
        c.c(parcel, 5, this.zze);
        c.q(parcel, 6, this.zzf, false);
        c.q(parcel, 7, this.zzg, false);
        c.b(parcel, a10);
    }
}
