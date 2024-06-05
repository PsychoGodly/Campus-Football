package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfft {
    private final String zza;
    private final String zzb;

    private zzfft(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfft zza(String str, String str2) {
        zzfgr.zza(str, "Name is null or empty");
        zzfgr.zza(str2, "Version is null or empty");
        return new zzfft(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
