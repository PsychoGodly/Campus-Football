package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzftc extends AbstractExecutorService implements zzfuu {
    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfvj.zzf(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfut) super.submit(runnable);
    }

    public final zzfut zza(Runnable runnable) {
        return (zzfut) super.submit(runnable);
    }

    public final zzfut zzb(Callable callable) {
        return (zzfut) super.submit(callable);
    }

    /* access modifiers changed from: protected */
    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfvj(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfut) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfut) super.submit(callable);
    }
}
