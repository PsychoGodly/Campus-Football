package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfun implements zzfut {
    static final zzfut zza = new zzfun((Object) null);
    private static final Logger zzb = Logger.getLogger(zzfun.class.getName());
    private final Object zzc;

    zzfun(Object obj) {
        this.zzc = obj;
    }

    public final boolean cancel(boolean z10) {
        return false;
    }

    public final Object get() {
        return this.zzc;
    }

    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException {
        Objects.requireNonNull(timeUnit);
        return this.zzc;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.zzc);
        return obj + "[status=SUCCESS, result=[" + valueOf + "]]";
    }

    public final void zzc(Runnable runnable, Executor executor) {
        zzfnu.zzc(runnable, "Runnable was null.");
        zzfnu.zzc(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = zzb;
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + valueOf + " with executor " + valueOf2, e10);
        }
    }
}
