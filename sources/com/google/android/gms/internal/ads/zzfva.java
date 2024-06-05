package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfva {
    public static zzfuu zza(ExecutorService executorService) {
        zzfuu zzfuu;
        if (executorService instanceof zzfuu) {
            return (zzfuu) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfuu = new zzfuz((ScheduledExecutorService) executorService);
        } else {
            zzfuu = new zzfuw(executorService);
        }
        return zzfuu;
    }

    public static Executor zzb() {
        return zzftx.INSTANCE;
    }

    static Executor zzc(Executor executor, zzfsx zzfsx) {
        Objects.requireNonNull(executor);
        if (executor == zzftx.INSTANCE) {
            return executor;
        }
        return new zzfuv(executor, zzfsx);
    }
}
