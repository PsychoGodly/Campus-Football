package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.h0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzeio {
    private final zzdgt zza;
    private final zzeib zzb;
    private final zzcur zzc;

    public zzeio(zzdgt zzdgt, zzfdk zzfdk) {
        this.zza = zzdgt;
        zzeib zzeib = new zzeib(zzfdk);
        this.zzb = zzeib;
        this.zzc = new zzein(zzeib, zzdgt.zzg());
    }

    public final zzcur zza() {
        return this.zzc;
    }

    public final zzcwc zzb() {
        return this.zzb;
    }

    public final zzden zzc() {
        return new zzden(this.zza, this.zzb.zzc());
    }

    public final zzeib zzd() {
        return this.zzb;
    }

    public final void zze(h0 h0Var) {
        this.zzb.zze(h0Var);
    }
}
