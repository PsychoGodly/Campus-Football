package com.google.android.gms.internal.ads;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: com.google.android.gms:play-services-ads-lite@@22.0.0 */
public final class zzbcb {
    public static final zzbbw zza = zzbbx.zzf("gads:consent:gmscore:dsid:enabled", true);
    public static final zzbbw zzb = zzbbx.zzf("gads:consent:gmscore:lat:enabled", true);
    public static final zzbbw zzc = new zzbbx("gads:consent:gmscore:backend_url", "https://adservice.google.com/getconfig/pubvendors", 4);
    public static final zzbbw zzd = new zzbbx("gads:consent:gmscore:time_out", Long.valueOf(UnityAdsConstants.Timeout.INIT_TIMEOUT_MS), 2);
    public static final zzbbw zze = zzbbx.zzf("gads:consent:gmscore:enabled", true);
}
