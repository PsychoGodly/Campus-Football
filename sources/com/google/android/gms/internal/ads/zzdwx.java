package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdwx implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzdwx(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    /* renamed from: zza */
    public final zzdww zzb() {
        return new zzdww(((zzcgj) this.zza).zza(), (ScheduledExecutorService) this.zzb.zzb());
    }
}
