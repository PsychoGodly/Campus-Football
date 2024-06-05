package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbsr extends a {
    public static final Parcelable.Creator<zzbsr> CREATOR = new zzbss();
    public final ApplicationInfo zza;
    public final String zzb;
    public final PackageInfo zzc;
    public final String zzd;
    public final int zze;
    public final String zzf;
    public final List zzg;
    public final boolean zzh;
    public final boolean zzi;

    public zzbsr(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i10, String str3, List list, boolean z10, boolean z11) {
        this.zzb = str;
        this.zza = applicationInfo;
        this.zzc = packageInfo;
        this.zzd = str2;
        this.zze = i10;
        this.zzf = str3;
        this.zzg = list;
        this.zzh = z10;
        this.zzi = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.p(parcel, 1, this.zza, i10, false);
        c.q(parcel, 2, this.zzb, false);
        c.p(parcel, 3, this.zzc, i10, false);
        c.q(parcel, 4, this.zzd, false);
        c.k(parcel, 5, this.zze);
        c.q(parcel, 6, this.zzf, false);
        c.s(parcel, 7, this.zzg, false);
        c.c(parcel, 8, this.zzh);
        c.c(parcel, 9, this.zzi);
        c.b(parcel, a10);
    }
}
