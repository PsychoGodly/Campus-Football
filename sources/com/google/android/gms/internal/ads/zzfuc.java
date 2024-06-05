package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzfuc extends zzfqb implements Future {
    protected zzfuc() {
    }

    public boolean cancel(boolean z10) {
        return zzb().cancel(z10);
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return zzb().get();
    }

    public final boolean isCancelled() {
        return zzb().isCancelled();
    }

    public final boolean isDone() {
        return zzb().isDone();
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public abstract Future zzb();

    public final Object get(long j10, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return zzb().get(j10, timeUnit);
    }
}
