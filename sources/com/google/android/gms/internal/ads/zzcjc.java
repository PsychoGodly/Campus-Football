package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcjc implements zzdqj {
    private final Long zza;
    private final String zzb;
    private final zzchy zzc;
    private final zzcjg zzd;
    private final zzcjc zze = this;

    /* synthetic */ zzcjc(zzchy zzchy, zzcjg zzcjg, Long l10, String str, zzcjb zzcjb) {
        this.zzc = zzchy;
        this.zzd = zzcjg;
        this.zza = l10;
        this.zzb = str;
    }

    public final zzdqt zza() {
        long longValue = this.zza.longValue();
        zzcjg zzcjg = this.zzd;
        return zzdqu.zza(longValue, zzcjg.zza, zzdqn.zzc(zzcjg.zzb), this.zzc, this.zzb);
    }

    public final zzdqx zzb() {
        long longValue = this.zza.longValue();
        zzcjg zzcjg = this.zzd;
        return zzdqy.zza(longValue, zzcjg.zza, zzdqn.zzc(zzcjg.zzb), this.zzc, this.zzb);
    }
}
