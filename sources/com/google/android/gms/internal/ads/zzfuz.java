package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfuz extends zzfuw implements ScheduledExecutorService {
    final ScheduledExecutorService zza;

    zzfuz(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.zza = scheduledExecutorService;
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        zzfvj zzf = zzfvj.zzf(runnable, (Object) null);
        return new zzfux(zzf, this.zza.schedule(zzf, j10, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzfuy zzfuy = new zzfuy(runnable);
        return new zzfux(zzfuy, this.zza.scheduleAtFixedRate(zzfuy, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        zzfuy zzfuy = new zzfuy(runnable);
        return new zzfux(zzfuy, this.zza.scheduleWithFixedDelay(zzfuy, j10, j11, timeUnit));
    }

    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        zzfvj zzfvj = new zzfvj(callable);
        return new zzfux(zzfvj, this.zza.schedule(zzfvj, j10, timeUnit));
    }
}
