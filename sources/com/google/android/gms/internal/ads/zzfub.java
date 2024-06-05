package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfub extends zzfua {
    private final zzfut zza;

    zzfub(zzfut zzfut) {
        Objects.requireNonNull(zzfut);
        this.zza = zzfut;
    }

    public final boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.zza.get();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.zza.get(j10, timeUnit);
    }
}
