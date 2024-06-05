package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.t;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzbzs implements zzfut {
    private final zzfvc zza = zzfvc.zzf();

    private static final boolean zza(boolean z10) {
        if (!z10) {
            t.q().zzt(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z10;
    }

    public boolean cancel(boolean z10) {
        return this.zza.cancel(z10);
    }

    public final Object get() throws ExecutionException, InterruptedException {
        return this.zza.get();
    }

    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final void zzc(Runnable runnable, Executor executor) {
        this.zza.zzc(runnable, executor);
    }

    public final boolean zzd(Object obj) {
        boolean zzd = this.zza.zzd(obj);
        zza(zzd);
        return zzd;
    }

    public final boolean zze(Throwable th) {
        boolean zze = this.zza.zze(th);
        zza(zze);
        return zze;
    }

    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zza.get(j10, timeUnit);
    }
}
