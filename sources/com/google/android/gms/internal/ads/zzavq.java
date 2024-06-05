package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import i5.a;
import i5.c;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzavq extends a {
    public static final Parcelable.Creator<zzavq> CREATOR = new zzavr();
    public final String zza;
    public final long zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final Bundle zzf;
    public final boolean zzg;
    public long zzh;
    public String zzi;
    public int zzj;

    zzavq(String str, long j10, String str2, String str3, String str4, Bundle bundle, boolean z10, long j11, String str5, int i10) {
        this.zza = str;
        this.zzb = j10;
        this.zzc = str2 == null ? MaxReward.DEFAULT_LABEL : str2;
        this.zzd = str3 == null ? MaxReward.DEFAULT_LABEL : str3;
        this.zze = str4 == null ? MaxReward.DEFAULT_LABEL : str4;
        this.zzf = bundle == null ? new Bundle() : bundle;
        this.zzg = z10;
        this.zzh = j11;
        this.zzi = str5;
        this.zzj = i10;
    }

    public static zzavq zza(Uri uri) {
        long parseLong;
        Uri uri2 = uri;
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                zzbza.zzj("Expected 2 path parts for namespace and id, found :" + size);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri2.getQueryParameter("url");
            boolean equals = UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(uri2.getQueryParameter("read_only"));
            String queryParameter2 = uri2.getQueryParameter("expiration");
            if (queryParameter2 == null) {
                parseLong = 0;
            } else {
                parseLong = Long.parseLong(queryParameter2);
            }
            long j10 = parseLong;
            Bundle bundle = new Bundle();
            for (String next : uri.getQueryParameterNames()) {
                if (next.startsWith("tag.")) {
                    bundle.putString(next.substring(4), uri2.getQueryParameter(next));
                }
            }
            return new zzavq(queryParameter, j10, host, str, str2, bundle, equals, 0, MaxReward.DEFAULT_LABEL, 0);
        } catch (NullPointerException | NumberFormatException e10) {
            zzbza.zzk("Unable to parse Uri into cache offering.", e10);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.q(parcel, 2, this.zza, false);
        c.n(parcel, 3, this.zzb);
        c.q(parcel, 4, this.zzc, false);
        c.q(parcel, 5, this.zzd, false);
        c.q(parcel, 6, this.zze, false);
        c.e(parcel, 7, this.zzf, false);
        c.c(parcel, 8, this.zzg);
        c.n(parcel, 9, this.zzh);
        c.q(parcel, 10, this.zzi, false);
        c.k(parcel, 11, this.zzj);
        c.b(parcel, a10);
    }
}
