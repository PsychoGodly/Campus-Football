package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbja extends a {
    public static final Parcelable.Creator<zzbja> CREATOR = new zzbjb();
    public final boolean zza;
    public final String zzb;
    public final int zzc;
    public final byte[] zzd;
    public final String[] zze;
    public final String[] zzf;
    public final boolean zzg;
    public final long zzh;

    zzbja(boolean z10, String str, int i10, byte[] bArr, String[] strArr, String[] strArr2, boolean z11, long j10) {
        this.zza = z10;
        this.zzb = str;
        this.zzc = i10;
        this.zzd = bArr;
        this.zze = strArr;
        this.zzf = strArr2;
        this.zzg = z11;
        this.zzh = j10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.zza);
        c.q(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc);
        c.f(parcel, 4, this.zzd, false);
        c.r(parcel, 5, this.zze, false);
        c.r(parcel, 6, this.zzf, false);
        c.c(parcel, 7, this.zzg);
        c.n(parcel, 8, this.zzh);
        c.b(parcel, a10);
    }
}
