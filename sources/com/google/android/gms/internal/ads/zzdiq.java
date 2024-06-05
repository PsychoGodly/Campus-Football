package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdiq implements zzgwy {
    private final zzdij zza;
    private final zzgxl zzb;
    private final zzgxl zzc;

    public zzdiq(zzdij zzdij, zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzdij;
        this.zzb = zzgxl;
        this.zzc = zzgxl2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdbu(((zzdlq) this.zzb).zzb(), (Executor) this.zzc.zzb());
    }
}
