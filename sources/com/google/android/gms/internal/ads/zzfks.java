package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfks {
    private final String zza;
    private final long zzb;

    public zzfks() {
        this.zza = null;
        this.zzb = -1;
    }

    public zzfks(String str, long j10) {
        this.zza = str;
        this.zzb = j10;
    }

    public final long zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zza != null && this.zzb >= 0;
    }
}
