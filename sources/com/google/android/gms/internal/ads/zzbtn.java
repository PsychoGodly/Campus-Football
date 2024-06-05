package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import i5.a;
import i5.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbtn extends a {
    public static final Parcelable.Creator<zzbtn> CREATOR = new zzbto();
    public final Bundle zza;
    public final zzbzg zzb;
    public final ApplicationInfo zzc;
    public final String zzd;
    public final List zze;
    public final PackageInfo zzf;
    public final String zzg;
    public final String zzh;
    public zzfaq zzi;
    public String zzj;
    public final boolean zzk;
    public final boolean zzl;

    public zzbtn(Bundle bundle, zzbzg zzbzg, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzfaq zzfaq, String str4, boolean z10, boolean z11) {
        this.zza = bundle;
        this.zzb = zzbzg;
        this.zzd = str;
        this.zzc = applicationInfo;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzfaq;
        this.zzj = str4;
        this.zzk = z10;
        this.zzl = z11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.e(parcel, 1, this.zza, false);
        c.p(parcel, 2, this.zzb, i10, false);
        c.p(parcel, 3, this.zzc, i10, false);
        c.q(parcel, 4, this.zzd, false);
        c.s(parcel, 5, this.zze, false);
        c.p(parcel, 6, this.zzf, i10, false);
        c.q(parcel, 7, this.zzg, false);
        c.q(parcel, 9, this.zzh, false);
        c.p(parcel, 10, this.zzi, i10, false);
        c.q(parcel, 11, this.zzj, false);
        c.c(parcel, 12, this.zzk);
        c.c(parcel, 13, this.zzl);
        c.b(parcel, a10);
    }
}
