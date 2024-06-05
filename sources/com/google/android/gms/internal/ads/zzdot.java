package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdot implements zzcxj, zzcwc, zzcur {
    private final zzdpd zza;
    private final zzdpn zzb;

    public zzdot(zzdpd zzdpd, zzdpn zzdpn) {
        this.zza = zzdpd;
        this.zzb = zzdpn;
    }

    public final void zza(c3 c3Var) {
        this.zza.zza().put("action", "ftl");
        this.zza.zza().put("ftl", String.valueOf(c3Var.f14427a));
        this.zza.zza().put("ed", c3Var.f14429c);
        this.zzb.zze(this.zza.zza());
    }

    public final void zzb(zzeyo zzeyo) {
        this.zza.zzb(zzeyo);
    }

    public final void zzbA(zzbtn zzbtn) {
        this.zza.zzc(zzbtn.zza);
    }

    public final void zzn() {
        this.zza.zza().put("action", "loaded");
        this.zzb.zze(this.zza.zza());
    }
}
