package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zzdd extends a {
    public static final Parcelable.Creator<zzdd> CREATOR = new zzdg();
    public final long zza;
    public final long zzb;
    public final boolean zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final Bundle zzg;
    public final String zzh;

    public zzdd(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.zza = j10;
        this.zzb = j11;
        this.zzc = z10;
        this.zzd = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzg = bundle;
        this.zzh = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.zza);
        c.n(parcel, 2, this.zzb);
        c.c(parcel, 3, this.zzc);
        c.q(parcel, 4, this.zzd, false);
        c.q(parcel, 5, this.zze, false);
        c.q(parcel, 6, this.zzf, false);
        c.e(parcel, 7, this.zzg, false);
        c.q(parcel, 8, this.zzh, false);
        c.b(parcel, a10);
    }
}
