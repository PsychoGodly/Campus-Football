package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgea implements zzgeb {
    private final zzgoj zza;
    private final zzgld zzb;

    private zzgea(zzgld zzgld) {
        this.zzb = zzgld;
        this.zza = zzgek.zzb(zzgld.zzg());
    }

    public static zzgea zza(zzgld zzgld) {
        return new zzgea(zzgld);
    }

    public final zzgld zzb() {
        return this.zzb;
    }

    public final zzgoj zzd() {
        return this.zza;
    }
}
