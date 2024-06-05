package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdyl implements zzcxj, zzcwc, zzcur {
    private final zzfdj zza;
    private final zzfdk zzb;
    private final zzbyn zzc;

    public zzdyl(zzfdj zzfdj, zzfdk zzfdk, zzbyn zzbyn) {
        this.zza = zzfdj;
        this.zzb = zzfdk;
        this.zzc = zzbyn;
    }

    public final void zza(c3 c3Var) {
        zzfdj zzfdj = this.zza;
        zzfdj.zza("action", "ftl");
        zzfdj.zza("ftl", String.valueOf(c3Var.f14427a));
        zzfdj.zza("ed", c3Var.f14429c);
        this.zzb.zzb(this.zza);
    }

    public final void zzb(zzeyo zzeyo) {
        this.zza.zzh(zzeyo, this.zzc);
    }

    public final void zzbA(zzbtn zzbtn) {
        this.zza.zzi(zzbtn.zza);
    }

    public final void zzn() {
        zzfdk zzfdk = this.zzb;
        zzfdj zzfdj = this.zza;
        zzfdj.zza("action", "loaded");
        zzfdk.zzb(zzfdj);
    }
}
