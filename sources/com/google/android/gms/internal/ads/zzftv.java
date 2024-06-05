package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
abstract class zzftv extends zzfus {
    private final Executor zza;
    final /* synthetic */ zzftw zzb;

    zzftv(zzftw zzftw, Executor executor) {
        this.zzb = zzftw;
        Objects.requireNonNull(executor);
        this.zza = executor;
    }

    /* access modifiers changed from: package-private */
    public abstract void zzc(Object obj);

    /* access modifiers changed from: package-private */
    public final void zzd(Throwable th) {
        this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zze(Object obj) {
        this.zzb.zza = null;
        zzc(obj);
    }

    /* access modifiers changed from: package-private */
    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e10) {
            this.zzb.zze(e10);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
