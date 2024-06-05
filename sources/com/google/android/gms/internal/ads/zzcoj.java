package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import m5.e;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcoj implements zzgwy {
    private final zzgxl zza;
    private final zzgxl zzb;

    public zzcoj(zzgxl zzgxl, zzgxl zzgxl2) {
        this.zza = zzgxl;
        this.zzb = zzgxl2;
    }

    /* renamed from: zza */
    public final zzcxd zzb() {
        return new zzcxd((ScheduledExecutorService) this.zza.zzb(), (e) this.zzb.zzb());
    }
}
