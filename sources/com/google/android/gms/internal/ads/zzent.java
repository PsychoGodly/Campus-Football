package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzent implements zzepn {
    private final zzepn zza;
    private final long zzb;
    private final ScheduledExecutorService zzc;

    public zzent(zzepn zzepn, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzepn;
        this.zzb = j10;
        this.zzc = scheduledExecutorService;
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final zzfut zzb() {
        zzfut zzb2 = this.zza.zzb();
        long j10 = this.zzb;
        if (j10 > 0) {
            zzb2 = zzfuj.zzn(zzb2, j10, TimeUnit.MILLISECONDS, this.zzc);
        }
        return zzfuj.zzf(zzb2, Throwable.class, zzens.zza, zzbzn.zzf);
    }
}
