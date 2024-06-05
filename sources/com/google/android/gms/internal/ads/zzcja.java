package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzcja implements zzdqi {
    private final zzchy zza;
    private final zzcjg zzb;
    private Long zzc;
    private String zzd;

    /* synthetic */ zzcja(zzchy zzchy, zzcjg zzcjg, zzciz zzciz) {
        this.zza = zzchy;
        this.zzb = zzcjg;
    }

    public final /* synthetic */ zzdqi zza(String str) {
        Objects.requireNonNull(str);
        this.zzd = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzdqi zzb(long j10) {
        this.zzc = Long.valueOf(j10);
        return this;
    }

    public final zzdqj zzc() {
        zzgxg.zzc(this.zzc, Long.class);
        zzgxg.zzc(this.zzd, String.class);
        return new zzcjc(this.zza, this.zzb, this.zzc, this.zzd, (zzcjb) null);
    }
}
